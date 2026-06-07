package dynamicprogramming;
import java.util.*;
import java.io.*;

public class climbingstair {
    static int dp[];
    
    public static int  countways(int curr,int n){
     if(curr==n){
        return 1;
     }
     if(curr>n){
        return 0;
     }
     if(dp[curr]!=-1){
        return dp[curr];

     }

       
    int single=countways(curr+1,n);
    int twice=countways(curr+2,n);
    dp[curr]=single+twice;
    return dp[curr];


    





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the last stair");
       int n=Integer.parseInt(obj.readLine());
       dp=new int[n];
       Arrays.fill(dp,-1);
       countways(0,n-1 );
       System.out.println("total ways of reaching the stair:"+dp[0]);
       

    }
}
