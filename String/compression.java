package String;
import java.util.*;
import java.io.*;

public class compression {
    public static String compression(String str){
        
        String newstr="";
        
        for(int i=0;i<str.length();i++){
           int count=1;

        while(i<str.length()-1 &&str.charAt(i)==str.charAt(i+1)){
            i++;
            count++;
        }
        newstr=newstr+str.charAt(i);
        if(count>1){
            newstr=newstr+Integer.toString(count);
        }


    }
    return newstr;
       
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String");
        String a=obj.readLine();
        System.out.println(compression(a));


    }
}
