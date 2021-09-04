
public class Math_min_and_max {

	public static void main(String[] args) {
		//Math.min(a,b) 와 Math.max(a,b)는 "같은 자료형"인 a와 b를 비교하여 작은 값 혹은 큰 값을 반환해주는 함수
		int a = 10;
		int b = 1;
		double c = 9.5;
		
		
		System.out.println(Math.min(a,b));
		System.out.println(Math.max(a,b));
		
		//자료형이 다른 경우 자동으로 a를 double형으로 변환하여 계산
		System.out.println(Math.min(a, c));

	}

}
