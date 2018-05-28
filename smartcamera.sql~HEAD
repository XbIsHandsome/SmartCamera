/*
 Navicat Premium Data Transfer

 Source Server         : Mybaits
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : smartcamera

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 11/05/2018 18:23:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `cid` int(20) NOT NULL,
  `department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `last_week_nattend` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for class_course
-- ----------------------------
DROP TABLE IF EXISTS `class_course`;
CREATE TABLE `class_course`  (
  `ccid` int(20) NOT NULL,
  `cid` int(20) NOT NULL,
  `csid` int(20) NOT NULL,
  PRIMARY KEY (`ccid`) USING BTREE,
  INDEX `classid`(`cid`) USING BTREE,
  INDEX `courseid`(`csid`) USING BTREE,
  CONSTRAINT `classid` FOREIGN KEY (`cid`) REFERENCES `class` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `courseid` FOREIGN KEY (`csid`) REFERENCES `course` (`csid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `csid` int(20) NOT NULL,
  `coursename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `teacher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `semester` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `week_time` datetime(6) NOT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `warning` int(255) NOT NULL,
  PRIMARY KEY (`csid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model`  (
  `mid` int(20) NOT NULL,
  `model_file` blob NOT NULL,
  `sid` int(20) NOT NULL,
  PRIMARY KEY (`mid`) USING BTREE,
  INDEX `sid`(`sid`) USING BTREE,
  CONSTRAINT `sid` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nattend
-- ----------------------------
DROP TABLE IF EXISTS `nattend`;
CREATE TABLE `nattend`  (
  `nid` int(20) NOT NULL,
  `sid` int(20) NOT NULL,
  `cid` int(20) NOT NULL,
  `csid` int(20) NOT NULL,
  `time` datetime(0) NOT NULL,
  `week` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `semester` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`nid`) USING BTREE,
  INDEX `studentid`(`sid`) USING BTREE,
  INDEX `clid`(`cid`) USING BTREE,
  INDEX `courid`(`csid`) USING BTREE,
  CONSTRAINT `clid` FOREIGN KEY (`cid`) REFERENCES `class` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `courid` FOREIGN KEY (`csid`) REFERENCES `course` (`csid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `studentid` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(20) NOT NULL,
  `studentname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cid` int(20) NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE,
  INDEX `cid`(`cid`) USING BTREE,
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `class` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
