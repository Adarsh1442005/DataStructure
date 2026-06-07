package Stack;
import java.util.*;
import java.io.*;

public class Decodestring {
    public static String  decode(String str){
     Stack<Integer> countstack=new Stack();
     Stack<String > stringstack=new Stack();
    String curr="";
    int currnum=0;
    for(int i=0;i<str.length();i++){
        char a=str.charAt(i);
       if(Character.isDigit(a)){
        currnum=Character.getNumericValue(a);
       }
      else  if(a=='['){
        countstack.push(currnum);
        stringstack.push(curr);
        curr="";

      }
      else if(a==']'){
        int num=countstack.pop();
        String st=stringstack.pop();
        String prev=curr;
        for(int j=1;j<=num-1;j++){
            curr=curr+prev;
        }
        curr=st+curr;
      }
    else{
        curr=curr+Character.toString(a);
    }





    }


   return curr;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String ");
        String str=obj.readLine();
        System.out.println("encode string is :"+decode(str));

    }
    
}
