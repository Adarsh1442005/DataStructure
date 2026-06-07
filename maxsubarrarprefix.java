import java.util.*;
import java.io.*;
public class maxsubarrarprefix {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                if(i==0){
                    currsum=prefix[j];

                }
                else{
                    currsum=prefix[j]-prefix[i-1];
                }
                if(currsum>max){
                    max=currsum;
                    start=i;
                    end=j;
                }

            }
        }
        System.out.println("maximum subarray sum is "+max+"start with"+start+"and end with"+end);

    }
    
}
