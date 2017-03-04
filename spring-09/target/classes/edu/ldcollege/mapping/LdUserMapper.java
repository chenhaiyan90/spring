package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdUser;
import edu.ldcollege.domain.LdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LdUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @SelectProvider(type=LdUserSqlProvider.class, method="countByExample")
    long countByExample(LdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @DeleteProvider(type=LdUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(LdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into user (id, login_name, ",
        "pwd, classId, lessionId)",
        "values (#{id,jdbcType=INTEGER}, #{loginName,jdbcType=VARCHAR}, ",
        "#{pwd,jdbcType=VARCHAR}, #{classid,jdbcType=INTEGER}, #{lessionid,jdbcType=INTEGER})"
    })
    int insert(LdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @InsertProvider(type=LdUserSqlProvider.class, method="insertSelective")
    int insertSelective(LdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @SelectProvider(type=LdUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="lessionId", property="lessionid", jdbcType=JdbcType.INTEGER)
    })
    List<LdUser> selectByExample(LdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, login_name, pwd, classId, lessionId",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="lessionId", property="lessionid", jdbcType=JdbcType.INTEGER)
    })
    LdUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=LdUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LdUser record, @Param("example") LdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=LdUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LdUser record, @Param("example") LdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=LdUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Update({
        "update user",
        "set login_name = #{loginName,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "classId = #{classid,jdbcType=INTEGER},",
          "lessionId = #{lessionid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdUser record);
}