import java.util.*;
import java.io.*;
public class Minimumabsolute {
    public static int  minimum(int A[],int B[]){
         Arrays.sort(A);
         Arrays.sort(B);
         int sum=0;
         for(int i=0;i<A.length;i++){
            int diff=Math.abs(A[i]-B[i]);
            sum=sum+diff;
         } 
         return sum;  
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int A[]=new int[size];
        int B[]=new int[size];
        System.out.println("enter the elements in the array A:");
        for(int i=0;i<A.length;i++){
            A[i]=Integer.parseInt(obj.readLine());

        }
        System.out.println("enter the elements  in the array B:");
        for(int i=0;i<B.length ;i++){
            B[i]=Integer.parseInt(obj.readLine());
        }
        int sum=minimum(A, B);
        System.out.println("the minimum absolute difference is :"+sum);
    }
    
}
