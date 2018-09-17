/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : itf

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-17 18:02:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `account_name` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'admin', 'admin', 'admin', '1', '0');

-- ----------------------------
-- Table structure for `asserter`
-- ----------------------------
DROP TABLE IF EXISTS `asserter`;
CREATE TABLE `asserter` (
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `deep` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of asserter
-- ----------------------------

-- ----------------------------
-- Table structure for `auth`
-- ----------------------------
DROP TABLE IF EXISTS `auth`;
CREATE TABLE `auth` (
  `id` varchar(255) NOT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `can_read_self` varchar(255) DEFAULT NULL,
  `can_read_other` varchar(255) DEFAULT NULL,
  `can_edit_self` varchar(255) DEFAULT NULL,
  `can_edit_other` varchar(255) DEFAULT NULL,
  `can_add_self` varchar(255) DEFAULT NULL,
  `can_add_other` varchar(255) DEFAULT NULL,
  `can_del_self` varchar(255) DEFAULT NULL,
  `can_del_other` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auth
-- ----------------------------

-- ----------------------------
-- Table structure for `directive`
-- ----------------------------
DROP TABLE IF EXISTS `directive`;
CREATE TABLE `directive` (
  `id` varchar(255) NOT NULL,
  `target_id` varchar(255) DEFAULT NULL,
  `sequence` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of directive
-- ----------------------------
INSERT INTO `directive` VALUES ('24B2954575A6082693241403B39AE59A', '404687C8BA0C2B2E0CFCCBFF890F2F9C', '0', '0', 'fda', '0');
INSERT INTO `directive` VALUES ('39EF1F505144896548ACEAEA3E813F83', '1E4722CC314BB461A9845AF6370C87C8', '', '0', 'fda', '0');
INSERT INTO `directive` VALUES ('64235E3B5DB6D38F085CE0780D08C53E', '01CCA98F3F946B60436DA9B3C199B654', '0', '0', 'b1', '0');
INSERT INTO `directive` VALUES ('74C891AA53939CEA651DB45698E331DB', '01CCA98F3F946B60436DA9B3C199B654', '0', '1', 'a2', '0');
INSERT INTO `directive` VALUES ('9261B7314A540D5F9BFD8D8ACB7F4F06', '404687C8BA0C2B2E0CFCCBFF890F2F9C', '0', '1', 'fa', '0');
INSERT INTO `directive` VALUES ('95380C9801F998C9D5B6FEA3683D2F8B', '1E4722CC314BB461A9845AF6370C87C8', '', '1', 'tag', '0');
INSERT INTO `directive` VALUES ('B2E36A8FFCC397F90DA81F78C83BE161', '01CCA98F3F946B60436DA9B3C199B654', '0', '1', 'a1', '0');
INSERT INTO `directive` VALUES ('CCB7A4A6DE072B47929AE0E12380FB67', '01CCA98F3F946B60436DA9B3C199B654', '0', '0', 'b2', '0');

-- ----------------------------
-- Table structure for `env`
-- ----------------------------
DROP TABLE IF EXISTS `env`;
CREATE TABLE `env` (
  `id` varchar(255) NOT NULL,
  `env_name` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of env
-- ----------------------------

-- ----------------------------
-- Table structure for `env_varibale`
-- ----------------------------
DROP TABLE IF EXISTS `env_varibale`;
CREATE TABLE `env_varibale` (
  `id` varchar(255) DEFAULT NULL,
  `env_id` varchar(255) DEFAULT NULL,
  `k` varchar(255) DEFAULT NULL,
  `v` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of env_varibale
-- ----------------------------

-- ----------------------------
-- Table structure for `execute`
-- ----------------------------
DROP TABLE IF EXISTS `execute`;
CREATE TABLE `execute` (
  `plan_id` int(11) DEFAULT NULL,
  `result_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of execute
-- ----------------------------

-- ----------------------------
-- Table structure for `global_variable`
-- ----------------------------
DROP TABLE IF EXISTS `global_variable`;
CREATE TABLE `global_variable` (
  `id` varchar(255) NOT NULL,
  `env_id` varchar(255) DEFAULT NULL,
  `k` varchar(255) DEFAULT NULL,
  `v` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of global_variable
-- ----------------------------

-- ----------------------------
-- Table structure for `local_variable`
-- ----------------------------
DROP TABLE IF EXISTS `local_variable`;
CREATE TABLE `local_variable` (
  `id` varchar(255) NOT NULL,
  `plan_id` varchar(255) DEFAULT NULL,
  `k` varchar(255) DEFAULT NULL,
  `v` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of local_variable
-- ----------------------------

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` varchar(255) NOT NULL,
  `account_id` varchar(255) DEFAULT NULL,
  `msg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for `paraminfo`
-- ----------------------------
DROP TABLE IF EXISTS `paraminfo`;
CREATE TABLE `paraminfo` (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `target_id` varchar(255) DEFAULT NULL,
  `k` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `v` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `is_delete` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paraminfo
-- ----------------------------
INSERT INTO `paraminfo` VALUES ('12030BF6AF0BAEA0431DDD958D825B11', '1E4722CC314BB461A9845AF6370C87C8', null, 'fa', '0');
INSERT INTO `paraminfo` VALUES ('2B0063B54F1A4F657C4BC719957D3C54', '404687C8BA0C2B2E0CFCCBFF890F2F9C', null, 'fda', '0');
INSERT INTO `paraminfo` VALUES ('CFD08F0653A82B3A3B0F424C2FB00B9A', '01CCA98F3F946B60436DA9B3C199B654', null, '1', '0');

-- ----------------------------
-- Table structure for `plan`
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan` (
  `id` varchar(255) NOT NULL,
  `plan_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plan
-- ----------------------------

-- ----------------------------
-- Table structure for `plan_detail`
-- ----------------------------
DROP TABLE IF EXISTS `plan_detail`;
CREATE TABLE `plan_detail` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `target_id` varchar(255) DEFAULT NULL,
  `ext` varchar(255) DEFAULT NULL,
  `step` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plan_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `result`
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `id` varchar(255) DEFAULT NULL,
  `is_success` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `status_text` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `headers` varchar(255) DEFAULT NULL,
  `config` varchar(255) DEFAULT NULL,
  `json` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(255) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'Tester', '0');

-- ----------------------------
-- Table structure for `target`
-- ----------------------------
DROP TABLE IF EXISTS `target`;
CREATE TABLE `target` (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  `lev` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `account_id` varchar(255) DEFAULT NULL,
  `is_dir` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `content_type` varchar(255) DEFAULT NULL,
  `is_mock` varchar(255) DEFAULT NULL,
  `is_delete` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of target
-- ----------------------------
INSERT INTO `target` VALUES ('01CCA98F3F946B60436DA9B3C199B654', 'fda', null, 'fdasf', '1', null, '1', '0', 'get', null, null, '0', '2018-09-14 16:41:21', '2018-09-14 16:41:21');
INSERT INTO `target` VALUES ('0E2712A16E9724E232F75B8D5A1B0F70', 'vcvVVbxv', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 17:03:46', '2018-09-14 17:03:46');
INSERT INTO `target` VALUES ('1', '用例管理', null, null, '-1', '0', '1', '1', null, null, null, '0', null, '2018-09-17 16:17:10');
INSERT INTO `target` VALUES ('1E4722CC314BB461A9845AF6370C87C8', 'ffa', null, 'fa', '1', null, '1', '0', 'post', null, null, '0', '2018-09-14 16:31:00', '2018-09-14 16:31:00');
INSERT INTO `target` VALUES ('404687C8BA0C2B2E0CFCCBFF890F2F9C', 'fda', null, 'fda', '1', null, '1', '0', 'delete', null, null, '0', '2018-09-14 16:46:15', '2018-09-14 16:46:15');
INSERT INTO `target` VALUES ('4810FAA6F38153531CA2722536E42162', 'daf', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 16:56:34', '2018-09-14 16:56:34');
INSERT INTO `target` VALUES ('59A3201A8463ED4758D2E6E9C6E51815', 'fdaagfaga', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 17:03:39', '2018-09-14 17:03:39');
INSERT INTO `target` VALUES ('BC4DED65A2E2ED069E54B88A865E0AEF', 'fgasg', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 17:03:14', '2018-09-14 17:03:14');
INSERT INTO `target` VALUES ('C8F814CF08C34E06CC2D605C6E316021', 'gda', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 17:01:37', '2018-09-14 17:01:37');
INSERT INTO `target` VALUES ('CCB6DC067C05D5F94AC2696756175ED1', 'gggg', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 17:01:24', '2018-09-14 17:01:24');
INSERT INTO `target` VALUES ('EA25D124824441B7150DE800C1C649F5', 'DIR', null, null, '1', null, '1', '1', null, null, null, '0', '2018-09-14 16:55:34', '2018-09-14 16:55:34');
