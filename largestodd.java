import java.util.*;
import java.io.*;
public class largestodd {
    public static int kth(int left,int right,int totalnumber,int k){
        int count=0;
    for(int i=right;i>=left;i--){
        if(i%2!=0){
            count++;
            if(count==k){
                return i;
            } 
        }
    }
      return 0;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the range 1:");
        int l=Integer.parseInt(obj.readLine());
        System.out.println("enter the range 2:");
        int r=Integer.parseInt(obj.readLine());
        int totalnumber=(r-l)+1;
        System.out.println("enter the value of K:");
        int k=Integer.parseInt(obj.readLine());
       int ans= kth( l,r,totalnumber,k);
       System.out.println(ans);


    }
}
