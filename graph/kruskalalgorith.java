package graph;
import java.util.*;
import java.io.*;
class Edgee implements Comparable<Edgee>{
    int src;
    int dest;
    int cost;
    public Edgee(int src,int dest,int cost){
       this.src=src;
       this.dest=dest;
       this.cost=cost;
    }
    public int compareTo(Edgee ed){
     return this.cost-ed.cost;
    }

}
public class kruskalalgorith {
    public static void kruskal(ArrayList<Edgee> edges,int v){
        disjpointsets dis=new disjpointsets();
        int parent[]=new int[4];
        int rank[]=new int[4];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
        dis.parent=parent;
        dis.rank1=rank;

        Collections.sort(edges);
        int mstcost=0;
        int count=0;
        for(int i=0;i<v-1;i++){
            Edgee ed=edges.get(i);
            int para=dis.find(ed.src);
            int parb=dis.find(ed.dest);
            if(para!=parb){
              dis.  union(ed.src,ed.dest);
              mstcost=mstcost+ed.cost;
              count++;
            }
        }
        System.out.println(mstcost);




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Edgee> arr=new ArrayList();
        arr.add(new Edgee(1,0,10));
        arr.add(new Edgee(0,3,30));
        arr.add(new Edgee(1,3,40));
        arr.add(new Edgee(0,2,15));
        arr.add(new Edgee(2,3,50));
     kruskal(arr, 4);

        
    }
    
}
