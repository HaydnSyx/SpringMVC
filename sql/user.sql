/*
Navicat MySQL Data Transfer

Source Server         : SYX
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2016-04-05 09:27:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(32) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` text,
  `moeny` double(8,2) DEFAULT NULL,
  `has_phone` tinyint(1) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `insert_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
