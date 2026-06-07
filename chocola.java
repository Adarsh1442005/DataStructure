import java.util.*;
import java.io.*;
public class chocola {
    public static int mincost(Integer vertical[],Integer horizontal[]){
              Arrays.sort(vertical,Collections.reverseOrder());
              int v=0;
              int h=0;
              int hc=1;
              int vc=1;
              int cost=0;
              while(v<vertical.length && h<horizontal.length){
                  if(vertical[v]<=horizontal[h]){
                    //horizontal cut
                    cost=cost+(vc*horizontal[h]);
                    h++;
                    hc++;

                  }
                  else{
                    //vertical cut
                    cost=cost+(hc*vertical[v]);
                    vc++;
                    v++;
                  }





              }
              while(v<vertical.length){
                  cost=cost+(hc*vertical[v]);
                    vc++;
                    v++;

              }
              while(h<horizontal.length){
                 cost=cost+(vc*horizontal[h]);
                    h++;
                    hc++;

              }
return cost;

    }
public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number of vertical lines: ");  
    int vsize=Integer.parseInt(obj.readLine());
    System.out.println("enter the horizontal size");
    int hsize=Integer.parseInt(obj.readLine());
    Integer vertical[]=new Integer [vsize];
    Integer horizontal[]=new Integer [hsize];
    System.out.println("enter the vertical line");
    for(int i=0;i<vertical.length;i++){
        vertical[i]=Integer.parseInt(obj.readLine());
    }
    System.out.println("enter the horizontal line:");
    for(int i=0;i<horizontal.length;i++){
        horizontal[i]=Integer.parseInt(obj.readLine());
    }
    int cost=mincost(vertical, horizontal);
   System.out.println("the minimum cost is:"+cost);

}
    
}
