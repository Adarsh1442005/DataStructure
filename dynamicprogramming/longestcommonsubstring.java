package dynamicprogramming;
import java.util.*;
import java.io.*;

public class longestcommonsubstring {
    public static void longest(String str1,String str2){
      int dp[][]=new int[str1.length()+1][str2.length()+1];
      int max=0;
      for(int i=str1.length()-1;i>=0;i--){
         for(int j=str2.length()-2;j>=0;j--){
            if(str1.charAt(i)==str2.charAt(j)){
                dp[i][j]=1+dp[i+1][j+1];
                max=Math.max(max,dp[i][j]);
            }
            else{
                dp[i][j]=0;
            }
         }
      }
      System.out.println("the length of the largest substring:"+max);
    }
      
    
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string 1:");
        String a=obj.readLine();
        System.out.println("enter the string 2:");
        String b=obj.readLine();
        longest(a, b);
        

    }
}
