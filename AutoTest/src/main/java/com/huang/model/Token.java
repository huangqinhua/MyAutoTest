package com.huang.model;

public class Token {
    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString(){
        return (
                "{openId:"+openId+"}"
        );

    }

}
