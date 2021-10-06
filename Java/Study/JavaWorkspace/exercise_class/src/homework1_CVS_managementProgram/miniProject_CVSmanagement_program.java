package homework1_CVS_managementProgram;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 제품 정보 입력
class P_receiving extends miniProject_CVSmanagement_program {
	public void P_receiving() {
		System.out.println("상품 번호(숫자만 입력): ");
		int p_num = sc.nextInt();
		
		System.out.println("상품 이름: (띄어쓰기없이 입력)");
		String p_name = sc.next();
		
		System.out.println("상품 분류: (띄어쓰기없이 입력)");
		String p_category = sc.next();	// nextLine()과의 차이 : 띄어쓰기 사용 불가. -> 띄어쓰기 전까지의 단어만 출력
		
		System.out.println("상품 가격: ");
		int p_price = sc.nextInt();
		
		System.out.println("판매 날짜: (년, 월, 주, 일 간격으로 각각 Enter로 입력), 미판매시 0으로 입력");
		System.out.print("년도: ");
		int p_sell_year = sc.nextInt();
		System.out.print("월: ");
		int p_sell_month = sc.nextInt();
		System.out.print("주: ");
		int p_sell_week = sc.nextInt();
		System.out.println("일: ");
		int p_sell_date = sc.nextInt();

		
		p_numList[count] = p_num;
		p_nameList[count] = p_name;
		p_categoryList[count] = p_category;
		p_priceList[count] = p_price;
		
		p_sell_dateList[count] = p_sell_date;
		p_sell_weekList[count] = p_sell_week;
		p_sell_monthList[count] = p_sell_month;
		p_sell_yearList[count] = p_sell_year;
		
		count += 1;
		
	}
	
}

// 제품 정보 출력
class P_data extends miniProject_CVSmanagement_program {
	public void P_data(int index) {
		System.out.println("상품 index: " + index);
		System.out.println("상품 번호: " + p_numList[index]);
		System.out.println("상품 이름: " + p_nameList[index]);
		System.out.println("상품 분류: " + p_categoryList[index]);
		System.out.println("상품 가격: " + p_priceList[index]);
		System.out.println();
		System.out.println("판매 날짜: "
				+ p_sell_yearList[index] + "년 "
				+ p_sell_dateList[index] + "월 "
				+ p_sell_weekList[index] + "주 "
				+ p_sell_monthList[index] +"일");
	}
}

// 일별 매출 집계
class P_priceSum_date extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("찾는 년도: ");
		int year = sc.nextInt();
		System.out.println("찾는 월: ");
		int month = sc.nextInt();
		System.out.println("찾는 주: ");
		int week = sc.nextInt();
		System.out.println("찾는 일: ");
		int date = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			if (year == p_sell_yearList[i]) {
				if (month == p_sell_monthList[i]) {
					if (week == p_sell_weekList[i]) {
						if (date == p_sell_dateList[i]) {
							tmp += p_priceList[i];
						}
					}
				}
			}
		}
		System.out.println("일별 매출 집계: " + tmp);
		priceSum_date = tmp;
	}
}
// 주별 매출 집계
class P_priceSum_week extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("찾는 년도: ");
		int year = sc.nextInt();
		System.out.println("찾는 월: ");
		int month = sc.nextInt();
		System.out.println("찾는 주: ");
		int week = sc.nextInt();
		
		for (int i = 0; i < count; i++) 
			if (year == p_sell_yearList[i]) 
				if (month == p_sell_monthList[i]) 
					if (week == p_sell_weekList[i])  
							tmp += p_priceList[i];

		System.out.println("주별 매출 집계: " + tmp);
		priceSum_week = tmp;
	}
}
// 월별 매출 집계
class P_priceSum_month extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("찾는 년도: ");
		int year = sc.nextInt();
		System.out.println("찾는 월: ");
		int month = sc.nextInt();
		
		for (int i = 0; i < count; i++) 
			if (year == p_sell_yearList[i]) 
				if (month == p_sell_monthList[i]) 
							tmp += p_priceList[i];

		System.out.println("월별 매출 집계: " + tmp);
		priceSum_month = tmp;
	}
}

