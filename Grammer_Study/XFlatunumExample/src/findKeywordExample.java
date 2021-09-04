
public class findKeywordExample {

	public static void main(String[] args) {
		String str = "Very fucking Coding!";
		
		//charAt(int): 문자열에서 int번째 글자 출력
		System.out.println(str.charAt(0));
		
		//indexOf(String keyword): 문자열에서 입력받은 문자열을 찾고 문자열이 시작되는 위치값 리턴 (위치값은 0부터 시작
		System.out.println(str.indexOf("fuck"));
		
		//lastIndexOf(String keyword): indexOf와 같은 기능이지만 맨 끝쪽부터 탐색시작
		System.out.println(str.lastIndexOf("C"));

		//length(): 문자열의 길이 출력
		System.out.println(str.length());
	}

}
