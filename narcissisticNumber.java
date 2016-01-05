import java.util.*;
public class narcissisticNumber {
	public static void main(String[] args) {
		int b1,b2,b3,n;
		for (b1=0;b1<10;b1++){
			for (b2=0;b2<10;b2++){
				for (b3=1;b3<10;b3++){
					n=b1+b2*10+b3*100;
					if(n==(Math.pow(b1, 3)+Math.pow(b2, 3)+Math.pow(b3, 3))){
						System.out.println(n);
					}
				}
			}
		}
	}
}
