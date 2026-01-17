import java.sql.*;

public class dbms {

    public static void addProperty(int id, String name, String type, int floor, int price, boolean pool, int roomQty) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sqlProperty = "INSERT INTO property (id, name, type, floor, price, pool, roomQty) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = con.prepareStatement(sqlProperty);

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, type);
            stmt.setInt(4, floor);
            stmt.setInt(5, price);
            stmt.setBoolean(6, pool);
            stmt.setInt(7, roomQty);

            stmt.executeUpdate();

            System.out.println("property added: " + name);

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addRealtor(int id, String name, String agency, String property) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sqlProperty = "INSERT INTO realtor (id, name, agency, property) VALUES (?, ?, ?, ?) ";
            stmt = con.prepareStatement(sqlProperty);

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, agency);
            stmt.setString(4, property);
            stmt.executeUpdate();

            System.out.println("realtor " + name + " added");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}