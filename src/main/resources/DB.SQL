CREATE TABLE `T_COLLECTION_THINGS` (
  `Id` BIGINT(11) not null auto_increment comment '主键',
  `OWNER` VARCHAR(10) default null comment '用户',
  `CREATE_tIME` TIMESTAMP null default null comment '创建时间',
  `SUMMARY` VARCHAR(100) default null comment '摘要',
  `CONTENT` VARCHAR(200) default null comment '具体内容',
  `SCENE` VARCHAR(10) default null comment '场景',
  `IMPORTANCE_dEGREE` VARCHAR(10) default null comment '重要程度',
  `URGENCY_dEGREE` VARCHAR(10) default null comment '紧急程度',
  `IS_rEQUIRED_eND` VARCHAR(1) default null comment '是否有截止日',
  `LAST_dATE` TIMESTAMP null default null comment '最迟日期',
  `DEAL_mETHOD` VARCHAR(10) default null comment '是否有截止日',
  primary key (`id`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE `T_LOGGER` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号 ',
  `client_ip` varchar(255) DEFAULT NULL COMMENT '请求地址',
  `requst_rui` varchar(255) DEFAULT NULL COMMENT '请求路径',
  `request_type` varchar(255) DEFAULT NULL COMMENT '请求类型（普通、ajax)',
  `request_method` varchar(255) DEFAULT NULL COMMENT '(post\\get)',
  `param_data` text COMMENT '参数内容',
  `session_id` varchar(50) DEFAULT NULL COMMENT 'session标识',
  `request_time` datetime DEFAULT NULL COMMENT '请求时间',
  `return_time` datetime DEFAULT NULL COMMENT '返回时间',
  `return_date` text COMMENT '返回数据json',
  `http_status_code` varchar(10) DEFAULT NULL COMMENT '返回状态',
  `time_consuming` int(8) DEFAULT NULL COMMENT '消耗时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='日志表';