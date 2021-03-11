DROP TABLE IF EXISTS `cientifico`;
CREATE TABLE `cientifico` (
  `dni` varchar(8) NOT NULL,
  `nomapels` varchar(255) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB;



DROP TABLE IF EXISTS `proyecto`;
CREATE TABLE `proyecto` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `horas` INT NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;


DROP TABLE IF EXISTS `asignado`;
CREATE TABLE `asignado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cientifico` varchar(8) NOT NULL,
  `proyecto` char(4) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cientifico_FK_1` FOREIGN KEY (`cientifico`) REFERENCES `cientifico` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `proyecto_FK_1` FOREIGN KEY (`proyecto`) REFERENCES `proyecto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO cientifico (dni,nomapels) values ('12345678','David Lascorz');
INSERT INTO cientifico (dni,nomapels) values ('09847264','Jorge Morillo');

INSERT INTO proyecto (id,nombre,horas) values ('AAAA','Bricomania',200);
INSERT INTO proyecto (id,nombre,horas) values ('BBBB','Bauhaus',105);

INSERT INTO asignado (cientifico,proyecto) VALUES ('12345678','AAAA');
INSERT INTO asignado (cientifico,proyecto) VALUES ('09847264','BBBB');