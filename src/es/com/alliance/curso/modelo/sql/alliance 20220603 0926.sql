-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.13-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema alliance
--

CREATE DATABASE IF NOT EXISTS alliance;
USE alliance;

--
-- Definition of table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
CREATE TABLE `alumnos` (
  `ALU_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ALU_APELLIDO` varchar(45) NOT NULL,
  `ALU_NOMBRE` varchar(45) NOT NULL,
  `ALU_EMAIL` varchar(45) DEFAULT NULL,
  `ALU_CONOCIMIENTOS` varchar(200) NOT NULL,
  `ALU_GIT` varchar(200) NOT NULL,
  `ALU_OBSERVACIONES` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ALU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alumnos`
--

/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` (`ALU_ID`,`ALU_APELLIDO`,`ALU_NOMBRE`,`ALU_EMAIL`,`ALU_CONOCIMIENTOS`,`ALU_GIT`,`ALU_OBSERVACIONES`) VALUES 
 (1,'MAIJO','Jose Adria',NULL,'24 años en la compañia programación en COBOL, ','https://github.com/jose-adria/CursoJava2022.g',NULL),
 (2,'GOU','Oscar',NULL,'15 años de experiencia en programacion cobol y pl','https://github.com/oscargouc/FromCobolToJava.',NULL),
 (3,'MOLINA','Jose Adrian',NULL,'10 años en la compañia programación en COBOL y PL, ','https://github.com/AdriaMolinaMartinez/CursoJ',NULL),
 (4,'Rodellas Roma','Gerard',NULL,'23 años en la compañia','https://github.com/gerardrodellas/CursoJava',NULL),
 (5,'Yepes Mallas','Ivan',NULL,'9 años en la compañia programación en COBOL, ','https://gitlab.com/gcasas1972/cursojava_mayo2',NULL),
 (6,'Fernandez','Javier',NULL,'15 años en la compañia programación en COBOL, ','https://github.com/fjavif77/Cursojava2022fjav',NULL),
 (7,'DONADA','Jordi',NULL,'10 años en la compañia programación en COBOL, ','https://github.com/jdonada/fromcoboltojava',NULL),
 (8,'Guirao Mellado ','Jordi',NULL,'10 años en la compañia','https://github.com/jordi-guirao/CursoJava2022',NULL),
 (9,'sin Apellido','Mariadel mar',NULL,'17 años en la compañia','sin rrepo',NULL),
 (10,'Boix planas','Ricard',NULL,'9 años en la compañia programación en COBOL y javaScript ','https://github.com/rboixp/fromcoboltojava.git',NULL),
 (11,'Navarro','Sergio',NULL,'10 años en la compañia programación en COBOL, java, PHP y ASP ','https://github.com/snavarrob/CursoJava2022.gi',NULL),
 (12,'Calderon','Wendi',NULL,'5 años en QA y nociones de JAVA ','https://github.com/Wendy0/CursoJava22.git',NULL),
 (13,'Domingo','Xavi',NULL,'15 años en la compañia programación en COBOL','https://github.com/XaviD2022/CursoJava2022.gi',NULL),
 (14,'Mendoza','Liliana',NULL,'10 años en la compañia programación en COBOL','https://github.com/LILIMSUC/Fromcobol.git',NULL);
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;


--
-- Definition of table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
CREATE TABLE `partidos` (
  `PAR_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRO_ID` int(10) unsigned NOT NULL,
  `PAR_DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`PAR_ID`),
  KEY `FK_Partidos_provincias` (`PRO_ID`),
  CONSTRAINT `FK_Partidos_provincias` FOREIGN KEY (`PRO_ID`) REFERENCES `provincias` (`PRO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `partidos`
--

/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` (`PAR_ID`,`PRO_ID`,`PAR_DESCRIPCION`) VALUES 
 (1,1,'Moron'),
 (2,1,'Haedo'),
 (3,1,'Tres de Febrero'),
 (4,1,'La Matanza'),
 (5,3,'Rosario'),
 (6,3,'San Lorenzo'),
 (7,3,'Tostado'),
 (8,4,'Yeba Buena'),
 (9,4,'San Miguel de Tucuman'),
 (10,4,'Tafi del Valle'),
 (11,5,'Rawson'),
 (12,5,'Gaiman'),
 (13,5,'Paso de Indios');
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;


--
-- Definition of table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
CREATE TABLE `provincias` (
  `PRO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRO_DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`PRO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `provincias`
--

/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` (`PRO_ID`,`PRO_DESCRIPCION`) VALUES 
 (1,'Bs As'),
 (3,'Santa Fe'),
 (4,'Tucuman'),
 (5,'Chubut');
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
