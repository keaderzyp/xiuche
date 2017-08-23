package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.ShareInfo;
import com.oojunzi.app.web.model.ShareInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareInfoMapper {
    int countByExample(ShareInfoExample example);

    int deleteByExample(ShareInfoExample example);

    int deleteByPrimaryKey(BigDecimal shareId);

    int insert(ShareInfo record);

    int insertSelective(ShareInfo record);

    List<ShareInfo> selectByExampleWithBLOBs(ShareInfoExample example);

    List<ShareInfo> selectByExample(ShareInfoExample example);

    ShareInfo selectByPrimaryKey(BigDecimal shareId);

    int updateByExampleSelective(@Param("record") ShareInfo record, @Param("example") ShareInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ShareInfo record, @Param("example") ShareInfoExample example);

    int updateByExample(@Param("record") ShareInfo record, @Param("example") ShareInfoExample example);

    int updateByPrimaryKeySelective(ShareInfo record);

    int updateByPrimaryKeyWithBLOBs(ShareInfo record);

    int updateByPrimaryKey(ShareInfo record);
}