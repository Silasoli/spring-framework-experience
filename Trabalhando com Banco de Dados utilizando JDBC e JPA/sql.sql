create database if not exists digital_innovation_one; 
use digital_innovation_one; 

create table if not exists aluno(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome varchar(80) NOT NULL,
	idade INTEGER NOT NULL,
	estado character(2) NOT NULL
);

insert into aluno(nome, idade, estado) values ('Pedro', 20,'BA');
insert into aluno(nome, idade, estado) values ('Maria', 19,'RJ');
insert into aluno(nome, idade, estado) values ('Silas', 21,'BA');
insert into aluno(nome, idade, estado) values ('Vino', 21,'BA');
