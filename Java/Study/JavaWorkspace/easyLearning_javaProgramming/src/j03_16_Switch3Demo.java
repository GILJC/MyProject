
public class j3_16_Switch3Demo {
	static void main(String[] args) {
		WhoIsIt("호랑이");
		WhoIsIt("참새");
		WhoIsIt("고등어");
		WhoIsIt("곰팡이");
	}

	static void WhoIsIt(String bio) {
		String kind = "...";
		switch (bio) {
		case "호랑이", "사자" -> kind = "포유류";
		case "독수리", "참새" -> kind = "조류";
		case "고등어", "연어" -> kind = "어류";
		default -> System.out.print("어이쿠! ");
		}
		System.out.printf("%s는%s이다.\n", bio, kind);
	}
}
