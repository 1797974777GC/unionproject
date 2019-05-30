package pojo;

import java.util.ArrayList;
import java.util.List;

public class anTyptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public anTyptExample() {
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

        public Criteria andAnTNameIsNull() {
            addCriterion("an_t_name is null");
            return (Criteria) this;
        }

        public Criteria andAnTNameIsNotNull() {
            addCriterion("an_t_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnTNameEqualTo(String value) {
            addCriterion("an_t_name =", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameNotEqualTo(String value) {
            addCriterion("an_t_name <>", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameGreaterThan(String value) {
            addCriterion("an_t_name >", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameGreaterThanOrEqualTo(String value) {
            addCriterion("an_t_name >=", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameLessThan(String value) {
            addCriterion("an_t_name <", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameLessThanOrEqualTo(String value) {
            addCriterion("an_t_name <=", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameLike(String value) {
            addCriterion("an_t_name like", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameNotLike(String value) {
            addCriterion("an_t_name not like", value, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameIn(List<String> values) {
            addCriterion("an_t_name in", values, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameNotIn(List<String> values) {
            addCriterion("an_t_name not in", values, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameBetween(String value1, String value2) {
            addCriterion("an_t_name between", value1, value2, "anTName");
            return (Criteria) this;
        }

        public Criteria andAnTNameNotBetween(String value1, String value2) {
            addCriterion("an_t_name not between", value1, value2, "anTName");
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