-- INSERT INTO cliente (id_cliente, cpf, nome, email, senha, nascimento, genero) 
-- VALUES(1, '55555555-55', 'leia','leia@hotmail.com' , '123','2000-02-01','FEMININO', 1, );

INSERT INTO endereco (ID_ENDERECO, apelido, NOME_LOGRADOURO, TIPO_LOGRADOURO, numero, cep, estado, cidade, bairro) 
VALUES(1, 'Casa', 'independencia', 'Rua' , '123','43700-000', 'BA','Salvador', 'CIA 2');

-- INSERTS PARA TESTES DE RELACIONAMENTO COM PRODUTO 

insert into FORNECEDOR (ID_FORNECEDOR, CNPJ,EMAIL, RAZAO_SOCIAL, FL_INATIVO) 
values (1, '15012705000104', 'franciscoeclara@hotmail.com','Francisco e Clara LTDA', 1);

insert into FORNECEDOR (ID_FORNECEDOR, CNPJ,EMAIL, RAZAO_SOCIAL, FL_INATIVO) 
values (2, '31451211000174', 'gospelatacado@gmail.com','Gospel Atacado Evangelico', 1);

insert into FORNECEDOR (ID_FORNECEDOR, CNPJ,EMAIL, RAZAO_SOCIAL, FL_INATIVO) 
values (3, '15336171000325', 'sac@casadocigano.com.br','Casa do Cigano Artigos', 1);

insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (1, 0.00);
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (2, 0.05);
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (3, 0.10);
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (4, 0.15);

insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (1, 'CATOLICA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (2, 'EVANGÉLICA',1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (3, 'ESPIRITA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (4, 'AFRICANA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (5, 'BUDISTA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (6, 'JUDAICA', 1);

insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (1, 'ARTIGOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (2, 'ADESIVOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (3, 'ADORNOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (4, 'ANEIS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (5, 'BIBLIAS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (6, 'BENTA', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (7, 'CALICES', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (8, 'CHAVEIROS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (9, 'COLARES', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (10, 'CRUCIFIXOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (11, 'DIVERSOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (12, 'ESCAPULÁRIOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (13, 'IMAGENS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (14, 'LIVROS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (15, 'MANTAS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (16, 'SACOLAS / MOCHILAS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (17, 'TERÇOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (18, 'VESTUÁRIO', 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO,ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Buda Dourado','Buda Dourado: Peça Dourada, Peça Confeccionada em Resina de Alta Qualidade ', 'https://m.media-amazon.com/images/I/71Elte1F7QL._AC_SL1280_.jpg', 295, '0.2', '23.50', '1.0', 13, 5, 3, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Terço Nossa Senhora','Terço Nossa Senhora: Em Madeira, Detalhes em Branco e Cristais Azuis', 'https://static.lvartigosreligiosos.com.br/public/liriodovale/imagens/produtos/terco-madeira-pau-brasil-com-entremeio-de-nossa-senhora-das-gracas-8mm-5172.jpg', 100, '0.1', '20.15', '0.5', 17, 1, 1, 1, 1);

-- insert into ENTREGA (DATA, VALOR_FRETE, STATUS_ENTREGA, FORMA_ENTREGA)
-- values ('2022-03-22', 15.3, 'OBJETO_POSTADO', 'CORREIOS');

-- insert into PEDIDO (DATA_PEDIDO, VALOR_TOTAL, STATUS_PEDIDO, FK_ID_CLIENTE, FK_ID_ENTREGA)
-- values ('2022-03-20', 15.3, 'SEPARAÇÃO', 1, 1);