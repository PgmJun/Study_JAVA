public class Casting{
	public static void main(String[] args) {
		//Casting ������Ÿ�� ��ȯ
		int i = (int) 1.1;	//�Ǽ����� ���������� Casting
		System.out.println(i);
		double a = (double)i;	//�������� �Ǽ������� Casting
		
		System.out.println(a);	//�������� ���
		
		//1 to String
		String str = Integer.toString(i);	//1->"1"
		System.out.println(str.getClass());
		
		
	}
}