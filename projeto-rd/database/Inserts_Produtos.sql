-- CATEGORIA 1.ARTIGOS // DEPARTAMENTO 1.CATÓLICA ;

select * from PRODUTO;
DROP database PRODUTO;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Caixa De Recordação Protegido E Guiado Divinamente Com Oração',
'Caixa De Recordação Protegido E Guiado Divinamente Com Oração: 
esta linda caixa de recordações tem o carinho que seus momentos merecem, juntamente com a proteção divina, 
a sugestão é guardar as lembranças deste momento tão especia', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Caixa-De-Recordacao-Protegido-e-Guiado-Divinamente-com-Oracao_74738a40-2d8e-46f4-b351-938fe5b5273a_5000x.jpg?v=1632947931', 
100, 
'0.10', 
'269.90', 
'2.0', 
1, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO,ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Porta Terço Do Anjo Da Guarda',
'Porta Terço Do Anjo Da Guarda:  Guarde nessa linda caixinha seus pedidos e seu terço.', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Porta-Terco-do-Anjo-da-Guarda_5000x.jpg?v=1651765571', 
100, 
'0.14', 
'169.90', 
'1.5', 
1, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME,DESCRICAO, URL_PRODUTO,ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Caixa De Recordação Santo Antônio',
'Caixa De Recordação Santo Antônio: guardar as lembranças dos momento tão especial.', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Caixa-De-Recordacao-Santo-Antonio_5da066cb-0bc9-4dd5-8346-2848cbbbf083_2000x.jpg?v=1632948209', 
100, 
'0.6', 
'199.99', 
'1.2', 
1, 
1, 
3, 
NULL, 
1);


-- CATEGORIA 2.ADESIVOS // DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adesivo de Transferência Terço Mariano',
'Adesivo de Transferência Terço Mariano: Belíssimo adesivo do Terço Mariano, para ser colado no seu carro ou qualquer outro lugar.', 
'https://images.tcdn.com.br/img/img_prod/660433/adesivo_terco_mariano_1217_1_bd47ca8768497f0c197846de45faaced.jpg', 
300, 
'0.2', 
'6.99', 
'0.2', 
2, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adesivo Anjo da Guarda',
'Adesivo Anjo da Guarda: Adesivo oval do Anjo da Guarda 10 cm de altura por 7 cm de largura.', 
'https://images.tcdn.com.br/img/img_prod/660433/adesivo_anjo_da_guarda_10x7_1241_1_99734506667681993494518784b72041.jpg',
300, 
'0.2', 
'9.99', 
'0.2', 
2, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adesivo FÉ',
'Adesivo FÉ: Adesivo FÉ oval de 10 cm de altura por 7 cm de largura.', 
'https://images.tcdn.com.br/img/img_prod/660433/adesivo_fe_10x7_1307_1_244815452a71e13fa289c28d9c6247aa.jpg', 
300, 
'0.2', 
'8.00', 
'0.2', 
2, 
1, 
3, 
NULL, 
1);


-- CATEGORIA 3.ADORNOS // DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adorno Para Porta 3 Arcanjos',
'Adorno Para Porta 3 Arcanjos: quatro medalhas feitas em madeira de São Gabriel, São Miguel, São Rafael e na ponta com a oração do Anjo da Guarda.', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Adorno-Para-Porta-3-Arcanjos_5000x.jpg?v=1630765819', 
400, 
'1.0', 
'89.99', 
'0.6', 
3, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adorno Santo Antônio Em Madeira Italiana',
'Adorno Santo Antônio Em Madeira Italiana: Tamanho: 4 x 5,5 cm, Material: Madeira, Origem: Itália.', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Adorno-Santo-Antonio-em-Madeira-Italiana_160d9920-fce7-4158-bec8-ff9f88a92447_5000x.jpg?v=1651865148',
400, 
'2.0', 
'19.99', 
'0.10', 
3, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Adorno Primeira Comunhão',
'Adorno Primeira Comunhão: Lindo adorno feito de resina imitando madeira, de fabricação italiana, com uma bela gravura com os símbolos da eucaristia em alto relevo e moldura toda trabalhada.', 
'https://cdn.shopify.com/s/files/1/0036/0142/products/Adorno-Primeira-Comunhao_f7476c7c-1770-4982-a9a1-61ddf4e53752_5000x.jpg?v=1631303418', 
100, 
'1.0', 
'39.00', 
'0.8', 
3, 
1, 
3, 
NULL, 
1);

-- CATEGORIA 4.ANÉIS // DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Anel São Jorge C/ Oração Aço Titânio Dourado Garantia',
'Anel São Jorge C/ Oração Aço Titânio Dourado Garantia: anel são jorge santo guerreiro com oração.', 
'https://http2.mlstatic.com/D_NQ_NP_869488-MLB45827357928_052021-O.webp', 
500, 
'5.0', 
'109.99', 
'0.60', 
4, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Anel Nossa Católico Senhora Aparecida Oração Proteção Aço',
'Anel Nossa Católico Senhora Aparecida Oração Proteção Aço: Material Aço, Cor Prateado.', 
'https://http2.mlstatic.com/D_NQ_NP_807212-MLB49527627122_032022-O.webp',
90, 
'2.0', 
'59.88', 
'0.80', 
4, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Anel Pedra Ametista Aço Titânio Cruz Cristão Garantia 3 Anos',
'Anel Pedra Ametista Aço Titânio Cruz Cristão Garantia 3 Anos: cores no momento: pedra ametista, pedra verde esmeralda, anel aço titânio, pedra natural.', 
'hhttps://http2.mlstatic.com/D_NQ_NP_850417-MLB46034795204_052021-O.webp', 
50, 
'1.0', 
'98.00', 
'0.90', 
4, 
1, 
3, 
NULL, 
1);

