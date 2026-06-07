//  you can also use hashmap approach


package String;
import java.util.*;
import java.io.*;

public class anagram {
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr2,arr1)){
            return true;
        }

        return false;
        


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string 1");
        String str=obj.readLine();
        System.out.println("enter the String 2");
        String str2=obj.readLine();
       if( anagram(str,str2)){
        System.out.println("yes the string are anagram");
       }
       else{
        System.out.println("String are not anagram");
       }
    
    }
    
}
