import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Statement1 {
	
static Connection newConnection = null;
	
	public static Connection getDBConnection() throws SQLException {
		
//		try (Connection con = DriverManager.getConnection(URL, username, password)) {
//			newConnection = con;
//		}
		
		return newConnection;
	}

	public static void main(String[] args) throws SQLException {
		
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES(120, Kelvin)");
	
	}

}
