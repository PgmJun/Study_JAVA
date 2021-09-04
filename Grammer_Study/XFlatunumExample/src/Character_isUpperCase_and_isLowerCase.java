
public class Character_isUpperCase_and_isLowerCase {

	public static void main(String[] args) {
		//isUpperCase(): 명시된 문자가 대문자인지 확인하여 boolean값을 반환
		//isLowerCase(): 명시된 문자가 소문자인지 확인하여 boolean값을 반환
		
		System.out.println(Character.isUpperCase('t'));	//false
		System.out.println(Character.isUpperCase('T')); //true
		
		System.out.println(Character.isLowerCase('t')); //true
		System.out.println(Character.isLowerCase('T')); //false
	}

}
