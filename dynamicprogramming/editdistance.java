package dynamicprogramming;
import java.util.*;
import java.io.*;
public class editdistance {
    public static void editdistance(String str1, String str2){
         int dp[][]=new int[str2.length()+1][str1.length()+1];
         for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[i].length-2;j>=0;j--){
               if(str1.charAt(j)==str2.charAt(i)){
                dp[i][j]=dp[i+1][j+1];
               }
               else{
                int add=1+dp[i+1][j];
                int del=1+dp[i][j+1];
                int rep=1+dp[i+1][j+1];
                dp[i][j]=Math.min(add,Math.min(del,rep));
               }


            }
         }
        System.out.println("minimum operation is:"+dp[0][0]);

    }

    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string a");
        String str1=obj.readLine();
        System.out.println("enter the string 2:");
        String str2=obj.readLine();
        editdistance(str1, str2);


    }

    
}
