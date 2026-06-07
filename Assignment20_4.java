import java.util.*;
import java.io.*;
public class Assignment20_4 {
    
    public static void calc_sub(String str,int index,HashMap<Character,Integer> map){
        char c=str.charAt(index);
        if(index==str.length()-1){
            if(map.containsKey(c)){
                int ind=map.get(c);
                System.out.println(str.substring(ind, index+1));
                System.out.println(c);

            }
            else{
                map.put(c,index);
            }
            return;
        }
        if(map.containsKey(c)){
                 int ind=map.get(c);
                 System.out.println(str.substring(ind,index+1));
                 System.out.println(c);
                 calc_sub(str, index+1, map);


        }
        else{
            map.put(c,index);
            calc_sub(str, index+1, map);
        }
        

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str=obj.readLine();
        HashMap<Character,Integer> map=new HashMap();
        map.put(str.charAt(0),0);
        calc_sub(str, 1, map);
        Set<Character> key=map.keySet();
        for(char k:key){
            System.out.println(k);
        }
        


        

    }
}
