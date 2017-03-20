package com.cy.module.submodule.mapper;

import com.cy.module.submodule.BaseTest;
import com.cy.module.submodule.entity.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class HusbandMapperTest extends BaseTest {

    @Autowired
    private HusbandMapper husbandMapper;

    @Test
    public void testSelectMultiByExample() {

        HusbandMultiExample example = new HusbandMultiExample();

        HusbandExample husbandExample = new HusbandExample();

        WifeExample wifeExample = new WifeExample();

        example.setHusbandExample(husbandExample);
        example.setWifeExample(wifeExample);

        List<HusbandMulti> husbandMultis = husbandMapper.selectMultiByExample(example);

        for (HusbandMulti husbandMulti : husbandMultis) {
            Husband husband = husbandMulti.getHusband();
            System.out.println(husband);
            Wife wife = husbandMulti.getWife();
            System.out.println(wife);
        }

    }


}
