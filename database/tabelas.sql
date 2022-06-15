-- DROP TABLE ;
-- DROP DATABASE bd_politeismo;
-- create database bd_politeismo;
-- 
-- use bd_politeismo;
-- show tables;

-- ADMINISTARDORES
insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values ('Muryllo Soares','Gerente','m.soares21@politeismo.com.br',MD5('123'));
insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values ('Denis William','Gerente','dwbarbosa@politeismo.com.br', MD5('123'));
insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values ('Sergio Caue','Gerente','sgomes@politeismo.com.br',MD5('123'));
insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values ('L�ia Borges','Gerente','lbsjesus@politeismo.com.br',MD5('123'));
insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values ('Fabiola de Carvalho','Gerente','facarvalho@politeismo.com.br',MD5('123'));
--

-- FORNECEDORES
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (1, 'Francisco e Clara LTDA', '15.012.705/0001-04', 'franciscoeclara@hotmail.com','3296-3455', true);
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (2,'Gospel Atacado Evangelico', '31.451.211/0001-74', 'gospelatacado@gmail.com', '3296-3455',true);
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (3,'Casa do cigano artigos religiosos', '15.336.171/0003-25', 'sac@casadocigano.com.br','3296-3455', true);
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (4,'Andre Luiz - Mundo Maior', '65.080.616/0001-65', 'sacmundomaior@feal.com.br','3296-3455', true);
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (5,'Conto de Fadas Distribuidora', '08.892.821/0001-91', 'contodefadas@distribuidora.com.br', '3296-3455',true);
insert into FORNECEDOR (ID_FORNECEDOR, RAZAO_SOCIAL, CNPJ, EMAIL,TELEFONE, FL_INATIVO) values (6,' cristaos e judaico messianico', '33.977.029/0001-87', 'camiyla-seeber@hotmail.com','3296-3455', true);


--

-- PRODUTO_DESTAQUE
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (1, 0.05);
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (2, 0.10);
insert into PRODUTO_DESTAQUE (ID_PRODUTO_DESTAQUE, DESCONTO) values (3, 0.15);

--


