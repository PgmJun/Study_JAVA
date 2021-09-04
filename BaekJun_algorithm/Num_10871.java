import java.io.*;
import java.util.StringTokenizer;


public class Num_10871 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] all_num = br.readLine().split(" ");
        
        int[] num = new int[n];
        int cnt = 0;
        
        for(int i = 0;i<n;i++){
            if(Integer.parseInt(all_num[i]) < x){
                num[cnt] = Integer.parseInt(all_num[i]);
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(num[i]+" ");
        }
        br.close();
        
        
    }
}

