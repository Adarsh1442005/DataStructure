import java.util.*;
import java.io.*;
public class Activityselection {
    static ArrayList<Integer> activity=new ArrayList();
    public static int  activity(int arr[][]){
       Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
      
       int max=1;
       int last=arr[0][2];
       activity.add(arr[0][0]);
       for(int i=1;i<arr.length;i++){
        if(arr[i][1]>last){
            max++;
            last=arr[i][2];
            activity.add(i);

        }
       }
       return max;




    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of activities");
        int size=Integer.parseInt(obj.readLine());
        int arr[][]=new int[size][3];
        for(int i=0;i<arr.length;i++){
           arr[i][0]=i;
           System.out.println("enter the start time");
           arr[i][1]=Integer.parseInt(obj.readLine());
           System.out.println("enter the end time ");
           arr[i][2]=Integer.parseInt(obj.readLine());

        }
       int max= activity(arr);
        System.out.println("maximum activity we can perform is:"+max);
        System.out.println("the activities are:");
        for(int i:activity){
            System.out.println("activity: "+i);
        }
    }
}
