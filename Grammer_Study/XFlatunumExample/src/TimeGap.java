import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeGap {

	public static void main(String[] args) {
		Calendar baseCal = new GregorianCalendar(2018,Calendar.JANUARY,11);
		Calendar targetCal = new GregorianCalendar(2018,Calendar.MAY,24);
		
		//getTimeInMillis(): �ʸ� 1000���� 1������ ������� �� ���ڰ�
		long diffSec = (targetCal.getTimeInMillis() - baseCal.getTimeInMillis())/1000;
		long diffDays = diffSec/(24*60*60);
		System.out.println(diffDays);
	}

}
