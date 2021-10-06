import java.sql.*;

public class j18_5_DB1Demo {
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		
		try {
			Class.forName("com.oracle.jdbc.Driver");
			
			System.out.println("�����ͺ��̽� ���� ��...");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�...");
		} catch ( SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
		return con;
	}
	
	public static void main(String[] args) {
		 makeConnection();
	}

}
