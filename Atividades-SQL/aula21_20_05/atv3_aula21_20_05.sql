CREATE DATABASE db_escola;
USE db_escola;
CREATE TABLE tb_alunos (
	ra INT NOT NULL UNIQUE PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    turma INT NOT NULL,
    nota FLOAT
);
RENAME TABLE tb_alunos TO tb_alunes;
INSERT INTO tb_alunes (ra, nome, data_nascimento, turma, nota)
VALUES
(110201501,'Aline Santos','1998-10-25',10,7.5),
(120201635,'Renato Roberto','1999-8-3',20,6.0),
(210201515,'Paulo Roberto','1999-8-3',10,8.5),
(210201525,'João Pedro','2000-1-20',10,9.5),
(130201812,'Luís Henrique','2002-7-3',30,5.5),
(230201835,'Suzan Gleiser','1989-3-21',30,4.0),
(120201712,'João Vitor','2004-1-1',20,8.0),
(110201803,'Ana Carolina','2004-12-25',10,7.5);

SELECT * FROM tb_alunes WHERE nota > 7.0;
SELECT * FROM tb_alunes WHERE nota < 7.0;

SET SQL_SAFE_UPDATES = 0; 
UPDATE tb_alunes SET nota = 7.0 WHERE nome = "Luís Henrique";

