import java.util.*;
public class Factorizations {
	public static void main(String[] args) {
		System.out.println("Input your number: ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.printf(n+"=");
		int k=2;
		while(k<=n){
			if(k==n){System.out.print(n);break;}
			else if(n%k==0){
				System.out.printf(k+"*");
				n=n/k;
			}
			else k++;
			//System.out.println(k);
		}
	}
}
