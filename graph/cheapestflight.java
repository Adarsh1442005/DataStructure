package graph;
import java.util.*;
import java.io.*;
class Dest implements Comparable<Dest>{
int dest;
int cost;
int stop;
public Dest(int dest,int cost,int stop){
   this.dest=dest;
   this.cost=cost;
   this.stop=stop;
}

public  int compareTo(Dest de){
  return this.cost-de.cost;
  


}



}

public class cheapestflight {
    public static int  cheapest(ArrayList<Ed> graph[],int src,int dest,int k){
       int max=0;
        boolean vis[]=new boolean[graph.length];
        int dist[]=new int[graph.length];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(vis,false);
        PriorityQueue<Dest> qu=new PriorityQueue<>();
        dist[src]=0;
        qu.add(new Dest(src,0,0));
        while(!qu.isEmpty()){
          Dest de=qu.remove();
          if(de.stop>k+1 && de.dest==dest){
            dist[dest]=Integer.MAX_VALUE;
          }
         else if(de.stop<=k+1 && de.dest==dest){
            return de.cost;
          }
          ArrayList<Ed> arr=graph[de.dest];
          vis[de.dest]=true;
          for(Ed ed:arr){
           
                if(dist[ed.src]+ed.cost<dist[ed.dest]){
                    dist[ed.dest]=dist[ed.src]+ed.cost;
                    qu.add(new Dest(ed.dest,dist[ed.dest],de.stop+1));
                
            }
          }
        
        }

        

    return -1;


    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the total length of the array");
     int size=Integer.parseInt(obj.readLine());
     int arr[][]=new int[size][3];
     for(int i=0;i<arr.length;i++){
       System.out.println("enter the src:");
       arr[i][0]=Integer.parseInt(obj.readLine());
        System.out.println("enter the destination");
        arr[i][1]=Integer.parseInt(obj.readLine());
        System.out.println("enter the cost:");
        arr[i][2]=Integer.parseInt(obj.readLine());
  }
  System.out.println("enter the number of cities ");
  int city=Integer.parseInt(obj.readLine());
  ArrayList<Ed> graph[]=new ArrayList[city];
  for(int i=0;i<graph.length;i++){
    graph[i]=new ArrayList();
  }
  for(int i=0;i<arr.length;i++){
    int src=arr[i][0];
    int dest=arr[i][1];
    int cost=arr[i][2];
    graph[src].add(new Ed(src,dest,cost));
  }
  int cost=cheapest(graph, 0, 3, 2);
  System.out.println("minimum cost is :"+cost);








    }
    
}
