import java.io.*;
import java.util.StringTokenizer;


public class Num_15552{
	public static void main(String Args[]) throws IOException  {
		//BufferedReader와 BufferedWriter를 이용한 입출력 문제
		//Scanner를 사용하기엔 요구되는 시간이 짧기때문에 빠르게 실행되는 이것을 사용
		
		//BufferedReader는 String형태로 저장되기 때문에 int형으로 사용하려면 Integer.parseInt() 사용해야함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//t = 반복횟수
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0;i<t;i++) {
			//st에 BW을 통해 "1 5" 형태로 입력받고 " "단위로 쪼개서 Token에 저장함
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		//BR종료
		br.close();
		
		//BW 스트림 비움
		bw.flush();
		//BW 종료
		bw.close();     
	}
}