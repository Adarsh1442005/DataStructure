import java.util.*;
import java.io.*;
public class maximumsubstring {
    public static int balancedpart(String str,int n){
    if(n==0){
        return n;
    }
     int l=0;
     int r=0;
     int ans=0;
     for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='L'){
            l++;
        }
        else if(str.charAt(i)=='R'){
            r++;
        }
        if(l==r){
            ans++;
        }
     }
     return ans;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str=obj.readLine();
        int ans=balancedpart(str,str.length());
        System.out.println("the length  of the maximum substrings are:"+ans);
    }
    
}
