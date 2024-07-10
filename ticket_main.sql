-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ticket
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `main`
--

DROP TABLE IF EXISTS `main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `main` (
  `main_code` bigint NOT NULL AUTO_INCREMENT,
  `main_img` varchar(255) DEFAULT NULL,
  `making` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`main_code`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main`
--

LOCK TABLES `main` WRITE;
/*!40000 ALTER TABLE `main` DISABLE KEYS */;
INSERT INTO `main` VALUES (8,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240625095147_16007528.gif&w=1920&q=75','slide'),(9,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240610094556_16007528.gif&w=1920&q=75','slide'),(10,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240621034719_24005722.gif&w=1920&q=75','slide'),(11,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240624024333_16007528.gif&w=1920&q=75','slide'),(12,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2404%2F240416092927_24005266.gif&w=1920&q=75','slide'),(13,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2405%2F240517091131_24006851.gif&w=1920&q=75','slide'),(14,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240626014422_16007528.gif&w=1920&q=75','slide'),(15,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2405%2F240524013858_24007162.gif&w=1920&q=75','slide'),(16,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2404%2F240424061723_24005971.gif&w=1920&q=75','slide'),(17,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2404%2F240417104334_16007528.gif&w=1920&q=75','slide'),(18,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2404%2F240423042820_24005706.gif&w=1920&q=75','slide'),(19,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FBbannerPC%2F2406%2F240605100253_24007059.gif&w=1920&q=75','slide'),(20,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240624111213_24005266.gif&w=640&q=75','banner'),(21,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240625103137_24006851.gif&w=640&q=75','banner'),(22,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240626020129_16007528.gif&w=640&q=75','banner'),(23,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240626042720_16007528.gif&w=640&q=75','banner'),(24,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240625102910_24008868.gif&w=640&q=75','banner'),(25,'https://tickets.interpark.com/_next/image?url=http%3A%2F%2Fticketimage.interpark.com%2FTCMS3.0%2FNMain%2FMiniBanner%2F2406%2F240617040250_24005706.gif&w=640&q=75','banner');
/*!40000 ALTER TABLE `main` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-10 10:00:43
