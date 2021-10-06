package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
 
public class JDBC_Update {
 
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = null;
        
        PreparedStatement pstmt = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "scott", "tiger");
            // System.out.println("�����ͺ��̽� ���� ����~~~");
            Scanner sc = new Scanner(System.in);
            System.out.print("������ ȸ���� ��ȣ�� �����ϼ���: ");
            String num = sc.nextLine();
            System.out.print("������ �׸��� �����ϼ���. 1.�̸��� 2.��ȭ��ȣ");
            String input = sc.nextLine();
            String sql = null;
            switch (input) {
            case "1":
                System.out.print("������ �̸����� �Է��ϼ���: ");
                String email = sc.nextLine();
                sql = "update cost set email=? where num=?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, email);
                pstmt.setInt(2, Integer.parseInt(num));
                break;
            case "2":
                System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���: ");
                String tel = sc.nextLine();
                sql = "update cost set tel=? where num=?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, tel);
                pstmt.setInt(2, Integer.parseInt(num));
                break;
            }
 
            int result = pstmt.executeUpdate();
            if (result == 1)
                System.out.println("���� ���� ~");
            else
                System.out.println("���� ���� ��");
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pstmt != null)
                pstmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
    }
 
}
 

