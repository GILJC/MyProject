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
      System.out.println("데이터 베이스 연결 중....");
      con = DriverManager.getConnection(url, "scott", "tiger");
      
      connect = true;
      
      if(connect == true)
         System.out.println("연결되었습니다.");
      else
         System.out.println("연결에 실패했습니다.");
   
   }catch(ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
   }catch(SQLException e) {
      System.out.println("데이터베이스 연결 실패");
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