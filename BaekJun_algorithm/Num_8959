import java.util.Scanner;

public class Num_8959 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        String[] str = new String[sc.nextInt()];
        
        for(int i =0;i<str.length;i++){
            str[i] = sc.next();
        }
        
        for(int i =0; i < str.length; i++){
            int sum = 0;
            int cnt = 0;
            
            for(int j=0;j < str[i].length();j++){
                
            	if(str[i].charAt(j) == 'O')
                    cnt++;
                else if(str[i].charAt(j) == 'X'){
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
