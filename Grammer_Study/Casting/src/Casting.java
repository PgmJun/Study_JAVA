public class Casting{
	public static void main(String[] args) {
		//Casting 데이터타입 변환
		int i = (int) 1.1;	//실수형을 정수형으로 Casting
		System.out.println(i);
		double a = (double)i;	//정수형을 실수형으로 Casting
		
		System.out.println(a);	//문제없이 출력
		
		//1 to String
		String str = Integer.toString(i);	//1->"1"
		System.out.println(str.getClass());
		
		
	}
}