package jdbc;
import java.sql.*;
public class Jdbc_test {

    public static void main(String[] args) {
            try {
                // 加载MySQL JDBC驱动程序
                Class.forName("com.mysql.jdbc.Driver");

                // 建立数据库连接
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "123123");

                // 创建Statement对象
                Statement stmt = conn.createStatement();

                // 执行SQL查询
                ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

                // 处理结果集
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println("ID: " + id + ", Name: " + name);
                }
                // 获取到的数据并不是特别的形象，不能做到见名之意

                // 关闭资源
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

