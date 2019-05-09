package bysj.dao.mapper;

import bysj.domain.po.SearchhistoryPO;
import bysj.domain.po.SearchhistoryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SearchhistoryPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    long countByExample(SearchhistoryPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    int deleteByExample(SearchhistoryPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    @Delete({
        "delete from searchhistory",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    @Insert({
        "insert into searchhistory (whatInput, time, ",
        "id)",
        "values (#{whatinput,jdbcType=VARCHAR}, #{time,jdbcType=TIMESTAMP}, ",
        "#{id,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="uid")
    int insert(SearchhistoryPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    int insertSelective(SearchhistoryPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    List<SearchhistoryPO> selectByExample(SearchhistoryPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "uid, whatInput, time, id",
        "from searchhistory",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    @ResultMap("bysj.dao.mapper.SearchhistoryPOMapper.BaseResultMap")
    SearchhistoryPO selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SearchhistoryPO record, @Param("example") SearchhistoryPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SearchhistoryPO record, @Param("example") SearchhistoryPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SearchhistoryPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchhistory
     *
     * @mbg.generated
     */
    @Update({
        "update searchhistory",
        "set whatInput = #{whatinput,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "id = #{id,jdbcType=INTEGER}",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SearchhistoryPO record);
}