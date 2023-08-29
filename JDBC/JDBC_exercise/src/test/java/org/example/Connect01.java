package org.example;

import com.mysql.cj.jdbc.Driver;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connect01 {
    //连接方式1
    @Test
    public static void conn01() throws SQLException, SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123123");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
        //执行sql语句
        String sql = "insert into actor values(null,'wang', '女', '1990-11-13','1321330')";
        Statement statement = connect.createStatement();
        //返回sql语句影响的数据库表的行的数量
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功" : "失败");
        //关闭连接
        statement.close();
        connect.close();
    }
}
