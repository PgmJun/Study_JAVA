
public class Equals {
	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		
		if(a == b) 
			System.out.println("a == b");
		else
			System.out.println("a != b");
	
	
		if(a.equals(b))
			System.out.println("a equals to b");
		else
			System.out.println("a not equals to b");
		
		//���۷��� Ÿ���� ����(������ ���� �ƴ� ������ �ּҰ��� �����ϴ� ����)�� �񱳰� �Ұ���
		//���� ���ڿ��̳� ������ �ƴ� �ּҰ��̱� ����
		String c = new String("test");
		String d = new String("test");
		
		if(c == d) 
			System.out.println("c == d");
		else
			System.out.println("c != d");	//c != d �� ���
		//----------------------------------------------------------
		
		//primitive type �Ӹ� �ƴ϶� Class���µ� �񱳰����ϴ�
		Integer x = 7;
		Integer y = 20;
		Integer z = 7;
		Short srt = 7;
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(srt));
		
	}
}
