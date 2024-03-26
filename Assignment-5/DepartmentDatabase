import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDatabase {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/departments";
    private static final String USER = "varun";
    private static final String PASSWORD = "password";
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        Department department = new Department(1, "IT");
        Department department = new Department(2, "CSE");

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD, DRIVE_DRIVER_NAME);
             Statement stmt = conn.createStatement()) {

            String query = "INSERT INTO department (id, name) VALUES (" + department.getId() + ", '" + department.getName() + "')";
            stmt.executeUpdate(query);

            System.out.println("Department inserted database successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
