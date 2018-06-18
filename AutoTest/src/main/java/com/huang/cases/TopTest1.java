package com.huang.cases;

import com.huang.config.URLConfig;
import com.huang.model.InterfaceName;
import com.huang.model.Top;
import com.huang.utils.DataBaseUtils;
import com.huang.utils.URLConnect;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class TopTest1 {
    @Test
        public void topTest() throws IOException {

            //获取url
            URLConfig.topurl = URLConnect.geturl(InterfaceName.TOP);

            //获取数据库top表中的参数
            SqlSession session = DataBaseUtils.getSqlSession();
            Top top = session.selectOne("findTopValue",0);




    }
}
