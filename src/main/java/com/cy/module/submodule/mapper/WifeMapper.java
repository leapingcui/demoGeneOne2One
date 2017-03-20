package com.cy.module.submodule.mapper;

import com.cy.module.submodule.entity.Wife;
import com.cy.module.submodule.entity.WifeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WifeMapper {
    int countByExample(WifeExample example);

    int deleteByExample(WifeExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Wife record);

    int insertSelective(Wife record);

    List<Wife> selectByExample(WifeExample example);

    Wife selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByExample(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByPrimaryKeySelective(Wife record);

    int updateByPrimaryKey(Wife record);
}