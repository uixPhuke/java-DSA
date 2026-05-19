package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 class JdbcConnectionExample {

    // Database URL, Username, and Password
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Connected to database successfully!");

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query
            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            // Process Result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close ResultSet
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (stmt != null)
                    stmt.close();

                if (conn != null)
                    conn.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}