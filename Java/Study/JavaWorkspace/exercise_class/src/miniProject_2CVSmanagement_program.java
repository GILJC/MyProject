import java.util.Scanner;

public class miniProject_2CVSmanagement_program {
	
//    * 프로그램 전체에서 사용할 변수들을 클래스 블록 아래에 선언합니다.
    
//    * 배열의 길이를 상수화 시킴.
//    * 상수를 선언할 때는 변수 이름 앞에 static final을 붙임.
	
    static final int MAX = 100;
    
    
//    * static이 붙어있는 블록(메서드)에서는  
//      static변수와 static메서드만 사용할 수 있습니다.
    
   
   static String[] nameList = new String[MAX];
   static char[] genderList = new char[MAX];
   static String[] emailList = new String[MAX];
   static int[] birthList = new int[MAX];
   
//   * 현재 고객 데이터가 몇 개 저장되었는지 알기 위한 변수 count 선언.
   static int count = 0;
   
   /*
    * 배열의 인덱스를 조작하기 위해 인덱스를 변수화 시킴.
      배열의 인덱스는 0번부터 시작하므로 초기값을 0 바로 이전값인
      -1로 세팅하여 초기에 next를 실행했을 때 1번 고객데이터가 아닌
      0번 고객데이터가 등장하도록 하기 위함.
    */
   
   static int index = -1;
   
   static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true) {
            
            System.out.println("\n[INFO] 고객 수: " 
            + count + ", 인덱스: " + index);
            System.out.println("메뉴를 입력하세요.");
            System.out.println("(I)nsert, (P)revious, "
                    + "(N)ext, (C)urrent, (U)pdate, "
                    + "(D)elete, (Q)uit");
            System.out.print("메뉴 입력: ");
            String menu = scan.next();
            menu = menu.toLowerCase();
            char m = menu.charAt(0);
            
            switch(m) {
            
            case 'i':
            case 'ㅑ':
                System.out.println("\n고객 정보 입력을 시작합니다.");
                insertData();
                System.out.println("고객 정보가 정상적으로 입력되었습니다.");
                break;
            case 'p':
            case 'ㅔ':
                System.out.println("\n이전 고객정보를 출력합니다.");
                
                if(index <= 0) {
                    System.out.println("이전 고객정보가 존재하지 않습니다.");
                }else {
                    index--;
                    printData(index);                    
                }                
                break;
            case 'n':
            case 'ㅜ':
                System.out.println("\n다음 고객정보를 출력합니다.");
                
                if(index >= count-1) {
                    System.out.println("다음 고객정보가 존재하지 않습니다.");
                }else {                    
                    index++;
                    printData(index);                    
                }
                break;
            case 'c':
            case 'ㅊ':
                System.out.println("\n현재 고객정보를 출력합니다.");
                
                if(index >= 0 && index < count) {
                    printData(index);
                } else {
                    System.out.println("현재 고객정보가 존재하지 않습니다.");
                }
                break;
            case 'u':
            case 'ㅕ':
                if(index >= 0 && index < count) {
                    System.out.println(nameList[index] + "님의 정보를 수정합니다.");
                    updateData(index);
                    System.out.println("고객 정보가 정상적으로 수정되었습니다.");
                }else {
                    System.out.println("수정할 데이터가 존재하지 않습니다.");
                }
                break;
            case 'd':
            case 'ㅇ':
                if(index >= 0 && index < count) {
                    System.out.println(nameList[index] + "님의 정보를 삭제합니다.");
                    deleteData(index);
                    System.out.println("고객 정보가 정상적으로 삭제되었습니다.");
                }else {
                    System.out.println("삭제할 데이터가 존재하지 않습니다.");
                }
                
                break;
            case 'q':
            case 'ㅂ':
                System.out.println("\n프로그램을 종료합니다.");
                scan.close();
                System.exit(0);//프로그램을 강제종료하는 구문
                break;
            
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
            }//end switch            
            
        }//end while

	}//end main method
    
//    * 고객정보를 입력받는 메서드 선언.
    static void insertData() {
        
        System.out.println("========고객 정보 입력========");
        System.out.print("이름: ");
        String name = scan.next();
        
        System.out.print("성별(M/F): ");
        String str = scan.next();
        char gender = str.charAt(0);
        
        System.out.print("이메일: ");
        String email = scan.next();
        
        System.out.print("출생년도: ");
        int birth = scan.nextInt();
        
        System.out.println("===========================");
        
        nameList[count] = name;
        genderList[count] = gender;
        emailList[count] = email;
        birthList[count] = birth;
        
        count++;
    }
    
 //   * 고객 정보를 출력하는 메서드 선언.
    static void printData(int index) {
        
        System.out.println("\n======고객 정보======");
        System.out.println("이름: " + nameList[index]);
        System.out.println("성별: " + genderList[index]);
        System.out.println("이메일: " + emailList[index]);
        System.out.println("출생년도: " + birthList[index]);
        System.out.println("=====================");
    }
    
//    * 고객 정보를 수정하는 메서드 선언.
    static void updateData(int index) {
        
        System.out.println("\n========고객 정보 수정========");
        System.out.print("이름(" + nameList[index] + "): ");
        nameList[index] = scan.next();
        
        System.out.print("성별(" + genderList[index] + "): ");
        genderList[index] = scan.next().charAt(0);
        
        System.out.print("이메일(" + emailList[index] + "): ");
        emailList[index] = scan.next();
        
        System.out.print("출생년도(" + birthList[index] + "): ");
        birthList[index] = scan.nextInt();
    }
    
//    * 고객 정보를 삭제하는 메서드 선언.
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
 
