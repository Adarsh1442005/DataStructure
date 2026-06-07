package HashMap;
import java.util.*;
import java.io.*;

public class validanagram {
    public static boolean  anagram(String str1,String str2){
        HashMap<Character,Integer> map=new HashMap();
        for(int i=0;i<str1.length();i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            if(map.containsKey(c)){
                map.put(c,(map.get(c)-1));
                if(map.get(c)==0){
                    map.remove(c);
                    if(map.isEmpty() && i!=str2.length()-1){
                        return false;
                    }
                }


            }
            else{
                return false;
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
        


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string 1:");
        String str1=obj.readLine();
        System.out.println("enter the strig 2:");
        String str2=obj.readLine();
        System.out.println("string is anagram ?:"+anagram(str1,str2));

    }
    
}
