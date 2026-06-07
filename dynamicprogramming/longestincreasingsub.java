package dynamicprogramming;
import java.util.*;
import java.io.*;
public class longestincreasingsub {
    public static void LIS(int arr[]){
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
       }
       int arr2[]=new int[set.size()];
       int k=0;
       for(int i:set){
        arr2[k]=i;
        k++;
       }
       Arrays.sort(arr2);

    int dp[][]=new int[arr.length+1][arr2.length+1];
    for(int i=dp.length-2;i>=0;i--){
        for(int j=dp[i].length-2;j>=0;j--){
            if(arr[i]==arr2[j]){
                
                dp[i][j]=1+dp[i+1][j+1];
            }
            else{
                dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
    }
    System.out.println("the length of the largest increasing subsequence:"+dp[0][0]);
   

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the totla number of elements");
        int elem=Integer.parseInt(obj.readLine());
        int arr[]=new int[elem];
        for(int i=0;i<arr.length;i++){
          arr[i]=Integer.parseInt(obj.readLine());
        }
        LIS(arr);
        

    }
    
}
