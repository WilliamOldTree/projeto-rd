-- DROP TABLE ;
DROP DATABASE bd_politeismo;
-- ATENCAO APAGA TODO O BANCO



create database bd_politeismo;
use bd_politeismo;

--                                                         TABLES

CREATE TABLE USER_ADM
(
ID_ADM								   INT													NOT NULL				AUTO_INCREMENT,
NOME                                   VARCHAR(255)                                         NOT NULL,
CARGO                                  VARCHAR(255)                                         NOT NULL,
EMAIL                                  VARCHAR(255)                                         NOT NULL,
SENHA                                  VARCHAR(100)  										NOT NULL,
PRIMARY KEY							   (ID_ADM)	
);

CREATE TABLE ESTOQUE
(
ID_ESTOQUE								INT													NOT NULL				AUTO_INCREMENT,
QUANTIDADE								INT													NOT NULL,
PRIMARY KEY								(ID_ESTOQUE)		
);

CREATE TABLE PRODUTO_DESTAQUE
(
ID_PRODUTO_DESTAQUE						INT													NOT NULL				AUTO_INCREMENT,
DESCONTO								DOUBLE												NOT NULL,
PRIMARY KEY								(ID_PRODUTO_DESTAQUE)
);


CREATE TABLE PRODUTO					
(
ID_PRODUTO								INT										NOT NULL 				AUTO_INCREMENT,
DESCRICAO								VARCHAR(255) 							NOT NULL,
VOLUME									DOUBLE									NULL,
PESO									DOUBLE									NULL,
SITUACAO								VARCHAR(15)								NOT NULL,
PRECO									DOUBLE									NOT NULL,
ESTOQUE_PRODUTO							INT										NULL,
PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE	INT										NULL,
PRIMARY KEY 							(ID_PRODUTO),
FOREIGN KEY								(ESTOQUE_PRODUTO)			 			REFERENCES				ESTOQUE				(ID_ESTOQUE),  
FOREIGN KEY								(PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE)  REFERENCES 				PRODUTO_DESTAQUE	(ID_PRODUTO_DESTAQUE) 
);

CREATE TABLE FORNECEDOR
(
ID_FORNECEDOR							INT										NOT NULL				AUTO_INCREMENT,
RAZAO_SOCIAL							VARCHAR(100)							NOT NULL,
CNPJ									VARCHAR(14)								NOT NULL				UNIQUE,
EMAIL									VARCHAR(100)							NOT NULL,
PRIMARY KEY								(ID_FORNECEDOR)
);


CREATE TABLE PRODUTO_FORNECEDOR
(
PRODUTO_ID_PRODUTO						INT										NOT NULL,
FORNECEDOR_ID_FORNECEDOR				INT										NOT NULL,
PRIMARY KEY								(PRODUTO_ID_PRODUTO, FORNECEDOR_ID_FORNECEDOR),
FOREIGN KEY								(PRODUTO_ID_PRODUTO)							REFERENCES		PRODUTO				(ID_PRODUTO),
FOREIGN KEY								(FORNECEDOR_ID_FORNECEDOR)						REFERENCES		FORNECEDOR		(ID_FORNECEDOR)		
);

CREATE TABLE DEPARTAMENTO
(
ID_DEPARTAMENTO							INT										NOT NULL				AUTO_INCREMENT,
NOME									VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_DEPARTAMENTO)
);

CREATE TABLE CATEGORIA
(
ID_CATEGORIA							INT										NOT NULL				AUTO_INCREMENT,
NOME									VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_CATEGORIA)
);

