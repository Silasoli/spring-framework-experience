use db_cadastro_cliente;

create table if not exists tb_cliente(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome varchar(80) NOT NULL
);