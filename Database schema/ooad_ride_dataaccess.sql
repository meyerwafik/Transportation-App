-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ooad
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ride_dataaccess`
--

DROP TABLE IF EXISTS `ride_dataaccess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ride_dataaccess` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(45) NOT NULL,
  `Rate` varchar(45) DEFAULT NULL,
  `Review` varchar(200) DEFAULT NULL,
  `Km` double DEFAULT NULL,
  `Start_X` int(11) DEFAULT NULL,
  `Start_Y` int(11) DEFAULT NULL,
  `End_X` int(11) DEFAULT NULL,
  `End_Y` int(11) DEFAULT NULL,
  `Fare` int(11) DEFAULT NULL,
  `Driver_Email` varchar(50) DEFAULT NULL,
  `Discount` varchar(50) DEFAULT NULL,
  `Payment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ride_dataaccess`
--

LOCK TABLES `ride_dataaccess` WRITE;
/*!40000 ALTER TABLE `ride_dataaccess` DISABLE KEYS */;
INSERT INTO `ride_dataaccess` VALUES (1,'admin','3',NULL,0,128,128,124,135,0,'abomi5awa7edbas@gmail.com','0.25','Cash'),(2,'admin','2',NULL,0,324,421,421,421,0,'erkabyaabdo@nene.com','0.25','Cash'),(3,'admin','4',NULL,0,123,123,546,546,0,'yarabnenga7@yahoo.com','0.25','Cash'),(4,'admin','3',NULL,0,150,150,155,165,0,'yarabnenga7@yahoo.com','0.25','Cash'),(5,'admin','4',NULL,0,160,160,125,155,0,'yarabnenga7@yahoo.com','0.25','Cash'),(6,'admin','4','ddfs',0,159,152,155,115,0,'abomi5awa7edbas@gmail.com','0.25','Cash'),(7,'admin','3','dsfsdfs',0,120,120,150,150,0,'yarabnenga7@yahoo.com','0.0','Cash'),(8,'admin','3','fsdfdfa',0,120,120,150,150,0,'yarabnenga7@yahoo.com','0.0','Cash'),(9,'admin','4','fsdfsf',0,120,120,150,150,0,'yarabnenga7@yahoo.com','0.0','Cash'),(10,'admin','3','fsdfsd',0,120,120,150,150,0,'yarabnenga7@yahoo.com','0.0','Cash'),(11,'admin','3','fdsfsdfsdfds',0,120,120,150,150,0,'yarabnenga7@yahoo.com','0.35','Cash'),(12,'admin','3','adsadafaf',0,120,150,120,180,0,'yarabnenga7@yahoo.com','0.35','Cash'),(13,'admin','5','sdfdsfs',0,150,180,160,190,0,'yarabnenga7@yahoo.com','0.2','Cash'),(14,'admin','3','fdfdfs',0,150,150,200,160,0,'liverpoolchampion2019@cl.com','0.2','Cash'),(15,'admin','4','dsffsdf',0,150,189,120,170,0,'liverpoolchampion2019@cl.com','0.35','Cash'),(16,'admin','3','gfhjkvhgj',0,123,123,321,321,0,'abomi5awa7edbas@gmail.com','0.0','Cash'),(17,'admin','5','xvcxvxx',0,120,180,100,150,0,'liverpoolchampion2019@cl.com','0.2','Cash'),(18,'test@test.com','3','Good Ride',0,50,100,120,90,0,'manchblue@liverpool.com','0.2','Cash'),(19,'ahmedkhaled@yahoo.com','4','gOOD Driver',0,100,120,130,100,0,'yarabnenga7@yahoo.com','0.35','Cash'),(20,'mayer@yahoo.com','3','Good =driver',0,100,110,105,120,0,'manchblue@liverpool.com','0.35','Cash'),(21,'tamer@yahoo.com','3','Good Service',0,120,120,110,130,0,'abomi5awa7edbas@gmail.com','0.35','Cash'),(22,'tamer@yahoo.com','4','Very Good',0,120,120,125,132,0,'yarabnenga7@yahoo.com','0.35','Cash');
/*!40000 ALTER TABLE `ride_dataaccess` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-26 23:07:27
