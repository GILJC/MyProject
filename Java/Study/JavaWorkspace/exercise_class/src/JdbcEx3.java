import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx3 {

   public static Connection makeCon() {
   
   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:testdb";
   
   Connection con = null;
   
   boolean connect = false;
   try {
      Class.forName(driver);
      System.out.println("������ ���̽� ���� ��....");
      con = DriverManager.getConnection(url, "scott", "tiger");
      
      connect = true;
      
      if(connect == true)
         System.out.println("����Ǿ����ϴ�.");
      else
         System.out.println("���ῡ �����߽��ϴ�.");
   
   }catch(ClassNotFoundException e) {
      System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�.");
   }catch(SQLException e) {
      System.out.println("�����ͺ��̽� ���� ����");
      System.out.println(e.getMessage());
   }
      return con;   
   }
   public static void main(String[] args)  throws SQLException {
      // TODO Auto-generated method
      Connection con = makeCon();
      StringBuilder sql = new StringBuilder();
      
      sql.append("insert into dept (deptno, dname, loc)");
      sql.append("values (?, ?, ?)");
   
      PreparedStatement psmt = con.prepareStatement(sql.toString());
      psmt.setInt(1, 60);
      psmt.setString(2, "Marketing");
      psmt.setString(3, "Busan");
      psmt.execute();
      
      
      
   }
}