
public class replaceExample {

	public static void main(String[] args) {
		String str1 = "aaaa";
		String str2 = "�ڹ� �ڵ�";
		
		//replace("a","b"): "a"�� "b"�� ġȯ
		System.out.println("result ==>"+str1.replace("aa", "b"));

		System.out.println("result ==>"+str2.replace("�� ��", "good"));
		
		
		//replaceAll: replace�� ��������� ����ǥ����[] ��밡��
		//����ǥ����:"[adsafaw]"�̶�� a,d,s,a,f,a,w ������ �ǹ�
		//if [^adsafaw] ��� �Է��Ѵٸ� a,d,s,a,f,a,w�� �� �������� �ǹ�
		String str3 = "abcdefghijk";
		System.out.println(str3.replaceAll("[abcijk]", "��"));
		System.out.println(str3.replaceAll("[^abcijk]", "��"));
		
		
	}

}
