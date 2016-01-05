import java.util.*;
public class PeachDivision {
	public static void main(String[] args) {
		int a;
		for(int i=6;i<100000;i++){
			a=i;
			int j;
			for(j=0;j<5;j++){
				//System.out.println(i);
				if ((a-1)%5 != 0){
					break;
				}
				a=(a-1)/5*4;
			}
			if(j==5){
				System.out.println("Least number of peaches: "+i);
				break;
			}
		}
	}
}
