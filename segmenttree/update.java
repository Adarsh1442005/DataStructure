package segmenttree;
import java.util.*;
import java.io.*;

public class update {
    static int tree[];
    public static void update(int i,int start,int end,int val,int index){
    if(start==end){
        tree[i]=val;
        return ;
    }
    int mid=(start+end)/2;
    if(index>mid){
        update(2*i+2,mid+1,end,val,index);
        
    }
    else {
        update(2*i+1,start,mid,val,index);
    }
    tree[i]=tree[2*i+1]+tree[2*i+2];
        
    


}

    public static void insert(int arr[],int i,int start,int end){
     if(start==end){
        tree[i]=arr[start];
        return;

     }
     int mid=(start+end)/2;
     insert(arr,2*i+1,start,mid);
     insert(arr,2*i+2,mid+1,end);
     tree[i]=tree[2*i+1]+tree[2*i+2];
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the index you wnat to update:");
        int index=Integer.parseInt(obj.readLine());
        System.out.println("enter the value you want to update with:");
        int val=Integer.parseInt(obj.readLine());
        int arr[]={1,2,3,4,5,6,7,8};
        tree=new int[4*arr.length];
        insert(arr,0,0,arr.length-1);
        for(int i:tree){
            System.out.print(i+",");
        }
        
        System.out.println("\n tree after updation");
        update(0,0,arr.length-1,val,index);
        for(int i:tree){
            System.out.print(i+",");
        }




    }
    
}
