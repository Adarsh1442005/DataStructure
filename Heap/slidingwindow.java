package Heap;
import java.util.*;
import java.io.*;

public class slidingwindow {
    public static void slidingwindow(int arr[],int k){
    int i=0;
    int j=k-1;
    PriorityQueue<Integer> qu=new PriorityQueue(Collections.reverseOrder());
    for(int m=0;m<k;m++ ){
        qu.add(arr[m]);

    }
    int max=qu.remove();
    int ival=qu.remove();
    System.out.println(max);
    i++;
    j++;
    qu.clear();
    qu.add(max);
    qu.add(ival);
    while(j<=arr.length-1){
      
        if(arr[i-1]!=max){
           max=Math.max(max,arr[j]);
           System.out.println(max);
           int firstmax=qu.remove();
           int secondmax=qu.remove();
           max=Math.max(max,arr[j]);
           qu.clear();
           qu.add(max);

           
        }
        else{
          
                qu.remove();
                max=qu.remove();
              max=  Math.max(max,arr[j]);
              System.out.println(max);
              qu.add(arr[i]);
              qu.add(max);

            
        }
        i++;
        j++;


    }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        System.out.println("enter the length of the window:");
        int k=Integer.parseInt(obj.readLine());
        slidingwindow(arr,k);



    }
    
}
