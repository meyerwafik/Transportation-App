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
-- Table structure for table `customertest`
--

DROP TABLE IF EXISTS `customertest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customertest` (
  `Name` text NOT NULL,
  `Average_Rating` double DEFAULT '5',
  `Phone_number` text NOT NULL,
  `Wallet` int(11) DEFAULT '0',
  `Subscription` binary(1) DEFAULT '0',
  `Credit_card_number` text,
  `State` text,
  `Email` varchar(50) NOT NULL,
  `Password` text NOT NULL,
  `Number_of_rides` int(11) DEFAULT '0',
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customertest`
--

LOCK TABLES `customertest` WRITE;
/*!40000 ALTER TABLE `customertest` DISABLE KEYS */;
INSERT INTO `customertest` VALUES ('admin',0,'admin',239,_binary '0','admin','Free','admin','admin',0),('Ahmed',5,'01101100483',119,_binary '\0','12356','InRide','ahmedkhaled@yahoo.com','1235',1),('Andrew',0,'01221231241',0,_binary '0','312414','NotInRide','dodo@mo5tar.com','1234',0),('Meyer',0,'01283132414',4,_binary '0','241241','NotInRide','mayer@yahoo.com','12345',0),('Meyer',0,'01289419393',0,_binary '0','65432','NotInRide','meyerwafik@gmail.com','54321',0),('Tamer',0,'01241516351',12,_binary '0','41241241','NotInRide','tamer@yahoo.com','12345',0),('Mark',0,'01289419393',10,_binary '0','1241215','NotInRide','test@test.com','1357',0),('Youssef',4.95,'01271922223',20,_binary '\0','12345','NotinRide','yoyo.magdy@rocketmail.com','1234',2);
/*!40000 ALTER TABLE `customertest` ENABLE KEYS */;
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
