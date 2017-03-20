/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.7.13-log : Database - one2one
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`one2one` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `one2one`;

/*Table structure for table `husband` */

DROP TABLE IF EXISTS `husband`;

CREATE TABLE `husband` (
  `hid` int(11) NOT NULL,
  `hname` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `husband` */

insert  into `husband`(`hid`,`hname`) values (1,'崔一'),(2,'崔二');

/*Table structure for table `wife` */

DROP TABLE IF EXISTS `wife`;

CREATE TABLE `wife` (
  `wid` int(11) NOT NULL,
  `wname` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`wid`),
  CONSTRAINT `wife_husband_fk` FOREIGN KEY (`wid`) REFERENCES `husband` (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wife` */

insert  into `wife`(`wid`,`wname`) values (1,'刘一'),(2,'刘二');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
