import java.util.*;
import java.io.*;
public class subsetstring {
   static ArrayList <String > arr=new ArrayList();
    public static void subset(String orig,String sub,int index){
        if(index==orig.length()){
            System.out.println(sub);
            arr.add(sub);
            return;

        }
        subset(orig,sub.concat(Character.toString(orig.charAt(index))),index+1);
        subset(orig,sub,index+1);





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str=obj.readLine();
        System.out.println("subsets are:");
        subset(str, "", 0);
        System.out.println("size of the arraylist is:"+arr.size());

    }
    
}
