
public class replaceExample {

	public static void main(String[] args) {
		String str1 = "aaaa";
		String str2 = "자바 코딩";
		
		//replace("a","b"): "a"를 "b"로 치환
		System.out.println("result ==>"+str1.replace("aa", "b"));

		System.out.println("result ==>"+str2.replace("바 코", "good"));
		
		
		//replaceAll: replace와 비슷하지만 정규표현식[] 사용가능
		//정규표현식:"[adsafaw]"이라면 a,d,s,a,f,a,w 각각을 의미
		//if [^adsafaw] 라고 입력한다면 a,d,s,a,f,a,w를 뺀 나머지를 의미
		String str3 = "abcdefghijk";
		System.out.println(str3.replaceAll("[abcijk]", "굿"));
		System.out.println(str3.replaceAll("[^abcijk]", "굿"));
		
		
	}

}
