
public class Equals {
	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		
		if(a == b) 
			System.out.println("a == b");
		else
			System.out.println("a != b");
	
	
		if(a.equals(b))
			System.out.println("a equals to b");
		else
			System.out.println("a not equals to b");
		
		//레퍼런스 타입의 변수(변수의 값이 아닌 변수의 주소값을 저장하는 변수)는 비교가 불가능
		//값이 문자열이나 정수가 아닌 주소값이기 때문
		String c = new String("test");
		String d = new String("test");
		
		if(c == d) 
			System.out.println("c == d");
		else
			System.out.println("c != d");	//c != d 가 출력
		//----------------------------------------------------------
		
		//primitive type 뿐만 아니라 Class형태도 비교가능하다
		Integer x = 7;
		Integer y = 20;
		Integer z = 7;
		Short srt = 7;
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(srt));
		
	}
}
