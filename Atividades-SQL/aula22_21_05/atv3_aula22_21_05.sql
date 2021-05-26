-- Querys DLL de criação de BD e Tabelas
CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;
CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT UNIQUE,
    descricao VARCHAR(255),
    setor VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
CREATE TABLE tb_produto (
	id_produto INT NOT NULL AUTO_INCREMENT UNIQUE,
    marca_ativo VARCHAR(255) NOT NULL,
    receita_obrigatorio BOOLEAN NULL,
    data_validade DATE NULL,
    preco decimal(10,2) NOT NULL,
    fk_categoria INT NOT NULL,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

-- Querys DML de população de tabelas
INSERT INTO tb_categoria (descricao, setor)
VALUES
('Fitoterápico','prateleira A'),
('Controlado', 'prateleira B'),
('Manipulado', 'pratelira C'),
('Referência', 'corredores 1 e 2'),
('Genérico', 'corredores 3 e 4');

INSERT INTO tb_produto (marca_ativo, receita_obrigatorio, data_validade, 
preco, fk_categoria)
VALUES
('Tylenol 500mg',FALSE,'2022-5-5', 15.55,4),
('Bromazepan 3mg',TRUE,'2022-1-25', 20.67,2),
('Paracetamol 500mg',FALSE,'2021-12-10', 2.39,5),
('Micofenolato de Mofetila 500mg',TRUE,'2021-7-15', 297.75,2),
('Biotina 5mg',TRUE,NULL, 18.50,3),
('Ginkgo Biloba',TRUE,NULL, 10.00,1),
('Omeprazol 20mg',FALSE,'2022-9-22', 13.99,5),
('Torsilax',FALSE,'2021-10-03', 6.99,4);

-- Querys DML de Consulta e Relacionamento entre tabelas --

-- select que retorne os Produtos com o valor maior do que 50 reais.
SELECT marca_ativo AS Medicamento, receita_obrigatorio AS Receita, 
data_validade AS Validade, preco AS Preço
FROM tb_produto WHERE preco > 50.00; 

-- select trazendo os produtos com valor entre 3 e 60 reais.
SELECT marca_ativo AS Medicamento, receita_obrigatorio AS Receita, 
data_validade AS Validade, preco AS Preço
FROM tb_produto WHERE preco BETWEEN 3.00 AND 60.00;

-- select  utilizando LIKE buscando os produtos que começam a letra B.
SELECT marca_ativo AS Medicamento, receita_obrigatorio AS Receita, 
data_validade AS Validade, preco AS Preço
FROM tb_produto WHERE marca_ativo LIKE 'b%';

-- select com Inner join entre  tabela categoria e produto
SELECT descricao AS Categoria, setor AS Setor, marca_ativo AS Medicamento,
receita_obrigatorio AS Receita, 
data_validade AS Validade, preco AS Preço
FROM tb_categoria
INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.fk_categoria;

-- select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são cosméticos)
SELECT descricao AS Categoria, setor AS Setor, marca_ativo AS Medicamento,
receita_obrigatorio AS Receita, 
data_validade AS Validade, preco AS Preço
FROM tb_categoria
INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.fk_categoria
WHERE descricao LIKE 'Controlado';

-- select e conte quantos remédios há em cada categoria
-- exercicio adicional para testar o funcionamento do group by e count
SELECT descricao AS Categoria, COUNT(*) AS Quantidade
FROM tb_categoria
INNER JOIN tb_produto ON tb_categoria.id_categoria = tb_produto.fk_categoria
GROUP BY descricao; 

