package dynamicprogramming;
import java.util.*;
import java.io.*;

public class stringconversion {
    public static void convert(String str1,String str2){
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[i].length-2;j>=0;j--){
                if(str1.charAt(i)==str2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    int ans1=dp[i+1][j];
                    int ans2=dp[i][j+1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        int del_operation=str1.length()-dp[0][0];
        int inse_op=str2.length()-dp[0][0];
        System.out.println("number of deletion is :"+del_operation);
        System.out.println("number of insert operation is:"+inse_op);

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string 1:");
        String str1=obj.readLine();
        System.out.println("enter the string 2:");
        String str2=obj.readLine();
        convert(str1, str2);

    }
    
}
