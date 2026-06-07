package segmenttree;
import java.util.*;
import java.io.*;
public class maxmin {
    static int tree[];
    public static void build(int arr[],int i,int si,int sj){
     if(si==sj){
        tree[i]=arr[si];
        return ;
     }
     int mid=(si+sj)/2;
     build(arr,2*i+1,si,mid);
     build(arr,2*i+2,mid+1,sj);
     tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
     
    }
    public static int query(int arr[],int i,int si,int sj,int qi,int qj){
      if(qj<=si || qi>=sj){
        return Integer.MIN_VALUE;
      }
      if(si>=qi && sj<=qj){
        return tree[i];
      }
      else{
        int mid=(si+sj)/2;
        int left=query(arr,2*i+1,si,mid,qi,qj);
        int right=query(arr,2*i+2,mid+1,sj,qi,qj);
        return Math.max(left,right);
      }

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int length=arr.length;
        tree=new int[4*length];
        build(arr,0,0,length-1);
      System.out.println( "maximum query in the range si:"+ query(arr,0,0,length-1,0,2));



    }
    
}
