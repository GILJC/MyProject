class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}	// 持失切
	Car(String c, String g, int d) {	// 持失切
		color = c;
		gearType = g;
		door = d;
	}
}

public class Car_newCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
	}

}
