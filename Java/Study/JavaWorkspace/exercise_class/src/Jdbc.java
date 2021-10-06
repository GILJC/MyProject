import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
    public static void main(String[] args) {
        // 1. DB����
        // -Connection Ŭ����
        Connection conn = null;
 
        // 2. ���� ���ڿ� ����
        // -���ӿ� �ʿ��� ������ ������ ���ڿ�, Connection String
        String url = "jdbc:oracle:thin:@localhost:1521:testdb"; //localhost��� ip�ּҰ� ������
        String id = "scott";
        String pw = "tiger";
 
        // DB�۾� > �ܺ� ����� > try-catch �ʼ�
 
        try {
            // 3. JDBC ����̹� �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
            // 4. ����
            // - Connection ��ü ���� + ���� �۾�.
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println(conn.isClosed()?"��������":"������");// ������(false), ��������(true)
 
            // 5. SQL
 
            // 6. ��������
            conn.close();
            System.out.println(conn.isClosed()?"��������":"������");// ������(false), ��������(true)
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main
}
