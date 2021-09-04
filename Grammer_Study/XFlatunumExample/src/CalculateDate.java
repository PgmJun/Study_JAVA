import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalculateDate {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("오늘날짜: "+sdf.format(cal.getTime()));
		
		//오늘부터 한달 후는 얼마일까?
		cal.add(Calendar.MONTH, 1);
		System.out.println("오늘로 부터 한달 후: "+sdf.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, -1);
		//응용예시: 연인과 100일 날짜 찾기
		System.out.println("사귄 날짜: "+sdf.format(cal.getTime()));
		cal.add(Calendar.DATE, 100);
		System.out.println("사귄지 100일: "+sdf.format(cal.getTime()));
		
	}

}
