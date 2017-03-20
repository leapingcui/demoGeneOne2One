package com.cy.module.submodule.entity;

/**
 * Created by Administrator on 2017/3/20.
 */
public class HusbandMultiExample {

    private HusbandExample husbandExample;

    private WifeExample wifeExample;

    public HusbandExample getHusbandExample() {
        return husbandExample;
    }

    public void setHusbandExample(HusbandExample husbandExample) {
        this.husbandExample = husbandExample;
    }

    public WifeExample getWifeExample() {
        return wifeExample;
    }

    public void setWifeExample(WifeExample wifeExample) {
        this.wifeExample = wifeExample;
    }

    @Override
    public String toString() {
        return "HusbandMultiExample{" +
                "husbandExample=" + husbandExample +
                ", wifeExample=" + wifeExample +
                '}';
    }
}
