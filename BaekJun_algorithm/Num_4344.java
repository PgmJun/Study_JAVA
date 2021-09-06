import java.io.*;
import java.util.StringTokenizer;



public class Num_4344{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int c = Integer.parseInt(br.readLine());
			
		for(int i=0;i<c;i++) {
			//점수 갯수 점수 점수 ```` 입력
			StringTokenizer st = new StringTokenizer(br.readLine()," ");;
				
			//평균을 넘는 학생의 수
			int over_avg_cnt = 0;
			
			//입력받은 점수 갯수를 이용하여 배열생성 
			int[] grade = new int[Integer.parseInt(st.nextToken())];
			int avg = 0;
				
			//입력받은 점수를 grade배열에 저장, 평균값을 계산할 avg변수에 점수 저장
			for(int j=0;j<grade.length;j++) {
				grade[j] = Integer.parseInt(st.nextToken());
				avg+=grade[j];
			}
				
			//평균값 구하기
			avg/=grade.length;
				
			for(int j=0;j<grade.length;j++) {
				if(grade[j] > avg)
					over_avg_cnt++;
			}
			System.out.printf("%.03f%%\n",((double)over_avg_cnt/grade.length)*100);	
		}
		
	}
}