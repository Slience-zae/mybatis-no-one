package com.perfect.moudle.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskWarnDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskWarnDetailExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProd_idIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProd_idIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProd_idEqualTo(String value) {
            addCriterion("prod_id =", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotEqualTo(String value) {
            addCriterion("prod_id <>", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idGreaterThan(String value) {
            addCriterion("prod_id >", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idGreaterThanOrEqualTo(String value) {
            addCriterion("prod_id >=", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLessThan(String value) {
            addCriterion("prod_id <", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLessThanOrEqualTo(String value) {
            addCriterion("prod_id <=", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLike(String value) {
            addCriterion("prod_id like", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotLike(String value) {
            addCriterion("prod_id not like", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idIn(List<String> values) {
            addCriterion("prod_id in", values, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotIn(List<String> values) {
            addCriterion("prod_id not in", values, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idBetween(String value1, String value2) {
            addCriterion("prod_id between", value1, value2, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotBetween(String value1, String value2) {
            addCriterion("prod_id not between", value1, value2, "prod_id");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoIsNull() {
            addCriterion("corp_unno is null");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoIsNotNull() {
            addCriterion("corp_unno is not null");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoEqualTo(String value) {
            addCriterion("corp_unno =", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoNotEqualTo(String value) {
            addCriterion("corp_unno <>", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoGreaterThan(String value) {
            addCriterion("corp_unno >", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoGreaterThanOrEqualTo(String value) {
            addCriterion("corp_unno >=", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoLessThan(String value) {
            addCriterion("corp_unno <", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoLessThanOrEqualTo(String value) {
            addCriterion("corp_unno <=", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoLike(String value) {
            addCriterion("corp_unno like", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoNotLike(String value) {
            addCriterion("corp_unno not like", value, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoIn(List<String> values) {
            addCriterion("corp_unno in", values, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoNotIn(List<String> values) {
            addCriterion("corp_unno not in", values, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoBetween(String value1, String value2) {
            addCriterion("corp_unno between", value1, value2, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andCorp_unnoNotBetween(String value1, String value2) {
            addCriterion("corp_unno not between", value1, value2, "corp_unno");
            return (Criteria) this;
        }

        public Criteria andWarn_noIsNull() {
            addCriterion("warn_no is null");
            return (Criteria) this;
        }

        public Criteria andWarn_noIsNotNull() {
            addCriterion("warn_no is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_noEqualTo(String value) {
            addCriterion("warn_no =", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noNotEqualTo(String value) {
            addCriterion("warn_no <>", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noGreaterThan(String value) {
            addCriterion("warn_no >", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noGreaterThanOrEqualTo(String value) {
            addCriterion("warn_no >=", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noLessThan(String value) {
            addCriterion("warn_no <", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noLessThanOrEqualTo(String value) {
            addCriterion("warn_no <=", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noLike(String value) {
            addCriterion("warn_no like", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noNotLike(String value) {
            addCriterion("warn_no not like", value, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noIn(List<String> values) {
            addCriterion("warn_no in", values, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noNotIn(List<String> values) {
            addCriterion("warn_no not in", values, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noBetween(String value1, String value2) {
            addCriterion("warn_no between", value1, value2, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_noNotBetween(String value1, String value2) {
            addCriterion("warn_no not between", value1, value2, "warn_no");
            return (Criteria) this;
        }

        public Criteria andWarn_dateIsNull() {
            addCriterion("warn_date is null");
            return (Criteria) this;
        }

        public Criteria andWarn_dateIsNotNull() {
            addCriterion("warn_date is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_dateEqualTo(Date value) {
            addCriterion("warn_date =", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateNotEqualTo(Date value) {
            addCriterion("warn_date <>", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateGreaterThan(Date value) {
            addCriterion("warn_date >", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("warn_date >=", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateLessThan(Date value) {
            addCriterion("warn_date <", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateLessThanOrEqualTo(Date value) {
            addCriterion("warn_date <=", value, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateIn(List<Date> values) {
            addCriterion("warn_date in", values, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateNotIn(List<Date> values) {
            addCriterion("warn_date not in", values, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateBetween(Date value1, Date value2) {
            addCriterion("warn_date between", value1, value2, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_dateNotBetween(Date value1, Date value2) {
            addCriterion("warn_date not between", value1, value2, "warn_date");
            return (Criteria) this;
        }

        public Criteria andWarn_eventIsNull() {
            addCriterion("warn_event is null");
            return (Criteria) this;
        }

        public Criteria andWarn_eventIsNotNull() {
            addCriterion("warn_event is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_eventEqualTo(String value) {
            addCriterion("warn_event =", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventNotEqualTo(String value) {
            addCriterion("warn_event <>", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventGreaterThan(String value) {
            addCriterion("warn_event >", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventGreaterThanOrEqualTo(String value) {
            addCriterion("warn_event >=", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventLessThan(String value) {
            addCriterion("warn_event <", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventLessThanOrEqualTo(String value) {
            addCriterion("warn_event <=", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventLike(String value) {
            addCriterion("warn_event like", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventNotLike(String value) {
            addCriterion("warn_event not like", value, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventIn(List<String> values) {
            addCriterion("warn_event in", values, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventNotIn(List<String> values) {
            addCriterion("warn_event not in", values, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventBetween(String value1, String value2) {
            addCriterion("warn_event between", value1, value2, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_eventNotBetween(String value1, String value2) {
            addCriterion("warn_event not between", value1, value2, "warn_event");
            return (Criteria) this;
        }

        public Criteria andWarn_resultIsNull() {
            addCriterion("warn_result is null");
            return (Criteria) this;
        }

        public Criteria andWarn_resultIsNotNull() {
            addCriterion("warn_result is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_resultEqualTo(Integer value) {
            addCriterion("warn_result =", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotEqualTo(Integer value) {
            addCriterion("warn_result <>", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultGreaterThan(Integer value) {
            addCriterion("warn_result >", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_result >=", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultLessThan(Integer value) {
            addCriterion("warn_result <", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultLessThanOrEqualTo(Integer value) {
            addCriterion("warn_result <=", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultIn(List<Integer> values) {
            addCriterion("warn_result in", values, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotIn(List<Integer> values) {
            addCriterion("warn_result not in", values, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultBetween(Integer value1, Integer value2) {
            addCriterion("warn_result between", value1, value2, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_result not between", value1, value2, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_statusIsNull() {
            addCriterion("warn_status is null");
            return (Criteria) this;
        }

        public Criteria andWarn_statusIsNotNull() {
            addCriterion("warn_status is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_statusEqualTo(Integer value) {
            addCriterion("warn_status =", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusNotEqualTo(Integer value) {
            addCriterion("warn_status <>", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusGreaterThan(Integer value) {
            addCriterion("warn_status >", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_status >=", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusLessThan(Integer value) {
            addCriterion("warn_status <", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusLessThanOrEqualTo(Integer value) {
            addCriterion("warn_status <=", value, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusIn(List<Integer> values) {
            addCriterion("warn_status in", values, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusNotIn(List<Integer> values) {
            addCriterion("warn_status not in", values, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusBetween(Integer value1, Integer value2) {
            addCriterion("warn_status between", value1, value2, "warn_status");
            return (Criteria) this;
        }

        public Criteria andWarn_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_status not between", value1, value2, "warn_status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDel_flagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDel_flagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDel_flagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagLessThan(Integer value) {
            addCriterion("del_flag <", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "del_flag");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_byEqualTo(String value) {
            addCriterion("create_by =", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotEqualTo(String value) {
            addCriterion("create_by <>", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThan(String value) {
            addCriterion("create_by >", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThan(String value) {
            addCriterion("create_by <", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLike(String value) {
            addCriterion("create_by like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotLike(String value) {
            addCriterion("create_by not like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byIn(List<String> values) {
            addCriterion("create_by in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotIn(List<String> values) {
            addCriterion("create_by not in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_byEqualTo(String value) {
            addCriterion("update_by =", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotEqualTo(String value) {
            addCriterion("update_by <>", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byGreaterThan(String value) {
            addCriterion("update_by >", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLessThan(String value) {
            addCriterion("update_by <", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLike(String value) {
            addCriterion("update_by like", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotLike(String value) {
            addCriterion("update_by not like", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIn(List<String> values) {
            addCriterion("update_by in", values, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotIn(List<String> values) {
            addCriterion("update_by not in", values, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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