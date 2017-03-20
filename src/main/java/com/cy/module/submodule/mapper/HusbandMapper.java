package com.cy.module.submodule.mapper;

import com.cy.module.submodule.entity.Husband;
import com.cy.module.submodule.entity.HusbandExample;
import com.cy.module.submodule.entity.HusbandMulti;
import com.cy.module.submodule.entity.HusbandMultiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HusbandMapper {
    int countByExample(HusbandExample example);

    int deleteByExample(HusbandExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Husband record);

    int insertSelective(Husband record);

    List<HusbandMulti> selectMultiByExample(HusbandMultiExample husbandMultiExample);
    List<Husband> selectByExample(HusbandExample example);

    Husband selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Husband record, @Param("example") HusbandExample example);

    int updateByExample(@Param("record") Husband record, @Param("example") HusbandExample example);

    int updateByPrimaryKeySelective(Husband record);

    int updateByPrimaryKey(Husband record);
}