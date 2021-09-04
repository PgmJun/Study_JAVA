import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public static void main(String[] args) {
		//시스템의 현재 날짜와 시간정보를 얻기 위해 getinstance()메서드 사용.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		//cal로 얻을 수 있는 상수값들
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	//월단위는 0~11월로 +1을 해야함.
		int date = cal.get(Calendar.DATE);
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);	//요일을 의미하며 1~7로 값이 주어지며 일~토로 계산함.

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		//이용예시
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오: ");
		String name = sc.next();
		
		System.out.println("name: "+name+"이 "+ year+"."+month+"."+date+" 에 입력되었습니다.");
	}

}
