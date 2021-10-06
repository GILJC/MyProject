package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
 
public class JDBC_Delete {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
            try {
                Class.forName("oracle.jdbc.OracleDriver"); 
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
                System.out.println("연결성공");
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 번호 를입력하세요");
        int num =sc.nextInt();
        String sql = "delete from customer where num=?";
        pstmt= con.prepareStatement(sql);
        pstmt.setInt(1, num);
        pstmt.executeUpdate();
            
    
            }catch (SQLException e) {
                System.out.println("DB연결 실패 무언가 틀렸다.. 드라이버 연결 정보 오류");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("DB연결 실패 무언가 틀렸다..  드라이버 클래스 파일 오류");
                e.printStackTrace();
            }catch (Exception e) {
                System.out.println("별도의 사유로 연결 실패");
                e.printStackTrace();
            }
            try {
                if(pstmt!= null)pstmt.close();
                if(con!= null)con.close();
                System.out.println("데이터베이스가 잘 종료되었다.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }    
}
 


// 출처: https://chillin-dev.tistory.com/12 [올곧은 프로그래밍 공간]