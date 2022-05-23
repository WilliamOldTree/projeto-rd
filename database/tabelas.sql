DROP TABLE ;
DROP DATABASE bd_politeismo;
--ATENCAO APAGA TODO O BANCO
SHOW TABLES;
create database bd_politeismo;
use bd_politeismo;
--                                                         TABLES


show tables; 


CREATE TABLE USER_ADM
(
ID_ADM			INT				NOT NULL 					AUTO_INCREMENT,
NOME			VARCHAR(255)	NOT NULL,
CARGO			VARCHAR(255) 	NOT NULL,
EMAIL   		VARCHAR(255) 	NOT NULL,
SENHA   		VARCHAR(100) 	NOT NULL,
PRIMARY KEY (ID_ADM)	
);

CREATE TABLE PRODUTO_DESTAQUE
(
ID_PRODUTO_DESTAQUE			INT				NOT NULL 		AUTO_INCREMENT,
DESCONTO 					DOUBLE			NOT NULL,
PRIMARY KEY	(ID_PRODUTO_DESTAQUE)
);

CREATE TABLE CATEGORIA
(
ID_CATEGORIA 		INT			 		NOT NULL 			AUTO_INCREMENT,
NOME 				VARCHAR(50)				NOT NULL,
FL_INATIVO			BOOLEAN				NOT NULL,
PRIMARY KEY (ID_CATEGORIA)
);

CREATE TABLE DEPARTAMENTO
(
ID_DEPARTAMENTO		INT					NOT NULL 			AUTO_INCREMENT,
NOME 				VARCHAR(50)				NOT NULL,
FL_INATIVO			BOOLEAN				NULL,
PRIMARY KEY	(ID_DEPARTAMENTO)
);

CREATE TABLE FORNECEDOR
(
ID_FORNECEDOR 		INT 				NOT NULL 			AUTO_INCREMENT,
RAZAO_SOCIAL 		VARCHAR(100) 		NOT NULL,
CNPJ 				VARCHAR(14) 		NOT NULL 			UNIQUE,
EMAIL 			VARCHAR(100) 		NOT NULL,
FL_INATIVO			BOOLEAN	 		NULL,
TELEFONE 			varchar(250) 		NOT NULL,
PRIMARY KEY (ID_FORNECEDOR)
);

CREATE TABLE PRODUTO					
(
ID_PRODUTO 					INT					NOT NULL 			AUTO_INCREMENT,
DESCRICAO 					VARCHAR(255)			NOT NULL,
NOME 						VARCHAR (255) 			NOT NULL,
URL 						VARCHAR (255) 			NOT NULL,
VOLUME 					DOUBLE 				NULL,
PESO						DOUBLE 				NULL,
PRECO 					DOUBLE 				NOT NULL,
STATUS 					BOOLEAN 				NOT NULL,
ESTOQUE 					INT 					NULL,
FK_ID_PRODUTO_DESTAQUE 			INT					NULL,
FK_ID_CATEGORIA				INT					NULL,
FK_ID_DEPARTAMENTO 			INT 					NULL,
FK_ID_FORNECEDOR 				INT 					NULL,
PRIMARY KEY	(ID_PRODUTO),
FOREIGN KEY	(FK_ID_PRODUTO_DESTAQUE) REFERENCES PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE),
FOREIGN KEY	(FK_ID_CATEGORIA)        REFERENCES CATEGORIA (ID_CATEGORIA),
FOREIGN KEY	(FK_ID_DEPARTAMENTO)     REFERENCES DEPARTAMENTO (ID_DEPARTAMENTO),
FOREIGN KEY (FK_ID_FORNECEDOR)       REFERENCES FORNECEDOR (ID_FORNECEDOR)
);


CREATE TABLE CLIENTE
(
ID_CLIENTE 					INT        		NOT NULL,
CPF	 					VARCHAR(14)      	NOT NULL 			UNIQUE,		
NOME 						VARCHAR(255)     	NOT NULL,
EMAIL 					VARCHAR(255)    	NOT NULL,
SENHA 					VARCHAR(255)    	NOT NULL,
NASCIMENTO 					DATE       		NOT NULL,
FIXO	 					VARCHAR(11) 	NULL,
CELULAR 					VARCHAR (12)	NULL,
PRIMARY KEY (ID_CLIENTE)
);


