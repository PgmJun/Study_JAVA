
public class Character_isUpperCase_and_isLowerCase {

	public static void main(String[] args) {
		//isUpperCase(): ��õ� ���ڰ� �빮������ Ȯ���Ͽ� boolean���� ��ȯ
		//isLowerCase(): ��õ� ���ڰ� �ҹ������� Ȯ���Ͽ� boolean���� ��ȯ
		
		System.out.println(Character.isUpperCase('t'));	//false
		System.out.println(Character.isUpperCase('T')); //true
		
		System.out.println(Character.isLowerCase('t')); //true
		System.out.println(Character.isLowerCase('T')); //false
	}

}
