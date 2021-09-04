import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeGap {

	public static void main(String[] args) {
		Calendar baseCal = new GregorianCalendar(2018,Calendar.JANUARY,11);
		Calendar targetCal = new GregorianCalendar(2018,Calendar.MAY,24);
		
		//getTimeInMillis(): 초를 1000분의 1단위로 만들었을 때 분자값
		long diffSec = (targetCal.getTimeInMillis() - baseCal.getTimeInMillis())/1000;
		long diffDays = diffSec/(24*60*60);
		System.out.println(diffDays);
	}

}
