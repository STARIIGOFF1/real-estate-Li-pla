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

    public static void readProperty(int id) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sql = "SELECT id, name, type, floor, price, pool, roomQty FROM property WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("--- property ---");
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("type: " + rs.getString("type"));
                System.out.println("floor: " + rs.getInt("floor"));
                System.out.println("price: " + rs.getInt("price"));
                System.out.println("pool: " + rs.getBoolean("pool"));
                System.out.println("roomQty: " + rs.getInt("roomQty"));
            } else {
                System.out.println("property not found, id=" + id);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updatePropertyPrice(int id, int newPrice) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sql = "UPDATE property SET price = ? WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, newPrice);
            stmt.setInt(2, id);

            int updated = stmt.executeUpdate();
            if (updated == 1) {
                System.out.println("property updated (price), id=" + id + ", newPrice=" + newPrice);
            } else {
                System.out.println("property not found, nothing updated, id=" + id);
            }

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

    public static void deleteProperty(int id) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sql = "DELETE FROM property WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            int deleted = stmt.executeUpdate();
            if (deleted == 1) {
                System.out.println("property deleted, id=" + id);
            } else {
                System.out.println("property not found, nothing deleted, id=" + id);
            }

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