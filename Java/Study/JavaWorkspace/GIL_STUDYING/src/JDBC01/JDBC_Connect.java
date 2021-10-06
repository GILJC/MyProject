package JDBC01;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBC_Connect {
    public static void main(String[] args) {
        //�ڹٿ��� �����ϴ� �����ͺ��̽��� �ڹ��� ���� Ŭ����: Connection ��ü
        Connection con = null;
        
        //���� ����̹� �޴����� �������� ���� �ν��Ͻ��� con ������ ����
        //sql���� Ŀ�ؼ��̶� �̰����� �����ݾ� �װ� �� ��ɾ�� �������.
        String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String id ="scott";
        String pw ="tiger";
        String driver = "oracle.jdbc.OracleDriver";
 
        //con �� �Ķ���ͷ� url(data source source ���콺�� ������Ƽ�� ���� Ŀ�ؼ� ���˿� Ȯ��) id pw �� 
       try {
            Class.forName(driver); // ������ġ 2���Űɷ���. �߰����شܰ�  ����̺� ���� �ȉ��� �� �뵵 
            con = DriverManager.getConnection(url,id,pw);
            System.out.println("���Ἲ��");
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
        if(con!= null)
            try {
                con.close();
                System.out.println("�����ͺ��̽��� �� ����Ǿ���.");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}

