package sec06;

public class TV implements Controllable {

	@Override
	public void turnOn() { // Controllable 인터페이스에 정의된 모든 추상 메서드를 구현해야 한다.
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() { // 반드시 public이어야 한다.
		System.out.println("TV를 끈다."); // 자식은 부모보다 접근 번위가 좁으면 안 되기 때문에.
	} // 부모인 interface의 method는 모두 public이다.
} // 여기선 interface에 public을 안썼으므로 조금 다를 수 있음.


