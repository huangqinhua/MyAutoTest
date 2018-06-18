package com.huang.utils;


import com.huang.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

//拼接URL，通过通过interfaceName 获得url
public class URLConnect {

    private static ResourceBundle bundle = ResourceBundle.getBundle("application",Locale.CHINA);


    public static String geturl( InterfaceName name){

        String address = bundle.getString("test.url");

        String uri ="";
        if(name ==InterfaceName.TOEKN){
            uri = bundle.getString("token.url");
        }

        if(name == InterfaceName.TOP){
            uri = bundle.getString("top.url");
        }


        //最终url
        String testUrl =address + uri;
        return testUrl;

    }
}
