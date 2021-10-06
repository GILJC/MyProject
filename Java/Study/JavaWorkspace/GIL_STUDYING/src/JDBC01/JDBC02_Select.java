package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class JDBC02_Select {
    public static void main(String[] args) {
      //Ŭ������ �޶����� ���� �ٽ� �ؾ��Ѵ�.
      //�ڹٿ��� �����ϴ� ������ ���̽��� �ڹ��� ���� Ŭ���� Connection��ü
      Connection con = null;
         //PreparedStatementŬ���� 
        //������ ���̽��� sql���� �����ϰ� , ����� ���� ������ �ϴ� Ŭ����
       // �׻� con�� ���̴ٴϴ³���.
         PreparedStatement pstmt = null;
          //PreparedStatement�� ����� �޾� �����ϴ� Ŭ���� ->ResultSet
         ResultSet rs =null;
                        
          //���� ����̹� �޴����� �������� ���� �ν��Ͻ��� con ������ ����
        //sql���� Ŀ�ؼ��̶� �̰����� �����ݾ� �װ� �� ��ɾ�� ������� �ڹٴ�
            String url ="jdbc:oracle:thin:@localhost:1521:xe";
         String id ="scott";
            String pw ="tiger";
           String driver = "oracle.jdbc.OracleDriver";
                        
        try {
         Class.forName(driver); // ������ġ 2���Űɷ���. �߰����شܰ�  ����̺� ���� �ȉ��� �� �뵵 
          con = DriverManager.getConnection(url,id,pw);
          System.out.println("���Ἲ��");
    String sql= "select * from cost";
          //con�� pstmt��sql ��ɰ� �Բ� �����ճ���.
           pstmt =con.prepareStatement(sql);
          rs=pstmt.executeQuery(); //select����
          //rs.next(); //rs.next();
// ���� ���ڵ�� �̵��϶�! ��������尡 �ִٸ� Ʈ�� �ƴ����� ���� ���� ���ڵ��� ���� �� �� �ִ�.
          System.out.println("��ȣ\t�̸�\t�̸���\t\t��ȭ��ȣ");
          System.out.println("----------------------------------------");
          while(rs.next()) { //���ڵ尡 ���� ��� �ݺ�
               int num =rs.getInt("num");
               String name = rs.getString("name");
               String email =rs.getString("email");
               String tel = rs.getString("tel");
               System.out.printf("%d\t%s\t%s\t%s\n",num,name,email,tel);
                                
                }
            } catch (SQLException e) {
           System.out.println("DB���� ���� ���� Ʋ�ȴ�.. ����̹� ���� ���� ����");
                            
               e.printStackTrace();
             } catch (ClassNotFoundException e) {
           System.out.println("DB���� ���� ���� Ʋ�ȴ�..  ����̹� Ŭ���� ���� ����");
           e.printStackTrace();
            }catch (Exception e) {
           System.out.println("������ ������ ���� ����");
           e.printStackTrace();
              }
              // ���� ������ �ȵǰԵǾ��ٸ� �����ִ� con��ü�� �ݾƾ��Ѵ�. 
          try {
               if(con!= null)con.close();
               if(pstmt!= null)pstmt.close(); //������ ��ü�� �ݾ������
               if(rs!= null)rs.close();// ������ ��ü�� �ݾ������.
              System.out.println("�����ͺ��̽��� �� ����Ǿ���.");
           } catch (SQLException e) {
           // TODO Auto-generated catch block
            e.printStackTrace();
     }
 
    }        
}
 
