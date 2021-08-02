package com.bitacademy.javaHomework1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class CVSmanagementProgram {
	
	static Scanner sc = new Scanner(System.in);		// static���� ����� �ٸ� class���� sc�� ��� ����.
	
	
	static int MAX = 300;
	static int count = 0;
	static int userCount = 0;	// �Qǰ���, ������ count�� ���� ����
	
	static int index = 0;
	
	static int[] p_numList = new int[MAX];		// static ������ main �ȿ� ���� ���� �߻�.
	static String[] p_nameList = new String[MAX];
	static String[] p_categoryList = new String[MAX];
	static int[] p_priceList = new int[MAX];
	
	static int[] p_sell_dateList = new int[MAX];
	static int[] p_sell_weekList = new int[MAX];
	static int[] p_sell_monthList = new int[MAX];
	static int[] p_sell_yearList = new int[MAX];
	
	static int tmp = 0;	// �Ǹ� �ݾ� �հ��
	
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
	
	public static void main(String[] args) {	// main ����
		
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
			System.out.println("�޴� ��ȣ ����");
			System.out.println("1) ���� ���� �޴�");
			System.out.println("2) �� ���� �޴�");
			System.out.println("3) ����, �� ���� ������ ���Ϸ� ����");
			System.out.println("(���������� Ȯ���� ��, ��, �Ϻ� ����� ��ü �� ���� �����͸� " + fileName + "(��)�� ����)");
			System.out.println("q) ����");
			String num_menu = sc.next();
			System.out.println();
			
			if (num_menu.equals("1")) {
				while(true) {
					System.out.println("\n���� ���� �޴�");
					System.out.println("1) �԰� ���");
					System.out.println("2) �Ǹ� ���(��ǰ ���� �������� �Ǹų�¥ �߰�)");
					System.out.println("3) ��� Ȯ��");
					System.out.println("4) ���� ���� ���: ��, ��, �� ����");
					System.out.println("5) ��ü ��� Ȯ��");
					System.out.println("q) ���� �޴��� ������");
					String num_menu1 = sc.next();
					if (num_menu1.equals("1")) {
						pReceiving.P_receiving();
					}
					else if (num_menu1.equals("2")) {
						System.out.println("�����Ϸ��� ��ǰ index �Է�(0 ~ " + count + "): ");
						index = sc.nextInt();
						pUpdate.P_update(index);
					}
					else if (num_menu1.equals("3")) {
						System.out.println("����Ϸ��� ��ǰ index �Է�(0 ~ " + count + "): ");
						index = sc.nextInt();
						pData.P_data(index);
						
						System.out.println("��ü ��ǰ ��: " + count);
					}
					else if (num_menu1.equals("4")) {
						System.out.println("���ϴ� ���� ���� �Է�('����' �Ǵ�, '�ֺ�' �Ǵ�, '�Ϻ�'�� ���ϴ� �޴��� ���ڷ� �Է�)");
						num_menu1 = sc.next();
						if(num_menu1.equals("����")) {
							pPriceSum_month.P_priceSum();
						}
						else if(num_menu1.equals("�ֺ�")) {
							pPriceSum_week.P_priceSum();
						}
						else if(num_menu1.equals("�Ϻ�")) {
							pPriceSum_month.P_priceSum();
						}
						else {
							System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�.");
							System.out.println();
						}
					}
					else if (num_menu1.equals("5")) {
						for (int i = 0; i < count; i++) {
							System.out.println("\n��ǰ index: " + i);
							System.out.println("��ǰ ��ȣ: " + p_numList[i]);
							System.out.println("��ǰ �̸�: " + p_nameList[i]);
							System.out.println("��ǰ �з� " + p_categoryList[i]);
							System.out.println("��ǰ ����: " + p_priceList[i]);
							System.out.println("�Ǹ� ��¥: " + p_sell_yearList[i] + "�� "
									 + p_sell_monthList[i] + "�� "
									+ p_sell_weekList[i] + "�� "
									+ p_sell_dateList[i] + "��");
						}

					}
					
					else if (num_menu1.equals("q")) {
						System.out.println("���� �޴��� ���ư��ϴ�.");
						break;
					}
					else if (num_menu1.equals("��")) {
						System.out.println("���� �޴��� ���ư��ϴ�.");
						break;
					}
					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�.");
						System.out.println();
					}
					
				} // while�� 1��(��ǰ ����) ����.
			}
			
			else if (num_menu.equals("2")) {
				System.out.println("�� ���� �޴�");
				while(true) {
					System.out.println();
					System.out.println("\n�޴� ��ȣ ����");
					System.out.println("1) �� ���� �Է�");
					System.out.println("2) �� ���� ����");
					System.out.println("3) �� ���� ����");
					System.out.println("4) Ư�� �� ���� ���");
					System.out.println("5) ��ü �� ���� ���");
					System.out.println("q) ���� �޴��� ������");
					String num_menu2 = sc.next();
					System.out.println();
					
					if (num_menu2.equals("1")) {
						addUser.AddUser();
					}
					else if (num_menu2.equals("2")) {
						System.out.println("�����Ϸ��� �� key �Է�(0 ~ " + userCount + "): ");
						index = sc.nextInt();
						userUpdate.UserUpdate(index);
					}
					else if (num_menu2.equals("3")) {
						index = sc.nextInt();
						userDelete.UserDelete(index);
					}
					else if (num_menu2.equals("4")) {
						System.out.println("����Ϸ��� �� key �Է�(0 ~ \" + userCount + \"): ");
						index = sc.nextInt();
						userData.UserData(index);
						System.out.println("��ü �� ��: " + userCount);
					}
					else if (num_menu2.equals("5")) {
						for (int i = 0; i < userCount; i++) {
							System.out.println("\n�� key: " + i);
							System.out.println("�� ����: " + userGenderList[i]);
							System.out.println("�� �̸�: " + userNameList[i]);
							System.out.println("�� ��ȣ: " + userNumberList[i]);
						}
					}
					
					else if (num_menu2.equals("q")) {
						break;
					}
					else if (num_menu2.equals("��")) {
						break;
					}
					else {
						System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�.");
					}
				} // while�� 2��(�� ����) ����
			}
			
			else if (num_menu.equals("3")) {
				
				for(int i=0; i<userCount; i++) {
					userData_Print += "\n\n�� �̸�: " + CVSmanagementProgram.userNameList[i]
							+ "\n�� ����: " + CVSmanagementProgram.userGenderList[i]
									+ "\n�� ��ȣ: " + CVSmanagementProgram.userNumberList[i];
				}
				
				String txt = "\n(���������� Ȯ����(=�����))\n�Ϻ� ����: " + priceSum_date + "\n�ֺ� ����: " + priceSum_week + "\n���� ����: " + priceSum_month
			    		+ "\n\n[��ü �� ���� ������]: " + userData_Print;
				
		        //String fileName = "C:\\Output.txt";	// ���� Static���� ���� �ߺ�
				
		        try{// BufferedWriter �� FileWriter�� �����Ͽ� ��� (�ӵ� ���)
		            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
		             
		            // ���Ͼȿ� ���ڿ� ����
		            fw.write(txt);
		            fw.flush();
		 
		            // ��ü �ݱ�
		            fw.close();
		             
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		        System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			}
			
			else if (num_menu.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if (num_menu.equals("��")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�.");
				System.out.println();
			}

		} // ��ü while�� ����
		
		
		
	} // main ����

} // public class ���� 

