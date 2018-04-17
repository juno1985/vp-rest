package org.softcits.vp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.softcits.vp.model.MbgComputer;
import org.softcits.vp.model.MbgComputerExample;

public interface MbgComputerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    long countByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int deleteByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int insert(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int insertSelective(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    List<MbgComputer> selectByExample(MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    MbgComputer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") MbgComputer record, @Param("example") MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int updateByExample(@Param("record") MbgComputer record, @Param("example") MbgComputerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int updateByPrimaryKeySelective(MbgComputer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer
     *
     * @mbg.generated Tue Apr 17 16:11:21 CST 2018
     */
    int updateByPrimaryKey(MbgComputer record);
}