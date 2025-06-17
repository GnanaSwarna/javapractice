import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class insertdept {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";  // Change as per your Oracle setup
        String username = "system";                      // Oracle username
        String password = "9642220646";                      // Oracle password
        String filePath = "D:\\crtpgrm\\dept.txt";                      // Your text file

        try (
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stmt = conn.createStatement();
            BufferedReader br = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    // Remove trailing semicolon if present
                    if (line.endsWith(";")) {
                        line = line.substring(0, line.length() - 1);
                    }
                    stmt.executeUpdate(line);
                }
            }
            System.out.println("All DEPT records inserted successfully.");

        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }
}
