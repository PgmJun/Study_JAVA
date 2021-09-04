import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_10818{	//최소, 최대
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0;i<n;i++) {
        	num[i] = Integer.parseInt(st.nextToken());	
        }
        //숫자 정렬
        Arrays.sort(num);
        //첫번째랑 마지막번째 값 출력하면 최소, 최대 출력가능
        System.out.println(num[0] + " " + num[n-1]);
        
        br.close();
        bw.flush();
        bw.close();
    }
}