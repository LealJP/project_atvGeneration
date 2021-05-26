CREATE DATABASE db_rhhotelaria;
USE db_rhhotelaria;
CREATE TABLE tb_funcionaries (
	id_funcionarie INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    setor VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    salario FLOAT NULL,
    UNIQUE (id_funcionarie),
    PRIMARY KEY (id_funcionarie)
    );

INSERT INTO tb_funcionaries  (nome, setor, cargo, salario) 
VALUES
('Ana Paula Arósio','Recepção','recepcionista',1800.00),
("Renata D'Agostino",'Governança','governanta',3200.00),
('Lucas Paulino','Alimentos e Bebidas','garçom',2800.00),
('Paulo Ricardo','Reservas','assistente de reservas',2000.00),
('Julina Alcantara','Alimentos e Bebidas','chefe de cozinha',4500.00);

SELECT * FROM tb_funcionaries WHERE salario > 2000.00;
SELECT * FROM tb_funcionaries WHERE salario < 2000.00;

UPDATE tb_funcionaries SET salario = 2200.00 WHERE id_funcionarie = 4;


