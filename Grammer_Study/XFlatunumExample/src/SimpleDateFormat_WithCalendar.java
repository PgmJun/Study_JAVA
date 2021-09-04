import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormat_WithCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		//SimpleDataFormat을 이용해 calendar의 시간을 받아와 저장해둔 형식의 시간으로 출력
		System.out.println(sdf.format(cal.getTime()));

	}

}
