
public class findKeywordExample {

	public static void main(String[] args) {
		String str = "Very fucking Coding!";
		
		//charAt(int): ���ڿ����� int��° ���� ���
		System.out.println(str.charAt(0));
		
		//indexOf(String keyword): ���ڿ����� �Է¹��� ���ڿ��� ã�� ���ڿ��� ���۵Ǵ� ��ġ�� ���� (��ġ���� 0���� ����
		System.out.println(str.indexOf("fuck"));
		
		//lastIndexOf(String keyword): indexOf�� ���� ��������� �� ���ʺ��� Ž������
		System.out.println(str.lastIndexOf("C"));

		//length(): ���ڿ��� ���� ���
		System.out.println(str.length());
	}

}
