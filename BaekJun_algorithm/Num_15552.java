import java.io.*;
import java.util.StringTokenizer;


public class Num_15552{
	public static void main(String Args[]) throws IOException  {
		//BufferedReader�� BufferedWriter�� �̿��� ����� ����
		//Scanner�� ����ϱ⿣ �䱸�Ǵ� �ð��� ª�⶧���� ������ ����Ǵ� �̰��� ���
		
		//BufferedReader�� String���·� ����Ǳ� ������ int������ ����Ϸ��� Integer.parseInt() ����ؾ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//t = �ݺ�Ƚ��
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0;i<t;i++) {
			//st�� BW�� ���� "1 5" ���·� �Է¹ް� " "������ �ɰ��� Token�� ������
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		//BR����
		br.close();
		
		//BW ��Ʈ�� ���
		bw.flush();
		//BW ����
		bw.close();     
	}
}