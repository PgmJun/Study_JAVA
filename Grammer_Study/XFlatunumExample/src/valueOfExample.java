
public class valueOfExample {
	public static void main(String[] args) {
		//valueOf는 입력받은 값을 지정된 자료형으로 변경하여 리턴한다.
		
		int a = 10;
		
		//int형이었던 a를 String형으로 변환하여 문자열 변수 b에 저장
		String b = String.valueOf(a);
		System.out.println(b);
		
		//int형이었던 a를 float형으로 변환하여 문자열 변수 b에 저장
		float c = Float.valueOf(a);
		System.out.println(c);
		
		
		float test = 10;
		
	}
}
