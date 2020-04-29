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
-- Table structure for table `driver_dataaccess`
--

DROP TABLE IF EXISTS `driver_dataaccess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver_dataaccess` (
  `Name` text,
  `Driver_Email` varchar(50) NOT NULL,
  `Phone` text,
  `Average_Rate` double DEFAULT NULL,
  `Completed_Trips` int(11) DEFAULT NULL,
  `Car` text,
  `Type` text,
  `Plate_number` text,
  `Colour` text,
  `Amount_per_km` double DEFAULT NULL,
  `Location_X` int(11) DEFAULT NULL,
  `Location_Y` int(11) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  PRIMARY KEY (`Driver_Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver_dataaccess`
--

LOCK TABLES `driver_dataaccess` WRITE;
/*!40000 ALTER TABLE `driver_dataaccess` DISABLE KEYS */;
INSERT INTO `driver_dataaccess` VALUES ('Mikha','abomi5awa7edbas@gmail.com','01272056597',5,21,'TOYOTA_COROLLA','Pets','KGF246','Orange',5.75,100,500,2020),('Dodo','erkabyaabdo@nene.com','01226809098',4.97,10,'VOLKSWAGEN_PASSAT','Luxury','3NN','Grey',6.5,400,375,2020),('George','liverpoolchampion2019@cl.com','01122025464',4.7,4,'BYD_F3','Economy','NUM111','Purple',4.5,200,150,2018),('Ahmed','manchblue@liverpool.com','0110100483',4.8,7,'BAJAJ_BOXER','Scooter','MIB5','Blue',2.5,500,700,2017),('Mark','yarabnenga7@yahoo.com','01271827372',4.99,2,'VOLKSWAGEN_PASSAT','Luxury','DKA12','Red',6.5,300,200,2019);
/*!40000 ALTER TABLE `driver_dataaccess` ENABLE KEYS */;
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
