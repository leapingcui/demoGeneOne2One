package com.cy.module.submodule.entity;

/**
 * Created by Administrator on 2017/3/20.
 */
public class HusbandMulti {
    private Husband husband;
    private Wife wife;

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "HusbandMulti{" +
                "husband=" + husband +
                ", wife=" + wife +
                '}';
    }
}
