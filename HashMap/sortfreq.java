package HashMap;
import java.util.*;
import java.io.*;
class Freq implements Comparable<Freq>{
  char a;
  int frq;
  public Freq(char a,int freq){
     this.a=a;
     this.frq=freq;
  } 
public int compareTo(Freq fr){
   return  this.frq-fr.frq;
}



}

public class sortfreq {
    public static String sort(String str){
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<str.length();i++){
        map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);

    }
    Set<Character> set=map.keySet();
   PriorityQueue<Freq> qu=new PriorityQueue(Collections.reverseOrder());
    for(char a:set){
        qu.add(new Freq(a,map.get(a)));
    }
    String ans="";
    while(!qu.isEmpty()){
        Freq fr=qu.poll();
        int count=fr.frq;
        char a=fr.a;
        for(int i=0;i<count;i++){
            ans=ans+Character.toString(a);
        }

    }
  


return ans;


    }
    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the string");
       String str=obj.readLine();
      String ans= sort(str);
      System.out.println(ans);


       
    }
    
}
