package HashMap;
import java.util.*;
import java.io.*;
public class largesubarray0sum {
    public static int  max(int arr[]){

   HashMap<Integer,Integer> map=new HashMap();
   int sum=0;
   int len=0;
   for(int i=0;i<arr.length;i++){
    sum=sum+arr[i];
    if(map.containsKey(sum)){
        len=Math.max(len,i-map.get(sum));
    }
    else{
        map.put(sum,i);
    }
   }
   return len;





    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the size of the Array:");
      int size=Integer.parseInt(obj.readLine());
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=Integer.parseInt(obj.readLine());     
     }
     System.out.println(max(arr));


    }
}
