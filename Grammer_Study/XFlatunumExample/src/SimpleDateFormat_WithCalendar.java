import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormat_WithCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		//SimpleDataFormat�� �̿��� calendar�� �ð��� �޾ƿ� �����ص� ������ �ð����� ���
		System.out.println(sdf.format(cal.getTime()));

	}

}