// 제품 삭제
class P_releasing extends miniProject_CVSmanagement_program {
	public void P_releasing(int index) {
		/*
		.p_numList[index] = 0;
		.p_nameList[index] = "";
		.p_categoryList[index] = "";
		*/
		for (int i = index; i < count; i++) {
			p_numList[index] = p_numList[index+1];
			p_nameList[index] = p_nameList[index+1];
			p_categoryList[index] = p_categoryList[index+1];
			p_priceList[index] = p_priceList[index+1];
			
			p_sell_yearList[index] = p_sell_yearList[index+1];
			p_sell_monthList[index] = p_sell_monthList[index+1];
			p_sell_weekList[index] = p_sell_weekList[index+1];
			p_sell_dateList[index] = p_sell_dateList[index+1];
		}
		
		count--;
	}
}

// 제품 정보 수정 = 제품 판매(판매 날짜 입력)
class P_update extends miniProject_CVSmanagement_program {
	public void P_update(int index) {
		System.out.println();
		System.out.println("상품 번호: " + p_numList[index]);
		//.p_numList[index] = .sc.nextInt();
		System.out.println("상품 이름: " + p_nameList[index]);
		//.p_nameList[index] = .sc.nextLine();
		System.out.println("상품 분류: " + p_categoryList[index]);
		//.p_categoryList[index] = .sc.nextLine();
		System.out.println("상품 가격: " + p_priceList[index]);
		//.p_priceList[index] = .sc.nextInt();
		System.out.println();
		System.out.println("판매 날짜: (판매된 날짜로 각각 변경하시오.)"
				+ p_sell_yearList[index] + "년 "
				+ p_sell_dateList[index] + "월 "
				+ p_sell_weekList[index] + "주 "
				+ p_sell_monthList[index] +"일");
		System.out.println("판매 날짜 수정: (년, 월, 주, 일 간격으로 각각 Enter로 입력), 미판매시 0으로 입력");
		System.out.print("년도: ");
		p_sell_yearList[index] = sc.nextInt();
		System.out.print("월: ");
		p_sell_monthList[index] = sc.nextInt();
		System.out.print("주: ");
		p_sell_weekList[index] = sc.nextInt();
		System.out.println("일: ");
		p_sell_dateList[index] = sc.nextInt();
		
	}
	
}

// * 여기서부터 고객 정보 관련

// 고객 추가
class AddUser extends miniProject_CVSmanagement_program {
	public void AddUser() {
		System.out.println("고객 key: " + userCount);
		System.out.println("고객 이름: ");
		String userName = sc.next();
		
		System.out.println("고객 성별: ");
		String userGender = sc.next();
		
		System.out.println("고객 번호");
		int userNumber = sc.nextInt();
		
		userNameList[userCount] = userName;
		userGenderList[userCount] = userGender;
		userNumberList[userCount] = userNumber;
		
		userCount++;
	}
}

//특정 고객 정보 출력
class UserData extends miniProject_CVSmanagement_program {
	public void UserData(int index) {
		System.out.println("고객 key: " + index);
		System.out.println("고객 이름: " + userNameList[index]);
		System.out.println("고객 성별: " + userGenderList[index]);
		System.out.println("고객 번호: " + userNumberList[index]);
	}
}

// 고객 정보 수정
class UserUpdate extends miniProject_CVSmanagement_program {
	public void UserUpdate(int index) {
		System.out.println("고객 이름: " + userNameList[index]);
		userNameList[index] = sc.next();
		System.out.println("고객 성별: " + userGenderList[index]);
		userGenderList[index] = sc.next();
		System.out.println("고객 번호: " + userNumberList[index]);
		userNumberList[index] = sc.nextInt();
	}
}

// 고객 정보 삭제
class UserDelete extends miniProject_CVSmanagement_program {
	public void UserDelete(int index) {
		for(int i = index; i < userCount; i++) {
			userNameList[i] = userNameList[i+1];
			userGenderList[i] = userGenderList[i+1];
			userNumberList[i] = userNumberList[i+1];
		}
		userCount--;
	}
}



public class miniProject_CVSmanagement_program {
	
	static Scanner sc = new Scanner(System.in);		// static으로 써줘야 다른 class에서 sc를 사용 가능.
	
	
	static int MAX = 300;
	static int count = 0;
	static int userCount = 0;	// 뭂품용과, 고객용의 count를 따로 나눔
	
	static int index = 0;
	
	static int[] p_numList = new int[MAX];		// static 변수는 main 안에 쓰면 에러 발생.
	static String[] p_nameList = new String[MAX];
	static String[] p_categoryList = new String[MAX];
	static int[] p_priceList = new int[MAX];
	
	static int[] p_sell_dateList = new int[MAX];
	static int[] p_sell_weekList = new int[MAX];
	static int[] p_sell_monthList = new int[MAX];
	static int[] p_sell_yearList = new int[MAX];
	
