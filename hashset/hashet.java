package hashset;
import java.util.*;
import java.io.*;
//HAshset return the stored value in random order
public class hashet {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        HashSet<String > set=new HashSet();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("agra");
        set.add("Delhi");
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.contains("delhi"));

    }
    
}
