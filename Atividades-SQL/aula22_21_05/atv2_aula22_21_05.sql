-- Querys DLL de criação de BD e Tabelas
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT UNIQUE,
    tamanho  VARCHAR(255) NOT NULL,
    tipo VARCHAR(255),
    PRIMARY KEY(id_categoria)
);
CREATE TABLE tb_pizza (
	id_pizza INT NOT NULL AUTO_INCREMENT UNIQUE,
	sabor VARCHAR(255) NOT NULL,
    descricao_sabor VARCHAR(255) NOT NULL,
    recheio_borda VARCHAR(255) NULL,
    preco DECIMAL(5,2) NOT NULL,
    fk_categoria INT NOT NULL,
    PRIMARY KEY(id_pizza),
    FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

-- Querys DML de população de tabelas
INSERT INTO tb_categoria (tamanho, tipo)
VALUES
('pequena','doce'),
('média','agridoce'),
('grande','doce'),
('pequeno','salgada'),
('média','salgada'),
('grande','salgada');

INSERT INTO tb_pizza (sabor, descricao_sabor, recheio_borda, preco, fk_categoria)
VALUES
('Portuguesa','ovos, cebola, azeitona, ervilha, queijo e presunto','catupiry',45.50,2),
('Marguerita','molho, muçarela, tomate e manjericão','cheddar',45.75,5),
('Portuguesa','ovos, cebola, azeitona, ervilha, queijo e presunto','cheddar',35.25,4),
('Romeu e Julieta','muçarela de búfala e goiabada','',55.50,2),
('Califórnia','peito de peru, muçarela, pêssego, figo e abacaxi','',65.00,6),
('Napolitana','muçarela, azeite, manjericão e molho de tomate','catupiry',37.50,4),
('Brigadeiro','chocolate, granulado e morango','',65.25,3),
('Brigadeiro','chocolate, granulado e morango','chocolate',35.00,1); 

-- Querys DML de Consulta e Relacionamento entre tabelas --

-- select que retorne as pizzas com o valor maior do que 45 reais
SELECT sabor AS Sabor, descricao_sabor AS Ingredientes, recheio_borda AS Borda, 
preco AS Preço FROM tb_pizza
WHERE preco > 45.00;
/* Obs: coloquei um INNER JOIN nesse caso só para fins de clareza, pois 
o sabor/tipo da pizza está na tabela categoria*/

-- select trazendo  as pizzas com valor entre 29 e 60 reais
SELECT sabor AS Sabor, descricao_sabor AS Ingredientes, recheio_borda AS Borda, 
preco AS Preço FROM tb_pizza
WHERE preco BETWEEN 29.00 AND 60.00;

-- select  utilizando LIKE buscando as pizzas que contenham a letra c
SELECT sabor AS Sabor, preco AS Preço
FROM tb_pizza
WHERE sabor LIKE '%c%';

-- select com InnerJoin entre  tabela categoria e pizza
SELECT sabor AS Sabor, descricao_sabor AS Ingredientes, recheio_borda AS Borda, 
preco AS Preço, tamanho AS Tamanho, tipo AS Tipo
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria;

-- select onde traga todos as pizzas de uma categoria específica 
-- (exemplo todos os produtos que são pizza doce)
SELECT sabor AS Sabor, descricao_sabor AS Ingredientes, recheio_borda AS Borda, 
preco AS Preço, tamanho AS Tamanho, tipo AS Tipo
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria
WHERE tipo = 'doce';

