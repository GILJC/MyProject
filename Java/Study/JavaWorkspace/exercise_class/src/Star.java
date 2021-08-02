interface Repairable {}

class GroundUnit extends Unit {
	GroundUnit (int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);		// Tank의 HP는 150dlek.
		hitPoint = MAX_HP;
	}
	
	public String toString (String tank) {
		return "Tank";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;	// Unit의 HP를 증가시킨다.
			}
		}
	}
}

public class Star {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);	// SCV가 Tank를 수리한다.
	//	scv.repair(marine);	// 에러!
	}
}