CREATE TABLE ENDERECO
(
ID_ENDERECO 				INT            		NOT NULL 		AUTO_INCREMENT,
APELIDO 					VARCHAR(255)       	NOT NULL,
NOME_LOGRADOURO 			VARCHAR(255) 		NOT NULL,
TIPO_LOGRADOURO 			VARCHAR(255) 		NOT NULL,
NUMERO 						VARCHAR(5)         	NOT NULL,
CEP 						VARCHAR(10)         NOT NULL,
CIDADE 						VARCHAR(50)       	NOT NULL,
BAIRRO						VARCHAR(255)		NOT NULL,
ESTADO						VARCHAR(255)		NOT NULL,
FK_ID_FORNECEDOR 			INT         		NOT NULL,
PRIMARY KEY (ID_ENDERECO),
FOREIGN KEY	(FK_ID_FORNECEDOR) REFERENCES FORNECEDOR (ID_FORNECEDOR)
);

CREATE TABLE CLIENTE_ENDERECO
(
CLIENTE_ID_CLIENTE 			INT		NOT NULL,
ENDERECO_ID_ENDERECO 			INT 		NOT NULL,
FOREIGN KEY (CLIENTE_ID_CLIENTE)  REFERENCES CLIENTE 	(ID_CLIENTE),
FOREIGN KEY (ENDERECO_ID_ENDERECO)REFERENCES ENDERECO	(ID_ENDERECO)
);


