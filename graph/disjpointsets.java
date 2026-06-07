package graph;
import java.util.*;
import java.io.*;

public class disjpointsets {
   static int parent[];
   static int rank1[];
    public static int find(int x){

    if(x==parent[x]){
        return x;
    }
   return parent[x]=find(parent[x]);



    }
    public static void union(int a ,int b ){
    int parent_a=find(a);
    int parent_b=find(b);
    if(rank1[parent_a]==rank1[parent_b]){
        parent[parent_b]=parent_a;
        rank1[parent_a]++;
    }
    else if(rank1[parent_a]<rank1[parent_b]){
           parent[parent_a]=parent_b;
    }
    else{
        parent[parent_b]=parent_a;
    }

    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the  total elements:");
     int n=Integer.parseInt(obj.readLine());
     int par[]=new int[n];
     int rank[]=new int[n];
     for(int i=0;i<par.length;i++){
        par[i]=i;
        rank[i]=0;
     }
     parent=par;
     rank1=rank;
     union(1,3);
     union(2,4);
     union(3,6);
     union(1,4);
     union(1,5);
     System.out.println("group of "+find(4));






    }
    
}
