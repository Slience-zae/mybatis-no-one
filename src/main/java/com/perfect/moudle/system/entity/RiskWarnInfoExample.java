package com.perfect.moudle.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskWarnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskWarnInfoExample() {
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

        public Criteria andWarn_codeIsNull() {
            addCriterion("warn_code is null");
            return (Criteria) this;
        }

        public Criteria andWarn_codeIsNotNull() {
            addCriterion("warn_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_codeEqualTo(String value) {
            addCriterion("warn_code =", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeNotEqualTo(String value) {
            addCriterion("warn_code <>", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeGreaterThan(String value) {
            addCriterion("warn_code >", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeGreaterThanOrEqualTo(String value) {
            addCriterion("warn_code >=", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeLessThan(String value) {
            addCriterion("warn_code <", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeLessThanOrEqualTo(String value) {
            addCriterion("warn_code <=", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeLike(String value) {
            addCriterion("warn_code like", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeNotLike(String value) {
            addCriterion("warn_code not like", value, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeIn(List<String> values) {
            addCriterion("warn_code in", values, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeNotIn(List<String> values) {
            addCriterion("warn_code not in", values, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeBetween(String value1, String value2) {
            addCriterion("warn_code between", value1, value2, "warn_code");
            return (Criteria) this;
        }

        public Criteria andWarn_codeNotBetween(String value1, String value2) {
            addCriterion("warn_code not between", value1, value2, "warn_code");
            return (Criteria) this;
        }

        public Criteria andRule_typeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRule_typeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRule_typeEqualTo(String value) {
            addCriterion("rule_type =", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeNotEqualTo(String value) {
            addCriterion("rule_type <>", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeGreaterThan(String value) {
            addCriterion("rule_type >", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_type >=", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeLessThan(String value) {
            addCriterion("rule_type <", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeLessThanOrEqualTo(String value) {
            addCriterion("rule_type <=", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeLike(String value) {
            addCriterion("rule_type like", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeNotLike(String value) {
            addCriterion("rule_type not like", value, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeIn(List<String> values) {
            addCriterion("rule_type in", values, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeNotIn(List<String> values) {
            addCriterion("rule_type not in", values, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeBetween(String value1, String value2) {
            addCriterion("rule_type between", value1, value2, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_typeNotBetween(String value1, String value2) {
            addCriterion("rule_type not between", value1, value2, "rule_type");
            return (Criteria) this;
        }

        public Criteria andRule_nameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRule_nameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRule_nameEqualTo(String value) {
            addCriterion("rule_name =", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameGreaterThan(String value) {
            addCriterion("rule_name >", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameLessThan(String value) {
            addCriterion("rule_name <", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameLike(String value) {
            addCriterion("rule_name like", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameNotLike(String value) {
            addCriterion("rule_name not like", value, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameIn(List<String> values) {
            addCriterion("rule_name in", values, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "rule_name");
            return (Criteria) this;
        }

        public Criteria andRule_nameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "rule_name");
            return (Criteria) this;
        }

        public Criteria andCheck_typeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheck_typeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_typeEqualTo(String value) {
            addCriterion("check_type =", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeNotEqualTo(String value) {
            addCriterion("check_type <>", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeGreaterThan(String value) {
            addCriterion("check_type >", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeGreaterThanOrEqualTo(String value) {
            addCriterion("check_type >=", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeLessThan(String value) {
            addCriterion("check_type <", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeLessThanOrEqualTo(String value) {
            addCriterion("check_type <=", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeLike(String value) {
            addCriterion("check_type like", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeNotLike(String value) {
            addCriterion("check_type not like", value, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeIn(List<String> values) {
            addCriterion("check_type in", values, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeNotIn(List<String> values) {
            addCriterion("check_type not in", values, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeBetween(String value1, String value2) {
            addCriterion("check_type between", value1, value2, "check_type");
            return (Criteria) this;
        }

        public Criteria andCheck_typeNotBetween(String value1, String value2) {
            addCriterion("check_type not between", value1, value2, "check_type");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolIsNull() {
            addCriterion("logical_symbol is null");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolIsNotNull() {
            addCriterion("logical_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolEqualTo(String value) {
            addCriterion("logical_symbol =", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolNotEqualTo(String value) {
            addCriterion("logical_symbol <>", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolGreaterThan(String value) {
            addCriterion("logical_symbol >", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolGreaterThanOrEqualTo(String value) {
            addCriterion("logical_symbol >=", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolLessThan(String value) {
            addCriterion("logical_symbol <", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolLessThanOrEqualTo(String value) {
            addCriterion("logical_symbol <=", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolLike(String value) {
            addCriterion("logical_symbol like", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolNotLike(String value) {
            addCriterion("logical_symbol not like", value, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolIn(List<String> values) {
            addCriterion("logical_symbol in", values, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolNotIn(List<String> values) {
            addCriterion("logical_symbol not in", values, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolBetween(String value1, String value2) {
            addCriterion("logical_symbol between", value1, value2, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andLogical_symbolNotBetween(String value1, String value2) {
            addCriterion("logical_symbol not between", value1, value2, "logical_symbol");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(String value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(String value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(String value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(String value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(String value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLike(String value) {
            addCriterion("threshold like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotLike(String value) {
            addCriterion("threshold not like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<String> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<String> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(String value1, String value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(String value1, String value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
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

        public Criteria andWarn_resultEqualTo(String value) {
            addCriterion("warn_result =", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotEqualTo(String value) {
            addCriterion("warn_result <>", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultGreaterThan(String value) {
            addCriterion("warn_result >", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultGreaterThanOrEqualTo(String value) {
            addCriterion("warn_result >=", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultLessThan(String value) {
            addCriterion("warn_result <", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultLessThanOrEqualTo(String value) {
            addCriterion("warn_result <=", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultLike(String value) {
            addCriterion("warn_result like", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotLike(String value) {
            addCriterion("warn_result not like", value, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultIn(List<String> values) {
            addCriterion("warn_result in", values, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotIn(List<String> values) {
            addCriterion("warn_result not in", values, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultBetween(String value1, String value2) {
            addCriterion("warn_result between", value1, value2, "warn_result");
            return (Criteria) this;
        }

        public Criteria andWarn_resultNotBetween(String value1, String value2) {
            addCriterion("warn_result not between", value1, value2, "warn_result");
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