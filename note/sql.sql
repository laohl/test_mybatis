CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '名字',
  `balance` decimal(7,2) DEFAULT '0.00' COMMENT '余额',
  `add_time` datetime DEFAULT NULL COMMENT '出生日期',
  `sex` char(1) DEFAULT '1' COMMENT '性别 1-男 0-女',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;