import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public static void main(String[] args) {
		//�ý����� ���� ��¥�� �ð������� ��� ���� getinstance()�޼��� ���.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		//cal�� ���� �� �ִ� �������
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	//�������� 0~11���� +1�� �ؾ���.
		int date = cal.get(Calendar.DATE);
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);	//������ �ǹ��ϸ� 1~7�� ���� �־����� ��~��� �����.

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		//�̿뿹��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�: ");
		String name = sc.next();
		
		System.out.println("name: "+name+"�� "+ year+"."+month+"."+date+" �� �ԷµǾ����ϴ�.");
	}

}
