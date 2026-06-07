package greedyalgo;
import java.util.*;
import java.io.*;

public class partitionstring {
    public static int partition(String str){
     int l=0;
     int r=0;
     int subcount=0;
     for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='L'){
            l++;
        }
        else if(str.charAt(i)=='R'){
         r++;
        }
        if(l==r){
            subcount++;
        }
     }
     return subcount;




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String");
        String str=obj.readLine();
        System.out.println("maximum substring are:"+partition(str));
        


          
    }
}
