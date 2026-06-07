package graph;
import java.util.*;
import java.io.*;
class edge{
    int src;
    int dest;
    int weight;
    public edge(int src,int dest,int weight){
      this.src=src;
      this.dest=dest;
      this.weight=weight;
    }
}
class Pair implements Comparable<Pair>{
int node;
int dist;
public Pair(int node,int dist){
   this.node=node;
   this.dist=dist;
}
public int compareTo(Pair p){
       return this.dist-p.dist;
}



}

public class Dijkstraalgo {
    public static void dijiksta(int src,ArrayList<edge> graph[],PriorityQueue<Pair> qu,int dist[],boolean vis[]){    
    qu.add(new Pair(src,0));
    dist[src]=0;
    
    while(!qu.isEmpty()){
      Pair p=qu.remove();
      if(!vis[p.node]){
        vis[p.node]=true;
        ArrayList<edge> arr=graph[p.node];
        for(edge ed:arr){
         int sr=ed.src;
         int dest=ed.dest;
         int weight=ed.weight;
         int updist=dist[sr]+weight;
         if(updist<dist[dest]){
            dist[dest]=updist;
            qu.add(new Pair(dest,updist));
         }

         
        }
       }
    }




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of vertices:");
      int vert=Integer.parseInt(obj.readLine());
      ArrayList<edge> arr[]=new ArrayList[vert];
      for(int i=0;i<vert;i++){
        arr[i]=new ArrayList();
      }
      arr[0].add(new edge(0,1,2));
      arr[0].add(new edge(0,2,4));
      arr[1].add(new edge(1,2,1));
      arr[1].add(new edge(1,2,1));
      arr[2].add(new edge(2,4,3));
      arr[3].add(new edge(3,5,1));
      arr[4].add(new edge(4,3,2));
      arr[4].add(new edge(4,5,5));
      int dist[]=new int[vert];
      Arrays.fill(dist,Integer.MAX_VALUE);
      boolean vis[]=new boolean[vert];
      Arrays.fill(vis,false);
      PriorityQueue<Pair> qu=new PriorityQueue<>();
      dijiksta(0, arr, qu, dist, vis);
      for(int dest:dist){
        System.out.println(dest);
      }


    

    }
    
}
