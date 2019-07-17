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