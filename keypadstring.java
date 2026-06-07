import java.util.*;
import java.io.*;
public class keypadstring {
    public static void backtrack(String arr[],String num,String ans,int index){
         if(index==num.length()){
            System.out.println(ans);
            return;
         }
        String alpha=arr[num.charAt(index)-'0'];
        char let[]=alpha.toCharArray();
        for(char c:let){
            backtrack(arr,num,ans.concat(Character.toString(c)),index+1);

        }


    }
    public static void main(String args[]) throws IOException{
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         String arr[]=new String[12];
         for(int i=0;i<arr.length;i++){
            arr[i]=obj.readLine();
         }
         System.out.println("enter the string");
         String num=obj.readLine();
         backtrack(arr,num,"",0);


    }
}
