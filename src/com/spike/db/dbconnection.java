
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
    public static void main(String[] args) throws SQLException{
        // JDBC连接的URL，不同数据库有不同的格式
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "tofuzk1.,";

        // 获取连接：
//        try(Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
//            // TODO: 访问数据库...
//            // 关闭连接：
//        }

    }



}
