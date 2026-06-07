package Heap;
import java.util.*;
import java.io.*;

public class rope {
    public static int reducecost(int arr[]){
     PriorityQueue<Integer> qu=new PriorityQueue();
     for(int i=0;i<arr.length;i++){
        qu.add(arr[i]);
     }
     int mincost=0;
     mincost=qu.remove()+qu.remove();
     int length=mincost;
     
     while(!qu.isEmpty()){
      length=length+qu.remove();
      mincost=mincost+length;
     }
     return mincost;




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of ropes");
        int num=Integer.parseInt(obj.readLine());
        int rope[]=new int[num];
        for(int i=0;i<num;i++){
         rope[i]=Integer.parseInt(obj.readLine());
        }
     System.out.println( "minmum cost is :"+  reducecost(rope));







    }
    
}
