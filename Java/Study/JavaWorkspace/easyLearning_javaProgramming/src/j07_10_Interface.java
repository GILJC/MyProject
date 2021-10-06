
interface Coin_7_10 {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
} // int�� ǥ�õǾ� ������, public static final int �̴�.
	// �������̽��� ��� �ʵ�� public static final�̱� �����̴�.

///	///			///	///

//public interface Controllable_7_10 {		// -> ���� .java���� �ȿ��� �۾����̶� public interface ���� ������. �׷��� �׳� ���⼭�� interface�� ����� ��.
// �ڹ����� �Ѱ��� public Ŭ������ �ϳ��� ������ �ְ� �� Ŭ������ ���ϸ��̶� �Ȱ��� Ŭ���� ���ߵȴ�.  -> ���� : ������ ����
interface Controllable_7_10 {
	default void repair() {
		show("��� �����Ѵ�.");
	}

	static void reset() { // ���� �޼����̴�.
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}

	private void show(String s) { // �ڹ� 9���� �����ϸ�, �ַ� ����� �޼���� ���ȴ�.
		System.out.println(s);
	}

	void turnOn();
	void turnOff(); // �߻� �޼����̴�.
}

// public interface RemoteControllable_7_10 extends Controllable_7_10 {		// ��������. �ϳ��� .java���� ���̶� public interface �������.
interface RemoteControllable_7_10 extends Controllable_7_10 { // �������̽��� ��ӹ��� ���� extends Ű���带 ����Ѵ�.
	void remoteOn();

	void remoteOff(); // RemoteControllable �������̽��� ���� �߰��� �޼����̴�.
}

// public class TV implements Controllable {
class TV implements Controllable_7_10 {

	@Override
	public void turnOn() { // Controllable �������̽��� ���ǵ� ��� �߻� �޼��带 �����ؾ� �Ѵ�.
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() { // �ݵ�� public�̾�� �Ѵ�.
		System.out.println("TV�� ����."); // �ڽ��� �θ𺸴� ���� ������ ������ �� �Ǳ� ������.
	} // �θ��� interface�� method�� ��� public�̴�.
} // ���⼱ interface�� public�� �Ƚ����Ƿ� ���� �ٸ� �� ����.

public class j7_10_Interface {
	public static void main(String[] args) {
		System.out.println("Dime�� " + Coin_7_10.DIME + "��Ʈ�Դϴ�.");

		///

		TV tv = new TV();
		Computer_7_10 com = new Computer_7_10();

		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff(); // Controllable �������̽��� TV ��ü��
		com.repair(); // Computer ��ü�� �����ϴ� ����� ����.

		Controllable_7_10.reset();
		// tv.reset();
		// com.reset(); // ���� �޼���� �������̽��� ���� ȣ���ؾ� �Ѵ�.

		Notebook_7_10 n = new Notebook_7_10(); // �ڽ��� �����ڸ� ȣ���ص� ������.
												// ��, ������ ���ο��� ȣ���� ���� this()�� ����ؾ� �Ѵ�.
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}

class Computer_7_10 implements Controllable_7_10 {

	@Override
	public void turnOn() {
		System.out.println("Computer�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer�� ����.");
	}
}

interface Portable_7_10 {
	void inMyBag();
}

class Notebook_7_10 extends Computer_7_10 implements Portable_7_10 {
	public void inMyBag() {
		System.out.println("��Ʈ���� ���濡 �ִ�."); // Portable_7_10 �������̽��� �޼��带 �����Ѵ�.
	}

	public void turnOn() {
		System.out.println("��Ʈ���� �Ҵ�");
	}

	public void turnOff() {
		System.out.println("��Ʈ���� ����."); // Computer Ŭ������ �޼��带 �������̵� �Ѵ�.
	}
}
