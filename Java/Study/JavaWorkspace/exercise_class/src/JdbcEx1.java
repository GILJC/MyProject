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
			System.out.println("�����ͺ��̽� ���� ��...");
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			connect = true;		// connect�� üũ.
			
			if(connect == true)
				System.out.println("����Ǿ����ϴ�.");
			else
				System.out.println("���ῡ �����Ͽ����ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�...");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public static void main(String[] args) {
		makeCon();
	}

}