	static int tmp = 0;	// 판매 금액 합계용
	
	static int priceSum_date = 0;
	static int priceSum_week = 0;
	static int priceSum_month = 0;
	
	static String[] p_EAList = new String[MAX];
	
	static String[] userNameList = new String[MAX];
	static String[] userGenderList = new String[MAX];
	static int[] userNumberList = new int[MAX];
	
	static String userData_Print = "";
	static String pData_Print = "";
	
	static String fileName = "C:\\Output.txt";
	
	
	// ------------------------------------------------------ jdbc start.
	
	static int t = 0;
	
	// ------------------------------------------------------ jdbc end.
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_receiving pReceiving = new P_receiving();
		P_data pData = new P_data();
		P_priceSum_date pPriceSum_date = new P_priceSum_date();
		P_priceSum_week pPriceSum_week = new P_priceSum_week();
		P_priceSum_month pPriceSum_month = new P_priceSum_month();
		P_releasing pReleasing = new P_releasing();
		P_update pUpdate = new P_update();
		
		AddUser addUser = new AddUser();
		UserData userData = new UserData();
		UserUpdate userUpdate = new UserUpdate();
		UserDelete userDelete = new UserDelete();
		
		//------------------------------------------  JDBC 부분 시작
		
		JDBC_CreateTable jdbc_createtable = new JDBC_CreateTable();
		JDBC_DropTable jdbc_droptable = new JDBC_DropTable();
		JDBC_InsertValue jdbc_insertvalue = new JDBC_InsertValue();
		JDBC_SelectTable jdbc_selecttable = new JDBC_SelectTable();
		
		
		
