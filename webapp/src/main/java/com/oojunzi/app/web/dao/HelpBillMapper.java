package com.oojunzi.app.web.dao;

import com.oojunzi.app.core.feature.orm.mybatis.Page;
import com.oojunzi.app.web.model.HelpBill;
import com.oojunzi.app.web.model.HelpBillExample;
import com.oojunzi.app.web.model.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpBillMapper {
    int countByExample(HelpBillExample example);

    int deleteByExample(HelpBillExample example);

    int deleteByPrimaryKey(Long billid);

    int insert(HelpBill record);

    int insertSelective(HelpBill record);

    List<HelpBill> selectByExample(HelpBillExample example);

    HelpBill selectByPrimaryKey(Long billid);

    int updateByExampleSelective(@Param("record") HelpBill record, @Param("example") HelpBillExample example);

    int updateByExample(@Param("record") HelpBill record, @Param("example") HelpBillExample example);

    int updateByPrimaryKeySelective(HelpBill record);

    int updateByPrimaryKey(HelpBill record);
    long  selectHelpBillId();
   long  selectHelpBillIdForPK();
   
   int selectCarJoinList(String enddate);
   
   List<HelpBill>  selectBillList(Page<User> page, HelpBillExample example);

   HelpBill  selectBillByTitleId(String titleId);
   
   List<HelpBill> selectBillListByTitleId(String titleId);

   List selectCarIdsList(String enddate);
   
   List selectCarListByTitleId(String titleId);
   double selectPartakeTotalByCarIds(List carids);
   List selectCarIdsFromHelpByTitleId(String titleId);

List<HelpBill> selectBillListByBillName(HelpBillExample example);
}