package com.cxg.gtd.entity;

import java.util.Date;

public class CollectionThings {
    private Long id;

    private String owner;

    private Date createTime;

    private String summary;

    private String content;

    private String scene;

    private String importanceDegree;

    private String urgencyDegree;

    private String isRequiredEnd;

    private Date lastDate;

    private String dealMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getImportanceDegree() {
        return importanceDegree;
    }

    public void setImportanceDegree(String importanceDegree) {
        this.importanceDegree = importanceDegree == null ? null : importanceDegree.trim();
    }

    public String getUrgencyDegree() {
        return urgencyDegree;
    }

    public void setUrgencyDegree(String urgencyDegree) {
        this.urgencyDegree = urgencyDegree == null ? null : urgencyDegree.trim();
    }

    public String getIsRequiredEnd() {
        return isRequiredEnd;
    }

    public void setIsRequiredEnd(String isRequiredEnd) {
        this.isRequiredEnd = isRequiredEnd == null ? null : isRequiredEnd.trim();
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getDealMethod() {
        return dealMethod;
    }

    public void setDealMethod(String dealMethod) {
        this.dealMethod = dealMethod == null ? null : dealMethod.trim();
    }
}