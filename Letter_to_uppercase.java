import java.util.*;
import java.io.*;
public class Letter_to_uppercase{
    public static StringBuilder touppercase(String str){
       StringBuilder newstr=new StringBuilder("");
       newstr.append(Character.toUpperCase(str.charAt(0)));
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)!=' '){
            if(str.charAt(i-1)==' '){
                newstr.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
            newstr.append(str.charAt(i));}
            
            continue;
        }
        else{
            if(i==str.length()-1){
                break;
            }
            else{
                 newstr.append(str.charAt(i));

            }
        }

       }

      return newstr;


    }
    public static void main(String arsgs[]) throws IOException{
      System.out.println("enter the String:");
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      String str=obj.readLine();
      System.out.println(touppercase(str));




    }
}