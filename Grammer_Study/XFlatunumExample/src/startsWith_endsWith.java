
public class startsWith_endsWith {

	public static void main(String[] args) {
		//boolean startsWith(String prefix): �� ��� ���ڿ��� �Է´� ���ڿ��� ���۵Ǵ��� Ȯ���� boolean������ ����
		String str1 = "�ڹ� �ڵ�";
		System.out.println(str1.startsWith("�ڹ�"));
		
		//�ڹ��ڵ� ���̿� ������ ������ ������ falseó��
		String str2 = "�ڹ��ڵ�";
		System.out.println(str2.startsWith("�ڹ� "));
		
		//boolean endsWith(String suffix): �� ����� �Էµ� ���ڿ��� �������� Ȯ���� boolean�� ����
		System.out.println(str1.endsWith("�ڹ�"));
		System.out.println(str1.endsWith("�ڵ�"));
	}

}
