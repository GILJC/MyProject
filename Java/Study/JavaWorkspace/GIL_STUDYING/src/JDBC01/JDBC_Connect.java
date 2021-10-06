package JDBC01;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBC_Connect {
    public static void main(String[] args) {
        //자바에서 지원하는 데이터베이스와 자바의 연결 클래스: Connection 객체
        Connection con = null;
        
        //연결 드라이버 메니저가 연결해준 연결 인스턴스를 con 변수에 저장
        //sql에선 커넥션이랑 이거저거 해줬잖아 그걸 다 명령어로 쳐줘야함.
        String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String id ="scott";
        String pw ="tiger";
        String driver = "oracle.jdbc.OracleDriver";
 
        //con 엔 파라미터로 url(data source source 마우스우 프로퍼티로 가서 커넥션 유알엘 확인) id pw 씀 
       try {
            Class.forName(driver); // 에드케치 2번쩨걸로함. 추가해준단것  드라이브 연결 안됬을 떄 용도 
            con = DriverManager.getConnection(url,id,pw);
            System.out.println("연결성공");
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
        if(con!= null)
            try {
                con.close();
                System.out.println("데이터베이스가 잘 종료되었다.");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}

