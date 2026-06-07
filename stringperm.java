import java.util.*;
import java.io.*;
public class stringperm {
    static int count=0;
    public static void perm(String str, String ans,int length){

      if(ans.length()==length){
        System.out.println(ans);
        count++;
        return;
      }
      for(int i=0;i<str.length();i++){
         if(i==0){
            perm(str.substring(i+1),ans.concat(Character.toString(str.charAt(i))),length);
         }
         else{
            perm((str.substring(0,i)+str.substring(i+1)),ans.concat(Character.toString(str.charAt(i))),length);
         }


      }

    }
     public static void main(String args[])throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String");
        String str=obj.readLine();
        System.out.println("string after permutations are");
        perm(str, "", str.length());
        System.out.println("total permutations are:"+count);



     }
}
