import java.util.Scanner;

public class miniProject_2CVSmanagement_program {
	
//    * ���α׷� ��ü���� ����� �������� Ŭ���� ��� �Ʒ��� �����մϴ�.
    
//    * �迭�� ���̸� ���ȭ ��Ŵ.
//    * ����� ������ ���� ���� �̸� �տ� static final�� ����.
	
    static final int MAX = 100;
    
    
//    * static�� �پ��ִ� ���(�޼���)������  
//      static������ static�޼��常 ����� �� �ֽ��ϴ�.
    
   
   static String[] nameList = new String[MAX];
   static char[] genderList = new char[MAX];
   static String[] emailList = new String[MAX];
   static int[] birthList = new int[MAX];
   
//   * ���� �� �����Ͱ� �� �� ����Ǿ����� �˱� ���� ���� count ����.
   static int count = 0;
   
   /*
    * �迭�� �ε����� �����ϱ� ���� �ε����� ����ȭ ��Ŵ.
      �迭�� �ε����� 0������ �����ϹǷ� �ʱⰪ�� 0 �ٷ� ��������
      -1�� �����Ͽ� �ʱ⿡ next�� �������� �� 1�� �������Ͱ� �ƴ�
      0�� �������Ͱ� �����ϵ��� �ϱ� ����.
    */
   
   static int index = -1;
   
   static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true) {
            
            System.out.println("\n[INFO] �� ��: " 
            + count + ", �ε���: " + index);
            System.out.println("�޴��� �Է��ϼ���.");
            System.out.println("(I)nsert, (P)revious, "
                    + "(N)ext, (C)urrent, (U)pdate, "
                    + "(D)elete, (Q)uit");
            System.out.print("�޴� �Է�: ");
            String menu = scan.next();
            menu = menu.toLowerCase();
            char m = menu.charAt(0);
            
            switch(m) {
            
            case 'i':
            case '��':
                System.out.println("\n�� ���� �Է��� �����մϴ�.");
                insertData();
                System.out.println("�� ������ ���������� �ԷµǾ����ϴ�.");
                break;
            case 'p':
            case '��':
                System.out.println("\n���� �������� ����մϴ�.");
                
                if(index <= 0) {
                    System.out.println("���� �������� �������� �ʽ��ϴ�.");
                }else {
                    index--;
                    printData(index);                    
                }                
                break;
            case 'n':
            case '��':
                System.out.println("\n���� �������� ����մϴ�.");
                
                if(index >= count-1) {
                    System.out.println("���� �������� �������� �ʽ��ϴ�.");
                }else {                    
                    index++;
                    printData(index);                    
                }
                break;
            case 'c':
            case '��':
                System.out.println("\n���� �������� ����մϴ�.");
                
                if(index >= 0 && index < count) {
                    printData(index);
                } else {
                    System.out.println("���� �������� �������� �ʽ��ϴ�.");
                }
                break;
            case 'u':
            case '��':
                if(index >= 0 && index < count) {
                    System.out.println(nameList[index] + "���� ������ �����մϴ�.");
                    updateData(index);
                    System.out.println("�� ������ ���������� �����Ǿ����ϴ�.");
                }else {
                    System.out.println("������ �����Ͱ� �������� �ʽ��ϴ�.");
                }
                break;
            case 'd':
            case '��':
                if(index >= 0 && index < count) {
                    System.out.println(nameList[index] + "���� ������ �����մϴ�.");
                    deleteData(index);
                    System.out.println("�� ������ ���������� �����Ǿ����ϴ�.");
                }else {
                    System.out.println("������ �����Ͱ� �������� �ʽ��ϴ�.");
                }
                
                break;
            case 'q':
            case '��':
                System.out.println("\n���α׷��� �����մϴ�.");
                scan.close();
                System.exit(0);//���α׷��� ���������ϴ� ����
                break;
            
            default:
                System.out.println("�޴��� �߸� �Է��߽��ϴ�.");
            }//end switch            
            
        }//end while

	}//end main method
    
//    * �������� �Է¹޴� �޼��� ����.
    static void insertData() {
        
        System.out.println("========�� ���� �Է�========");
        System.out.print("�̸�: ");
        String name = scan.next();
        
        System.out.print("����(M/F): ");
        String str = scan.next();
        char gender = str.charAt(0);
        
        System.out.print("�̸���: ");
        String email = scan.next();
        
        System.out.print("����⵵: ");
        int birth = scan.nextInt();
        
        System.out.println("===========================");
        
        nameList[count] = name;
        genderList[count] = gender;
        emailList[count] = email;
        birthList[count] = birth;
        
        count++;
    }
    
 //   * �� ������ ����ϴ� �޼��� ����.
    static void printData(int index) {
        
        System.out.println("\n======�� ����======");
        System.out.println("�̸�: " + nameList[index]);
        System.out.println("����: " + genderList[index]);
        System.out.println("�̸���: " + emailList[index]);
        System.out.println("����⵵: " + birthList[index]);
        System.out.println("=====================");
    }
    
//    * �� ������ �����ϴ� �޼��� ����.
    static void updateData(int index) {
        
        System.out.println("\n========�� ���� ����========");
        System.out.print("�̸�(" + nameList[index] + "): ");
        nameList[index] = scan.next();
        
        System.out.print("����(" + genderList[index] + "): ");
        genderList[index] = scan.next().charAt(0);
        
        System.out.print("�̸���(" + emailList[index] + "): ");
        emailList[index] = scan.next();
        
        System.out.print("����⵵(" + birthList[index] + "): ");
        birthList[index] = scan.nextInt();
    }
    
//    * �� ������ �����ϴ� �޼��� ����.
    static void deleteData(int index) {
        
        for(int i=index; i<count-1; i++) {
            nameList[i] = nameList[i+1];
            genderList[i] = genderList[i+1];
            emailList[i] = emailList[i+1];
            birthList[i] = birthList[i+1];
        }
        count--;
    }
 
}//end class
 
