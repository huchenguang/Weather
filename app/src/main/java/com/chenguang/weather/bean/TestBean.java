package com.chenguang.weather.bean;

/**
 * Created by hcg on 2018/4/3.
 */

public class TestBean {

    /**
     * id : 9f7d202c-f99f-4fe6-b428-1446c8e9fc92
     * state : 1
     * title : 我能申请多少金额？分多少期
     * addTime : 2018-04-01 09:36:26
     * remark : 请您确认绑定银行卡为申请人本人所有，且银行的相关信息确认无误。若银行卡有误，请您联系相关银行进行核实，非申请本人名下银行卡是不予体现。
     */

    private String id;
    private int state;
    private String title;
    private String addTime;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
