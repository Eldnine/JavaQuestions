import java.util.*;
public class Commonisor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input two integer: ");
		int a=scanner.nextInt(),b=scanner.nextInt();
		Commonisor com=new Commonisor();
		int n= com.common(a,b);
		System.out.println("Biggest commonisor is: "+n);
		System.out.println("Smallest common multiple is: "+a*b/n);
	}
}
class Commonisor {
	public int common(int a,int b){
		if (a<b){
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		while(b!=0){
			if (a==b){
				return a;
			}
			int temp=a%b;
			a=b;
			b=temp;
		}
		return a;
	}
}
