package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        JDBCConnection jdbcConnection1 = getConnection();
        JDBCConnection jdbcConnection2 = getConnection();

        System.out.println("JDBC Connection 1: "+jdbcConnection1.hashCode());
        System.out.println("JDBC Connection 2: "+jdbcConnection2.hashCode());

        if(jdbcConnection1.hashCode() == jdbcConnection2.hashCode()) {
            System.out.println("Its a singleton design pattern");
        }
    }

    public static JDBCConnection getConnection() {
        return JDBCConnection.getJdbcConnection();
    }
}
