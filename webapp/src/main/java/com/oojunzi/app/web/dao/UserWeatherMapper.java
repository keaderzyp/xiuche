package com.oojunzi.app.web.dao;

import com.oojunzi.app.web.model.UserWeather;
import com.oojunzi.app.web.model.UserWeatherExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeatherMapper {
    int countByExample(UserWeatherExample example);

    int deleteByExample(UserWeatherExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(UserWeather record);

    int insertSelective(UserWeather record);

    List<UserWeather> selectByExample(UserWeatherExample example);

    UserWeather selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") UserWeather record, @Param("example") UserWeatherExample example);

    int updateByExample(@Param("record") UserWeather record, @Param("example") UserWeatherExample example);

    int updateByPrimaryKeySelective(UserWeather record);

    int updateByPrimaryKey(UserWeather record);
    
    //add LGQ  根据城市和时间查天气
    UserWeather selectByCityAndTime(UserWeather userWeather);
}