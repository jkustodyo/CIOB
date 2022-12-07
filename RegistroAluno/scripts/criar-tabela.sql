
-- drop table if exists Materia;
-- drop table if exists Aluno;

create table Aluno (
	idAluno int AUTO_INCREMENT PRIMARY KEY,
	nome varchar(100) not null,
	datanasc date not null,
	rg varchar(30) default '',
	cpf varchar(30) default '',
	turma varchar(30) default '',
	curso varchar(30) default '',
	turno varchar(20) default '',
	ano varchar(4) default '',
	sexo char(1) default null,
	foto blob
);

INSERT INTO Aluno (nome,datanasc,rg,cpf,turma,curso,turno,ano) VALUES
	 ('Letícia Santos Oliveira','2006-03-24',NULL,NULL,NULL,NULL,NULL,NULL),
	 ('Eric Santos Oliveira','2000-04-06',NULL,NULL,NULL,NULL,NULL,NULL),
	 ('Denise Ana Augusta dos Santos Oliveira','1980-03-04',NULL,NULL,NULL,NULL,NULL,NULL),
	 ('José Custódio Oliveira Gomes','1971-09-27',NULL,NULL,NULL,NULL,NULL,NULL);


CREATE TABLE Materia (
  idNotas int(11) NOT NULL AUTO_INCREMENT,
  idAluno int(11) NOT NULL,
  bimestre char(20) DEFAULT NULL,
  mat int(11) DEFAULT NULL,
  port int(11) DEFAULT NULL,
  geo int(11) DEFAULT NULL,
  his int(11) DEFAULT NULL,
  lit int(11) DEFAULT NULL,
  artes int(11) DEFAULT NULL,
  redacao int(11) DEFAULT NULL,
  fis int(11) DEFAULT NULL,
  bio int(11) DEFAULT NULL,
  qui int(11) DEFAULT NULL,
  ed_f int(11) DEFAULT NULL,
  PRIMARY KEY (idNotas),
  KEY aluno_matricula_fkey (idAluno),
  CONSTRAINT aluno_matricula_fkey FOREIGN KEY (idAluno) REFERENCES Aluno (idAluno)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
