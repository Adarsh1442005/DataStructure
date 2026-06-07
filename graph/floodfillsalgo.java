package graph;
import java.util.*;
import java.io.*;


public class floodfillsalgo {
    public static void flood(int arr[][],int sr,int sc,int color,int oc,boolean vis[][]){
    
       if(sr>=arr.length|| sc>=arr[0].length|| sr<0 || sc<0){
        return ;
       }
       if(vis[sr][sc]){
         return ;
       }
        if(arr[sr][sc]!=oc){
        return;
       }
       
        arr[sr][sc]=color;
        vis[sr][sc]=true;
        flood(arr,sr,sc-1,color,oc,vis);
        flood(arr,sr,sc+1,color,oc,vis);
        flood(arr,sr-1,sc,color,oc,vis);
        flood(arr,sr+1,sc,color,oc,vis);






    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total number of rows:");
        int row=Integer.parseInt(obj.readLine());
        System.out.println("enter the total number of column:");
        int col=Integer.parseInt(obj.readLine());
        int arr[][]=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              arr[i][j]=Integer.parseInt(obj.readLine());
            }
        }
        System.out.println("enter the src row:");
        int sr=Integer.parseInt(obj.readLine());
        System.out.println("enter the src column:");
        int sc=Integer.parseInt(obj.readLine());
        boolean vis[][]=new boolean[row][col];
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[0].length;j++){
                vis[i][j]=false;
            }
        }
        System.out.println("enter the color to be fill:");
        int color=Integer.parseInt(obj.readLine());
    flood(arr, sr, sc, color, arr[sr][sc], vis);
    for(int i=0;i<arr.length;i++){
        System.out.println("");
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]);
        }
    }


    }
    
}
