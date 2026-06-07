import java.util.*;
import java.io.*;
public class Recursion_dup_str {

    public static void rem_dup(String str,boolean arr[],int index,StringBuilder newstr){
         if(index==str.length()){
            return;
         }
         int ind=str.charAt(index)-'a';
         if(arr[ind]==false){
             arr[ind]=true;
             newstr.append(Character.toString(str.charAt(index)));
             rem_dup(str, arr, index+1, newstr);
             return;
         }
         rem_dup(str, arr, index+1, newstr);




    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the String");
      String str=obj.readLine();
      boolean arr[]=new boolean[26];
      for(int i=0;i<arr.length;i++){
           arr[i]=false;
      }
      StringBuilder newstr=new StringBuilder("");
      rem_dup(str,arr,0,newstr);
      System.out.println(newstr);



    }
    
}
