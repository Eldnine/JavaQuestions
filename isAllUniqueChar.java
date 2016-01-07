import java.util.*;
public class isAllUniqueChar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		if (isUniqueChars(s)){
			System.out.println("Yes, all characters in this string is unique");
		}else System.out.println("No, this string does not have all unique characters");
	}
	public static boolean isUniqueChars(String str){
		if (str.length()>256) return false;
		boolean[] chVisit=new boolean[256];
		for (int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if (chVisit[val]) return false;
			chVisit[val]=true;
		}
		return true;
	}
}

