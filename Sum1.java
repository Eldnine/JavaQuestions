import java.util.*;
public class Sum1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input a: ");
		int a=scanner.nextInt();
		System.out.println("Please input no of adding operation: ");
		int b=scanner.nextInt();
		int output=0;
		for (int i=0;i<b;i++){
			output=a+output;
			a=a*10+a;
		}
		System.out.println(output);
	}
}
