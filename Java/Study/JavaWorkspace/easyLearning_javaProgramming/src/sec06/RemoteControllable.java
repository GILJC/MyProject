package sec06;

public class RemoteControllable {
	public static void main(String[] agrs) {
		TV tv = new TV();
		Computer com = new Computer();

		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff(); // Controllable �������̽��� TV ��ü��
		com.repair(); // Computer ��ü�� �����ϴ� ����� ����.

		Controllable.reset();
		// tv.reset();
		// com.reset(); // ���� �޼���� �������̽��� ���� ȣ���ؾ� �Ѵ�.

		
	}

}
