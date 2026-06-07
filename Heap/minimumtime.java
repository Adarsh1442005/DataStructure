package Heap;
import java.util.*;
import java.io.*;

public class minimumtime {
    public static int mintime(int arr[],int n,int k){
     Queue<Integer> qu=new LinkedList<>();
     boolean vis[]=new boolean[n+1];
     for(int i=0;i<vis.length;i++){
        vis[i]=false;
     }
     int time=0;
     for(int i=0;i<arr.length;i++){
        qu.add(arr[i]);
        vis[arr[i]]=true;
     }
     while(qu.size()>0){
        int siz=qu.size();
        int ind=0;
        for(int i=0;i<siz;i++){
            int curr=qu.poll();
            if(curr-1>=1 && !vis[curr-1]){
                ind=1;
                vis[curr-1]=true;
                qu.add(curr-1);
            }
            if(curr+1<=n && !vis[curr+1]){
                ind=1;
                vis[curr+1]=true;
                qu.add(curr+1);
            }
        }
        if(ind!=0){
        time++;
        }
     }


    return time;




    }

    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the size of the array");
     int k=Integer.parseInt(obj.readLine());
     int arr[]=new int [k];
     for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());
     }
     System.out.println("enter the value of N:");
     int n=Integer.parseInt(obj.readLine());
     System.out.println(mintime(arr,n,k));







    }
    
}
