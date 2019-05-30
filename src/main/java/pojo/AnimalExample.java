package pojo;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimalExample() {
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

        public Criteria andAnIdIsNull() {
            addCriterion("an_id is null");
            return (Criteria) this;
        }

        public Criteria andAnIdIsNotNull() {
            addCriterion("an_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnIdEqualTo(Integer value) {
            addCriterion("an_id =", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdNotEqualTo(Integer value) {
            addCriterion("an_id <>", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdGreaterThan(Integer value) {
            addCriterion("an_id >", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("an_id >=", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdLessThan(Integer value) {
            addCriterion("an_id <", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdLessThanOrEqualTo(Integer value) {
            addCriterion("an_id <=", value, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdIn(List<Integer> values) {
            addCriterion("an_id in", values, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdNotIn(List<Integer> values) {
            addCriterion("an_id not in", values, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdBetween(Integer value1, Integer value2) {
            addCriterion("an_id between", value1, value2, "anId");
            return (Criteria) this;
        }

        public Criteria andAnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("an_id not between", value1, value2, "anId");
            return (Criteria) this;
        }

        public Criteria andAnNameIsNull() {
            addCriterion("an_name is null");
            return (Criteria) this;
        }

        public Criteria andAnNameIsNotNull() {
            addCriterion("an_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnNameEqualTo(String value) {
            addCriterion("an_name =", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameNotEqualTo(String value) {
            addCriterion("an_name <>", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameGreaterThan(String value) {
            addCriterion("an_name >", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameGreaterThanOrEqualTo(String value) {
            addCriterion("an_name >=", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameLessThan(String value) {
            addCriterion("an_name <", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameLessThanOrEqualTo(String value) {
            addCriterion("an_name <=", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameLike(String value) {
            addCriterion("an_name like", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameNotLike(String value) {
            addCriterion("an_name not like", value, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameIn(List<String> values) {
            addCriterion("an_name in", values, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameNotIn(List<String> values) {
            addCriterion("an_name not in", values, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameBetween(String value1, String value2) {
            addCriterion("an_name between", value1, value2, "anName");
            return (Criteria) this;
        }

        public Criteria andAnNameNotBetween(String value1, String value2) {
            addCriterion("an_name not between", value1, value2, "anName");
            return (Criteria) this;
        }

        public Criteria andAnTIdIsNull() {
            addCriterion("an_t_id is null");
            return (Criteria) this;
        }

        public Criteria andAnTIdIsNotNull() {
            addCriterion("an_t_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnTIdEqualTo(Integer value) {
            addCriterion("an_t_id =", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdNotEqualTo(Integer value) {
            addCriterion("an_t_id <>", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdGreaterThan(Integer value) {
            addCriterion("an_t_id >", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("an_t_id >=", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdLessThan(Integer value) {
            addCriterion("an_t_id <", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdLessThanOrEqualTo(Integer value) {
            addCriterion("an_t_id <=", value, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdIn(List<Integer> values) {
            addCriterion("an_t_id in", values, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdNotIn(List<Integer> values) {
            addCriterion("an_t_id not in", values, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdBetween(Integer value1, Integer value2) {
            addCriterion("an_t_id between", value1, value2, "anTId");
            return (Criteria) this;
        }

        public Criteria andAnTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("an_t_id not between", value1, value2, "anTId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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