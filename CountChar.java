import java.util.*;
public class CountChar {
	public static void main(String[] args) {
		int ch=0, space=0, digital=0, other=0;
		char[] cha=null;
		Scanner scanner =new Scanner(System.in);
		String s=scanner.nextLine();
		cha=s.toCharArray();//convert string to array
		for(char c:cha){
			if (c>='0'&&c<='9'){
				digital++;
			}else if(c>='a'&&c<='z'){
				ch++;
			}else if(c==' '){
				space++;
			}else other++;
		}
		System.out.println("letter: "+ch);
		System.out.println("space: "+space);
		System.out.println("digital: "+digital);
		System.out.println("other: "+other);
	}
}