		while (1==1) {
						
			System.out.println();
			System.out.println("메뉴 번호 선택");
			System.out.println("1) 물건 관리 메뉴");
			System.out.println("2) 고객 관리 메뉴");
			System.out.println("3) 매출, 고객 정보 데이터 파일로 저장");
			System.out.println("(마지막으로 확인한 월, 주, 일별 매출과 전체 고객 정보 데이터를 " + fileName + "(으)로 저장)");
			System.out.println("4) OracleDB 테이블 생성");
			System.out.println("5) OracleDB 테이블 삭제");
			System.out.println("6) OracleDB 테이블에 전체 고객 내용 저장");
			System.out.println("7) OracleDB 테이블의 내용 출력");
			System.out.println("q) 종료");
			String num_menu = sc.next();
			System.out.println();
			
			if (num_menu.equals("1")) {
				while(true) {
					System.out.println("\n물건 관리 메뉴");
					System.out.println("1) 입고 기능");
					System.out.println("2) 판매 기능(제품 정보 수정으로 판매날짜 추가)");
					System.out.println("3) 재고 확인");
					System.out.println("4) 매출 집계 기능: 일, 주, 월 단위");
					System.out.println("5) 전체 재고 확인");
					System.out.println("q) 이전 메뉴로 나가기");
					String num_menu1 = sc.next();
					if (num_menu1.equals("1")) {
						pReceiving.P_receiving();
					}
					else if (num_menu1.equals("2")) {
						System.out.println("수정하려는 상품 index 입력(0 ~ " + count + "): ");
						index = sc.nextInt();
						pUpdate.P_update(index);
					}
					else if (num_menu1.equals("3")) {
						System.out.println("출력하려는 상품 index 입력(0 ~ " + count + "): ");
						index = sc.nextInt();
						pData.P_data(index);
						
						System.out.println("전체 상품 수: " + count);
					}
					else if (num_menu1.equals("4")) {
						System.out.println("원하는 매출 정보 입력('월별' 또는, '주별' 또는, '일별'중 원하는 메뉴를 글자로 입력)");
						num_menu1 = sc.next();
						if(num_menu1.equals("월별")) {
							pPriceSum_month.P_priceSum();
						}
						else if(num_menu1.equals("주별")) {
							pPriceSum_week.P_priceSum();
						}
						else if(num_menu1.equals("일별")) {
							pPriceSum_month.P_priceSum();
						}
						else {
							System.out.println("잘못 입력하였습니다. 다시 입력하여 주십시오.");
							System.out.println();
						}
					}
					else if (num_menu1.equals("5")) {
						for (int i = 0; i < count; i++) {
							System.out.println("\n상품 index: " + i);
							System.out.println("상품 번호: " + p_numList[i]);
							System.out.println("상품 이름: " + p_nameList[i]);
							System.out.println("상품 분류 " + p_categoryList[i]);
							System.out.println("상품 가격: " + p_priceList[i]);
							System.out.println("판매 날짜: " + p_sell_yearList[i] + "년 "
									 + p_sell_monthList[i] + "월 "
									+ p_sell_weekList[i] + "주 "
									+ p_sell_dateList[i] + "일");
						}

					}
					
					else if (num_menu1.equals("q")) {
						System.out.println("이전 메뉴로 돌아갑니다.");
						break;
					}
					else if (num_menu1.equals("ㅂ")) {
						System.out.println("이전 메뉴로 돌아갑니다.");
						break;
					}
					else {
						System.out.println("잘못 입력하였습니다. 다시 입력하여 주십시오.");
						System.out.println();
					}
					
				} // while문 1번(물품 관리) 종료.
			}
			
			else if (num_menu.equals("2")) {
				System.out.println("고객 관리 메뉴");
				while(true) {
					System.out.println();
					System.out.println("\n메뉴 번호 선택");
					System.out.println("1) 고객 정보 입력");
					System.out.println("2) 고객 정보 수정");
					System.out.println("3) 고객 정보 삭제");
					System.out.println("4) 특정 고객 정보 출력");
					System.out.println("5) 전체 고객 정보 출력");
					System.out.println("q) 이전 메뉴로 나가기");
					String num_menu2 = sc.next();
					System.out.println();
					
					if (num_menu2.equals("1")) {
						addUser.AddUser();
					}
					else if (num_menu2.equals("2")) {
						System.out.println("수정하려는 고객 key 입력(0 ~ " + userCount + "): ");
						index = sc.nextInt();
						userUpdate.UserUpdate(index);
					}
					else if (num_menu2.equals("3")) {
						index = sc.nextInt();
						userDelete.UserDelete(index);
					}
					else if (num_menu2.equals("4")) {
						System.out.println("출력하려는 고객 key 입력(0 ~ \" + userCount + \"): ");
						index = sc.nextInt();
						userData.UserData(index);
						System.out.println("전체 고객 수: " + userCount);
					}
					else if (num_menu2.equals("5")) {
						for (int i = 0; i < userCount; i++) {
							System.out.println("\n고객 key: " + i);
							System.out.println("고객 성별: " + userGenderList[i]);
							System.out.println("고객 이름: " + userNameList[i]);
							System.out.println("고객 번호: " + userNumberList[i]);
						}
					}
					
					else if (num_menu2.equals("q")) {
						break;
					}
					else if (num_menu2.equals("ㅂ")) {
						break;
					}
					else {
						System.out.println("잘못 입력하였습니다. 다시 입력하여 주십시오.");
					}
				} // while문 2번(고객 관리) 종료
			}
			
			else if (num_menu.equals("3")) {
				
				for(int i=0; i<userCount; i++) {
					userData_Print += "\n\n고객 이름: " + userNameList[i]
							+ "\n고객 성별: " + userGenderList[i]
									+ "\n고객 번호: " + userNumberList[i];
				}
				
				Date today = new Date();
				
				SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
				SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
				
				String txt = "\n(마지막으로 확인한(=저장된))\n일별 매출: " + priceSum_date + "\n주별 매출: " + priceSum_week + "\n월별 매출: " + priceSum_month
			    		+ "\n\n[전체 고객 정보 데이터]: " + userData_Print
			    		+ "\n\n" + date.format(today)
			    		+ "\n" + time.format(today)
			    		+ "\n============================";
				
		        //String fileName = "C:\\Output.txt";	// 위에 Static으로 빼서 중복
				
		        try{// BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
		            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
		             
		            // 파일안에 문자열 쓰기
		            fw.write(txt);
		            fw.flush();
		 
		            // 객체 닫기
		            fw.close();
		             
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		        System.out.println("파일 생성이 완료되었습니다.");
		        
			}

	        
	        // =======================================================
	        // sql 연동부분 시작
			
			else if (num_menu.equals("4")) {
				System.out.println("4) OracleDB 테이블 생성");
				
				jdbc_createtable.JDBCTest_CreateTable();
			}
			
			else if (num_menu.equals("5")) {
				System.out.println("5) OracleDB 테이블 삭제");
				
				jdbc_droptable.JDBCTest_DropTable();
			}
			
			else if (num_menu.equals("6")) {
				System.out.println("6) OracleDB 테이블에 전체 고객 내용 저장");
				
				do {
					JDBC_InsertValue.JDBC_InsertValue();
					t++;
				} while(t<userCount);
				
				System.out.println("\n저장된 내역 출력");
				JDBC_SelectTable.JDBC_SelectTable();
			}
			
			else if (num_menu.equals("7")) {
				System.out.println("\n저장된 내역 출력");
				JDBC_SelectTable.JDBC_SelectTable();
			}
			
			 // =======================================================
	        // sql 연동부분 끝
			
			
			else if (num_menu.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if (num_menu.equals("ㅂ")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시 입력하여 주십시오.");
				System.out.println();
			}
			

		} // 전체 while문 종료
				
		
	} // main 종료

} // public class 종료 



// ---------------------------------------------------------- JDBC 시작

class JDBC_CreateTable {
	public static void JDBCTest_CreateTable() {
		// public static void main(String[] args) {

		try {
			// 1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!!");

			// 2. DB와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott", pwd = "tiger";
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결 성공");

			// 3. SQL문 작성
			String sql = "create table userList(";
			sql += "userName VARCHAR(15),";
			sql += "userGender VARCHAR(15),";
			sql += "userNumber NUMBER(15))";

			// 4. sql문을 실행시키기위한 Statement객체 얻어오기
			Statement stmt = con.createStatement();

			// 5. Statement의 execute(String sql)메소드를 이용해서 sql문 실행
			boolean b = stmt.execute(sql);
			System.out.println("b=" + b);

			System.out.println("USERLIST테이블 생성 성공");

			// 6. DB와 연결된 자원들 반납
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL오류: USERLIST테이블이 이미 생성되어 있는지 확인하세요");
			e.printStackTrace();
		}
	}
}

class JDBC_DropTable {
	public static void JDBCTest_DropTable() {
		// public static void main(String[] args) {

		try {
			// 1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!!");

			// 2. DB와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott", pwd = "tiger";
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결 성공");

			// 3. SQL문 작성
			String sql = "drop table userlist";

			// 4. sql문을 실행시키기위한 Statement객체 얻어오기
			Statement stmt = con.createStatement();

			// 5. Statement의 execute(String sql)메소드를 이용해서 sql문 실행
			boolean b = stmt.execute(sql);
			System.out.println("b=" + b);

			System.out.println("테이블 삭제 성공");

			// 6. DB와 연결된 자원들 반납
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL오류: USERLIST테이블이 이미 삭제되어 있는지 확인하세요");
			e.printStackTrace();
		}
	}
}

class JDBC_InsertValue extends miniProject_CVSmanagement_program {
	public static void JDBC_InsertValue() {
		
		String userNameList_db = userNameList[t];
		String userGenderList_db = userGenderList[t];
		int userNumberList_db = userNumberList[t];

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!!");

			// 2. DB연결 ==&gt; Connction 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott", pwd = "tiger"; // 각자 DB 비밀번호 입력

			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결 성공!!");

			// 3. SQL문 작성
			
			String sql = "INSERT INTO USERLIST";
			//sql += " VALUES ('이길동', '안녕하세요 친구들', '516')";		// 특정값 넣기
			//sql += " VALUES (" + userNameList + ", " + userGenderList + ", " + userNumberList + ")";	// ' ' 없으면 에러
			sql += " VALUES ('" + userNameList_db + "', '" + userGenderList_db + "', '" + userNumberList_db + "')";
			

			// 4. sql문을 실행시키기위한 Statement객체 얻어오기
			Statement stmt = con.createStatement();

			// 5. Statement의 execute(String sql)메소드를 이용해서 sql문 실행
			stmt.execute(sql);
			System.out.println("데이터 insert 성공!!");
			

			// 6. DB연결 자원 반납
			if (stmt != null)
				stmt.close();

			if (con != null)
				con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


class JDBC_SelectTable {
	public static void JDBC_SelectTable() {

    	
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:testdb";
        //String query = "select id, passwd, name from member";  // id , passwd, name 검색
        String query = "select username, usergender, usernumber from userlist";
        
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;   // 리턴받아 사용할 객체 생성
        
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, "scott", "tiger");
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery(); // 리턴받아온 쿼리 내용을 객체생성
            
            while(rs.next()){
                System.out.println("username :" + rs.getString("username"));  // 각각 해당하는 필드의 값을 가져옴
                System.out.println("usergender :" + rs.getString("usergender"));
                System.out.println("usernumber :" + rs.getString("usernumber"));
                System.out.println("---------------");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try {
                rs.close(); 
                pstmt.close(); 
                con.close();   // 객체 생성한 반대 순으로 사용한 객체는 닫아준다.
            } catch (Exception e2) {}
        }
    }
}
