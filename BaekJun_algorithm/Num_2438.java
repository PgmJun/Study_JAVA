import java.io.*;

public class Num_2438 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        
        for(int i = 0;i<n;i++){
            for(int k = 0;k<cnt;k++){
                System.out.print("*");
            }
            cnt++;
            System.out.print("\n");
        }
     
         br.close();
    }

	}

