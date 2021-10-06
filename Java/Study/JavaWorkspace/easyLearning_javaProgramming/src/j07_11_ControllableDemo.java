import sec06.Computer;
import sec06.Controllable;
import sec06.TV;


public class j7_11_ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controllable[] controllable = {new TV(), new Computer() };
		
		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}

}