CREATE TABLE DEPARTAMENTO_CATEGORIA
(
DEPARTAMENTO_ID_DEPARTAMENTO			INT										NOT NULL,
CATEGORIA_ID_CATEGORIA					INT										NOT NULL,
PRODUTO_ID_PRODUTO						INT										NOT NULL,
PRIMARY KEY								(DEPARTAMENTO_ID_DEPARTAMENTO, CATEGORIA_ID_CATEGORIA),
FOREIGN KEY								(DEPARTAMENTO_ID_DEPARTAMENTO)			REFERENCES		DEPARTAMENTO			(ID_DEPARTAMENTO),
FOREIGN KEY								(CATEGORIA_ID_CATEGORIA)				REFERENCES		CATEGORIA				(ID_CATEGORIA),
FOREIGN KEY								(PRODUTO_ID_PRODUTO)					REFERENCES		PRODUTO					(ID_PRODUTO)								
);


CREATE TABLE SEXO
(
ID_SEXO									INT										NOT NULL		AUTO_INCREMENT,
DESCRICAO								VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_SEXO)
);


CREATE TABLE CLIENTE
(
ID_CLIENTE								INT										NOT NULL,		
NOME									VARCHAR(255)							NOT NULL,
EMAIL									VARCHAR(255)							NOT NULL,
PRIMARY KEY								(ID_CLIENTE)
);


CREATE TABLE FISICA
(
ID_CPF									VARCHAR(14)								NOT NULL,
NASCIMENTO								DATE									NOT NULL,
SEXO_ID_SEXO							INT										NULL,
CLIENTE_ID_CLIENTE						INT										NOT NULL,
PRIMARY KEY								(ID_CPF, CLIENTE_ID_CLIENTE),
FOREIGN KEY								(SEXO_ID_SEXO)							REFERENCES		SEXO		(ID_SEXO),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES		CLIENTE		(ID_CLIENTE)
);

CREATE TABLE JURIDICA
(
ID_CNPJ									VARCHAR(18)								NOT NULL,
ABERTURA								DATE									NOT NULL,
INSCRICAO_ESTADUAL						VARCHAR(50)								NOT NULL,
RAZAO_SOCIAL							VARCHAR(255)							NOT NULL,
CLIENTE_ID_CLIENTE						INT										NOT NULL,
PRIMARY KEY								(ID_CNPJ, CLIENTE_ID_CLIENTE),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES		CLIENTE		(ID_CLIENTE)
);

CREATE TABLE  TELEFONE
(
ID_TELEFONE								INT										NOT NULL		AUTO_INCREMENT,
DDD										INT										NOT NULL,
CELULAR									VARCHAR(9)								NOT NULL,
FIXO									VARCHAR(8)								NULL,
CLIENTE_ID_CLIENTE 						INT										NULL,
FORNECEDOR_ID_FORNECEDOR				INT										NULL,
PRIMARY KEY 							(ID_TELEFONE ),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES		CLIENTE		(ID_CLIENTE),
FOREIGN KEY								(FORNECEDOR_ID_FORNECEDOR)				REFERENCES		FORNECEDOR	(ID_FORNECEDOR)
);


CREATE TABLE ESTADO
(
ID_ESTADO								INT										NOT NULL 		AUTO_INCREMENT,
NOME 									VARCHAR	(50)							NOT NULL,
SIGLA									VARCHAR(2)								NOT NULL,
PRIMARY KEY								(ID_ESTADO)
);

CREATE TABLE ENDERECO
(
ID_ENDERECO								INT 									NOT NULL		AUTO_INCREMENT,
APELIDO									VARCHAR(50)								NOT NULL,
TIPO_LOGRADOURO							VARCHAR(50) 							NOT NULL,
NOME_LOGRADOURO							VARCHAR(255)							NOT NULL,
NUMERO									VARCHAR(5)								NOT NULL,
CEP										VARCHAR(8)								NOT NULL,
CIDADE									VARCHAR(50)								NOT NULL,
FORNECEDOR_ID_FORNECEDOR				INT										NULL,
ESTADO_ID_ESTADO						INT 									NOT NULL,
PRIMARY KEY								(ID_ENDERECO),
FOREIGN KEY								(FORNECEDOR_ID_FORNECEDOR)				REFERENCES		FORNECEDOR	(ID_FORNECEDOR),
FOREIGN KEY 							(ESTADO_ID_ESTADO)						REFERENCES		ESTADO		(ID_ESTADO)
);

