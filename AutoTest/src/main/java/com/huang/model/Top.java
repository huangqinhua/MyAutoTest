package com.huang.model;


import lombok.Data;



@Data
public class Top {
    String noErrorTip;
    String token;

    public String getTop(){
        return noErrorTip+token;
    }


    @Override
    public String toString(){
        return(
                "{noErrorTip："+noErrorTip+","+
                        "token:"+token+"}"
        );

    }
}
