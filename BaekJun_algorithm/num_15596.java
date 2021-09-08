import java.util.Scanner;

class Test{
	long sum(int[] a) {
		long sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=(long)a[i];
		}
		return sum;
	}
}

public class num_15596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Test ts = new Test();
		
		System.out.println(ts.sum(a));
	}

}
