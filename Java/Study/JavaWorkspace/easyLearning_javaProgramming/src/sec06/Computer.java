package sec06;

public class Computer implements Controllable {
	
	@Override
	public void turnOn() {
		System.out.println("Computer¸¦ ÄÒ´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer¸¦ ²ö´Ù.");
	}
}