-- DEPARTAMENTOS
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (1, 'CATOLICA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (2, 'EVANG�LICA',1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (3, 'ESPIRITA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (4, 'AFRICANA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (5, 'BUDISTA', 1);
insert into DEPARTAMENTO (ID_DEPARTAMENTO, NOME, FL_INATIVO) values (6, 'JUDAICA', 1);

--


-- CATEGORIAS
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
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (12, 'ESCAPUL�RIOS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (13, 'IMAGENS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (14, 'LIVROS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (15, 'MANTAS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (16, 'SACOLAS / MOCHILAS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (17, 'TER�OS', 1);
insert into CATEGORIA (ID_CATEGORIA, NOME, FL_INATIVO) values (18, 'VESTU�RIO', 1);

--


-- PRODUTOS
-- (Cat�lica)
insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO,ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Imagem de Nossa Senhora Aparecida','IMAGEM DE NOSSA SENHORA APARECIDA EM RESINA: Imagem de Nossa Senhora Aparecida em resina nacional, pintada a m�o.
Resistente e bonita.', 'https://images.tcdn.com.br/img/img_prod/660433/nossa_senhora_aparecida_30_cm_475_1_20191204154033.jpg', 100, '1.2', '149.00', '0.30', 13, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Imagem de S�o Miguel','IMAGEM EM RESINA DE S�O MIGUEL ARCANJO: Imagem de S�o Miguel Arcanjo em resina nacional, pintada a m�o.
Resistente e bonita.', 'https://images.tcdn.com.br/img/img_prod/660433/imagem_de_sao_miguel_20_cm_883_1_c33f8c34c50b4148edcba0532b5f5cc5.jpg', 100, '1.0', '69.00', '0.20', 13, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Livro Novena de Santa Dulce dos Pobres','NOVENA DE SANTA DULCE DOS POBRES: Irm� Dulce foi uma pessoa muito admirada no Brasil do s�culo XX. Chamada de �O Anjo bom da Bahia�. Foi indicada para o Pr�mio Nobel da Paz em 1988. Irm� Dulce faleceu aos 77 anos, em 1992.', 'https://images.tcdn.com.br/img/img_prod/660433/livro_novena_de_santa_dulce_dos_pobres_1661_1_632349cf5adcc8ff1a5c6579f6c7af8a.jpg', 100, '0.1', '9.90', '0.01', 14, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Capelinha de Santa Rita','CAPELINHA DE SANTA RITA: Capelinha em madeira natural, com imagem e ora��o de Santa Rita.
Essa linda capelinha � formada por duas partes de madeira, unidas por dobradi�as.', 'https://images.tcdn.com.br/img/img_prod/660433/capelinha_de_santa_rita_1481_2_70896de00dbec8f85a264eb09f4ceb01.jpg', 100, '0.5', '29.60', '7.05', 1, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Capelinha em Madeira Pres�pio Natal','CAPELINHA DE MADEIRA PRES�PIO NATAL: Capelinha em madeira natural na cor clara, com imagem do pres�pio. Essa linda capelinha � formada por duas partes de madeira, unidas por dobradi�as. ', 'https://images.tcdn.com.br/img/img_prod/660433/capelinha_em_madeira_presepio_natal_1611_1_70433b50a6c5e233660ded47f67651b7.jpg', 100, '0.5', '37.60', '7.05', 1, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Ter�o Mission�rio','TER�O MISSION�RIO: Ter�o em Madeira com as cores dos 5 continentes: branco, verde, amarelo, vermelho e azul.
Produto feito em madeira natural de reflorestamento, 100% nacional.', 'https://images.tcdn.com.br/img/img_prod/660433/terco_missionario_153_1_9df688974172e47dfd4a927e9c11eaa2.jpg', 100, '0.3', '37.60', '7.50', 13, 1, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR,FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Ter�o de S�o Bento Premium','TER�O DE S�O BENTO: O Ter�o de S�o Bento � um ter�o �nico, todo em madeira e com um sofisticado crucifixo com os cantos arredondados, fresado e com medalha de S�o Bento Colorida, o que d� um aspecto cl�ssico ao ter�o.', 'https://images.tcdn.com.br/img/img_prod/660433/terco_de_sao_bento_premium_3_1_2ec5831dcdcbe94fab2fe5752dc2195b.jpg', 100, '0.3', '23.50', '0.43', 13, 1, 1,1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Vela Arom�tica Nossa Senhora de F�tima','VELA AROM�TICA NOSSA SENHORA DE F�TIMA COPO REDONDO: Vela artesanal arom�tica no copo de vidro redondo, com o tema de Nossa Senhora de F�tima.
Essa vela arom�tica vem com a imagem de Nossa Senhora de F�tima e com as inscri��es.', 'https://images.tcdn.com.br/img/img_prod/660433/vela_aromatica_nossa_senhora_de_fatima_copo_redondo_1165_1_57fbbaf7368ada436a064ac0a361c281.png', 100, '0.3', '27.20', '0.43', 1, 1, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Vela Arom�tica Sagrado','VELA AROM�TICA SAGRADO CORA��O DE JESUS COPO REDONDO: Vela artesanal arom�tica no copo de vidro redondo, com o tema do Sagrado Cora��o de Jesus.
Essa vela arom�tica vem com a imagem dp Sagrado Cora��o de Jesus e com a ora��o.', 'https://images.tcdn.com.br/img/img_prod/660433/vela_aromatica_sagrado_coracao_de_jesus_copo_redondo_1765_1_6eeced7a9593d2af9d61f369e29aff58.png', 100, '0.2', '34.00', '0.5', 1, 1, 1, null, 1);

-- (Evang�lica)

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('B�blia de Estudo Matthew Henry','B�BLIA DE ESTUDO MATTHEW HENRY: A B�blia de Estudo Matthew Henry, cujos estudos h� mais de 300 anos v�m auxiliando crist�os a compreenderem a B�blia, relacionando seus ensinamentos.
Introdu��o a cada um dos livros b�blicos.', 'https://shalomloja.com.br/wp-content/uploads/2018/10/7899938403877_arc085bemhsbb_01.jpg', 100, '0.2', '265.16', '0.5', 5, 2, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('B�blia da Mulher','A B�BLIA DA MULHER: Uma das b�blias mais vendidas para o publico feminino, que buscam o conhecimento atrav�s das escrituras, com uma nova edi��o mais feminina delicada, florida na capa e borda. Seus textos s�o contextualizados � realidade da mulher.', 'https://shalomloja.com.br/wp-content/uploads/2018/08/2.jpg', 100, '0.2', '34.00', '0.5', 5, 2, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('B�blia da Pregadora Pentencostal','B�BLIA DA PREGADORA PENTECOSTAL: Esta edi��o, especialmente voltada ao p�blico feminino, traz ainda um encarte especial sobre as mulheres da B�blia. 1002 serm�es, Curso b�sico na Teologia com 12 mat�rias', 'https://shalomloja.com.br/wp-content/uploads/2018/08/60.jpg', 100, '0.2', '275.00', '0.5', 5, 2, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Harpa Crist�','HARPA CRIST�: Hinos da Harpa Crist�, sem notas musicais.', 'https://shalomloja.com.br/wp-content/uploads/2018/10/7898521814083_hcmpop_01.jpg', 100, '0.2', '12.00', '0.5', 14, 2, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Harpa Crist�','HARPA CRIST�: Hinos da Harpa Crist�, sem notas musicais.', 'https://shalomloja.com.br/wp-content/uploads/2018/10/7898521814106_hcmpop_01.jpg', 100, '0.2', '12.00', '0.5', 14, 2, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Harpa Crist� MI BEMOL(EB)','HARPA CRIST� MI BEMOL (EB): IDIOMA: Portugu�s ; FORMATO: Grande; CAPA: Ilustrada', 'https://shalomloja.com.br/wp-content/uploads/2018/12/WhatsApp-Image-2018-12-13-at-14.58.13.jpeg', 100, '0.2', '75.00', '0.5', 14, 2, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Camiseta Le�o da Cruz','CAMISETA LE�O DA CRUZ: IDIOMA:Camiseta Masculina F� Preta, dispon�vel em tamanhos variados. 100% algod�o, N�O passar ferro quente diretamente na estampa, de prefer�ncia a camisa deve ser passada ao avesso.
Para maior durabilidade do produto.', 'https://shalomloja.com.br/wp-content/uploads/2018/11/WhatsApp-Image-2018-11-07-at-16.39.40.jpeg', 100, '0.2', '49.00', '0.7', 14, 2, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Camiseta Le�o da Tribo de Jud�','CAMISETA LE�O DA TRIBO DE JUD�: IDIOMA:Camiseta Masculina F� Preta, dispon�vel em tamanhos variados. 100% algod�o, N�O passar ferro quente diretamente na estampa, de prefer�ncia a camisa deve ser passada ao avesso.
Para maior durabilidade do produto.', 'https://shalomloja.com.br/wp-content/uploads/2018/11/WhatsApp-Image-2018-11-07-at-16.38.36.jpeg', 100, '0.2', '49.00', '0.7', 14, 2, 1, null, 1);


-- (Espirita)

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Quartzo Rosa','Significado: Essencialmente � a pedra do amor. � a personifica��o do amor Universal, ligado a Deus. � uma pedra sutil, leve e delicada. Libera m�goas do passado, ressentimentos, medo e raiva acumulada.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/l/g/lgp042-quartzo-rosa.jpg', 100, '0.20', '8.60', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Ametista','Significado: � o s�mbolo do 3� olho, acalma a mente e os nervos, com seu efeito profundo e tranq�ilizador. � facilitador da medita��o e da viagem astral. Desencadeia o crescimento interior nos dando li��es de humanidade com sabedoria e discernimento.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/l/g/lgp038-ametista.jpg', 100, '0.20', '13.60', '0.3', 1, 3, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Jasper Vermelho','Significado: Esta pedra nos torna pessoas mais praticas e objetivas. Proporciona uma vis�o de como aproveitar melhor as oportunidades ligadas � sobreviv�ncia. Ela nos ajuda a termos id�ias criativas e pr�ticas de modo realizador.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/l/g/lgp041-jaspe-vermelho.jpg', 100, '0.20', '6.70', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Malaquita','Significado: �til para o relaxamento e desordens neurol�gicas, assim como para regenera��o de tecidos. Atua contra doen�as mentais, al�m de ser ben�fica nos casos de dislexia. Simboliza o crescimento do Ser Espiritual.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/l/g/lgp063-malaquita.jpg', 100, '0.80', '30.00', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Kit Toalha + Bolsa - 7 Chakras','Esta toalha pode ser usada em altares e para consultas de or�culos como Tar�, Runas, B�zios e I Ching por exemplo. Ela forma o solo sagrado para pr�ticas ritual�sticas, criando conex�o entre voc� e o universo.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/m/l/mlu10-kit-toalha-bolsa-sacola-7-chakras-roxa.jpg', 100, '0.80', '78.20', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Incenso Massala Opium Satya','O Incenso Massala Opium Satya foi produzido artesanalmente por uma das principais empresas do ramo, Shrinivas Sugandhalaya. Conhecidos mundialmente por seus incensos com fragr�ncias �nicas.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/i/n/incenso-massala-opium-satya.jpg', 100, '0.50', '17.80', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Incenso Artesanal in Natura - Palo Santo','Quantidade: 1 pacotinho com 50 gramas de Palo Santo in natura; Composi��o: Madeira de palo santo', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/i/n/ina13-incenso-artesanal-in-natura-palo-santo.jpg', 100, '0.50', '22.00', '0.3', 1, 3, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Kit Toalha + Bolsa - Zodiacal - A Mandala','Esta toalha pode ser usada em altares e para consultas de or�culos como Tar�, Runas, B�zios e I Ching por exemplo. Ela forma o solo sagrado para pr�ticas ritual�sticas, criando conex�o entre voc� e o universo.', 'https://loja.simbolika.com.br/media/catalog/product/cache/37a9a8f3002fee25759059124a331b12/m/l/mlu62-kit-bolsa-_-toalha-zodiacal-a-mandala.jpg', 100, '0.50', '78.00', '0.3', 1, 3, 1, 1, 1);

-- (Africana)


insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Jogo de Iemanj� Branco', 'Por ser um item feito artesanalmente pode haver mudan�as em alguns detalhes e vir com pequenas varia��es nas cores.', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/06/Iemanja-Branco-600x600.jpg', 100, '0.5', '220.00', '0.4', 1, 4, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Jogo de Oxum Luxo', 'Por ser um item feito artesanalmente pode haver mudan�as em alguns detalhes e vir com pequenas varia��es nas cores.', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/07/Oxum-600x600.jpg', 100, '0.5', '350.00', '0.4', 1, 4, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Jogos de Oxumar�', 'Por ser um item feito artesanalmente pode haver mudan�as em alguns detalhes e vir com pequenas varia��es nas cores.', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/04/Oxumare-600x600.jpg', 100, '0.5', '220.00', '0.4', 1, 4, 1, null, 1);


insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Escultura Iemanj�', 'Imagem de gesso', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2021/03/PicsArt_03-02-11.26.22-600x600.jpg', 100, '1.2', '176.00', '0.9', 13, 4, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adja com 3 Bocas A�o Cabo de Madeira', 'Por ser um item feito artesanalmente pode haver mudan�as em alguns detalhes e vir com varia��o de tonalidades(mais claro ou mais escuro).', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/05/Adja-chapa-a%C3%A7o-cabo-madeira-1-600x600.jpg', 100, '1.2', '49.00', '0.9', 1, 4, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Abeb� Aramado Dourado Perola', 'Por ser um item feito artesanalmente pode haver mudan�as em alguns detalhes e vir com varia��o de tonalidades(mais claro ou mais escuro).', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/05/Abebe-aramado-dourado-600x600.jpg', 100, '1.2', '138.00', '0.9', 1, 4, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adaga Aramada Cobre', 'Observa��o: banhada.', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2017/05/adaga-aramada-cobre-1-600x600.jpg', 100, '0.5', '129.00', '0.4', 1, 4, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Orix� Oxum de madeira', 'Por serem feitas artesanalmente, podem vir com varia��es nos detalhes talhados na madeira.', 'https://www.mercadaodeniteroi.com.br/wp-content/uploads/2021/03/PicsArt_02-26-11.31.48-600x600.jpg', 100, '0.5', '169.00', '0.4', 1, 4, 1, 1, 1);


-- (Budista)

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Sino Tibetano Especial', 'Acess�rio para medita��o, rituais e preces dentro do budismo tibetano, os c�mbalos, hoje tamb�m s�o usados em processos de cura e terapias vibracionais no Ocidente.', 'https://images.tcdn.com.br/img/img_prod/720512/sino_tibetano_orin_excelente_sonoridade_para_terapia_do_som_10_cm_3593_1_4cbbfb3ac8fb22b1fececf7caeeb4933.jpg', 100, '0.9', '489.00', '0.4', 1, 5, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Ganesha Dan�ando Turquesa', 'De acordo com o Hindu�smo, � o Deus elefante, filho de Shiva e Parvati. Conhecido como Deus dos comerciantes, da prosperidade, da pol�tica e da sagacidade. Possui quatro bra�os.', 'https://images.tcdn.com.br/img/img_prod/720512/ganesha_dancando_turquesa_1m_2287_1_ffc46cecdf05386bc7de9206d7e58d2e.jpg', 100, '0.9', '645.00', '0.4', 1, 5, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Japamala De Madeira Com A�ai', 'A pr�tica do japamala consiste em entoar o mantra, uma ora��o e repeti-la utilizando o cord�o para contabilizar o n�mero de repeti��es.', 'https://http2.mlstatic.com/D_NQ_NP_886182-MLB45281404599_032021-O.webp', 100, '0.9', '28.00', '0.4', 1, 5, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Colar Japamala Olho D Tigre', 'Lindo Japamala de Pedra Olho de Tigre com pedra Hematita, 108 contas ambas de 8 mm.', 'https://http2.mlstatic.com/D_NQ_NP_833227-MLB46200567576_052021-O.webp', 100, '0.9', '134.00', '0.4', 1, 5, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Buda Tibetano', 'Buda Tibetano Estatueta Medita��o Oferenda 18 X 10 Cm 4022 Material: Resina Tamanho: 18 X 10 Cm Cor: Dourado Cont�m: 1 Unidade.', 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSsQohpfDXkPjPdJAphXYC8jpeknLf6sXvFPIur24v7V2SfPWXCXeGcOFTyNUkzpSVmjqTMCbKEkH1TYCUAiTcRpSRYZ8_hsrmcYLfLEB0Zy__UsW0awlXn6g&usqp=CAE', 100, '0.9', '98.20', '0.4', 1, 5, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Est�tua de Buda Hindu', 'Marca: MANDALA DE LUZ; Material: Resina; Cor: Dourado', 'https://m.media-amazon.com/images/I/71Elte1F7QL._AC_SX425_.jpg', 100, '0.9', '79.00', '0.4', 1, 5, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Lioobo � Tigela tibetana', 'A nota musical sustentada cria o estado perfeito para medita��o profunda, pensamento criativo e mensagens intuitivas.', 'https://m.media-amazon.com/images/I/51y+KKKk7JL._AC_SX522_.jpg', 100, '0.9', '162.00', '0.4', 1, 5, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Est�tua Buda Chin�s', 'Est�tua Buda Chin�s Sorridente Riqueza Prata E Dourado 16Cm', 'https://product-hub-prd.madeiramadeira.com.br/4215568/images/7da6d9e3-90f4-4137-b4c2-f1bcc0ba28c611536134estatuabudachinessorridenteriquezaprataedourado16cmprd0rmwoz54z42tp1791600x600.jpg?width=500&canvas=1:1&bg-color=FFF', 100, '0.9', '79.00', '0.4', 1, 5, 1, null, 1);

-- (Judaica)

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Hanukkah Menorah - Chanuc�', 'BRTAGG Hanukkah Menorah - Chanuc� Menor� - Casti�ais judeus de 9 ramos (17 cm, prata)', 'https://m.media-amazon.com/images/I/41q+3Osxq2L._AC_SX425_.jpg', 100, '0.9', '162.00', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Menor� Knesset m�dia esmaltada', 'Menor� dourada e esmaltada , decorada com os s�mbolos das doze tribos de Israel, no p� cont�m a palavra Jerusal�m escrita . dispon�veis em azul e branco. Mede 17 x 13 cm.', 'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcThMDQ49ovzO1VCxjBETCJKP78vzEDArXFwVULtETYZNZw6BNimkZuXlNPv9i30gtvNwAfWlIn-KsXrZOTO4_57mYqG6pgpMVn9CXgZpyPfLJGcYeXLsmcCBMwI&usqp=CAE', 100, '0.9', '200.00', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Talit de Poli�ster com Listras Pretas', 'Xale de ora��o de Poli�ster com listras pretas. Importado de Israel, dispon�vel nos tamanhos assinalados. Imagem meramente ilustrativa, podendo variar alguns detalhes. Importado de Israel.', 'https://http2.mlstatic.com/D_NQ_NP_610879-MLB49470276279_032022-O.webp', 100, '0.9', '580.00', '0.4', 1, 6, 1, 1, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Talit de Poli�ster com Listras Azuis', 'Xale de ora��o de Poli�ster com listras azuis. Importado de Israel, dispon�vel nos tamanhos assinalados. Imagem meramente ilustrativa, listras azuis e frisos dourados ou prateados Importado de Israel.', 'https://http2.mlstatic.com/D_NQ_NP_630054-MLB49470243657_032022-O.webp', 100, '0.9', '580.00', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Kipa Judaico Cetim Com Estrela De Davi', 'Kip� de cetim branca com borda, feita a maquina. Mede aproximadamente 17 cm de di�metro.', 'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcQUehA2KwwHWksYkhiHHPtomCsEcfbdJ9kcGzHienyOZ7ZdqENFK4GnOHOZFYC84fUFMjaApwyLEweiPK1xbZX87k4gXkGdM1AlMbieK5EvIKtN-6fYL7icxw&usqp=CAE', 100, '0.9', '42.90', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Kipa Judaico Cetim Com Forro Interno Preto', 'Kip� de cetim preto com borda, feita a maquina. Mede aproximadamente 17 cm de di�metro.', 'https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcR74zanlrhFtyB9nw8foZU7xpzmdQGwoTyr7yR957Uqu8mYHlISscU3YV1vwd8WqGz-Sy6xBsBIAHLQtOAlz9Y0JH7RDpTe-nDgxgvx2i5NzGFexwwDFzcBIg&usqp=CAE', 100, '0.9', '36.90', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Copo Para Vinho Judaico', 'C�lice de kidush sem p�, prateado, decorado com detalhes em alto relevo, tanto no copo como no pires.', 'https://http2.mlstatic.com/D_NQ_NP_627590-MLB48987957400_012022-O.webp', 100, '0.9', '199.90', '0.4', 1, 6, 1, null, 1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Ta�a De Santa Ceia Prata Kidush', 'Este elegante copo de Kiddush banhado a prata e a placa correspondente adicionar�o eleg�ncia a qualquer mesa de Shabat.', 'https://http2.mlstatic.com/D_NQ_NP_719282-MLB48802839874_012022-O.webp', 100, '0.9', '290.90', '0.4', 1, 6, 1, 1, 1);

-- ENDERECOS
INSERT INTO endereco (ID_ENDERECO, apelido, NOME_LOGRADOURO, TIPO_LOGRADOURO, numero, cep, estado, cidade, bairro) 
VALUES(1, 'Casa', 'independencia', 'Rua' , '123','43700-000', 'BA','Salvador', 'CIA 2');

INSERT INTO endereco (ID_ENDERECO, apelido, NOME_LOGRADOURO, TIPO_LOGRADOURO, numero, cep, estado, cidade, bairro) 
VALUES(2, 'Trabalho', 'Jardim Das Margaridas', 'Avenioda' , '26','8900-000', 'SP','S�o Paulo', 'Oceania');

-- 

-- CLIENTES COM ENDERECOS 
INSERT INTO cliente (id_cliente, cpf, nome, email, senha, nascimento, genero, fixo, celular) 
VALUES(1, '111.222.333-44', 'Ana Vit�ria de Melo','vitoria@hotmail.com' , '123','2000-02-01','FEMININO', '(11) 83490-3943', '(11) 83490-3943');

INSERT INTO cliente_endereco (fk_cliente, fk_endereco) 
VALUES(1, 1);

INSERT INTO cliente (id_cliente, cpf, nome, email, senha, nascimento, genero, fixo, celular) 
VALUES(2, '2222.444.555-66', 'Lucas Costa Santos','lucas@hotmail.com' , '123','2002-02-01','MASCULINO', '(11) 83490-3943', '(11) 83490-3943');

INSERT INTO cliente_endereco (fk_cliente, fk_endereco) 
VALUES(2, 2);

INSERT INTO cliente_endereco (fk_cliente, fk_endereco) 
VALUES(3, 1);
select * from cliente_endereco ce ;

-- ENTREGAS


INSERT INTO ENTREGA (id_entrega, forma_entrega, valor_frete) 
VALUES(1, "PADRAO", 20.00);

INSERT INTO ENTREGA (id_entrega, forma_entrega, valor_frete ) 
VALUES(2, "EXPRESSA", 35.50);

INSERT INTO ENTREGA (id_entrega, forma_entrega, valor_frete ) 
VALUES(3, "AGENDADA", 45.00);


-- PEDIDOS
INSERT INTO pedido (id_pedido, data_pedido , forma_pagamento, status_pedido, valor_total, fk_id_cliente, fk_id_endereCo, entrega) 
VALUES(1, '2000-02-01', 'PIX','AGUARDANDO_PAGAMENTO', '45.6', 1, 1, 2);

INSERT INTO ITEM_PEDIDO (id_pedido, id_produto, quantidade) 
VALUES(1, 1,5);

INSERT INTO pedido (id_pedido, data_pedido , forma_pagamento, status_pedido, valor_total, fk_id_cliente, fk_id_endereCo, entrega) 
VALUES(2, '2000-02-01', 'CARTAO','AGUARDANDO_PAGAMENTO', '45.6', 2, 1, 3);

INSERT INTO ITEM_PEDIDO (id_pedido, id_produto, quantidade) 
VALUES(2, 2,1);

-- 

select * from endereco e ;

select * from item_pedido ip ;

-- Query's
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

SELECT 
C.ID_CLIENTE,
C.NOME,
CONCAT(SUBSTR(CPF, 1,9), '-', SUBSTR(CPF, 10,11)) AS 'CPF',
C.EMAIL,
C.SENHA,
DATE_FORMAT(NASCIMENTO, '%d-%m-%Y') AS 'NASCIMENTO',
C.FIXO,
C.CELULAR,
C.GENERO,
E.APELIDO,
E.TIPO_LOGRADOURO,
E.NOME_LOGRADOURO,
E.NUMERO,
E.CEP,
E.CIDADE,
E.BAIRRO,
E.ESTADO
FROM CLIENTE C
JOIN ENDERECO E
ON
E.ID_ENDERECO = C.ID_CLIENTE;

select * from pedido;
select P.ID_PEDIDO, 
DATE_FORMAT(P.DATA_PEDIDO, '%d-%m-%Y') AS 'DATA_PEDIDO',
P.FORMA_PAGAMENTO,
P.STATUS_PEDIDO,
P.VALOR_TOTAL,
C.NOME AS NOME_CLIENTE,
C.CPF,
C.EMAIL,
C.FIXO,
C.CELULAR,
E.APELIDO,
CONCAT(E.TIPO_LOGRADOURO,' ', E.NOME_LOGRADOURO, ' ','-', ' ', E.NUMERO) AS ENDERECO,
E.CIDADE,
E.BAIRRO,
E.ESTADO,
E.CEP,
PD.NOME AS NOME_PRODUTO,
PD.PRECO AS PRECO_UNT,
PD.VOLUME,
PD.PESO,
IP.QUANTIDADE AS QUANTIDADE
FROM PEDIDO P  
inner JOIN CLIENTE C ON P.FK_ID_CLIENTE = C.ID_CLIENTE
inner JOIN ENDERECO E ON P.FK_ID_ENDERECO = E.ID_ENDERECO
INNER JOIN ITEM_PEDIDO IP ON IP.ID_PEDIDO = P.ID_PEDIDO 
INNER JOIN PRODUTO PD ON IP.ID_PRODUTO = PD.ID_PRODUTO;

-- select P.ID_PRODUTO, P.NOME, P.ESTOQUE, P.PRECO, C.NOME, D.NOME, F.RAZAO_SOCIAL FROM PRODUTO P join CATEGORIA C on P.FK_ID_CATEGORIA = C.ID_CATEGORIA join DEPARTAMENTO D on P.FK_ID_DEPARTAMENTO = D.ID_DEPARTAMENTO join FORNECEDOR F on P.FK_ID_FORNECEDOR =  F.ID_FORNECEDOR WHERE P.FL_INATIVO != 0;