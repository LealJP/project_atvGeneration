-- Querys DLL de criação de BD e Tabelas
CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;
CREATE TABLE tb_classe (
	nivel_classe CHAR(1) UNIQUE NOT NULL,
    descricao_classe VARCHAR(255) NOT NULL,
    habilidade_especial VARCHAR(255) UNIQUE NOT NULL,
    PRIMARY KEY (nivel_classe)
);
CREATE TABLE tb_personagem (
	id_personagem INT NOT NULL AUTO_INCREMENT UNIQUE,
    nome VARCHAR(255) NOT NULL,
    ataque INT NOT NULL,
    defesa INT NOT NULL,
    equipamento VARCHAR(255) NOT NULL,
    fk_nivel CHAR(1) NOT NULL,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_nivel) REFERENCES tb_classe(nivel_classe)
);

-- Querys DML de população de tabelas
INSERT INTO tb_classe (nivel_classe, descricao_classe, habilidade_especial)
VALUES
('A','Divindade','imortalidade'),
('B','Mago','cura'),
('C','Dragão','solta fogo pela boca'),
('D','Criatura das Neves','raio congelante'),
('E', 'Humano','trapaça');

INSERT INTO tb_personagem (nome, ataque, defesa, equipamento, fk_nivel)
VALUES
('Zeus',4000,4000,'lançador de raios','A'),
('Hércules',1500,1000,'armadura','E'),
('Dumbledore',3000,2500,'varinha mágica','B'),
('Sub-Zero',2500,3000,'corrente de gelo','D'),
('Drogon',3500,2700,'calda cortante','C'),
('Gandalf',3500,3000,'cajado mágico','B'),
('Hela',4000,3800,'espada da justiça','A'),
('Goku',1800,1500,'calda macaco super sayajin 4','E');

-- Querys DML de Consulta e Relacionamento entre tabelas --

-- select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT nome AS personagem, ataque, defesa, fk_nivel AS classe FROM tb_personagem WHERE ataque > 2000;

-- select trazendo os personagens com poder de defesa entre 1000 e 2000.
SELECT nome AS personagem, ataque, defesa, fk_nivel AS classe FROM tb_personagem 
WHERE defesa BETWEEN 1000 AND 2000;

-- select  utilizando LIKE buscando os personagens com a letra C.
SELECT nome AS personagem, ataque, defesa, fk_nivel AS classe FROM tb_personagem
WHERE nome LIKE '%C%'; -- no caso que contém a letra C

-- select com Inner join entre  tabela classe e personagem
SELECT nome As Personagem, descricao_classe AS Classe, 
habilidade_especial AS Habilidade
FROM tb_classe
INNER JOIN tb_personagem ON tb_classe.nivel_classe = tb_personagem.fk_nivel;

/*select onde traga todos os personagem de uma classe específica 
(exemplo todos os personagens que são arqueiros)*/
SELECT nome AS Personagem, descricao_classe AS Classe 
FROM tb_classe
INNER JOIN tb_personagem ON tb_classe.nivel_classe = tb_personagem.fk_nivel
WHERE descricao_classe IN ('mago');
