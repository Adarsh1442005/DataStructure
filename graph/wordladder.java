package graph;
import java.util.*;
import java.io.*;
public class wordladder {
    public static int ladder(Set<String > dict,String start,String target){
        if(!dict.contains(target)){
            return 0;
        }
        HashMap<String ,Integer> dist=new HashMap<>();
        dist.put(start,1);
        Queue<String> qu=new LinkedList<>();
        qu.add(start);
        while(!qu.isEmpty()){
            String check=qu.remove();
            int dest=dist.get(check);
            if(check.equals(target)){
                return dest;
            }
            for(String neigh:getneighb(check,dict)){
                if(!dist.containsKey(neigh)){
                    dist.put(neigh,dest+1);
                    qu.add(neigh);
                }
            }

        }
        return 0;
        
    }
     public static List<String> getneighb(String word, Set<String> dict) {
        List<String> neighbors = new ArrayList<>();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char original = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == original) continue;
                chars[i] = c;
                String newWord = new String(chars);
                if (dict.contains(newWord)) {
                    neighbors.add(newWord);
                }
            }
            chars[i] = original; // restore
        }
        return neighbors;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the start word");
        String start=obj.readLine();
        System.out.println("enter the target word:");
        String target=obj.readLine();
        HashSet<String> set=new HashSet<>();
        System.out.println("enter the size of the dictionary");
        int size=Integer.parseInt(obj.readLine());
        for(int i=0;i<size;i++){
            set.add(obj.readLine());
        }
     System.out.println("length of the smallest chain:" +ladder(set, start, target));


    }
    
}
