package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    // реализуйте настройку соеденения с БД
    private static final String HOSTNAME = "localhost";
    private static final String PORT = "3306";
    private static final String NAME_DB = "katadb_1_1_3";
    private static final String USERNAME = "user1";
    private static final String PASSWORD = "kata_113";

    public static Connection getConnection() {
        Connection connection = null;
        String connectionLine = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + NAME_DB;
        try {
            connection = DriverManager.getConnection(connectionLine, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
