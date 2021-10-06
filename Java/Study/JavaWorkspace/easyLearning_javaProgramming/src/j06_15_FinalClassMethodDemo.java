class Good_6_15 {
}

class Better_6_15 extends Good_6_15 {
}

final class Best_6_15 extends Better_6_15 {
}
// class NumberOne extends Best6_15 {}	-> Best 클래스는 final로 지정되어 있어 다 이상 자식 클래스로 확장할 수 없다. 

class Chess_6_15 {
	enum ChessPlayer {
		WHITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess_6_15 extends Chess_6_15 {
	// ChessPlayer getFirstPlayer() {} //-> getFirstPlayer()는 final메서드이기 떄문에 오버라이딩하면
	// 오류가 발생
}

public class j6_15_FinalClassMethodDemo {

	public static void main(String[] args) {
		// new NumberOne();
		new Best_6_15();

		WorldChess_6_15 w = new WorldChess_6_15();
		w.getFirstPlayer();
	}

}
