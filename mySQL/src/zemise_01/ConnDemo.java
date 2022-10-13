package zemise_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnDemo {
    //声明Connection对象
    Connection con;
    //建立返回值为Connection的方法
    public Connection getConnection(){
        //加载数据库驱动类
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            //通过访问数据库的URL，获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql:" +
                    "//cellcraft.####:3306/cellcraft",
                    "root","#####");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //按要求返回一个Connection对象
        return con;
    }

    public static void main(String[] args) {
        //创建本类对象
        ConnDemo c = new ConnDemo();
        //调用连接数据库方法
        Connection connection = c.getConnection();
        try {
            //要执行SQL语句，首先要获得Statement类对象
            Statement sql = connection.createStatement();
            //查询的结果集存放在ResultSet类对象中
            ResultSet resultSet = sql.executeQuery("select *from authme");
            while(resultSet.next()){
                String username = resultSet.getString("username");
                String ip = resultSet.getString("ip");
                System.out.println("name: " + username);
                System.out.println("ip: " + ip);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
