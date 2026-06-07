package dprevision;
import java.util.*;
import java.io.*;

public class maxsubsequence {
   static  int arr[];
   static int dp[];
    public static int  max(int n){
        if(n==arr.length-1){
            return arr[n];
        }
        if(n>=arr.length){
            return 0;

        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick=arr[n]+max(n+2);
        int notpick=max(n+1);
        dp[n]=Math.max(pick,notpick);
        return dp[n];


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        arr=new int[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        dp=new int[size];
        Arrays.fill(dp,-1);
        System.out.println("maxsum subsequence is :"+max(0));
    
   

    }
    
}
