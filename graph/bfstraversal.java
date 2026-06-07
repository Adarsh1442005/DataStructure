package graph;

import java.util.*;
import java.io.*;

class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {

        this.src = src;
        this.dest = dest;

    }
}

public class bfstraversal {
    public static void dfs(ArrayList<Edge> graph[],int src,boolean vis[]){
      System.out.println(src);
      vis[src]=true;
      ArrayList<Edge> arr=graph[src];
      for(Edge edge:arr){
        int dest=edge.dest;
        if(!vis[dest]){
            dfs(graph,dest,vis);
        }
      }
      






    }
    public static void traversal(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < vis.length; i++) {
            vis[i] = false;
        }
        Queue<Integer> qu = new LinkedList();
        qu.add(0);
        while (!qu.isEmpty()) {
            int src = qu.remove();
            if (!vis[src]) {
                vis[src] = true;
                System.out.println(src);
                ArrayList<Edge> arr = graph[src];
                for (Edge e : arr) {
                    qu.add(e.dest);
                }
            }

        }

    }

    public static ArrayList<Edge>[]  main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of edges");
        int size = Integer.parseInt(obj.readLine());
        ArrayList<Edge> arr[] = new ArrayList[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList();
        }
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Edge> li = arr[i];
            System.out.println("enter the total destination from node:" + i);
            int destsize = Integer.parseInt(obj.readLine());
            System.out.println("enter the destinations:");
            for (int j = 0; j < destsize; j++) {
                int dest = Integer.parseInt(obj.readLine());
                li.add(new Edge(i, dest));

            }

        }
        // System.out.println("bfs traversal of the graph");
        // traversal(arr);
        return arr;
         

    }

}