CREATE TABLE CLIENTE_ENDERECO
(
CLIENTE_ID_ENDERECO						INT										NOT NULL,
ENDERECO_ID_ENDERECO					INT										NOT NULL,
PRIMARY KEY								(CLIENTE_ID_ENDERECO, ENDERECO_ID_ENDERECO),
FOREIGN KEY 							(CLIENTE_ID_ENDERECO)					REFERENCES 		CLIENTE 	(ID_CLIENTE),
FOREIGN KEY 							(ENDERECO_ID_ENDERECO)					REFERENCES 		ENDERECO 	(ID_ENDERECO)
);

CREATE TABLE FORMA
(
ID_FORMA								INT										NOT NULL,
INSTITUICAO								VARCHAR(255)							NOT NULL,
PRIMARY KEY								(ID_FORMA)
);


CREATE TABLE BOLETO
(
ID_BOLETO								INT 									NOT NULL,
BANCO									VARCHAR(50)								NOT NULL,
VENCIMENTO								DATE									NOT NULL,
BENEFICIARIO							VARCHAR(50)								NOT NULL,
NUMERO_DOCUMENTO						VARCHAR(50)								NOT NULL,
DATA_PROCESSAMENTO						DATE 									NOT NULL,
VALOR_COBRADO							DOUBLE 									NOT NULL,
FORMA_ID_FORMA							INT										NOT NULL,
CLIENTE_ID_CLIENTE						INT 									NOT NULL,
PRIMARY KEY								(ID_BOLETO, FORMA_ID_FORMA),
FOREIGN KEY								(FORMA_ID_FORMA)						REFERENCES 		FORMA		(ID_FORMA),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES 		CLIENTE 	(ID_CLIENTE)
);

CREATE TABLE PIX
(
ID_PIX									INT										NOT NULL,
CHAVE									VARCHAR(255)							NOT NULL,
FORMA_ID_FORMA							INT										NOT NULL,
CLIENTE_ID_CLIENTE						INT 									NOT NULL,
PRIMARY KEY								(ID_PIX, FORMA_ID_FORMA),
FOREIGN KEY								(FORMA_ID_FORMA)						REFERENCES 		FORMA		(ID_FORMA),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES 		CLIENTE 	(ID_CLIENTE)
);

CREATE TABLE CARTAO
(
ID_NUMERO_CARTAO						INT										NOT NULL,
TITULAR									VARCHAR(50)								NOT NULL,
VALIDADE								DATE									NOT NULL,
CVV										VARCHAR(3)								NOT NULL 		UNIQUE, 
FORMA_ID_FORMA 							INT										NOT NULL, 
CLIENTE_ID_CLIENTE 						INT										NOT NULL,
PRIMARY KEY								(ID_NUMERO_CARTAO, FORMA_ID_FORMA),
FOREIGN KEY								(FORMA_ID_FORMA)						REFERENCES		FORMA 		(ID_FORMA),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES 		CLIENTE 	(ID_CLIENTE) 
);

CREATE TABLE FORMA_ENTREGA
(
ID_FORMA_ENTREGA						INT										NOT NULL		AUTO_INCREMENT,
EMPRESA									VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_FORMA_ENTREGA)
);

CREATE TABLE ENTREGA 
(
ID_ENTREGA								INT										NOT NULL 		AUTO_INCREMENT,
PRAZO_ESTIMADO							VARCHAR(50)								NOT NULL,
VALOR									DOUBLE 									NOT NULL,
FORMA_ENTREGA_ID_FORMA_ENTREGA			INT										NOT NULL, 
PRIMARY KEY								(ID_ENTREGA),
FOREIGN KEY								(FORMA_ENTREGA_ID_FORMA_ENTREGA)		REFERENCES 		FORMA_ENTREGA 		(ID_FORMA_ENTREGA)
);

