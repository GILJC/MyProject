package com.bitacademy.javaHomework1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class CVSmanagementProgram {
	
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
	
	public static void main(String[] args) {	// main 시작
		
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
		
		
		
		while (1==1) {
			System.out.println();
			System.out.println("메뉴 번호 선택");
			System.out.println("1) 물건 관리 메뉴");
			System.out.println("2) 고객 관리 메뉴");
			System.out.println("3) 매출, 고객 정보 데이터 파일로 저장");
			System.out.println("(마지막으로 확인한 월, 주, 일별 매출과 전체 고객 정보 데이터를 " + fileName + "(으)로 저장)");
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
					userData_Print += "\n\n고객 이름: " + CVSmanagementProgram.userNameList[i]
							+ "\n고객 성별: " + CVSmanagementProgram.userGenderList[i]
									+ "\n고객 번호: " + CVSmanagementProgram.userNumberList[i];
				}
				
				String txt = "\n(마지막으로 확인한(=저장된))\n일별 매출: " + priceSum_date + "\n주별 매출: " + priceSum_week + "\n월별 매출: " + priceSum_month
			    		+ "\n\n[전체 고객 정보 데이터]: " + userData_Print;
				
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

