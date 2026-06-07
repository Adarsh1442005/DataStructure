import java.util.*;
import java.io.*;
public class jobsequencing {
    public static int jobseq(int jobs[][]){
          int maxprofit=0;
          int deadline=0;
          Arrays.sort(jobs,Comparator.comparingDouble(o->o[1]));
          for(int i=jobs.length-1;i>=0;i--){
            if(jobs[i][0]>deadline){
                maxprofit=maxprofit+jobs[i][1];
                deadline=jobs[i][0];
            }
          }
          return maxprofit;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of jobs:");
        int num=Integer.parseInt(obj.readLine());
        int jobs[][]=new int[num][2];
        for(int i=0;i<jobs.length;i++){
            System.out.println("enter the deadLine:");
               jobs[i][0]=Integer.parseInt(obj.readLine());
            System.out.println("enter the profit:");
            jobs[i][1]=Integer.parseInt(obj.readLine());

        }
        int maxprofit=jobseq(jobs);
        System.out.println("maximum profir that we can achieve is :"+maxprofit);







    }
    
}
