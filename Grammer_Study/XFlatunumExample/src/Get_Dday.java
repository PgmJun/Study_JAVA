import java.util.Calendar;

public class Get_Dday {

	public static int GetDday(int _year, int _month, int _date) {
		Calendar today = Calendar.getInstance();
		Calendar Dday = Calendar.getInstance();
		
		Dday.set(_year, _month, _date);
		
		long date_today = today.getTimeInMillis() / (1000*24*60*60);
		long date_Dday = Dday.getTimeInMillis() / (1000*24*60*60);
		
		long Gap_Date = date_Dday - date_today;
		
		return (int)Gap_Date;
	}
	
	public static void main(String[] args) {
		System.out.println("9월 7일까지 D-day: "+ GetDday(2021, Calendar.SEPTEMBER, 7));
		

	}

}
