package my.hotelId.lib.connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Connect to a PostgreSQL database.
 */
public class PostgreSQLJDBC {
    public static Connection connect() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hotel", "postgres", "pepperoni pizza");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return c;
    }
}