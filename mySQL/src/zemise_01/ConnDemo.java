package zemise_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDemo {
    //声明Connection对象
    Connection con;
    //建立返回值为Connection的方法
    public Connection getConnection(){
        //加载数据库驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            //通过访问数据库的URL，获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql:" +
                    "//cellcraft.123",
                    "root","123");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //按要求返回一个Connecttion对象
        return con;
    }

    public static void main(String[] args) {
        //创建本类对象
        ConnDemo c = new ConnDemo();
        //调用连接数据库方法
        c.getConnection();
    }
}
