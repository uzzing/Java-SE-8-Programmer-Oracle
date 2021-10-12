import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection1 {

	private Connection con; 
	private Statement stmt;
	private ResultSet rs; 
	
	public Connection1() { 
		
	
		try { 
			String oracleDriver ="oracle.jdbc.driver.OracleDriver";
			String OracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String OracleUser = "hr";
			String OraclePasswd = "hr";
			
			Class.forName(oracleDriver);
			con = DriverManager.getConnection(OracleUrl, OracleUser, OraclePasswd);
			System.out.println("DB연결 성공");
			
			
			stmt = con.createStatement(); 
			System.out.println("Statement객체 생성 성공");
			
			
			rs = stmt.executeQuery("select * from employee");
			stmt.executeQuery("SELECT id FROM Customer");
			
			System.out.print(rs);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " " + rs.getString(2));
			}
			
			
			rs.close(); 
			stmt.close(); 
			con.close(); 
			
		} catch (SQLException | ClassNotFoundException e) { 
			System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다."); 
			System.out.print("사유 : " + e.getMessage());
			} 
	} 
	
	public static void main(String[] args) { 
			new Connection1();
	}


}
