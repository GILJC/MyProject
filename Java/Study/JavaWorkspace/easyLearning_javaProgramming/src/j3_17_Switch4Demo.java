public class j3_17_Switch4Demo {
	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "호랑이", "사자" -> "포유류";
		case "독수리", "참새" -> "조류";
		case "고등어", "연어" -> "어류";
		default -> {
			System.out.print("어이쿠! "); // -> '어이쿠'를 화면에 출력만 한다면 반환 값이 문자열이 아니므로 오류가 발생한다.
			yield "..."; // -> 따라서 yield를 사용하여 문자열을 반환해야 한다.
		}
		}; // -> 하나의 실행문이므로 마지막에 세미콜론이 필요하다.
	}
}

/*
 * 
 * 14줄 부터는 기존 switch 문도 연산식, 다중 case 레이블, yield 예약어가 허용되므로 10~18행을 다음과 같이 나타낼 수도
 * 있다.
 * 
 * String kindString kind = switch (bio) { case "호랑이", "사자" -> "포유류"; yield
 * "포유류"; case "독수리", "참새" -> "조류"; yield "포유류"; case "고등어", "연어" -> "어류"; yield
 * "포유류"; default -> { System.out.print("어이쿠! "); yield "..."; }
 * 
 */