CREATE TABLE if not exists FILIAL (
    id int auto_increment primary key,
    nomeFilial varchar(255),
    rua varchar(255),
    numero varchar(255),
    cidade varchar(255),
    estado varchar(255),
    ehCincoEstrelas Boolean
);