CREATE TABLE BOLETO
(
ID_BOLETO 				INT                NOT NULL,
BANCO 				VARCHAR(50)        NOT NULL,
VENCIMENTO 				DATE	             NOT NULL,
BENEFICIARIO 			VARCHAR(50) 	 NOT NULL,
NUMERO_DOCUMENTO 			VARCHAR(50) 	 NOT NULL,
DATA_PROCESSAMENTO 		DATE		       NOT NULL,
VALOR_COBRADO 			DOUBLE		 NOT NULL,
FK_ID_CLIENTE 			INT		       NOT NULL,
PRIMARY KEY (ID_BOLETO),
FOREIGN KEY (FK_ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);

CREATE TABLE PIX
(
ID_PIX 					INT		       NOT NULL,
CHAVE 					VARCHAR(255)	 NOT NULL,
FK_ID_CLIENTE 				INT  			 NOT NULL,
PRIMARY KEY (ID_PIX),
FOREIGN KEY (FK_ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);


CREATE TABLE CARTAO
(
ID_CARTAO_NUMERO 			INT 			NOT NULL,
TITULAR_CARTAO 			VARCHAR(50)  	NOT NULL,
NUMERO_CARTAO			VARCHAR(20)		NOT NULL,
VALIDADE_CARTAO 			DATE        	NOT NULL,
FK_ID_CLIENTE 			INT			NOT NULL,
PRIMARY KEY (ID_CARTAO_NUMERO),
FOREIGN KEY (FK_ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE) 
);


CREATE TABLE ENTREGA 
(
ID_ENTREGA 				INT              			NOT NULL		 AUTO_INCREMENT,
PRAZO 				DATE	           			NOT NULL,
VALOR 				DOUBLE          	   		NOT NULL,
FORMA_ENTREGA 			VARCHAR(255)			NOT NULL, 
STATUS_ENTREGA 			VARCHAR(255)			NOT NULL,
PRIMARY KEY (ID_ENTREGA)
);

CREATE TABLE PEDIDO
(
ID_PEDIDO 				INT			        NOT NULL 		AUTO_INCREMENT,
DATA_PEDIDO 			DATE			        NOT NULL,
VALOR_TOTAL 			DOUBLE        		  NOT NULL,
STATUS_PEDIDO 			VARCHAR(50) 		  NOT NULL,
FK_ID_CLIENTE 		INT    			  NOT NULL,
FK_ID_ENTREGA 		INT    			  NOT NULL,
PRIMARY KEY (ID_PEDIDO),
FOREIGN KEY	(FK_ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE),
FOREIGN KEY (FK_ID_ENTREGA) REFERENCES ENTREGA (ID_ENTREGA)
);


CREATE TABLE ITEM_PEDIDO
(
ID_PRODUTO	 		INT 				NOT NULL,
ID_PEDIDO 			INT  				NOT NULL,
QUANTIDADE			INT         		NOT NULL,
FOREIGN KEY	(ID_PRODUTO)  REFERENCES PRODUTO (ID_PRODUTO),
FOREIGN KEY (ID_PEDIDO)   REFERENCES PEDIDO (ID_PEDIDO)
);


CREATE TABLE NOTA_FISCAL
(
ID_NOTA_FISCAL 			INT       			NOT NULL		 AUTO_INCREMENT,
CODIGO_ACESSO_CHAVE 		INT  				NOT NULL,
DATA_NOTA_FISCAL 			DATE    			NOT NULL,
NUMERO_SERIE 			INT         		NOT NULL,
VALOR 				DOUBLE             	NOT NULL,
ID_PEDIDO	 			INT     			NOT NULL,
PRIMARY KEY (ID_NOTA_FISCAL),
FOREIGN KEY	(ID_PEDIDO)     REFERENCES PEDIDO (ID_PEDIDO)
);

CREATE TABLE ITEM_NOTA_FISCAL
(
ID_PRODUTO		 				INT         	NOT NULL,
ID_NOTA_FISCAL		 			INT 			NOT NULL,
QUANTIDADE 						INT   	      NOT NULL,
PERCENTUAL_ICMS					DOUBLE            NOT NULL,
VALOR_ICMS 						DOUBLE            NOT NULL,
PRIMARY KEY (ID_PRODUTO,ID_NOTA_FISCAL),
FOREIGN KEY	(ID_PRODUTO)    		REFERENCES PRODUTO (ID_PRODUTO),
FOREIGN KEY (ID_NOTA_FISCAL) 		REFERENCES NOTA_FISCAL (ID_NOTA_FISCAL)
);


CREATE TABLE PAGAMENTO
(
ID_PAGAMENTO 					INT 		NOT NULL 		AUTO_INCREMENT,
DATA_PAGAMENTO 					DATE 		NOT NULL,
FL_PAGAMENTO	 				VARCHAR(50) NOT NULL,
VALOR_PAGAMENTO 					DOUBLE      NOT NULL,
PEDIDO_ID_PEDIDO 					INT         NOT NULL,
PRIMARY KEY (ID_PAGAMENTO),
FOREIGN KEY	(PEDIDO_ID_PEDIDO) REFERENCES PEDIDO (ID_PEDIDO)
);

CREATE TABLE FAVORITOS 
(
ID_FAVORITOS 				INT			   NOT NULL,
ID_CLIENTE		 			INT,
PRIMARY KEY (ID_FAVORITOS),
FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);

CREATE TABLE PRODUTOS_FAVORITOS
(
PRODUTO_ID_PRODUTO 			INT			   NOT NULL,
FAVORITOS_ID_FAVORITOS 			INT			   NOT NULL,
PRIMARY KEY (PRODUTO_ID_PRODUTO, FAVORITOS_ID_FAVORITOS),
FOREIGN KEY	(PRODUTO_ID_PRODUTO)     REFERENCES PRODUTO (ID_PRODUTO),
FOREIGN KEY	(FAVORITOS_ID_FAVORITOS) REFERENCES FAVORITOS (ID_FAVORITOS)
);

SHOW TABLES;

SELECT * FROM  CLIENTE;

SELECT 
C.ID_CLIENTE,
C.NOME,
CONCAT(SUBSTR(CPF, 1,9), '-', SUBSTR(CPF, 10,11)) AS 'CPF',
C.EMAIL,
C.SENHA,
DATE_FORMAT(NASCIMENTO, '%d-%m-%Y') AS 'NASCIMENTO',
C.FIXO,
C.CELULAR,
E.APELIDO,
CONCAT(E.TIPO_LOGRADOURO, '-', E.NOME_LOGRADOURO, 'Nº ', E.NUMERO) AS 'ENDERECO',
E.CEP,
E.CIDADE,
E.BAIRRO,
E.ESTADO
FROM CLIENTE C
JOIN ENDERECO E
ON
E.ID_ENDERECO = C.ID_CLIENTE;

SELECT 
C.ID_CLIENTE,
C.NOME,
CONCAT(SUBSTR(CPF, 1,9), '-', SUBSTR(CPF, 10,11)) AS 'CPF',
C.EMAIL,
C.SENHA,
DATE_FORMAT(NASCIMENTO, '%d-%m-%Y') AS 'NASCIMENTO',
C.FIXO,
C.CELULAR
FROM CLIENTE C;

