package HashMap;
import java.util.*;
import java.io.*;
public class iternaryticket {
    public static void main(String args[]) throws IOException{

    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the from which city to which city");
    HashMap<String ,String > map=new HashMap();
    System.out.println("enter the total tickets");
    int size=Integer.parseInt(obj.readLine());
    for(int i=0;i<size;i++){
        System.out.println("enter from :");
        String from=obj.readLine();
        System.out.println("enter  to :");
        String to=obj.readLine();
        map.put(from,to);
        
    }
    Set <String> set=map.keySet();
    HashSet<String > set2=new HashSet<>();
    for(String str:set){
        set2.add(map.get(str));
    }
    for(String str:set){
        if(!set2.contains(str)){
           String st=str;
           System.out.println("travelling is:");
           while(!map.isEmpty()){

           System.out.println(st);
           String st1=map.get(st);
           map.remove(st);
           st=st1;
           }
           System.out.println(st);
           break;

        }
    }












    }
}
