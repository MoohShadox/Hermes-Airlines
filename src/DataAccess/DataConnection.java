package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Petru on 19-May-16.
 */

public class DataConnection {

    //fields
    private static Connection connection;
    private static String JDBC_DRIVER = "org.sqlite.JDBC";
    private static final String DATABASE_URL = "jdbc:sqlite:C:/Users/Geekzone/Desktop/Hermes-Airlines4\\Test";
    private static String userName = UserPass.getUserName(); //user credentials sored in UserPass
    private static String password = UserPass.getPassword();


    //method to connect to the database
    public static void connect() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, userName, password);
            System.out.println("database connection success");
        }

        catch (Exception e) {
            e.printStackTrace();

            System.out.println("problem with database connection");
        }
    }

    public static void main(String[] prm){
        connect();
    }

    //getters
    public static Connection getConnection() {
        return connection;
    }

}
