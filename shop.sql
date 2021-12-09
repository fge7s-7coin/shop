/*
 Navicat Premium Data Transfer

 Source Server         : pass
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : shop

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 09/12/2021 09:20:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` varchar(36) NOT NULL,
  `consignee` varchar(255) DEFAULT NULL,
  `consignee_tel` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of address
-- ----------------------------
BEGIN;
INSERT INTO `address` VALUES ('0b1b42b552434d588c569ada14a2d738', 'fge7s111', '13377778888', 'qwe1111111', 'fge7s', '2021.11.02 10:18:36', '0');
INSERT INTO `address` VALUES ('1', '1', '13377778882', '张三', '123', '1', '0');
INSERT INTO `address` VALUES ('2', '2', '2', '2', '22', '2', '1');
INSERT INTO `address` VALUES ('47036cd97ee24290a23f27ff4d4cfe91', 'fge7s', '13377778888', 'qwe', 'fge7s', '2021.11.02 09:42:15', '0');
COMMIT;

-- ----------------------------
-- Table structure for big_type
-- ----------------------------
DROP TABLE IF EXISTS `big_type`;
CREATE TABLE `big_type` (
  `id` varchar(36) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of big_type
-- ----------------------------
BEGIN;
INSERT INTO `big_type` VALUES ('04345af34d274cde9752d08ddcc197e2', 'admin111', '2021.11.06 12:28:47', '0');
INSERT INTO `big_type` VALUES ('1559b38a24654b72bfcce093aaa18aa6', 'test333', '2021.11.06 12:49:29', '0');
INSERT INTO `big_type` VALUES ('2', 'fge7s', '1', '0');
INSERT INTO `big_type` VALUES ('3', 'admin123123', '1', '1');
INSERT INTO `big_type` VALUES ('4', 'mac book pro', '1', '0');
INSERT INTO `big_type` VALUES ('4bcb1f43366247edbb9e80538f4f5a24', '1111111111', '2021.11.06 22:14:56', '1');
INSERT INTO `big_type` VALUES ('5', 'test', '2021.11.02 19:15:09', '0');
INSERT INTO `big_type` VALUES ('6', '3,test', '2021.11.06 10:59:56', '1');
INSERT INTO `big_type` VALUES ('7', '3,test2', '2021.11.06 11:00:15', '1');
INSERT INTO `big_type` VALUES ('74f8bdb1835c46b5b9982179a0a32dbd', '2,fge7s', '2021.11.06 12:47:20', '1');
INSERT INTO `big_type` VALUES ('8', '4,test3', '2021.11.06 11:04:34', '1');
INSERT INTO `big_type` VALUES ('8fe0846529734e13965d3b70d77cb5b9', '3,fuckfuck', '2021.11.06 12:45:06', '1');
INSERT INTO `big_type` VALUES ('a3090540c9e447a8848ad9f5891dc2a1', '衣服', '2021.11.10 16:17:31', '0');
INSERT INTO `big_type` VALUES ('ba309e0f6c1a467593bbde48db99e15f', '中国mac', '2021.11.06 13:14:05', '0');
INSERT INTO `big_type` VALUES ('c5548b261263425aad38500b47c35304', '3,adminadmin', '2021.11.06 12:48:03', '1');
COMMIT;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` varchar(36) NOT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `describtion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `num` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `manufacturer` varchar(255) DEFAULT NULL,
  `small_type_id` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
INSERT INTO `goods` VALUES ('43f60c2c971649008082787dc188514d', '1234', '13377778882', '张三', '123', '1', '1', '1', '2021.11.02 15:00:03', '0', '1', '1');
INSERT INTO `goods` VALUES ('8d827266356c44e78391e078e6dbff5e', 'adminad', 'admin', 'admin', 'admin', 'admin', 'admin', 'admin', '2021.11.09 21:12:12', '0', '0', NULL);
INSERT INTO `goods` VALUES ('e1526fe8b10b4663ae83d1fa6435b0f0', 'qwewqeeqweq', 'ewqeeqwewq', 'ewqeeqwe', 'eqweeqwe', 'eqweeqwe', 'ewqeeqwe', 'eqweeqweqwe', '2021.11.09 21:03:23', '0', '0', NULL);
INSERT INTO `goods` VALUES ('e389feb1e3d642a08f1961b1cd6e60ec', 'admin', '13377778883', '李五', '123', '2', '2', '2', '2021.11.02 15:02:24', '0', '2', '1');
COMMIT;

-- ----------------------------
-- Table structure for goods_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `goods_evaluate`;
CREATE TABLE `goods_evaluate` (
  `id` varchar(36) NOT NULL,
  `goods_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `level` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods_evaluate
-- ----------------------------
BEGIN;
INSERT INTO `goods_evaluate` VALUES ('0718a0504e344d24817f8e5469202712', 'admin', 'tes', 'tes', 'admin', '4');
INSERT INTO `goods_evaluate` VALUES ('49027cdd917542b598ca5ceddb229884', '2', '3', '3', '2', '2');
INSERT INTO `goods_evaluate` VALUES ('bc80ecbfbc39464e86391547051cf9ee', 'tests', 'tests', 'gsfdgsdf                                                                                    ', 'gdsfg', '3');
COMMIT;

-- ----------------------------
-- Table structure for ord
-- ----------------------------
DROP TABLE IF EXISTS `ord`;
CREATE TABLE `ord` (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goods_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `address_id` varchar(255) DEFAULT NULL,
  `num` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `ord_no` varchar(255) DEFAULT NULL,
  `ord_state` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of ord
-- ----------------------------
BEGIN;
INSERT INTO `ord` VALUES ('5867e168910c4e17b450e8f08e98047a', '23123123', '3213', '321321', '312312', '321312', '32131', '3', '2021.11.09 21:25:06', '0');
INSERT INTO `ord` VALUES ('9459264cc3ef47ccafbcb77eeb830567', 'test', 'test', 'tests', 'dsad', 'dasdas', 'dsada', '0', '2021.11.09 21:17:03', '0');
COMMIT;

-- ----------------------------
-- Table structure for shop_car
-- ----------------------------
DROP TABLE IF EXISTS `shop_car`;
CREATE TABLE `shop_car` (
  `id` varchar(36) NOT NULL,
  `goods_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `num` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of shop_car
-- ----------------------------
BEGIN;
INSERT INTO `shop_car` VALUES ('1f97fb009d46455baad8f87c737f31bb', '11', '11', '11', '0');
INSERT INTO `shop_car` VALUES ('6ff1944cc56a423fa77e92b24b27e643', '2', '2', '100', '0');
INSERT INTO `shop_car` VALUES ('aedd490206464340a199216f4f8d087e', '1', '4', '1002', '0');
INSERT INTO `shop_car` VALUES ('bdd093f07e0946be98fc48e7535aec2f', 'abc', 'abc', 'abc', '0');
COMMIT;

-- ----------------------------
-- Table structure for small_type
-- ----------------------------
DROP TABLE IF EXISTS `small_type`;
CREATE TABLE `small_type` (
  `id` varchar(36) NOT NULL,
  `big_type_id` varchar(255) DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of small_type
-- ----------------------------
BEGIN;
INSERT INTO `small_type` VALUES ('2', '2', 'fge7s', '2021.11.02 20:51:52', '0');
INSERT INTO `small_type` VALUES ('f68d61b8a33a45859b554fdbf91766cd', '2', 'mac', '2021.11.07 12:21:23', '0');
INSERT INTO `small_type` VALUES ('fb4b987694d44844ae9db4b1ee83543e', '3', 'mac book pro', '2021.11.07 12:26:12', '0');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `real_name` varchar(255) DEFAULT NULL,
  `id_card` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '1asdasdasdasd', '32132131', '1312321', '13123213', '男', '121321321', '1', '0');
INSERT INTO `user` VALUES ('1a1ebd0caaf04e70a774637a167df68c', 'pp', '123123', '13', '13', '男', '123', '2021.11.10 16:16:13', '0');
INSERT INTO `user` VALUES ('3a37a92de1b841ab8cbd21ed280c54d4', '3333', '3', '3', '3', '男', '333', '2021.11.10 16:16:44', '0');
INSERT INTO `user` VALUES ('3e91d6a7d7d94e45bf2e580485a6295c', 'admin', 'admin', 'admin', 'admin', '男', 'admin', '2021.11.04 19:37:09', '0');
INSERT INTO `user` VALUES ('48f6e997f5d245e6b7c64e3577195fd7', 'fge7s', 'fge7s', 'fge7s', '111111', '1', '123213213', '2021.10.31 17:39:58', '0');
INSERT INTO `user` VALUES ('60f055154446473c9d2f69575a28b083', '111111111', '1111111111', '111111111', '111111111', '男', '111111111', '2021.11.04 20:11:03', '0');
INSERT INTO `user` VALUES ('eba7fff26612497fae386e957c6794e2', '2222222222222', '2222222', '222222', '22222222', '男', '2222222', '2021.11.04 20:12:05', '0');
COMMIT;

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` varchar(36) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `test` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user1
-- ----------------------------
BEGIN;
INSERT INTO `user1` VALUES ('1', '1', NULL);
INSERT INTO `user1` VALUES ('2', '2', NULL);
INSERT INTO `user1` VALUES ('3', '3', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
