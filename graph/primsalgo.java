package graph;
import java.util.*;
import java.io.*;


public class primsalgo {
    public static void primsalgo(ArrayList<Ed> graph[],boolean vis[],PriorityQueue<Ed> qu ,HashSet<Integer> mst,HashSet<Integer> nonmst){
        int cost=0;
        nonmst.remove(0);
        mst.add(0);
        vis[0]=true;
        while(!nonmst.isEmpty()){
            for(int i:mst){
                ArrayList<Ed> arr=graph[i];
                for(Ed ed:arr){
                    if(!vis[ed.dest]){
                        qu.add(ed);
                    }
                }

            }
            Ed ed=qu.remove();
     vis[ed.dest]=true;
     nonmst.remove(ed.dest);
     cost=cost+ed.cost;
     mst.add(ed.dest);
     qu.clear();

        }
     



   System.out.println("total cost is: "+cost);


    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the total number of vertices:");
     int ver=Integer.parseInt(obj.readLine());
     ArrayList<Ed> graph[]=new ArrayList[ver];
     for(int i=0;i<ver;i++){
        graph[i]=new ArrayList();
     }
     graph[0].add(new Ed(0,3,30));
     graph[0].add(new Ed(0,2,15));
     graph[0].add(new Ed(0,1,10));
     graph[1].add(new Ed(1,0,10));
     graph[1].add(new Ed(1,3,40));
     graph[2].add(new Ed(2,0,15));
     graph[2].add(new Ed(2,3,50));
     graph[3].add(new Ed(3,0,30));
     graph[3].add(new Ed(3,1,40));
     graph[3].add(new Ed(3,2,50));

     boolean vis[]=new boolean[ver];
     Arrays.fill(vis,false);
     HashSet<Integer> nonmst=new HashSet<>();
     HashSet<Integer> mst=new HashSet<>();
     for(int i=0;i<ver;i++){
        nonmst.add(i);
     }
     PriorityQueue<Ed> qu=new PriorityQueue<>();
     primsalgo(graph, vis, qu, mst, nonmst);







    }
    
}
