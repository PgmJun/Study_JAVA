
public class Math_rint_and_round {

	public static void main(String[] args) {
		//Math.rint(): ���� ����� ���� �����ų� �ø� �� double�� ��ȯ(�ݿø����� ��¦ �ٸ�)
		//0.0~0.5������ ���� 0.6~0.9������ �ø�
		
		double a = 101.1;
		double b = 101.6;
		double c = 101.5;
		
		System.out.println(Math.rint(a));
		System.out.println(Math.rint(b));
		System.out.println(Math.rint(c));
		
		
		
		
		//------------------------------
		//�ݿø��� round�Լ� ���
		//rint�ʹ� �ٸ��� round�� int�� ��ȯ
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		System.out.println(Math.round(c));
	}

}
