import java.util.*;
public class PerfectNo {
	public static void main(String[] args) {
		for (int i=1;i<1000;i++){
			int a=0;
			for (int j=1;j<=i/2;j++){
				if(i%j==0){
					a=a+j;
				}
			}
			if (a==i){
				System.out.print(i+" ");
			}
		}
		
	}
}
