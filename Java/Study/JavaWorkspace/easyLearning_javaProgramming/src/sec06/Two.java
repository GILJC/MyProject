package sec06;

public class Two {
	void print() {
		One o = new One();
		// System.out.println(o.secret);	// ���� ��Ű���� �ִ��� �ٸ� ��ü�� private ����� ������ �� ����.
		System.out.println(o.roommate);
		System.out.println(o.child);		// ���� ��Ű���� �ִٸ� �ٸ� ��ü�� private���� ����� ������ �� �ִ�.
		System.out.println(o.anybody);		// �׷��� �ڽ��� ����� �ƴϱ� ������ ��ü�� �����ؾ� �Ѵ�.
	}
}
