import java.util.StringTokenizer;
import java.io.*;

public class Num_1009{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Test Case 갯수 입력받기
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for(int i = 0;i<t;i++) {
        	st = new StringTokenizer(br.readLine()," "); 
        	int r = 1;
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	for(int j=0;j<b;j++) r = (r*a) % 10;
        	if(r == 0)
        		System.out.println("10");
        	else
        		System.out.println(r);
        }
        br.close();
        
    }
}