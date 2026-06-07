package dynamicprogramming;
import java.util.*;
import java.io.*;

public class countbsts {
    public static void countbst(int n){
     int dp[]=new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for(int i=2;i<=n;i++){
        int ans=0;
        for(int j=0;j<i;j++){
            ans=ans+(dp[j]*dp[i-j-1]);
        }
        dp[i]=ans;
     }
     System.out.println("total bst that can be formed is:"+dp[n]);







    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of node :");
        int node=Integer.parseInt(obj.readLine());
        countbst(node);
    }
    
}
