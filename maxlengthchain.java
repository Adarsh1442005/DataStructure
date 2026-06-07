import java.util.*;
import java.io.*;
public class maxlengthchain {
    public static int maxlen(int arr[][]){
           Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
           int max=1;
           int last=arr[0][1];
           for(int i=1;i<arr.length;i++){
              if(arr[i][0]>last){
                last=arr[i][1];
                max++;

              }
           }
           return max;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of pairs:");
        int size=Integer.parseInt(obj.readLine());
        int arr[][]=new int[size][2];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the start time:");
            arr[i][0]=Integer.parseInt(obj.readLine());
            System.out.println("enter the end time:");
            arr[i][1]=Integer.parseInt(obj.readLine());

            
        }
       int max= maxlen(arr);
       System.out.println("the maximum length of the chain is:"+max);


    }
}
