import java.io.*;
import java.util.StringTokenizer;



public class Num_4344{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int c = Integer.parseInt(br.readLine());
			
		for(int i=0;i<c;i++) {
			//���� ���� ���� ���� ```` �Է�
			StringTokenizer st = new StringTokenizer(br.readLine()," ");;
				
			//����� �Ѵ� �л��� ��
			int over_avg_cnt = 0;
			
			//�Է¹��� ���� ������ �̿��Ͽ� �迭���� 
			int[] grade = new int[Integer.parseInt(st.nextToken())];
			int avg = 0;
				
			//�Է¹��� ������ grade�迭�� ����, ��հ��� ����� avg������ ���� ����
			for(int j=0;j<grade.length;j++) {
				grade[j] = Integer.parseInt(st.nextToken());
				avg+=grade[j];
			}
				
			//��հ� ���ϱ�
			avg/=grade.length;
				
			for(int j=0;j<grade.length;j++) {
				if(grade[j] > avg)
					over_avg_cnt++;
			}
			System.out.printf("%.03f%%\n",((double)over_avg_cnt/grade.length)*100);	
		}
		
	}
}