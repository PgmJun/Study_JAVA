
public class Upper_Lower_trim {

	public static void main(String[] args) {
		//.toUpperCase(): �ҹ��� -> �빮��
		String str1 = "upper java";
		System.out.println(str1.toUpperCase());
		
		//.toLowerCase(): �빮�� -> �ҹ���
		String str2 = "LOWER JAVA";
		System.out.println(str2.toLowerCase());
		
		//.trim(): �յ� ���� ����(�߰� ������ �Ȼ����)
		String str3 = " trim java ";
		System.out.println("["+str3.trim()+"]");
		
	}

}
