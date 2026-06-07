package greedyalgo;
import java.util.*;
import java.io.*;
public class kthlargestodd {
    public static int oddmax(int left,int right){
        for(int i=right;i>=left;i--){
            if((i%2)!=0){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the left range");
        int left=Integer.parseInt(obj.readLine());
        int right=Integer.parseInt(obj.readLine());
       int oddmax= oddmax(left,right);
       System.out.println("maximum odd number betweenn the provide range is:"+oddmax);




    }
    
}