CREATE TABLE STATUS_ENTREGA
(
ID_STATUS_ENTREGA						INT										NOT NULL 		AUTO_INCREMENT,
DATA_ENTREGA							DATE									NOT NULL,
ENTREGA_ID_ENTREGA						INT										NOT NULL,
PRIMARY KEY								(ID_STATUS_ENTREGA),
FOREIGN KEY								(ENTREGA_ID_ENTREGA)					REFERENCES 		ENTREGA 			(ID_ENTREGA)
);


CREATE TABLE TIPO_STATUS_ENTREGA		
(
ID_TIPO_STATUS_ENTREGA					INT										NOT NULL 		AUTO_INCREMENT,
DESCRICAO 								VARCHAR(50)								NOT NULL,
STATUS_ENTREGA_ID_STATUS_ENTREGA		INT										NOT NULL,
PRIMARY KEY								(ID_TIPO_STATUS_ENTREGA),
FOREIGN KEY								(STATUS_ENTREGA_ID_STATUS_ENTREGA)		REFERENCES		STATUS_ENTREGA 		(ID_STATUS_ENTREGA)		
);

CREATE TABLE PEDIDO
(
ID_PEDIDO								INT										NOT NULL		AUTO_INCREMENT,
DATA_PEDIDO								DATE									NOT NULL,
VALOR_TOTAL								DOUBLE									NOT NULL,
CLIENTE_ID_CLIENTE						INT										NOT NULL,
ENTREGA_ID_ENTREGA 						INT										NOT NULL,
PRIMARY KEY								(ID_PEDIDO),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES 		CLIENTE 		(ID_CLIENTE),
FOREIGN KEY								(ENTREGA_ID_ENTREGA)					REFERENCES 		ENTREGA 		(ID_ENTREGA)
);


CREATE TABLE ITEM_PEDIDO
(
PRODUTO_ID_PRODUTO						INT										NOT NULL,
PEDIDO_ID_PEDIDO						INT										NOT NULL,
QUANTIDADE								INT										NOT NULL,
PRIMARY KEY								(PRODUTO_ID_PRODUTO, PEDIDO_ID_PEDIDO),
FOREIGN KEY								(PRODUTO_ID_PRODUTO)					REFERENCES 		PRODUTO 		(ID_PRODUTO),
FOREIGN KEY								(PEDIDO_ID_PEDIDO)						REFERENCES		PEDIDO			(ID_PEDIDO)
);

CREATE TABLE STATUS_PEDIDO
(
ID_STATUS								INT										NOT NULL		AUTO_INCREMENT,
DESCRICAO 								VARCHAR (100)							NOT NULL,
PEDIDO_ID_PEDIDO						INT										NOT NULL,
PRIMARY KEY								(ID_STATUS),	
FOREIGN KEY								(PEDIDO_ID_PEDIDO)						REFERENCES 		PEDIDO 			(ID_PEDIDO)				
);

CREATE TABLE DESTINATARIO
(
ID_DESTINATARIO							INT										NOT NULL		AUTO_INCREMENT,
TIPO									VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_DESTINATARIO)
);

CREATE TABLE REMENTENTE
(
ID_REMETENTE							INT										NOT NULL		AUTO_INCREMENT,
TIPO									VARCHAR(50)								NOT NULL,
PRIMARY KEY								(ID_REMETENTE)
);


CREATE TABLE OPERACAO
(
ID_OPERACAO								INT										NOT NULL		AUTO_INCREMENT,
DESTINATARIO_ID_DESTINATARIO			INT										NOT NULL,
REMENTENTE_ID_REMETENTE					INT										NOT NULL,
PRIMARY KEY								(ID_OPERACAO),
FOREIGN KEY								(DESTINATARIO_ID_DESTINATARIO)			REFERENCES 		DESTINATARIO 		(ID_DESTINATARIO),
FOREIGN KEY								(REMENTENTE_ID_REMETENTE)				REFERENCES		REMENTENTE 			(ID_REMETENTE)
);

