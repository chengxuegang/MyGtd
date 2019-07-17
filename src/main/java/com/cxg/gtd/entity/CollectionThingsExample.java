package com.cxg.gtd.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionThingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionThingsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_tIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_tIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_tIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_tIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_tIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_tIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_tIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_tIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_tIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_tIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_tIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_tIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("SUMMARY not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("SCENE is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("SCENE is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("SCENE =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("SCENE <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("SCENE >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("SCENE >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("SCENE <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("SCENE <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("SCENE like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("SCENE not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("SCENE in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("SCENE not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("SCENE between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("SCENE not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeIsNull() {
            addCriterion("IMPORTANCE_dEGREE is null");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeIsNotNull() {
            addCriterion("IMPORTANCE_dEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeEqualTo(String value) {
            addCriterion("IMPORTANCE_dEGREE =", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeNotEqualTo(String value) {
            addCriterion("IMPORTANCE_dEGREE <>", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeGreaterThan(String value) {
            addCriterion("IMPORTANCE_dEGREE >", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANCE_dEGREE >=", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeLessThan(String value) {
            addCriterion("IMPORTANCE_dEGREE <", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANCE_dEGREE <=", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeLike(String value) {
            addCriterion("IMPORTANCE_dEGREE like", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeNotLike(String value) {
            addCriterion("IMPORTANCE_dEGREE not like", value, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeIn(List<String> values) {
            addCriterion("IMPORTANCE_dEGREE in", values, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeNotIn(List<String> values) {
            addCriterion("IMPORTANCE_dEGREE not in", values, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeBetween(String value1, String value2) {
            addCriterion("IMPORTANCE_dEGREE between", value1, value2, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andImportanceDegreeNotBetween(String value1, String value2) {
            addCriterion("IMPORTANCE_dEGREE not between", value1, value2, "importanceDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeIsNull() {
            addCriterion("URGENCY_dEGREE is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeIsNotNull() {
            addCriterion("URGENCY_dEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeEqualTo(String value) {
            addCriterion("URGENCY_dEGREE =", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeNotEqualTo(String value) {
            addCriterion("URGENCY_dEGREE <>", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeGreaterThan(String value) {
            addCriterion("URGENCY_dEGREE >", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("URGENCY_dEGREE >=", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeLessThan(String value) {
            addCriterion("URGENCY_dEGREE <", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeLessThanOrEqualTo(String value) {
            addCriterion("URGENCY_dEGREE <=", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeLike(String value) {
            addCriterion("URGENCY_dEGREE like", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeNotLike(String value) {
            addCriterion("URGENCY_dEGREE not like", value, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeIn(List<String> values) {
            addCriterion("URGENCY_dEGREE in", values, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeNotIn(List<String> values) {
            addCriterion("URGENCY_dEGREE not in", values, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeBetween(String value1, String value2) {
            addCriterion("URGENCY_dEGREE between", value1, value2, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andUrgencyDegreeNotBetween(String value1, String value2) {
            addCriterion("URGENCY_dEGREE not between", value1, value2, "urgencyDegree");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndIsNull() {
            addCriterion("IS_rEQUIRED_eND is null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndIsNotNull() {
            addCriterion("IS_rEQUIRED_eND is not null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndEqualTo(String value) {
            addCriterion("IS_rEQUIRED_eND =", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndNotEqualTo(String value) {
            addCriterion("IS_rEQUIRED_eND <>", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndGreaterThan(String value) {
            addCriterion("IS_rEQUIRED_eND >", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndGreaterThanOrEqualTo(String value) {
            addCriterion("IS_rEQUIRED_eND >=", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndLessThan(String value) {
            addCriterion("IS_rEQUIRED_eND <", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndLessThanOrEqualTo(String value) {
            addCriterion("IS_rEQUIRED_eND <=", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndLike(String value) {
            addCriterion("IS_rEQUIRED_eND like", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndNotLike(String value) {
            addCriterion("IS_rEQUIRED_eND not like", value, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndIn(List<String> values) {
            addCriterion("IS_rEQUIRED_eND in", values, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndNotIn(List<String> values) {
            addCriterion("IS_rEQUIRED_eND not in", values, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndBetween(String value1, String value2) {
            addCriterion("IS_rEQUIRED_eND between", value1, value2, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEndNotBetween(String value1, String value2) {
            addCriterion("IS_rEQUIRED_eND not between", value1, value2, "isRequiredEnd");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_dATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_dATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterion("LAST_dATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterion("LAST_dATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterion("LAST_dATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_dATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterion("LAST_dATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_dATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterion("LAST_dATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterion("LAST_dATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterion("LAST_dATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_dATE not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andDealMethodIsNull() {
            addCriterion("DEAL_mETHOD is null");
            return (Criteria) this;
        }

        public Criteria andDealMethodIsNotNull() {
            addCriterion("DEAL_mETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andDealMethodEqualTo(String value) {
            addCriterion("DEAL_mETHOD =", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodNotEqualTo(String value) {
            addCriterion("DEAL_mETHOD <>", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodGreaterThan(String value) {
            addCriterion("DEAL_mETHOD >", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_mETHOD >=", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodLessThan(String value) {
            addCriterion("DEAL_mETHOD <", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodLessThanOrEqualTo(String value) {
            addCriterion("DEAL_mETHOD <=", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodLike(String value) {
            addCriterion("DEAL_mETHOD like", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodNotLike(String value) {
            addCriterion("DEAL_mETHOD not like", value, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodIn(List<String> values) {
            addCriterion("DEAL_mETHOD in", values, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodNotIn(List<String> values) {
            addCriterion("DEAL_mETHOD not in", values, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodBetween(String value1, String value2) {
            addCriterion("DEAL_mETHOD between", value1, value2, "dealMethod");
            return (Criteria) this;
        }

        public Criteria andDealMethodNotBetween(String value1, String value2) {
            addCriterion("DEAL_mETHOD not between", value1, value2, "dealMethod");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}