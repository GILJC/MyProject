package sec06;

public class Computer implements Controllable {
	
	@Override
	public void turnOn() {
		System.out.println("Computer�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer�� ����.");
	}
}

