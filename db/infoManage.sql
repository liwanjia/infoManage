DROP TABLE  IF EXISTS `descript_info`;

CREATE TABLE `descript_info` (
  `info_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '描述id',
  `message` varchar(255) DEFAULT NULL COMMENT '描述',
  `note` varchar(20) DEFAULT NULL COMMENT '备注',
  `create_date` datetime DEFAULT NULL COMMENT '入库时间',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `state` char DEFAULT '1' COMMENT '启用状态',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



DROP TABLE  IF EXISTS `image_info`;

CREATE TABLE `image_info` (
  `image_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `info_id` int(4) NOT NULL DEFAULT 0 COMMENT '描述id',
  `image_path` varchar(60) DEFAULT NULL COMMENT '图片路径',
  `note` varchar(20) DEFAULT NULL COMMENT '备注',
  `create_date` datetime DEFAULT NULL COMMENT '入库时间',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `state` char DEFAULT '1' COMMENT '启用状态',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;