UNLOCK TABLES;
DROP DATABASE IF EXISTS `cst323`;
CREATE DATABASE IF NOT EXISTS `cst323` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cst323`;
-- MySQL dump 10.13  Distrib 5.7.26, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: testapp
-- ------------------------------------------------------
-- Server version	5.7.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ORDERS`
--

DROP TABLE IF EXISTS `ORDERS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ORDERS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_NO` varchar(25) NOT NULL,
  `PRODUCT_NAME` varchar(128) NOT NULL,
  `PRICE` float NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `USERS`;
CREATE TABLE `USERS` (
  `ID` int(15) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) NOT NULL,
-- `EMAIL` varchar(50) NOT NULL,
  `PASSWORD` varchar(250) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
--
-- Dumping data for table `ORDERS`
--

LOCK TABLES `ORDERS` WRITE;
/*!40000 ALTER TABLE `ORDERS` DISABLE KEYS */;
INSERT INTO `ORDERS` VALUES (1,'0000000000','This is Product 1',1,1),
(2,'0000000001','This is Product 2',2,2),
(3,'0000000002','This is Product 3',3,3),
(4,'0000000003','This is Product 4',4,4),
(5,'0000000004','This is Product 5',5,5),
(6,'0000000005','This is Product 6',6,6),
(7,'0000000006','This is Product 7',7,7),
(8,'0000000007','This is Product 8',8,8),
(9,'0000000008','This is Product 9',9,9),
(10,'0000000009','This is Product 10',10,10),
(11,'0000000100','This is Product 100',10,10);
/*!40000 ALTER TABLE `ORDERS` ENABLE KEYS */;
UNLOCK TABLES;
INSERT INTO `USERS` VALUES (1,'Test1', 'Test1');
SELECT * FROM `cst323`.`ORDERS`;
SELECT * FROM `cst323`.`USERS`;
-- /*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
-- /*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
-- /*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
-- /*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
-- /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
-- /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
-- /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- /*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-28  7:16:52