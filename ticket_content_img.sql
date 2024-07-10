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
-- Table structure for table `content_img`
--

DROP TABLE IF EXISTS `content_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content_img` (
  `content_img_code` bigint NOT NULL AUTO_INCREMENT,
  `content_img_name` varchar(255) DEFAULT NULL,
  `content_img_url` varchar(255) DEFAULT NULL,
  `content_ori_name` varchar(255) DEFAULT NULL,
  `thumbnail` varchar(255) DEFAULT NULL,
  `content_code` bigint DEFAULT NULL,
  PRIMARY KEY (`content_img_code`),
  KEY `FK51nq3kbhp70j7wj3vdgg8k486` (`content_code`),
  CONSTRAINT `FK51nq3kbhp70j7wj3vdgg8k486` FOREIGN KEY (`content_code`) REFERENCES `content` (`content_code`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content_img`
--

LOCK TABLES `content_img` WRITE;
/*!40000 ALTER TABLE `content_img` DISABLE KEYS */;
INSERT INTO `content_img` VALUES (1,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050913330642.jpg',NULL,NULL,260),(2,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050913330867.jpg',NULL,NULL,260),(3,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024052313295783.jpg',NULL,NULL,260),(4,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024062410153324.jpg',NULL,NULL,260),(5,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006741-04.jpg',NULL,NULL,260),(7,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24008147-05.jpg',NULL,NULL,261),(8,NULL,'https://ticketimage.interpark.com/240067462024/06/10/bc29a023.jpg',NULL,NULL,262),(9,NULL,'https://ticketimage.interpark.com/240067462024/05/29/859e2bf3.jpg',NULL,NULL,262),(10,NULL,'https://ticketimage.interpark.com/240067462024/05/29/859e2bf3.jpg',NULL,NULL,262),(11,NULL,'https://ticketimage.interpark.com/240067462024/05/31/07c057c8.jpg',NULL,NULL,262),(12,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006746-08.jpg',NULL,NULL,262),(13,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006746-07.jpg',NULL,NULL,262),(14,NULL,'https://ticketimage.interpark.com/240082432024/06/12/f63ea57a.jpg',NULL,NULL,263),(15,NULL,'https://ticketimage.interpark.com/240082432024/06/12/b7bf9cc7.jpg',NULL,NULL,263),(16,NULL,'https://ticketimage.interpark.com/240082432024/06/12/2dc08440.jpg',NULL,NULL,263),(17,NULL,'https://ticketimage.interpark.com/240082432024/06/12/1cfd937e.jpg',NULL,NULL,263),(18,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024061311124859.jpg',NULL,NULL,263),(19,NULL,'	https://ticketimage.interpark.com/Play/image/etc/24/24008243-02.jpg',NULL,NULL,263),(20,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24008243-03.jpg',NULL,NULL,263),(21,NULL,'https://ticketimage.interpark.com/240082482024/06/12/5c89d63c.jpg',NULL,NULL,264),(22,NULL,'https://ticketimage.interpark.com/240082482024/06/12/1f90e337.jpg',NULL,NULL,264),(23,NULL,'https://ticketimage.interpark.com/240082482024/06/12/8433e62c.jpg',NULL,NULL,264),(24,NULL,'https://ticketimage.interpark.com/240082482024/06/12/ac6fbcb9.jpg',NULL,NULL,264),(25,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24008248-02.jpg',NULL,NULL,264),(26,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24008248-03.jpg',NULL,NULL,264),(27,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050817204202.jpg',NULL,NULL,265),(28,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050817205349.jpg',NULL,NULL,265),(29,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024061415171190.jpg',NULL,NULL,265),(30,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006709-02.jpg',NULL,NULL,265),(31,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006709-04.jpg',NULL,NULL,265),(32,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050723431082.jpg',NULL,NULL,266),(33,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024061910273918.jpg',NULL,NULL,266),(34,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024062417291233.jpg',NULL,NULL,266),(35,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024062417290449.jpg',NULL,NULL,266),(36,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050723420882.jpg',NULL,NULL,266),(37,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006515-02.jpg',NULL,NULL,266),(38,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006515-05.jpg',NULL,NULL,266),(39,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024050315124992.jpg',NULL,NULL,267),(40,NULL,'https://ticketimage.interpark.com/240006382024/06/10/47d26fd8.png',NULL,NULL,267),(41,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24000638-07.jpg',NULL,NULL,267),(42,NULL,'https://ticketimage.interpark.com/P00038392024/04/15/93568416.jpg',NULL,NULL,268),(43,NULL,'https://ticketimage.interpark.com/P00038392024/04/08/f96d7f09.jpg',NULL,NULL,268),(44,NULL,'https://ticketimage.interpark.com/P00038392024/05/14/0f8d208e.jpg',NULL,NULL,268),(45,NULL,'https://ticketimage.interpark.com/P00038392024/06/10/acc079ff.jpg',NULL,NULL,268),(46,NULL,'https://ticketimage.interpark.com/P00038392024/06/04/1f9e7835.jpg',NULL,NULL,268),(47,NULL,'https://ticketimage.interpark.com/P00038392024/05/24/7591892d.jpg',NULL,NULL,268),(48,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/P0003839-09.jpg',NULL,NULL,268),(49,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/P0003839-13.jpg',NULL,NULL,268),(50,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024053115572885.jpg',NULL,NULL,269),(51,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24006875-05.jpg',NULL,NULL,269),(52,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024061917125355.jpg',NULL,NULL,271),(53,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024061917115611.jpg',NULL,NULL,271),(54,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024052914543423.jpg',NULL,NULL,271),(55,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024051309340315.jpg',NULL,NULL,271),(56,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024062411460589.jpg',NULL,NULL,271),(57,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/6/2024062422385416.jpg',NULL,NULL,271),(58,NULL,'https://ticketimage.interpark.com/Play/ITM/Data/Modify/2024/5/2024052010112985.jpg',NULL,NULL,271),(59,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24004604-15.jpg',NULL,NULL,271),(60,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24004604-17.jpg',NULL,NULL,271),(61,NULL,'https://ticketimage.interpark.com/240077032024/06/14/23cab7dc.jpg',NULL,NULL,272),(62,NULL,'https://ticketimage.interpark.com/Play/image/etc/24/24007703-03.jpg',NULL,NULL,272);
/*!40000 ALTER TABLE `content_img` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-10 10:00:44
