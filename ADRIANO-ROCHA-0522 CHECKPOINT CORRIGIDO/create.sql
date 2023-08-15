CREATE TABLE IF NOT EXISTS filiais
(ID int auto_increment PRIMARY KEY,
NOME varchar (255) NOT NULL,
RUA varchar (255) NOT NULL,
CIDADE varchar (255) NOT NULL,
ESTADO varchar (255) NOT NULL,
CINCOESTRELAS bit NOT NULL
);