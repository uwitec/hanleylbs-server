/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2012-06-05 11:26:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accountId` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `userId` int(10) DEFAULT NULL,
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'hanley', 'hanley', '1');
INSERT INTO `account` VALUES ('2', 'kevin', 'kevin', '2');
INSERT INTO `account` VALUES ('3', 'lacey', 'lacey', '4');
INSERT INTO `account` VALUES ('4', 'ob', 'ob', '3');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `age` int(10) DEFAULT NULL,
  `gender` int(10) DEFAULT NULL,
  `online` int(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `longitude` varchar(100) DEFAULT NULL,
  `latitude` varchar(100) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '25', '1', '1', '18659264592', 'Hanley Towne', '厦门五缘湾', '118.115387', '24.496521', 'test');
INSERT INTO `user` VALUES ('2', '26', '1', '1', '18476785431', 'kevin', '软件园二期', '118.115387', '24.496521', 'test');
INSERT INTO `user` VALUES ('3', '25', '1', '1', '18698765456', 'OB', '软件园二期', '118.115387', '24.496521', 'test');
INSERT INTO `user` VALUES ('4', '22', '0', '1', '18659264593', 'Lacey Lee', '厦门火车站', '118.115387', '24.496521', 'test');
INSERT INTO `user` VALUES ('5', '28', '1', '1', '16794876532', 'Jack', '美国纽约', '118.115387', '24.496521', 'test');
INSERT INTO `user` VALUES ('6', '26', '5', '1', '16599878765', 'Rose', '美国新泽西', '118.115387', '24.496521', 'test');
