import java.util.*;
import java.io.*;
public class maxsubarray {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size ofnthe array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        int prefix[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                prefix[i]=arr[i];
                continue;
            }
            prefix[i]=prefix[i-1]+arr[i];
        }
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                if(i==0){
                    currsum=prefix[i];
                    if(currsum>maxsum){
                        maxsum=currsum;
                    }
                    continue;
                }
                currsum=prefix[j]-prefix[i-1];
                if(currsum>maxsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("maximum subarray sum is : "+maxsum);



    }
    
}
