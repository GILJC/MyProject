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
                System.out.println("���Ἲ��");
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ��ȣ ���Է��ϼ���");
        int num =sc.nextInt();
        String sql = "delete from customer where num=?";
        pstmt= con.prepareStatement(sql);
        pstmt.setInt(1, num);
        pstmt.executeUpdate();
            
    
            }catch (SQLException e) {
                System.out.println("DB���� ���� ���� Ʋ�ȴ�.. ����̹� ���� ���� ����");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("DB���� ���� ���� Ʋ�ȴ�..  ����̹� Ŭ���� ���� ����");
                e.printStackTrace();
            }catch (Exception e) {
                System.out.println("������ ������ ���� ����");
                e.printStackTrace();
            }
            try {
                if(pstmt!= null)pstmt.close();
                if(con!= null)con.close();
                System.out.println("�����ͺ��̽��� �� ����Ǿ���.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }    
}
 


// ��ó: https://chillin-dev.tistory.com/12 [�ð��� ���α׷��� ����]