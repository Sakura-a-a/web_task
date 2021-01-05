package org.csu.mypetstore.persistence;
import java.sql.*;

import java.sql.*;

public class DBUtil {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mypetstore?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void closeConnection(Connection connection) throws Exception{
        if(null != connection){
            connection.close();
        }
    }

    public static void closeStatement(Statement statement) throws Exception{
        if(null != statement){
            statement.close();
        }
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) throws Exception{
        if(null != preparedStatement){
            preparedStatement.close();
        }
    }

    public static void closeResultSet(ResultSet resultSet) throws Exception{
        if(null != resultSet){
            resultSet.close();
        }
    }
}
