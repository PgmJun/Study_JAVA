import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatExample {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("###,###");
		System.out.println(formatter.format(12345));
		

	}

}
