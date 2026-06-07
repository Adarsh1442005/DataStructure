package hashset;
import java.util.*;
import java.io.*;
// TreeSet use the Lexicographically sorting of String in which capital letter comes before small letter.
public class Treeset {
    public static void main(String arga[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
TreeSet<String > set=new TreeSet();
set.add("Aaarsh");
set.add("ADarsh");
set.add("Ram");
set.add("shyam");
System.out.println(set);
    }
    
}
