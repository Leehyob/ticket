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
-- Table structure for table `theater`
--

DROP TABLE IF EXISTS `theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theater` (
  `theater_code` bigint NOT NULL AUTO_INCREMENT,
  `theater_name` varchar(255) DEFAULT NULL,
  `theater_seat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`theater_code`)
) ENGINE=InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theater`
--

LOCK TABLES `theater` WRITE;
/*!40000 ALTER TABLE `theater` DISABLE KEYS */;
INSERT INTO `theater` VALUES (1,'전국투어',NULL),(2,'KT＆G 상상마당 대치아트홀',NULL),(3,'뉴스뮤지엄 연희',NULL),(4,'올림픽공원 우리금융아트홀',NULL),(5,'청라블루노바홀',NULL),(6,'초록씨어터',NULL),(7,'경복궁아트홀',NULL),(8,'영등포아트홀',NULL),(9,'예술의전당 자유소극장',NULL),(10,'시온아트홀',NULL),(11,'모두누림센터',NULL),(12,'유니버설아트센터 루나홀',NULL),(13,'대학로 유니플렉스 3관',NULL),(14,'마포아트센터 플레이맥',NULL),(15,'두산아트센터 Space111',NULL),(16,'JTN 아트홀 3관',NULL),(17,'지인시어터(구.알과핵소극장)',NULL),(18,'소극장 선물 1관',NULL),(19,'라온아트홀',NULL),(20,'홍익대 대학로 아트센터 소극장',NULL),(21,'대학로극장 쿼드',NULL),(22,'명동예술극장',NULL),(23,'동국대학교 이해랑예술극장',NULL),(24,'대학로 선돌극장',NULL),(25,'피카소 소극장',NULL),(26,'평택남부문화예술회관 대공연장',NULL),(27,'대학로 세우아트센터 2관',NULL),(28,'플랫폼74',NULL),(29,'윤당아트홀 1관',NULL),(30,'스카이씨어터',NULL),(31,'도토리씨어터',NULL),(32,'마루아트홀',NULL),(33,'해바라기 소극장',NULL),(34,'아이들극장',NULL),(35,'용인시문예회관 처인홀',NULL),(36,'초콜릿팩토리',NULL),(37,'댕로홀',NULL),(38,'아라아트홀',NULL),(39,'용인문화예술원 마루홀',NULL),(40,'아스가르드 씨어터',NULL),(41,'용인포은아트홀',NULL),(42,'홍대 윤형빈소극장',NULL),(43,'대학로예술극장 소극장',NULL),(44,'대학로 오마이갓 전용관',NULL),(45,'용인시 평생학습관 큰어울마당',NULL),(46,'제나아트홀',NULL),(47,'대학로 아트포레스트 2관',NULL),(48,'대학로 올래홀',NULL),(49,'하땅세극장',NULL),(50,'서연아트홀',NULL),(51,'우리소극장',NULL),(52,'스튜디오블루',NULL),(53,'미아리고개예술극장',NULL),(54,'올림아트센터',NULL),(55,'우란2경',NULL),(56,'Culture Relay Ticket',NULL),(57,'대관령야외공연장',NULL),(58,'세종문화회관',NULL),(59,'예술의전당 콘서트홀',NULL),(60,'세종문화회관 대극장',NULL),(61,'전국 각 지역',NULL),(62,'성남아트센터 오페라하우스',NULL),(63,'예술의전당 IBK챔버홀',NULL),(64,'예술의전당 오페라극장',NULL),(65,'해당 공연장',NULL),(66,'성남아트센터',NULL),(67,'롯데콘서트홀',NULL),(68,'대구문화예술회관',NULL),(69,'고양아람누리 아람음악당',NULL),(70,'라움아트센터 4층 체임버홀',NULL),(71,'여의도 KBS홀',NULL),(72,'부산 동래문화회관 대극장',NULL),(73,'대전예술의전당 아트홀',NULL),(74,'대원콘텐츠라이브',NULL),(75,'대한성공회 서울주교좌성당',NULL),(76,'경동교회',NULL),(77,'아트센터인천 콘서트홀',NULL),(78,'현대카드 언더스테이지',NULL),(79,'신영체임버홀',NULL),(80,'예술의전당 리사이틀홀',NULL),(81,'세종문화회관 체임버홀',NULL),(82,'동구문화체육센터 공연장',NULL),(83,'더현대서울 6층 ALT.1',NULL),(84,'북촌 어둠속의대화',NULL),(85,'동탄 어둠속의대화',NULL),(86,'광주비엔날레전시관',NULL),(87,'예술의전당 한가람미술관 1층',NULL),(88,'예술의전당 한가람디자인미술관',NULL),(89,'DDP(동대문디자인플라자) 아트홀1, 컨퍼런스 홀',NULL),(90,'DUEX',NULL),(91,'솔올미술관',NULL),(92,'JCC아트센터',NULL),(93,'인사센트럴뮤지엄',NULL),(94,'예술의전당 한가람미술관 제7전시실',NULL),(95,'그라운드시소 명동',NULL),(96,'미디어 아트 갤러리 언더독뮤지엄',NULL),(97,'KT&G상상마당부산',NULL),(98,'예술의전당 한가람미술관 2층',NULL),(99,'코엑스 Hall B',NULL),(100,'충무아트센터 갤러리 신당',NULL),(101,'아트팩토리 참기름',NULL),(102,'Process ITW(프로세스 이태원)',NULL),(103,'부산 영도 피아크 전시장 2F,3F',NULL),(104,'이월드 83타워 뮤지엄',NULL),(105,'광주시립미술관 제1~6전시실',NULL),(106,'롯데칠성 강릉공장',NULL),(107,'띠아트 홍대',NULL),(108,'북서울꿈의숲 상상톡톡미술관',NULL),(109,'GIDC 광명역',NULL),(110,'춘천 애니메이션박물관',NULL),(111,'구하우스미술관',NULL),(112,'아라리오뮤지엄 인 스페이스',NULL),(113,'성곡미술관 1,2관',NULL),(114,'강동아트센터 복합문화공간 아트랑 SPACE 1, 2, 3',NULL),(115,'서면미술관',NULL),(116,'예술의전당 한가람미술관 3층',NULL),(117,'하리보 해피월드 인 제주',NULL),(118,'대원뮤지엄 팝콘D스퀘어',NULL),(119,'올림픽공원 KSPO DOME',NULL),(120,'블루스퀘어 마스터카드홀',NULL),(121,'송도달빛축제공원',NULL),(122,'소향씨어터 신한카드홀',NULL),(123,'건국대학교 새천년관 대공연장',NULL),(124,'엠피엠지 2층 LOUNGE M.',NULL),(125,'KBS 아레나',NULL),(126,'장충체육관',NULL),(127,'제주,대구,부산,수원,여수',NULL),(128,'해당없음',NULL),(129,'벡스코 오디토리움',NULL),(130,'명화 라이브 홀',NULL),(131,'무신사 개러지',NULL),(132,'부평아트센터 해누리 극장',NULL),(133,'KBS아레나 일대',NULL),(134,'일산 킨텍스 제1전시장 1, 2홀',NULL),(135,'잠실 실내체육관',NULL),(136,'고양아람누리 아람극장',NULL),(137,'백암아트홀',NULL),(138,'인스파이어 아레나',NULL),(139,'올림픽공원 올림픽홀',NULL),(140,'LG아트센터 서울 U+ 스테이지',NULL),(141,'신한카드 SOL페이 스퀘어 라이브홀',NULL),(142,'연세대학교 대강당',NULL),(143,'전국 각 공연장',NULL),(144,'SK올림픽 핸드볼경기장',NULL),(145,'명화 라이브홀',NULL),(146,'인천 파라다이스시티',NULL),(147,'서울KBS 아레나 홀',NULL),(148,'성수아트홀',NULL),(149,'KBS아레나',NULL),(150,'구로아트밸리 예술극장',NULL),(151,'부산 영화의전당 야외극장',NULL),(152,'KT&G 상상마당 라이브홀',NULL),(153,'고양, 부산, 수원',NULL),(154,'구름아래소극장',NULL),(155,'꿈빛극장',NULL),(156,'파라다이스시티',NULL),(157,'서울,고양',NULL),(158,'KT＆G 상상마당 홍대',NULL),(159,'연세대학교 백주년기념관 콘서트홀',NULL),(160,'서울랜드',NULL),(161,'올림픽공원 88잔디마당, 88호수수변무대',NULL),(162,'부천시민회관 소공연장',NULL),(163,'고양아람누리 새라새극장',NULL),(164,'무신사 개러지,롤링홀',NULL),(165,'언더스테이지',NULL),(166,'예스24스테이지 1관','https://ticketimage.interpark.com/TMGSNAS/TMGS/R/21/21000291RGN001.gif'),(167,'기타',NULL),(168,'대학로 TOM(티오엠) 1관',NULL),(169,'플러스씨어터',NULL),(170,'링크아트센터드림 드림4관',NULL),(171,'인터파크 유니플렉스 2관',NULL),(172,'예스24스테이지 2관',NULL),(173,'서울숲씨어터 2관',NULL),(174,'세종문화회관 M씨어터',NULL),(175,'목동아이스링크',NULL),(176,'대구',NULL),(177,'대학로 SH아트홀',NULL),(178,'소월아트홀',NULL),(179,'JTN 아트홀 1관',NULL),(180,'대학로 스타시티 7층 후암씨어터',NULL),(181,'마포아트센터 아트홀 맥',NULL),(182,'예향콘서트홀',NULL),(183,'예스24스테이지 3관',NULL),(184,'한전아트센터',NULL),(185,'두산아트센터 연강홀',NULL),(186,'링크아트센터 벅스홀',NULL),(187,'인터파크 유니플렉스 1관',NULL),(188,'연남장',NULL),(189,'국립극장 해오름극장',NULL),(190,'대학로 세우아트센터 1관',NULL),(191,'경향아트힐',NULL),(192,'브릭스씨어터',NULL),(193,'대학로 하마씨어터',NULL),(194,'명동, 홍대',NULL),(195,'더굿씨어터',NULL),(196,'명보아트홀 가온홀',NULL),(197,'서울아트센터 도암홀',NULL),(198,'CKL스테이지',NULL),(199,'무하아트센터',NULL);
/*!40000 ALTER TABLE `theater` ENABLE KEYS */;
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
