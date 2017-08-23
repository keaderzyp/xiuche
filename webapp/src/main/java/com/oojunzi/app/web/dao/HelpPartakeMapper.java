package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.HelpPartake;
import com.oojunzi.app.web.model.HelpPartakeExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HelpPartakeMapper {
    int countByExample(HelpPartakeExample example);

    int deleteByExample(HelpPartakeExample example);

    int deleteByPrimaryKey(BigDecimal payId);

    int insert(HelpPartake record);

    int insertSelective(HelpPartake record);

    List<HelpPartake> selectByExample(HelpPartakeExample example);

    HelpPartake selectByPrimaryKey(BigDecimal payId);

    int updateByExampleSelective(@Param("record") HelpPartake record, @Param("example") HelpPartakeExample example);

    int updateByExample(@Param("record") HelpPartake record, @Param("example") HelpPartakeExample example);

    int updateByPrimaryKeySelective(HelpPartake record);

    int updateByPrimaryKey(HelpPartake record);
	/**
     * add lgq
     * */
    
     List<HelpPartake> selectByhelpIdAndcarId(Map<String, Object> map);
     /**
      * 生成主键id
      */
     Long selectHelpPartakeId();
     
     /*
      * 根据用户ID修改信息
      * 
      * 
      */
     
     int updateByUserId(long userId);
}