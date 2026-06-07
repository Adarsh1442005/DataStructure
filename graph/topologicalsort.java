package graph;
import java.util.*;
import java.io.*;
public class topologicalsort {
    public static void topo(ArrayList<Edge> graph[],boolean vis[],Stack<Integer> st){
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
               topoutil(graph, vis, st, i);
            }
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void topoutil(ArrayList<Edge> graph[],boolean vis[], Stack<Integer> st,int src){
           
      vis[src]=true;
      ArrayList<Edge> arr=graph[src];
        for(Edge e:arr){
            int dest=e.dest;
            if(!vis[dest]){
                topoutil(graph,vis,st,dest);
            }
        }
        st.push(src);





    }
      public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of vertices");
        int num=Integer.parseInt(obj.readLine());
        ArrayList<Edge> graph[]=new ArrayList[num];
        for(int i=0;i<num;i++){
            graph[i]=new ArrayList();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


        boolean vis[]=new boolean[num];
        Arrays.fill(vis,false);
        Stack<Integer>st=new Stack();

      topo(graph, vis, st);

        


      }
}
