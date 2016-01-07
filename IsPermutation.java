//Given two strings, write a method to decide if one is a permutation of the other.
//Assume that it's case sensitive and the whitespace is significant
import java.util.*;
public class IsPermutation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		if(permutation(s1,s2)) System.out.println("Yes, they are permutation");
		else System.out.println("No, they are not permutaion");
		if(permutation2(s1,s2)) System.out.println("Yes, they are permutation");
		else System.out.println("No, they are not permutaion");
	}
	public static boolean permutation (String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		char[] s1Char=s1.toCharArray();
		char[] s2Char=s2.toCharArray();
		java.util.Arrays.sort(s1Char);
		java.util.Arrays.sort(s2Char);
		s1=new String(s1Char);
		s2=new String(s2Char);
		return s1.equals(s2);
	}
	public static boolean permutation2(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		int[] count1=new int[256];//assume strings are encoded by ASCII
		int[] count2=new int[256];
		for(int i=0;i<s1.length();i++){
			count1[s1.charAt(i)]++;
			count2[s2.charAt(i)]++;
		}
		return Arrays.equals(count1,count2);
		//cannot use count1.equals(count2), because it compares two reference instead of values in the array
	}
}

