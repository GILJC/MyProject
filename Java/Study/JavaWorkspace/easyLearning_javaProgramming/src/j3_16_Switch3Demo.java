
public class j3_16_Switch3Demo {
	static void main(String[] args) {
		WhoIsIt("ȣ����");
		WhoIsIt("����");
		WhoIsIt("����");
		WhoIsIt("������");
	}

	static void WhoIsIt(String bio) {
		String kind = "...";
		switch (bio) {
		case "ȣ����", "����" -> kind = "������";
		case "������", "����" -> kind = "����";
		case "����", "����" -> kind = "���";
		default -> System.out.print("������! ");
		}
		System.out.printf("%s��%s�̴�.\n", bio, kind);
	}
}
