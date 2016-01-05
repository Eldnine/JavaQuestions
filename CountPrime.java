import java.util.*;
public class CountPrime {
	public static void main(String[] args) {
		int no=0;
		boolean a=false;;
		for (int i=101;i<200;i+=2){
			for(int j=2;j<=Math.sqrt(i);j++){
				if (i%j==0){
					a=false;
					break;
				}
				else{
					a=true;
				}
			}
			if(a){
				no++;
				System.out.println(i);
			}
		}
		System.out.println(no);
	}
}
