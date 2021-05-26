-- Querys DLL de criação de BD e Tabelas
CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT UNIQUE,
    descricao VARCHAR(255) NOT NULL,
    perecivel BOOLEAN,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto INT NOT NULL AUTO_INCREMENT UNIQUE,
    nome VARCHAR(255) NOT NULL,
    validade VARCHAR(255) NULL,
    quantidade VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    fk_categoria INT NOT NULL,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

-- Querys DML de população de tabelas
INSERT INTO tb_categoria (descricao, perecivel)
VALUES
('verduras e legumes',TRUE),
('frutas',TRUE),
('castanhas e cereais',FALSE),
('temperos',FALSE),
('ovos e laticinios',TRUE);

INSERT INTO tb_produto (nome, validade, quantidade, preco, fk_categoria)
VALUES
('abacaxi','7 dias','1 item',7.50,2),
('pepino','7 dias','3 itens',5.50,1),
('castanha do pará',NULL,'5kg',75.00,3),
('beterraba','5 dias','7 itens',10.00,1),
('tempero baiano',NULL,'100g',2.50,4),
('banana','5 dias','12 itens',12.50,2),
('ovos','25 dias','30 itens',15.00,5),
('batata grande','10 dias','15 itens',25.00,1);

-- Querys DML de Consulta e Relacionamento entre tabelas --

-- select que retorne os Produtos com o valor maior do que 5.0 reais
SELECT nome AS Produto, validade AS Validade, quantidade AS quantidade,
preco AS Preço FROM tb_produto
WHERE preco > 5.0;

-- select trazendo  os Produtos com valor entre 3 e 60 reais
SELECT nome AS Produto, validade AS Validade, quantidade AS quantidade,
preco AS Preço FROM tb_produto
WHERE preco BETWEEN 3.0 AND 60.0;

-- select  utilizando LIKE buscando os Produtos com a letra C
SELECT nome AS Produto, validade AS Validade, quantidade AS quantidade,
preco AS Preço FROM tb_produto
WHERE nome LIKE '%C%'; -- que contém C

-- select com Inner join entre  tabela categoria e produto.
SELECT descricao AS Categoria, perecivel AS Perecível, nome AS Produto, 
validade AS Validade, quantidade AS quantidade, preco AS Preço 
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_produto.fk_categoria;

-- select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são aves ou legumes)
SELECT descricao AS Categoria, perecivel AS Perecível, nome AS Produto, 
validade AS Validade, quantidade AS quantidade, preco AS Preço 
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_produto.fk_categoria
WHERE descricao LIKE '%legumes%';
