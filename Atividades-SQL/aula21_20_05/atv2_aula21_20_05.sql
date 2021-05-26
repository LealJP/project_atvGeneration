CREATE DATABASE db_concessionaria;
USE db_concessionaria;
CREATE TABLE tb_automovel (
	id_automovel INT NOT NULL AUTO_INCREMENT,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    ano CHAR(4) NOT NULL,
    transmissao VARCHAR(255),
    preco FLOAT NOT NULL,
    UNIQUE (id_automovel),
    PRIMARY KEY (id_automovel)
);
INSERT INTO tb_automovel (marca, modelo, ano, transmissao, preco)
VALUES
('FIAT','Idea MPI ESSENCE','2012','manual',30999.00),
('KIA','Picanto EX','2013','automático',36299.0),
('FIAT','Idea MPI ESSENCE','2012','manual',30999.0),
('FORD','Focus SE SEDAN','2014','automático',48799.0),
('FORD','Ka MPI','2013','manual',21999.0),
('VOLKSWAGEN','Golf 200 TSI Total Confortline','2018','automático',94799.0),
('TOYOTA','Corolla XEI','2019','automático',106799.0),
('TOYOTA','Etios X SEDAN','2014','manual',36799.0);

SELECT modelo, ano, preco FROM tb_automovel WHERE preco > 500.0;
SELECT * FROM tb_auomovel WHERE preco < 500.0;

UPDATE tb_automovel 
SET 
	modelo = 'Argo FIREFLY DRIVE', 
	ano = '2020',
    transmissao = 'manual',
    preco = 58999.0 
WHERE id_automovel = 3;





