package Backtracking;
import java.util.*;
import java.io.*;

public class permutation {
    public static void geneperm(String s,String str){
        if(s.length()==0){
            System.out.println(str);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String newstr=s.substring(0, i)+s.substring(i+1);
            geneperm(newstr,str+ch);
        }




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the strig");
        String str=obj.readLine();
        geneperm(str, "");

    }
    
}
