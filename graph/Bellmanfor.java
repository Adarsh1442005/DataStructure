package graph;
import java.util.*;
import java.io.*;
class Ed implements Comparable<Ed>{
 int src;
 int dest;
 int cost;
 public Ed(int src,int dest,int cost){
    this.src=src;
    this.dest=dest;
    this.cost=cost;
 }
 public int compareTo(Ed ed){
    return this.cost-ed.cost;
 }


}
public class Bellmanfor {
    public static void bellamn(ArrayList<Ed> graph[],int dist[],int src){
        dist[src]=0;

      for(int i=0;i<graph.length-1;i++){
        for(int j=0;j<graph.length;j++){
         ArrayList<Ed> arr=graph[j];
         for(Ed ed:arr){
            int sc=ed.src;
            int dest=ed.dest;
            int cost=ed.cost;
            if(dist[sc]+cost<dist[dest]){
                dist[dest]=dist[sc]+cost;
            }

         }

        }
      }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total numbe rof vertices");
        int ver=Integer.parseInt(obj.readLine());
        ArrayList<Ed> graph[]=new ArrayList[ver];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new Ed(0,1,2));
        graph[0].add(new Ed(0,2,4));
        graph[1].add(new Ed(1,2,-4));
        graph[2].add(new Ed(2,3,2));
        graph[3].add(new Ed(3,4,4));
        graph[4].add(new Ed(4,1,-1));
        
        int dist[]=new int[ver];
        Arrays.fill(dist,Integer.MAX_VALUE);
       bellamn(graph,dist,0);
       for(int d:dist){
        System.out.println(d);
       }
        




    }
    
}
