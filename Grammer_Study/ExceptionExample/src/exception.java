import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int multi = a*b*c;
        int[] number = new int[10];
        
        while(multi>0){
            int num = multi%10;
            multi/=10;
            number[num]++;
        }
        
        for(int i=0;i<10;i++)
            System.out.println(number[i]);
        
        sc.close();
    }
}