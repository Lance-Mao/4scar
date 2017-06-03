-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: carSystem
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.17.04.1

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
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Admin` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES (1,'mlw','123456'),(2,'Jack','aaaa'),(3,'kkkk','kkkk'),(4,NULL,NULL),(5,NULL,NULL),(6,NULL,NULL),(7,NULL,NULL),(8,NULL,NULL),(9,NULL,NULL),(10,NULL,NULL),(11,NULL,NULL),(12,'demo','demo'),(13,NULL,NULL),(14,NULL,NULL);
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `models` varchar(50) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL,
  `size` varchar(50) DEFAULT NULL,
  `fuel_consumption` varchar(50) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'奥迪','4000000','4.5','5',100),(2,'阿斯顿·马丁','500000','56','785',785),(3,'阿尔法·罗密欧','8485500','452','52',453),(4,'北京奔驰','51231','7496','7878',45),(5,'东风本田','502200','452','4545',454),(6,'宝马','50000','41','32',120),(7,'一汽马自达-阿特兹','1000000','12','22',100),(8,'上汽大众-帕萨特','1500000','12','12',120),(9,'吉利汽车-帝豪GS','15200000','11','12',1),(10,'as','4510','12','12',100),(11,'一汽-大众-迈腾','400000','41','4',10),(12,'123','123','123','213',123),(13,'123','123','123','123',123),(14,'123','123','123','123',213),(15,'123123','123','31','31',31),(16,'3','24','243','243',234),(17,'1234','134','142','142',412),(18,'12','12','12','12',12),(19,'123','123','123','231',123),(20,'123','123','12321','321',123),(21,'','','132','123',123),(22,'123','123','123','123',123),(23,'123','123','123','132',132),(24,'北京奔驰-奔驰C级','450000','152','120',120),(25,'上汽集团-荣威i6','45020000','153','001',20),(26,'上汽通用别克-英朗','1200000','1200','120',12),(27,'上汽大众-途昂','45','45','45',45),(28,'上汽大众-途昂','45','45','45',45),(29,'上汽大众-途昂','45','45','45',45),(30,'上汽大众-途昂','45','45','45',45),(31,'上汽大众-途昂','45','45','45',45),(32,'上汽大众-途昂','45','45','45',45),(33,'上汽大众-途昂','45','45','45',45),(34,'上汽大众-途昂','45','45','45',45),(35,'上汽大众-途昂','45','45','45',45),(36,'上汽大众-途昂','45','45','45',45),(37,'12','12','12','12',12),(38,'12','12','12','12',12),(39,'12','12','12','12',12),(40,'12','12','12','12',12),(41,'122','12','12','12',12),(42,'122','12','12','12',12),(43,'122','12','12','12',12),(44,'122','12','12','12',12),(45,'122','12','12','12',12),(46,'123','123','132','123',123),(47,'123','123','132','123',123),(48,'123','123','132','123',123),(49,'12','12','12','12',12),(50,'12','12','12','12',12),(51,'12','12','12','12',12),(52,'12','12','12','12',12),(53,'12','12','12','12',12),(54,'12','12','12','12',12),(55,'12','12','12','12',12),(56,'12','12','12','12',12),(57,'12','12','12','12',12),(58,'12','12','12','12',12),(59,'12','12','12','12',12),(60,'12','12','12','12',12),(61,'12','12','12','12',12),(62,'12','12','12','12',12),(63,'12','12','12','12',12),(64,'12','12','12','12',12),(65,'12','12','12','12',12),(66,'12','12','12','12',12),(67,'12','12','12','12',12),(68,NULL,'1500','12','12',12),(69,NULL,'15000','121','2',12),(70,NULL,'12','12','12',12),(71,NULL,'12','12','12',12),(72,NULL,'12','12','12',12),(73,NULL,'12','12','12',12),(74,NULL,'12','12','12',12);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-03 16:25:13
