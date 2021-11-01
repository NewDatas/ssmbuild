/*
 Navicat Premium Data Transfer

 Source Server         : mysql57_3306
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : localhost:3306
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 01/11/2021 15:41:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `bookID` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `bookCounts` int(11) NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bookID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, 'Java入门到精通', 3, 'null');
INSERT INTO `books` VALUES (2, '黑客与红客', 5, 'null');
INSERT INTO `books` VALUES (3, '数据结构', 2, 'null');
INSERT INTO `books` VALUES (4, '网络编程', 8, 'null');
INSERT INTO `books` VALUES (5, 'Java程序设计', 7, 'null');
INSERT INTO `books` VALUES (6, 'Java程序设计Ⅱ', 13, 'null');
INSERT INTO `books` VALUES (7, '白帽子', 8, 'null');
INSERT INTO `books` VALUES (8, '红黑树的奥妙', 11, 'null');

SET FOREIGN_KEY_CHECKS = 1;
