package hashset;
import java.util.*;
import java.io.*;

//Linked HAshset differ from set as it return the stored elements in ordered form while Hashset return the elements in the unordered form;
public class Linkedhashset {
    public static void main(String args[]) throws IOException{
   BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
   LinkedHashSet<String> lhs=new LinkedHashSet<>();
   lhs.add("Delhi");
   lhs.add("Mumbai");
   lhs.add("Agra");
   lhs.add("kolkata");
   for(String st:lhs){
    System.out.println(st);
   }
   lhs.remove("Delhi");
   System.out.println(lhs.size());






    }
}
