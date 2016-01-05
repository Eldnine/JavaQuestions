import java.util.*;
public class Grade {
	public static void main(String[] args) {
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input your grade:");
		int g=scanner.nextInt();
		grade= g>=90?'A'
				:g>=60?'B'
						:'C';
		System.out.println("So your grade is: "+grade);
	}
}
