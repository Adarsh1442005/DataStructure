package segmenttree;
import java.util.*;
import java.io.*;

public class queries {
    public static int  query(int tree[],int i,int sti,int stj,int qi,int qj){
     if(qj<=sti || qi>=stj){
        return 0;
     }
     if(sti>=qi && stj<=qj){
        return  tree[i];
     }
     else{
        int mid=(sti+stj)/2;
       int left= query(tree,2*i+1,sti,mid,qi,qj);
      int right=  query(tree,2*i+2,mid+1,stj,qi,qj);
      return left+right;
     }




    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first index");
        int qi=Integer.parseInt(obj.readLine());
        System.out.println("enter the second index");
        int qj=Integer.parseInt(obj.readLine());
        int arr[]={1,2,3,4,5,6,7,8};
        creation cr=new creation();
        cr.main(args);
       System.out.println("the sum is :"+query(cr.tree,0,0,arr.length-1,qi,qj));


    }
}
