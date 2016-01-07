//Longest common subsequence problem
import java.util.*;
public class LongestCommonSubsequence {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input two strings:");
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		System.out.println("The length of longest common subsequence is "+longestCS(s1,s2)+".");
	}
	public static int longestCS(String str1,String str2){
		int[][] lcs=new int[str1.length()+1][str2.length()+1];
		
		for(int i=1;i<=str1.length();i++){
			for(int j=1;j<=str2.length();j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)) lcs[i][j]=1+lcs[i-1][j-1];
				else {
					lcs[i][j]=Math.max(lcs[i][j],lcs[i-1][j]);
					lcs[i][j]=Math.max(lcs[i][j],lcs[i][j-1]);
				}
			}
		}
		return lcs[str1.length()][str2.length()];
	}
}

