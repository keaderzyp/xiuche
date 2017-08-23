package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.HelpPartakemax;
import com.oojunzi.app.web.model.HelpPartakemaxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpPartakemaxMapper {
    int countByExample(HelpPartakemaxExample example);

    int deleteByExample(HelpPartakemaxExample example);

    int deleteByPrimaryKey(BigDecimal pmaxId);

    int insert(HelpPartakemax record);

    int insertSelective(HelpPartakemax record);

    List<HelpPartakemax> selectByExample(HelpPartakemaxExample example);

    HelpPartakemax selectByPrimaryKey(BigDecimal pmaxId);

    int updateByExampleSelective(@Param("record") HelpPartakemax record, @Param("example") HelpPartakemaxExample example);

    int updateByExample(@Param("record") HelpPartakemax record, @Param("example") HelpPartakemaxExample example);

    int updateByPrimaryKeySelective(HelpPartakemax record);

    int updateByPrimaryKey(HelpPartakemax record);
}