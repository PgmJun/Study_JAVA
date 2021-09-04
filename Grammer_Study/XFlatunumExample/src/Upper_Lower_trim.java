
public class Upper_Lower_trim {

	public static void main(String[] args) {
		//.toUpperCase(): 소문자 -> 대문자
		String str1 = "upper java";
		System.out.println(str1.toUpperCase());
		
		//.toLowerCase(): 대문자 -> 소문자
		String str2 = "LOWER JAVA";
		System.out.println(str2.toLowerCase());
		
		//.trim(): 앞뒤 공백 제거(중간 공백은 안사라짐)
		String str3 = " trim java ";
		System.out.println("["+str3.trim()+"]");
		
	}

}
