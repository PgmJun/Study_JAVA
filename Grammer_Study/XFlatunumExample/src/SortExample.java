import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		
		//숫자 정렬
			int[] numSort = {41,110,4515,63,88,7};
		
			//정렬 전 배열 출력
			for(int i=0;i<numSort.length;i++) {
			System.out.print(numSort[i]+" ");
			}
		
			//배열 정렬(Array Sort)
			Arrays.sort(numSort);
			System.out.println("\n\n");
		
			//정렬된 배열 출력
			for(int i=0;i<numSort.length;i++) {
				System.out.print(numSort[i]+" ");
			}
		
		
			System.out.println("\n\n");
		
		//글자 정렬
			String[] engSort = {"apple","peach","orange","vitamin","covid19"};
				
			//정렬 전 배열 출력
			for(int i=0;i<engSort.length;i++) {
				System.out.print(engSort[i]+" ");
			}
				
			//배열 정렬(Array Sort)
			Arrays.sort(engSort);
			System.out.println("\n\n");
				
			//정렬된 배열 출력
			for(int i=0;i<engSort.length;i++) {
				System.out.print(engSort[i]+" ");
			}
		
		
	}

}
