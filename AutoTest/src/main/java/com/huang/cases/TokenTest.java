package com.huang.cases;

import com.huang.config.URLConfig;
import com.huang.model.InterfaceName;
import com.huang.model.Token;
import com.huang.utils.DataBaseUtils;
import com.huang.utils.URLConnect;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class TokenTest {

    @Test
    public void getToken() throws IOException {
        //获取token的URL
        URLConfig.tokenurl = URLConnect.geturl(InterfaceName.TOEKN);

        //获取数据库openid表中的openid值
        SqlSession session = DataBaseUtils.getSqlSession();
        Token openid = session.selectOne("findOpendId",0);
        System.out.println("openid:"+openid);

        //执行https请求
//        Request request = new Request.Builder()
//                                      .url(url)
//                                      .build();
//        Response response = URLConfig.client.newCall(request).execute();
//        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
//        System.out.println(response.body().toString());





    }
}
