package homework1_CVS_managementProgram;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// ��ǰ ���� �Է�
class P_receiving extends miniProject_CVSmanagement_program {
	public void P_receiving() {
		System.out.println("��ǰ ��ȣ(���ڸ� �Է�): ");
		int p_num = sc.nextInt();
		
		System.out.println("��ǰ �̸�: (������� �Է�)");
		String p_name = sc.next();
		
		System.out.println("��ǰ �з�: (������� �Է�)");
		String p_category = sc.next();	// nextLine()���� ���� : ���� ��� �Ұ�. -> ���� �������� �ܾ ���
		
		System.out.println("��ǰ ����: ");
		int p_price = sc.nextInt();
		
		System.out.println("�Ǹ� ��¥: (��, ��, ��, �� �������� ���� Enter�� �Է�), ���ǸŽ� 0���� �Է�");
		System.out.print("�⵵: ");
		int p_sell_year = sc.nextInt();
		System.out.print("��: ");
		int p_sell_month = sc.nextInt();
		System.out.print("��: ");
		int p_sell_week = sc.nextInt();
		System.out.println("��: ");
		int p_sell_date = sc.nextInt();


		
		count += 1;
		
		p_numList[count] = p_num;
		p_nameList[count] = p_name;
		p_categoryList[count] = p_category;
		p_priceList[count] = p_price;
		
		p_sell_dateList[count] = p_sell_date;
		p_sell_weekList[count] = p_sell_week;
		p_sell_monthList[count] = p_sell_month;
		p_sell_yearList[count] = p_sell_year;
	}
	
}

// ��ǰ ���� ���
class P_data extends miniProject_CVSmanagement_program {
	public void P_data(int index) {
		System.out.println("��ǰ index: " + index);
		System.out.println("��ǰ ��ȣ: " + p_numList[index]);
		System.out.println("��ǰ �̸�: " + p_nameList[index]);
		System.out.println("��ǰ �з�: " + p_categoryList[index]);
		System.out.println("��ǰ ����: " + p_priceList[index]);
		System.out.println();
		System.out.println("�Ǹ� ��¥: "
				+ p_sell_yearList[index] + "�� "
				+ p_sell_dateList[index] + "�� "
				+ p_sell_weekList[index] + "�� "
				+ p_sell_monthList[index] +"��");
	}
}

// �Ϻ� ���� ����
class P_priceSum_date extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("ã�� �⵵: ");
		int year = sc.nextInt();
		System.out.println("ã�� ��: ");
		int month = sc.nextInt();
		System.out.println("ã�� ��: ");
		int week = sc.nextInt();
		System.out.println("ã�� ��: ");
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
		System.out.println("�Ϻ� ���� ����: " + tmp);
		priceSum_date = tmp;
	}
}
// �ֺ� ���� ����
class P_priceSum_week extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("ã�� �⵵: ");
		int year = sc.nextInt();
		System.out.println("ã�� ��: ");
		int month = sc.nextInt();
		System.out.println("ã�� ��: ");
		int week = sc.nextInt();
		
		for (int i = 0; i < count; i++) 
			if (year == p_sell_yearList[i]) 
				if (month == p_sell_monthList[i]) 
					if (week == p_sell_weekList[i])  
							tmp += p_priceList[i];

		System.out.println("�ֺ� ���� ����: " + tmp);
		priceSum_week = tmp;
	}
}
// ���� ���� ����
class P_priceSum_month extends miniProject_CVSmanagement_program {
	public void P_priceSum() {
		System.out.println("ã�� �⵵: ");
		int year = sc.nextInt();
		System.out.println("ã�� ��: ");
		int month = sc.nextInt();
		
		for (int i = 0; i < count; i++) 
			if (year == p_sell_yearList[i]) 
				if (month == p_sell_monthList[i]) 
							tmp += p_priceList[i];

		System.out.println("���� ���� ����: " + tmp);
		priceSum_month = tmp;
	}
}

// ��ǰ ����
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

// ��ǰ ���� ���� = ��ǰ �Ǹ�(�Ǹ� ��¥ �Է�)
class P_update extends miniProject_CVSmanagement_program {
	public void P_update(int index) {
		System.out.println();
		System.out.println("��ǰ ��ȣ: " + p_numList[index]);
		//.p_numList[index] = .sc.nextInt();
		System.out.println("��ǰ �̸�: " + p_nameList[index]);
		//.p_nameList[index] = .sc.nextLine();
		System.out.println("��ǰ �з�: " + p_categoryList[index]);
		//.p_categoryList[index] = .sc.nextLine();
		System.out.println("��ǰ ����: " + p_priceList[index]);
		//.p_priceList[index] = .sc.nextInt();
		System.out.println();
		System.out.println("�Ǹ� ��¥: (�Ǹŵ� ��¥�� ���� �����Ͻÿ�.)"
				+ p_sell_yearList[index] + "�� "
				+ p_sell_dateList[index] + "�� "
				+ p_sell_weekList[index] + "�� "
				+ p_sell_monthList[index] +"��");
		System.out.println("�Ǹ� ��¥ ����: (��, ��, ��, �� �������� ���� Enter�� �Է�), ���ǸŽ� 0���� �Է�");
		System.out.print("�⵵: ");
		p_sell_yearList[index] = sc.nextInt();
		System.out.print("��: ");
		p_sell_monthList[index] = sc.nextInt();
		System.out.print("��: ");
		p_sell_weekList[index] = sc.nextInt();
		System.out.println("��: ");
		p_sell_dateList[index] = sc.nextInt();
		
	}
	
}

// * ���⼭���� �� ���� ����

// �� �߰�
class AddUser extends miniProject_CVSmanagement_program {
	public void AddUser() {
		System.out.println("�� key: " + userCount);
		System.out.println("�� �̸�: ");
		String userName = sc.next();
		
		System.out.println("�� ����: ");
		String userGender = sc.next();
		
		System.out.println("�� ��ȣ");
		int userNumber = sc.nextInt();
		
		userNameList[userCount] = userName;
		userGenderList[userCount] = userGender;
		userNumberList[userCount] = userNumber;
		
		userCount++;
	}
}

//Ư�� �� ���� ���
class UserData extends miniProject_CVSmanagement_program {
	public void UserData(int index) {
		System.out.println("�� key: " + index);
		System.out.println("�� �̸�: " + userNameList[index]);
		System.out.println("�� ����: " + userGenderList[index]);
		System.out.println("�� ��ȣ: " + userNumberList[index]);
	}
}

// �� ���� ����
class UserUpdate extends miniProject_CVSmanagement_program {
	public void UserUpdate(int index) {
		System.out.println("�� �̸�: " + userNameList[index]);
		userNameList[index] = sc.next();
		System.out.println("�� ����: " + userGenderList[index]);
		userGenderList[index] = sc.next();
		System.out.println("�� ��ȣ: " + userNumberList[index]);
		userNumberList[index] = sc.nextInt();
	}
}

// �� ���� ����
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
					userData_Print += "\n\n�� �̸�: " + userNameList[i]
							+ "\n�� ����: " + userGenderList[i]
									+ "\n�� ��ȣ: " + userNumberList[i];
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

