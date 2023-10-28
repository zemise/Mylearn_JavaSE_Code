package zemise_02;

import java.sql.*;

public class TrainDemo {
    //声明Connection对象
    static Connection con;
    //声明Statement对象
    static Statement sql;
    //声明ResultSet对象
    static ResultSet resultSet;

    //建立返回值为Connection的方法
    public Connection getConnection() {
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
                            "//*****:3306/cellcraft",
                    "root", "Abc***");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //按要求返回一个Connection对象
        return con;
    }

    public static void main(String[] args) {
        //创建本类对象
        TrainDemo trainDemo = new TrainDemo();
        //获取与数据库的连接
        con = trainDemo.getConnection();

        try {
            //实例化Statement对象
            sql = con.createStatement();
            //执行SQL语句
            //“SQL语句中提供了LIKE操作符用于模糊查询，可使用“%”来代替0个或多个字符，使用下画线“_”来代替一个字符”
            resultSet = sql.executeQuery("select *from authme where username like 'abc%'");

            //如果当前记录不是结果集中的最后一条，进入循环体
            while (resultSet.next()) {
                //获得第一列，也就是id字段值
                String id = resultSet.getString(1);
                //获得username字段值
                String username = resultSet.getString("username");
                //获得realname字段值
                String realname = resultSet.getString("realname");
                //获得ip字段值
                String ip = resultSet.getString("ip");

                //输出信息
                StringBuilder sb = new StringBuilder();
                sb.append("编号: " + id + "\n").append("\t玩家名: " + username + "\n").
                        append("\t玩家ID: " + realname + "\n").append("\t登陆ip: " + ip + "\n");
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
