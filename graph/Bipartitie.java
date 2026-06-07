package graph;
import java.util.*;
import java.io.*;
public class Bipartitie {
   public static boolean color(int color[],ArrayList<Edge> graph[],int src){
      ArrayList<Edge> neighb=graph[src];
      for(Edge e:neighb){
        int dest=e.dest;
        if(color[dest]==-1){
            if(color[src]==1){
                color[dest]=0;
               return  color(color,graph,dest);
            }
            else{
                color[dest]=1;
              return   color(color,graph,dest);
            }
        }
        else if(color[dest]!=-1 && color[dest]==color[src]){
            return false;

        }
       
      }
      return true;




   }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of vertices");
        int num=Integer.parseInt(obj.readLine());
        int color[]=new int[num];
       Arrays.fill(color,-1);
       ArrayList<Edge> graph[]=new ArrayList[num];
       for(int i=0;i<graph.length;i++) {
           graph[i]=new ArrayList();
       }
       graph[0].add(new Edge(0,1));
       graph[0].add(new Edge(0,2));
       graph[1].add(new Edge(1,0));
       graph[1].add(new Edge(1,3));
       graph[2].add(new Edge(2,0));
       graph[2].add(new Edge(2,3));
    //    graph[3].add(new Edge(3,1));
    //    graph[3].add(new Edge(3,4));
    //    graph[4].add(new Edge(4,3));
    //    graph[4].add(new Edge(4,2));
       color[0]=1;
      if(color(color,graph,0)){
        System.out.println("graph is Bipartite graph");
      }
      else{
        System.out.println("graph is not Bipartite graph");
      }





    






    }
}