CREATE TABLE NOTA_FISCAL
(
ID_NOTA_FISCAL							INT										NOT NULL 		AUTO_INCREMENT,
CODIGO_ACESSO_CHAVE						INT										NOT NULL,
DATA_NOTA_FISCAL						DATE									NOT NULL,
NUMERO_SERIE							INT										NOT NULL,
VALOR									DOUBLE									NOT NULL,
PEDIDO_ID_PEDIDO						INT										NOT NULL,
OPERACAO_ID_OPERACAO					INT										NOT NULL,
PRIMARY KEY								(ID_NOTA_FISCAL),
FOREIGN KEY								(PEDIDO_ID_PEDIDO)						REFERENCES		PEDIDO  			(ID_PEDIDO),
FOREIGN KEY								(OPERACAO_ID_OPERACAO)					REFERENCES		OPERACAO 			(ID_OPERACAO)
);

CREATE TABLE ITEM_NOTA_FISCAL
(
PRODUTO_ID_PRODUTO 						INT										NOT NULL,
NOTA_FISCAL_ID_NOTA_FISCAL				INT										NOT NULL,
QUANTIDADE 								INT										NOT NULL,
PERCENTUAL								DOUBLE									NOT NULL,
VALOR_ICMS								DOUBLE									NOT NULL,
PRIMARY KEY								(PRODUTO_ID_PRODUTO, NOTA_FISCAL_ID_NOTA_FISCAL),
FOREIGN KEY								(PRODUTO_ID_PRODUTO)					REFERENCES		PRODUTO 			(ID_PRODUTO),
FOREIGN KEY								(NOTA_FISCAL_ID_NOTA_FISCAL)			REFERENCES 		NOTA_FISCAL 		(ID_NOTA_FISCAL)
);

CREATE TABLE PAGAMENTO
(
ID_PAGAMENTO							INT										NOT NULL		AUTO_INCREMENT,
DATA_PAGAMENTO							DATE									NOT NULL,
STATUS_PAGAMENTO						VARCHAR(50)								NOT NULL,
VALOR_PAGAMENTO							DOUBLE									NOT NULL,
PEDIDO_ID_PEDIDO						INT										NOT NULL,
FORMA_ID_FORMA							INT										NOT NULL,
PRIMARY KEY								(ID_PAGAMENTO),
FOREIGN KEY								(PEDIDO_ID_PEDIDO)						REFERENCES		PEDIDO 		(ID_PEDIDO),
FOREIGN KEY								(FORMA_ID_FORMA)						REFERENCES 		FORMA		(ID_FORMA)
);

CREATE TABLE FAVORITOS 
(
ID_FAVORITOS 							INT										NOT NULL,
LISTA									VARCHAR(255)							NOT NULL,
CLIENTE_ID_CLIENTE						INT,
PRIMARY KEY								(ID_FAVORITOS),
FOREIGN KEY								(CLIENTE_ID_CLIENTE)					REFERENCES		CLIENTE		(ID_CLIENTE)
);

CREATE TABLE PRODUTOS_FAVORITOS
(
PRODUTO_ID_PRODUTO						INT										NOT NULL,
FAVORITOS_ID_FAVORITOS					INT										NOT NULL,
PRIMARY KEY								(PRODUTO_ID_PRODUTO, FAVORITOS_ID_FAVORITOS),
FOREIGN KEY								(PRODUTO_ID_PRODUTO)					REFERENCES		PRODUTO 		(ID_PRODUTO),
FOREIGN KEY								(FAVORITOS_ID_FAVORITOS)				REFERENCES 		FAVORITOS		(ID_FAVORITOS)
);
















-





































