import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection2 {
	
	public static void main(String[] args) { 
	
		try { 
			String oracleDriver ="oracle.jdbc.driver.OracleDriver";
			String OracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String OracleUser = "hr";
			String OraclePasswd = "hr";
			
			Class.forName(oracleDriver);
			Connection conn = DriverManager.getConnection(OracleUrl, OracleUser, OraclePasswd);
			
			
//			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); 
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from employee");
//			ResultSet rs = st.getResultSet();
			
			System.out.print(rs.next());
			
//			while (rs.next()) {
//				if (rs.getInt(1) == 112)
//					rs.updateString(2, "Jack");
//			}
//			
//			rs.absolute(2);
//			System.out.print(rs.getInt(1) + " " + rs.getString(2));
			
			
			rs.close(); 
			st.close(); 
			conn.close(); 
			
		} catch (SQLException | ClassNotFoundException e) { 
			System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다."); 
			System.out.print("사유 : " + e.getMessage());
		} 
	
	}


}
