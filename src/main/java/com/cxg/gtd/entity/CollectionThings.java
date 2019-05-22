package com.cxg.gtd.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CollectionThings {

    private Long id;
    /**谁**/
    private String owner;
    /*创建时间*/
    private Date createTime;
    /*摘要*/
    private String summary;
    /*具体内容*/
    private String content;
    /*场景*/
    private String scene;
    /*重要程度*/
    private String importanceDegree;
    /*紧急程度*/
    private String  urgencyDegree;
    /*是否有截止日*/
    private String isRequiredEnd;
    /*最迟日期*/
    private Date lastDate;
    /*处理方式 处理、委托、推迟、删除*/
    private String dealMethod;



}