-- CATEGORIA 5.BÍBLIAS // DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Bíblia Ave Maria - Edição De Estudos',
'Bíblia Ave Maria - Edição De Estudos: Preparada por uma renomada equipe de biblistas, a edição de estudos da Bíblia Ave-Maria traz notas explicativas aprofundadas, atualizadas e de grande rigor exegético, além de referencias bíblicas paralelas e um abundante índice doutrinal.', 
'https://lojasantaterezinha.com.br/image/cache/catalog/723385893_img_61f2e4c45716c_1643308228-910x910.JPG', 
60, 
'1.3', 
'142.90', 
'0.6', 
5, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Bíblia Com  Lantejoula - Rosa - Ave Maria',
'Biblia Com  Lantejoula - Rosa - Ave Maria: modelo completamente inédito na história das Bíblias Católicas do Brasil. Ao movimentar as lantejoulas da capa para cima ou para baixo, o fiel irá se encantar com as ilustrações da cruz, símbolo da fé e do amor cristão e, também, do cálice com a hóstia, que é o alimento da nossa vida em Cristo.', 
'https://lojasantaterezinha.com.br/image/cache/catalog/Biblias%201605/B%C3%ADblia%20Ave%20Maria%20Lantejoula-910x910.JPG',
220, 
'1.9', 
'87.90', 
'0.6', 
5, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Bíblia Pastoral - Zíper - Jeans',
'Bíblia Pastoral - Zíper - Jeans: Disponível em diversos formatos e capas, a Nova Bíblia Pastoral apresenta linguagem simples, tradução a partir dos idiomas originais e notas explicativas a todos os textos. Ideal para encontros de catequese, a edição traz os avanços no campo da animação bíblica e a atualização dos estudos bíblicos das últimas décadas.', 
'https://lojasantaterezinha.com.br/image/cache/catalog/678128314_img_60219282753e8_1612812930-910x910.JPG', 
150, 
'1.0', 
'98.00', 
'0.7', 
5, 
1, 
3, 
NULL, 
1);


-- CATEGORIA 6.BENTA // DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Garrafa Porta Água Benta - Aparecida',
'Garrafa Porta Água Benta - Aparecida: Garrafa de vidro para água benta com tampa de metal dourado.', 
'https://lojasantaterezinha.com.br/image/cache/catalog/729423791_img_62602a6f2e9c3_1650469487-910x910.jpg', 
70, 
'158', 
'12.90', 
'0.6', 
6, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Pia De Água Benta - Espírito Santo',
'Pia De Água Benta - Espírito Santo: Pia de resina com acabamento pintado, possui cavidade para ser pendurado na parede.'
'https://lojasantaterezinha.com.br/image/cache/catalog/250921/IMAGEM%20PIA%20ESP%C3%8DRITO%20SANTO%2019,5X11CM-910x910.JPG',
70, 
'313', 
'87.90', 
'0.6', 
6, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Garrafinha Para Água Benta - Sagrada Familía',
'Garrafinha Para Água Benta - Sagrada Familía: Garrafinha de vidro com detalhes em metal e tampa de plástica com acabamento cromado.'
'https://lojasantaterezinha.com.br/image/cache/catalog/290521/PORTA%20AGUA%20BENTA%20OU%20%C3%93LEO%20SAGRADA%20FAM%C3%8DLIA-910x910.JPG', 
100, 
'38', 
'8.50', 
'0.7', 
6, 
1, 
3, 
NULL, 
1);


-- CATEGORIA 7.CÁLICES// DEPARTAMENTO 1.CATÓLICA ;

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Garrafa Porta Água Benta - Aparecida',
'Garrafa Porta Água Benta - Aparecida: Garrafa de vidro para água benta com tampa de metal dourado.', 
'https://lojasantaterezinha.com.br/image/cache/catalog/729423791_img_62602a6f2e9c3_1650469487-910x910.jpg', 
10, 
'158', 
'12.90', 
'0.6', 
6, 
1, 
1, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Cálice de Cobre ',
'Cálice de Cobre:Design moderno: Temos a opção com verniz e sem verniz, mantém a temperatura da bebida por mais tempo.'
'https://www.artesanatoemcobre.com.br/media/catalog/product/cache/1/image/380x350/9df78eab33525d08d6e5fb8d27136e95/c/a/calice-de-cobre.jpg',
10, 
'130', 
'87.90', 
'0.6', 
7, 
1, 
2, 
NULL, 
1);

insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, ESTOQUE, PESO, PRECO, VOLUME, FK_ID_CATEGORIA, 
FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO)
values ('Garrafinha Para Água Benta - Sagrada Familía',
'Garrafinha Para Água Benta - Sagrada Familía: Garrafinha de vidro com detalhes em metal e tampa de plástica com acabamento cromado.'
'https://lojasantaterezinha.com.br/image/cache/catalog/290521/PORTA%20AGUA%20BENTA%20OU%20%C3%93LEO%20SAGRADA%20FAM%C3%8DLIA-910x910.JPG', 
50, 
'38', 
'8.50', 
'0.7', 
6, 
1, 
3, 
NULL, 
1);













































