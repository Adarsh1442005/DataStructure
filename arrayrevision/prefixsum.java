package arrayrevision;
import java.util.*;
import java.io.*;

public class prefixsum {
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the size of the array");
     int size=Integer.parseInt(obj.readLine());
     int arr[]=new int[size];
     for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(obj.readLine());

     }
     int prefix[]=new int[arr.length];
     prefix[0]=arr[0];
    for (int i=1;i<arr.length;i++){
         prefix[i]=prefix[i-1]+arr[i];
    }
    int start=0;
    int end=0;
    int maxsum=prefix[0];
    for(int i=0;i<arr.length;i++){
       
        for(int j=i+1;j<arr.length;j++){
            int sum=0;
            if((i-1)<0){
               sum=prefix[j];
  
            }
            else{
                sum=prefix[j]-prefix[i-1];
            }
            if(sum>maxsum){
                maxsum=sum;
                start=i;
                end=j;
            }

        }
    }
    System.out.println("maxsubarray index start from"+start+"to"+end +"and maxum"+maxsum);



    }
    
}
