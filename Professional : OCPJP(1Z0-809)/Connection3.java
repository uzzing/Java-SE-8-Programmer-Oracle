import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection3 {

	public static void main(String[] args) throws SQLException {
		
		String oracleDriver ="oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String passWord = "hr";

		Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
		try (Statement stmt = conn.createStatement()) {
			
			Class.forName(oracleDriver);
			
			String query = "SELECT id FROM Employee";
			
			ResultSet rs = stmt.executeQuery(query);
			stmt.executeQuery("SELECT id FROM Customer");
			
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
