package zemise_03;

import java.sql.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class mcDemo {
    Connection c = connect();

    public static void main(String[] args) throws SQLException {
        new mcDemo().init();
    }

    //建立连接，返回一个Connection实例
    private Connection connect() {
        //放在本插件的plugins文件夹下
        //String url = "jdbc:sqlite:.\\plugins\\BungeeZemBot\\database.db";
        String url = "jdbc:sqlite:/Users/Shared/database.db";
        Connection conn = null;
        try {
            //声明驱动类型
            Class.forName("org.sqlite.JDBC");
            System.out.println("数据库驱动加载成功");
            conn = DriverManager.getConnection(url);
            System.out.println("连接数据库成功");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void init() throws SQLException {
            //玩家信息数据库表
            PreparedStatement ps = c.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS PLAYER (" +
                            "    NAME    TEXT    NOT NULL," +
                            "    QQ      TEXT    NOT NULL," +
                            "    UUID    TEXT," +
                            "    MSGREC  BOOLEAN DEFAULT (1)," +
                            "    PRIMARY KEY (" +
                            "        NAME" +
                            "    )" +
                            ");");
            ps.execute();

            //数据库白名单列表
            PreparedStatement pc = c.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS WHITELIST (" +
                            "    NAME    TEXT    NOT NULL," +
                            "    QQ      TEXT    NOT NULL," +
                            "    UUID    TEXT," +
                            "    MSGREC  BOOLEAN DEFAULT (1)," +
                            "    PRIMARY KEY (" +
                            "        NAME" +
                            "    )" +
                            ");");
            pc.execute();
            System.out.println("执行成功");






    }

    public static Map<String, Object> queryPlayer(Object arg) throws SQLException {
        Map<String, Object> queryRes = new HashMap<>();

        String name = "[-]";
        long QQ = -1L;
        if (arg instanceof String) name = (String) arg;
        else if (arg instanceof Long) QQ = (Long) arg;

        try (Statement stmt = new mcDemo().getConnect().createStatement()) {
            ResultSet res = stmt.executeQuery("SELECT * FROM PLAYER;");
            while (res.next()) {
                if (res.getString("NAME").toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT)) || res.getLong("QQ") == QQ) {
                    ResultSetMetaData data = res.getMetaData();
                    for (int i = 1; i <= data.getColumnCount(); ++i)
                        queryRes.put(data.getColumnName(i), res.getObject(data.getColumnName(i)));
                    return queryRes;
                }
            }
        }

        return queryRes;
    }

    public void executeCommand(String sqlCommand) throws SQLException {
        try (Statement stmt = c.createStatement()) {
            stmt.execute(sqlCommand);
        }
    }

    public Connection getConnect() {
        return c;
    }
}
