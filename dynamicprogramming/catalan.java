package dynamicprogramming;
import java.util.*;
import java.io.*;
public class catalan {
    public static void catalan(int n){
      int dp[]=new int[n+1];
      dp[0]=1;
      dp[1]=1;
      for(int i=2;i<=n;i++){
        int ans=0;
        for(int j=0;j<i;j++){
            ans=ans+dp[j]*dp[i-j-1];

        }
        dp[i]=ans;

      }
      System.out.println("catalan number is:"+dp[n]);
      

    }
    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the number whose catalan value you want");
       int n=Integer.parseInt(obj.readLine());
       catalan(n);







    }
    
}
