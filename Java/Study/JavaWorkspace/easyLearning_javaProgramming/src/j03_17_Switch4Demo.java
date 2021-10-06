public class j3_17_Switch4Demo {
	public static void main(String[] args) {
		whoIsIt("ȣ����");
		whoIsIt("����");
		whoIsIt("����");
		whoIsIt("������");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "ȣ����", "����" -> "������";
		case "������", "����" -> "����";
		case "����", "����" -> "���";
		default -> {
			System.out.print("������! "); // -> '������'�� ȭ�鿡 ��¸� �Ѵٸ� ��ȯ ���� ���ڿ��� �ƴϹǷ� ������ �߻��Ѵ�.
			yield "..."; // -> ���� yield�� ����Ͽ� ���ڿ��� ��ȯ�ؾ� �Ѵ�.
		}
		}; // -> �ϳ��� ���๮�̹Ƿ� �������� �����ݷ��� �ʿ��ϴ�.
	}
}

/*
 * 
 * 14�� ���ʹ� ���� switch ���� �����, ���� case ���̺�, yield ���� ���ǹǷ� 10~18���� ������ ���� ��Ÿ�� ����
 * �ִ�.
 * 
 * String kindString kind = switch (bio) { case "ȣ����", "����" -> "������"; yield
 * "������"; case "������", "����" -> "����"; yield "������"; case "����", "����" -> "���"; yield
 * "������"; default -> { System.out.print("������! "); yield "..."; }
 * 
 */