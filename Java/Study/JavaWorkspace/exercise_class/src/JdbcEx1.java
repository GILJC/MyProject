import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx1 {

	public static Connection makeCon() {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		
		Connection con = null;
		
		boolean connect = false;
		
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 연결 중...");
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			connect = true;		// connect값 체크.
			
			if(connect == true)
				System.out.println("연결되었습니다.");
			else
				System.out.println("연결에 실패하였습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다...");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public static void main(String[] args) {
		makeCon();
	}

}

