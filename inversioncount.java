import java.util.*;
import java.io.*;
public class inversioncount {
    static int inversion=0;
    public static void divide(int arr[],int start_ind,int end_ind){
        if(start_ind>=end_ind){
            return;
        }
        int mid=(start_ind+end_ind)/2;
        divide(arr,start_ind,mid);
        divide(arr,mid+1,end_ind);
        merge(arr,start_ind,mid,end_ind);


    }
    public static void merge(int arr[],int low,int mid,int high){
        int lowc=low;
        int midc=mid+1;
        int merge_arr[]=new int[(high-low)+1];
        int j=0;
        while(lowc<=mid && midc<=high){
            if(arr[lowc]<arr[midc]){
                merge_arr[j]=arr[lowc];
                lowc++;
                j++;
            }
            else{
                merge_arr[j]=arr[midc];
                inversion=inversion+(mid-lowc)+1;
                j++;
                midc++;


            }
        }
        while(lowc<=mid){
            merge_arr[j]=arr[lowc];
            j++;
            lowc++;
        }
        while(midc<=high){
            merge_arr[j]=arr[midc];
            midc++;
            j++;

        }
        j=0;
        for(int i=low;i<=high;i++){
            arr[i]=merge_arr[j];
            j++;

        }



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the size of the array ");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
        divide(arr,0,arr.length-1);
        System.out.println("total inversion count is: "+inversion);

    }
    
}
