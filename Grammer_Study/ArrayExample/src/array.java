import java.util.Random;
import java.util.Scanner;

public class array{
	
	public static void getLottoNum(int[] lotto,int bonusNum) {
		Random rd = new Random();
		for(int i=0;i<6;i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j])
					i--;
					break;
			}
			
		}
		System.out.println("로또 번호: ");
		for(int i=0;i<6;i++) {
			System.out.printf(lotto[i]+" ");
		}
	}
	
	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		int bonusNum = 0;
		
		getLottoNum(lotto,bonusNum);
	}
}