class Good_6_15 {
}

class Better_6_15 extends Good_6_15 {
}

final class Best_6_15 extends Better_6_15 {
}
// class NumberOne extends Best6_15 {}	-> Best Ŭ������ final�� �����Ǿ� �־� �� �̻� �ڽ� Ŭ������ Ȯ���� �� ����. 

class Chess_6_15 {
	enum ChessPlayer {
		WHITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess_6_15 extends Chess_6_15 {
	// ChessPlayer getFirstPlayer() {} //-> getFirstPlayer()�� final�޼����̱� ������ �������̵��ϸ�
	// ������ �߻�
}

public class j6_15_FinalClassMethodDemo {

	public static void main(String[] args) {
		// new NumberOne();
		new Best_6_15();

		WorldChess_6_15 w = new WorldChess_6_15();
		w.getFirstPlayer();
	}

}
