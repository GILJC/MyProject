package sec06;

public class TV implements Controllable {

	@Override
	public void turnOn() { // Controllable �������̽��� ���ǵ� ��� �߻� �޼��带 �����ؾ� �Ѵ�.
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() { // �ݵ�� public�̾�� �Ѵ�.
		System.out.println("TV�� ����."); // �ڽ��� �θ𺸴� ���� ������ ������ �� �Ǳ� ������.
	} // �θ��� interface�� method�� ��� public�̴�.
} // ���⼱ interface�� public�� �Ƚ����Ƿ� ���� �ٸ� �� ����.


