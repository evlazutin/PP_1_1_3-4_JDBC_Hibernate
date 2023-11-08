package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  Util {
    public static Connection getConnection() {
        final String HOSTNAME = "jdbc:mysql://localhost:3306/mydb";
        final String USERNAME = "root";
        final String PASS = "root";
        {
            try {
                Driver driver = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(driver);
                return DriverManager.getConnection(HOSTNAME, USERNAME, PASS);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
