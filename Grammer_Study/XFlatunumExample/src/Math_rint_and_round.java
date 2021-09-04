
public class Math_rint_and_round {

	public static void main(String[] args) {
		//Math.rint(): 가장 가까운 수로 내리거나 올린 뒤 double형 반환(반올림과는 살짝 다름)
		//0.0~0.5까지는 내림 0.6~0.9까지는 올림
		
		double a = 101.1;
		double b = 101.6;
		double c = 101.5;
		
		System.out.println(Math.rint(a));
		System.out.println(Math.rint(b));
		System.out.println(Math.rint(c));
		
		
		
		
		//------------------------------
		//반올림은 round함수 사용
		//rint와는 다르게 round는 int형 반환
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		System.out.println(Math.round(c));
	}

}
