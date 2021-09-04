import java.util.Scanner;

public class Num_1110{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cycle = 0;
		int n = sc.nextInt();
		int first_n = n;
		
		do {
			int a = n/10;
			int b = n%10;
			int c = a+b;
			
			if(c>=10) {
				n = (b*10)+(c%10);
				cycle++;
			}
			else if(c<10) {
				n = (b*10)+c;
				cycle++;
			}
		}while(n !=  first_n);
		
		System.out.println(cycle);
		
		sc.close();
	}
}