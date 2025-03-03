package Creational.Singleton;

public class JDBCConnection {

    //Declare a static variable which store the connection object
    private static JDBCConnection jdbcConnection = null;

    //make the constructor private

    private JDBCConnection() {};

    //make a method that will create the connection object
    //since we can not create an instance of this class using constructor because its private
    //we need to create a static method to instantiate the object

    public static JDBCConnection getJdbcConnection() {
        if(jdbcConnection == null) {
            synchronized (JDBCConnection.class) {
                if(jdbcConnection == null) {
                    jdbcConnection =  new JDBCConnection();
                }
            }
        }

        return jdbcConnection;
    }
}
