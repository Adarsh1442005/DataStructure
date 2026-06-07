import java.util.*;
import java.io.*;
public class Lexicographically {
    public static String lexco(char arr[],int n,int k){
        char ans[]=new char[n];
        for(int i=0;i<n;i++){
            ans[i]='a';
        }
        int remaining=k-n;
        int j=n-1;

        for(int i=n-1;i>=0;i--){
            if(remaining>26){
                remaining=(remaining-26)+1;
                ans[i]='z';

                
            }
            else if(remaining<26){
                remaining=remaining+1;
                ans[i]=arr[remaining-1];
                remaining=0;
                break;

            }
            
        }
        String fin=new String(ans);
        return fin;
         
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of N:");
        int n=Integer.parseInt(obj.readLine());
        System.out.println("enter the value of K:");
        int k=Integer.parseInt(obj.readLine());
        
        char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println("the smallest String is :"+lexco(arr, n, k));



    }
}
