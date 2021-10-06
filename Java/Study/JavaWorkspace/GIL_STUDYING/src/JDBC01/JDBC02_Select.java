package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class JDBC02_Select {
    public static void main(String[] args) {
      //클래스가 달라지면 연결 다시 해야한다.
      //자바에서 지원하는 데이터 베이스와 자바의 연결 클래스 Connection객체
      Connection con = null;
         //PreparedStatement클래스 
        //데이터 베이스에 sql문을 전송하고 , 결과를 얻어내는 역할을 하는 클래스
       // 항상 con과 같이다니는놈임.
         PreparedStatement pstmt = null;
          //PreparedStatement의 결과를 받아 저장하는 클래스 ->ResultSet
         ResultSet rs =null;
                        
          //연결 드라이버 메니저가 연결해준 연결 인스턴스를 con 변수에 저장
        //sql에선 커넥션이랑 이거저거 해줬잖아 그걸 다 명령어로 쳐줘야함 자바는
            String url ="jdbc:oracle:thin:@localhost:1521:xe";
         String id ="scott";
            String pw ="tiger";
           String driver = "oracle.jdbc.OracleDriver";
                        
        try {
         Class.forName(driver); // 에드케치 2번쩨걸로함. 추가해준단것  드라이브 연결 안됬을 떄 용도 
          con = DriverManager.getConnection(url,id,pw);
          System.out.println("연결성공");
    String sql= "select * from cost";
          //con과 pstmt를sql 명령과 함께 연결합나다.
           pstmt =con.prepareStatement(sql);
          rs=pstmt.executeQuery(); //select만씀
          //rs.next(); //rs.next();
// 다음 레코드로 이동하라! 다음레토드가 있다면 트루 아님폴스 리턴 다음 레코드의 유무 할 수 있다.
          System.out.println("번호\t이름\t이메일\t\t전화번호");
          System.out.println("----------------------------------------");
          while(rs.next()) { //레코드가 있음 계속 반복
               int num =rs.getInt("num");
               String name = rs.getString("name");
               String email =rs.getString("email");
               String tel = rs.getString("tel");
               System.out.printf("%d\t%s\t%s\t%s\n",num,name,email,tel);
                                
                }
            } catch (SQLException e) {
           System.out.println("DB연결 실패 무언가 틀렸다.. 드라이버 연결 정보 오류");
                            
               e.printStackTrace();
             } catch (ClassNotFoundException e) {
           System.out.println("DB연결 실패 무언가 틀렸다..  드라이버 클래스 파일 오류");
           e.printStackTrace();
            }catch (Exception e) {
           System.out.println("별도의 사유로 연결 실패");
           e.printStackTrace();
              }
              // 만약 연결이 안되게되었다면 열려있는 con객체를 닫아야한다. 
          try {
               if(con!= null)con.close();
               if(pstmt!= null)pstmt.close(); //각각의 객체도 닫아줘야함
               if(rs!= null)rs.close();// 각가의 객체도 닫아줘야함.
              System.out.println("데이터베이스가 잘 종료되었다.");
           } catch (SQLException e) {
           // TODO Auto-generated catch block
            e.printStackTrace();
     }
 
    }        
}
 
