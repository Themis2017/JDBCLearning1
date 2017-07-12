package com.njxxx.mydemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by 10195 on 2017/7/12.
 */
public class ConnectTest {
    public ResultSet getResult() throws  Exception{
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:@127.0.0.1:1521:orcl","zsy","zsy");
        //开启命令
        PreparedStatement pstat = conn.prepareStatement("select 1  from dual");
        //执行
        return pstat.executeQuery();
    }
    public static void main(String [] args) throws Exception{
        System.out.println(new ConnectTest().getResult() );
    }
}
