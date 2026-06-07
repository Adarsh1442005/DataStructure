package segmenttree;
import java.util.*;
import java.io.*;

public class creation {
    static int tree[];
    public static int  segment(int arr[],int sti,int start,int end){
     if(start==end){
        tree[sti]=arr[start];
        return tree[sti];
     }
     int mid=(start+end)/2;
    int left= segment(arr,2*sti+1,start,mid);
     int right=segment(arr,2*sti+2,mid+1,end);
     tree[sti]=left+right;
     return tree[sti];



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={1,2,3,4,5,6,7,8};
        tree=new int[arr.length*4];
        segment(arr,0,0,arr.length-1);
        for(int i:tree){
            System.out.println(i);
        }


        

    }
    
}
