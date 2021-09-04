import java.io.*;
import java.util.StringTokenizer;


public class Num_11022 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0;i<t;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            //문자열과 계산식을 묶을때에는 계산식을 꼭 ()로 묶어주어야 Error가 나지 않습니다.
            bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n"); 
        }
        br.close();
        
        bw.flush();
        bw.close();
    }
}

