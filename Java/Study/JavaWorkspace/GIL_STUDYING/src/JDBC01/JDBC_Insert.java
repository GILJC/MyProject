package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
 
public class JDBC_Insert {
    public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver"); 
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
            System.out.println("���Ἲ��");
            
            Scanner sc =new Scanner(System.in);
            System.out.printf("������ ��ȣ�� �Է��ϼ���: ");
            String num = sc.nextLine();
            
            System.out.printf("�̸����� �Է��ϼ���: ");
            String name = sc.nextLine();
            
            System.out.printf("�̸��� �Է��ϼ���: ");
            String email = sc.nextLine();
            
            System.out.printf("��ȭ��ȣ�� �Է��ϼ���: ");
            String tel = sc.nextLine();
            
            //�׷��� �̴� ���� ������ ������� ���� �Է¹޾� �ִ¹���̴�.
           //    String sql = "insert into cost values("+num +"," + name +"," + email +"," + ","+tel+")" ;
            
            //�Ʒ��� ������
            String sql = "insert into cost values(?,?,?,?)"; //? ��prepareStatement �� �˾ƺ���
            pstmt =con.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(num)); // ���̺��� ������Ÿ�Կ� �p���ִ°� ������.
            pstmt.setString(2,name);
            pstmt.setString(3,email);
            pstmt.setString(4,tel);
            
            int result = pstmt.executeUpdate();
            if(result ==1) System.out.println("inset ���� ����!");
            else System.out.println("���� ����");
            
        } catch (SQLException e) {
            System.out.println("DB ���� ���� ���� �߸����.. ����̹� ���� ���� ����");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("DB ���� ���� ���� �߸����..  ����̹� Ŭ���� ���� ����");
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("������ ������ ���� ����");
            e.printStackTrace();
            
        }try {//con!= null ������.
                if(con!= null)con.close();
                if(pstmt!= null)pstmt.close();
                System.out.println("�����ͺ��̽��� �� ����Ǿ���.");
            } catch (SQLException e) {
            }
        
        
    }
}
 

