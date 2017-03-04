package edu.ldcollege.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LdHomeWorkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public LdHomeWorkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andLessionidIsNull() {
            addCriterion("lessionId is null");
            return (Criteria) this;
        }

        public Criteria andLessionidIsNotNull() {
            addCriterion("lessionId is not null");
            return (Criteria) this;
        }

        public Criteria andLessionidEqualTo(Integer value) {
            addCriterion("lessionId =", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidNotEqualTo(Integer value) {
            addCriterion("lessionId <>", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidGreaterThan(Integer value) {
            addCriterion("lessionId >", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessionId >=", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidLessThan(Integer value) {
            addCriterion("lessionId <", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidLessThanOrEqualTo(Integer value) {
            addCriterion("lessionId <=", value, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidIn(List<Integer> values) {
            addCriterion("lessionId in", values, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidNotIn(List<Integer> values) {
            addCriterion("lessionId not in", values, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidBetween(Integer value1, Integer value2) {
            addCriterion("lessionId between", value1, value2, "lessionid");
            return (Criteria) this;
        }

        public Criteria andLessionidNotBetween(Integer value1, Integer value2) {
            addCriterion("lessionId not between", value1, value2, "lessionid");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathIsNull() {
            addCriterion("homeworkFilePath is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathIsNotNull() {
            addCriterion("homeworkFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathEqualTo(String value) {
            addCriterion("homeworkFilePath =", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathNotEqualTo(String value) {
            addCriterion("homeworkFilePath <>", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathGreaterThan(String value) {
            addCriterion("homeworkFilePath >", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("homeworkFilePath >=", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathLessThan(String value) {
            addCriterion("homeworkFilePath <", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathLessThanOrEqualTo(String value) {
            addCriterion("homeworkFilePath <=", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathLike(String value) {
            addCriterion("homeworkFilePath like", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathNotLike(String value) {
            addCriterion("homeworkFilePath not like", value, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathIn(List<String> values) {
            addCriterion("homeworkFilePath in", values, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathNotIn(List<String> values) {
            addCriterion("homeworkFilePath not in", values, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathBetween(String value1, String value2) {
            addCriterion("homeworkFilePath between", value1, value2, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilepathNotBetween(String value1, String value2) {
            addCriterion("homeworkFilePath not between", value1, value2, "homeworkfilepath");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameIsNull() {
            addCriterion("homeworkFileName is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameIsNotNull() {
            addCriterion("homeworkFileName is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameEqualTo(String value) {
            addCriterion("homeworkFileName =", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameNotEqualTo(String value) {
            addCriterion("homeworkFileName <>", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameGreaterThan(String value) {
            addCriterion("homeworkFileName >", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("homeworkFileName >=", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameLessThan(String value) {
            addCriterion("homeworkFileName <", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameLessThanOrEqualTo(String value) {
            addCriterion("homeworkFileName <=", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameLike(String value) {
            addCriterion("homeworkFileName like", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameNotLike(String value) {
            addCriterion("homeworkFileName not like", value, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameIn(List<String> values) {
            addCriterion("homeworkFileName in", values, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameNotIn(List<String> values) {
            addCriterion("homeworkFileName not in", values, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameBetween(String value1, String value2) {
            addCriterion("homeworkFileName between", value1, value2, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andHomeworkfilenameNotBetween(String value1, String value2) {
            addCriterion("homeworkFileName not between", value1, value2, "homeworkfilename");
            return (Criteria) this;
        }

        public Criteria andStarcountIsNull() {
            addCriterion("starCount is null");
            return (Criteria) this;
        }

        public Criteria andStarcountIsNotNull() {
            addCriterion("starCount is not null");
            return (Criteria) this;
        }

        public Criteria andStarcountEqualTo(Integer value) {
            addCriterion("starCount =", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountNotEqualTo(Integer value) {
            addCriterion("starCount <>", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountGreaterThan(Integer value) {
            addCriterion("starCount >", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("starCount >=", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountLessThan(Integer value) {
            addCriterion("starCount <", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountLessThanOrEqualTo(Integer value) {
            addCriterion("starCount <=", value, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountIn(List<Integer> values) {
            addCriterion("starCount in", values, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountNotIn(List<Integer> values) {
            addCriterion("starCount not in", values, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountBetween(Integer value1, Integer value2) {
            addCriterion("starCount between", value1, value2, "starcount");
            return (Criteria) this;
        }

        public Criteria andStarcountNotBetween(Integer value1, Integer value2) {
            addCriterion("starCount not between", value1, value2, "starcount");
            return (Criteria) this;
        }

        public Criteria andNegativecountIsNull() {
            addCriterion("negativeCount is null");
            return (Criteria) this;
        }

        public Criteria andNegativecountIsNotNull() {
            addCriterion("negativeCount is not null");
            return (Criteria) this;
        }

        public Criteria andNegativecountEqualTo(Integer value) {
            addCriterion("negativeCount =", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountNotEqualTo(Integer value) {
            addCriterion("negativeCount <>", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountGreaterThan(Integer value) {
            addCriterion("negativeCount >", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("negativeCount >=", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountLessThan(Integer value) {
            addCriterion("negativeCount <", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountLessThanOrEqualTo(Integer value) {
            addCriterion("negativeCount <=", value, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountIn(List<Integer> values) {
            addCriterion("negativeCount in", values, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountNotIn(List<Integer> values) {
            addCriterion("negativeCount not in", values, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountBetween(Integer value1, Integer value2) {
            addCriterion("negativeCount between", value1, value2, "negativecount");
            return (Criteria) this;
        }

        public Criteria andNegativecountNotBetween(Integer value1, Integer value2) {
            addCriterion("negativeCount not between", value1, value2, "negativecount");
            return (Criteria) this;
        }

        public Criteria andCorrectflagIsNull() {
            addCriterion("correctFlag is null");
            return (Criteria) this;
        }

        public Criteria andCorrectflagIsNotNull() {
            addCriterion("correctFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectflagEqualTo(Integer value) {
            addCriterion("correctFlag =", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagNotEqualTo(Integer value) {
            addCriterion("correctFlag <>", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagGreaterThan(Integer value) {
            addCriterion("correctFlag >", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("correctFlag >=", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagLessThan(Integer value) {
            addCriterion("correctFlag <", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagLessThanOrEqualTo(Integer value) {
            addCriterion("correctFlag <=", value, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagIn(List<Integer> values) {
            addCriterion("correctFlag in", values, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagNotIn(List<Integer> values) {
            addCriterion("correctFlag not in", values, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagBetween(Integer value1, Integer value2) {
            addCriterion("correctFlag between", value1, value2, "correctflag");
            return (Criteria) this;
        }

        public Criteria andCorrectflagNotBetween(Integer value1, Integer value2) {
            addCriterion("correctFlag not between", value1, value2, "correctflag");
            return (Criteria) this;
        }

        public Criteria andBestflagIsNull() {
            addCriterion("BestFlag is null");
            return (Criteria) this;
        }

        public Criteria andBestflagIsNotNull() {
            addCriterion("BestFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBestflagEqualTo(Boolean value) {
            addCriterion("BestFlag =", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagNotEqualTo(Boolean value) {
            addCriterion("BestFlag <>", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagGreaterThan(Boolean value) {
            addCriterion("BestFlag >", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BestFlag >=", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagLessThan(Boolean value) {
            addCriterion("BestFlag <", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagLessThanOrEqualTo(Boolean value) {
            addCriterion("BestFlag <=", value, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagIn(List<Boolean> values) {
            addCriterion("BestFlag in", values, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagNotIn(List<Boolean> values) {
            addCriterion("BestFlag not in", values, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagBetween(Boolean value1, Boolean value2) {
            addCriterion("BestFlag between", value1, value2, "bestflag");
            return (Criteria) this;
        }

        public Criteria andBestflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BestFlag not between", value1, value2, "bestflag");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ld_homework
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ld_homework
     *
     * @mbg.generated
     */
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