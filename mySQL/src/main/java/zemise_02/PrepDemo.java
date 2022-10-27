package zemise_02;

import java.sql.*;

public class PrepDemo {
    //声明Connection对象
    static Connection con;
    //声明PreparedStatement对象
    static PreparedStatement sql;
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
                            "//***:3306/cellcraft",
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
        PrepDemo prepDemo = new PrepDemo();
        //获取与数据库的连接
        con = prepDemo.getConnection();

        try {
            //实例化预处理对象
            //“对SQL进行预处理时可以使用通配符“?”来代替任何的字段值”
            sql = con.prepareStatement("select *from authme where id = ?");
            //设置参数

            sql.setInt(1,19);
            //“上述语句中的1表示从左向右的第1个通配符，2表示设置的通配符的值。将通配符的值设置为2后，功能等同于：
            //sql = con.prepareStatement("select * from tb_stu where id = 19");”
            //也就是查询该authme表中第一列的19行的玩家信息

            //执行预处理语句
            resultSet = sql.executeQuery();

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
