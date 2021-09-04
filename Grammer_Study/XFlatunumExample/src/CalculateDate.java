import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalculateDate {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("���ó�¥: "+sdf.format(cal.getTime()));
		
		//���ú��� �Ѵ� �Ĵ� ���ϱ�?
		cal.add(Calendar.MONTH, 1);
		System.out.println("���÷� ���� �Ѵ� ��: "+sdf.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, -1);
		//���뿹��: ���ΰ� 100�� ��¥ ã��
		System.out.println("��� ��¥: "+sdf.format(cal.getTime()));
		cal.add(Calendar.DATE, 100);
		System.out.println("����� 100��: "+sdf.format(cal.getTime()));
		
	}

}
