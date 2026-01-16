import java.sql.*;

public class dbms {

    public static void addCourse(String courseName, String courseCode, int credits) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(connectionURL, "postgres", "0000");

            String sqlCourse = "INSERT INTO course (course_name, course_code, credits) VALUES (?, ?, ?)";
            stmt = con.prepareStatement(sqlCourse);

            stmt.setString(1, courseName);
            stmt.setString(2, courseCode);
            stmt.setInt(3, credits);

            stmt.executeUpdate();

            System.out.println("Course added: " + courseName);

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