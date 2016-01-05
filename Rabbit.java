import java.util.Scanner;
public class Rabbit {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner=new Scanner(System.in);
		int M=scanner.nextInt();
		
		System.out.println("Month 1:1");
		System.out.println("Month 2:1");
		int fOld=1,fNow=1;
		int n0=0,n1=0;
		for (int i=3;i<=M;i++){
			fNow=fNow+fOld;	
			fOld=fOld+n1;
			n1=n0;
			n0=fOld;			
			System.out.println("Month "+i+":"+fNow);
		}
	}
}
