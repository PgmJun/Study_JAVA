import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		
		//���� ����
			int[] numSort = {41,110,4515,63,88,7};
		
			//���� �� �迭 ���
			for(int i=0;i<numSort.length;i++) {
			System.out.print(numSort[i]+" ");
			}
		
			//�迭 ����(Array Sort)
			Arrays.sort(numSort);
			System.out.println("\n\n");
		
			//���ĵ� �迭 ���
			for(int i=0;i<numSort.length;i++) {
				System.out.print(numSort[i]+" ");
			}
		
		
			System.out.println("\n\n");
		
		//���� ����
			String[] engSort = {"apple","peach","orange","vitamin","covid19"};
				
			//���� �� �迭 ���
			for(int i=0;i<engSort.length;i++) {
				System.out.print(engSort[i]+" ");
			}
				
			//�迭 ����(Array Sort)
			Arrays.sort(engSort);
			System.out.println("\n\n");
				
			//���ĵ� �迭 ���
			for(int i=0;i<engSort.length;i++) {
				System.out.print(engSort[i]+" ");
			}
		
		
	}

}
