import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection4 {

public static void main(String[] args) throws SQLException {
		
		String OracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String passWord = "hr";
		
		try {
			Connection conn = DriverManager.getConnection(OracleUrl, userName, passWord);
			String query = "SELECT * FROM Employee";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println("Error");
		}

	}
}
