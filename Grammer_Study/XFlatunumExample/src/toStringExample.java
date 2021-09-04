
public class toStringExample {

	public static void main(String[] args) {
		//.toString(): Number객체를 String 객체로 변환하여 리턴
		
		//primitive type은 사용 불가능
		
		//이미 타입이 정해져있기 떄문 Integer,Float 등의 Number 객체는 타입이 아닌 클래스
		
		/*int x = 7;
		System.out.println(x.toString());         오류가 나는 예시*/
		
		Integer x = 7;
		
		System.out.println(x.toString());
		System.out.println(Integer.toString(x));

	}

}
