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
	
	//another method that also print the LCS
	public static void LCS(String s1,String s2) {
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		
		//find the length of the LCS
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					dp[i+1][j+1]=dp[i][j]+1;
				}else dp[i+1][j+1]=Math.max(dp[i][j+1], dp[i+1][j]);
			}
		}
		
		//print
		int r=s1.length(),c=s2.length(),t=dp[s1.length()][s2.length()];
		char[] lcs=new char[dp[s1.length()][s2.length()]];
		while(r>0&&c>0){
			if(dp[r][c]==dp[r-1][c-1]+1 && dp[r-1][c]==dp[r][c-1]) {
				lcs[t-1]=s1.charAt(r-1);
				t--;
				r--;
				c--;
			}else{
				if(dp[r][c]==dp[r-1][c]) r--;
				else c--;
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
		System.out.println(lcs);
	}
}

