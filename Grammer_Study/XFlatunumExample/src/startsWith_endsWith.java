
public class startsWith_endsWith {

	public static void main(String[] args) {
		//boolean startsWith(String prefix): 비교 대상 문자열이 입력단 문자열로 시작되는지 확인후 boolean값으로 리턴
		String str1 = "자바 코딩";
		System.out.println(str1.startsWith("자바"));
		
		//자바코딩 사이에 공백이 빠졌기 때문에 false처리
		String str2 = "자바코딩";
		System.out.println(str2.startsWith("자바 "));
		
		//boolean endsWith(String suffix): 비교 대상이 입력된 문자열로 끝나는지 확인후 boolean값 리턴
		System.out.println(str1.endsWith("자바"));
		System.out.println(str1.endsWith("코딩"));
	}

}
