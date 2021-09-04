
public class compareTo {

	public static void main(String[] args) {
		//compareTo(reference Number) 함수는 함수를 호출한 인자값을 비교한다. 물론 비교 대상인 만큼 비교하는 두 인자는 같은 자료형이어야 한다.
		//비교 대상이 동일한 값일 경우: return 0
		//비교 대상보다 큰 경우: return 1
		//비교 대상보다 작은 경우: return -1
		
		Integer x = 10;
		System.out.println(x.compareTo(-30));
		System.out.println(x.compareTo(10));
		System.out.println(x.compareTo(30));

	}

}
