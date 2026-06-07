import java.util.*;
import java.io.*;
public class uniquesubstring {
    static int count=0;
    static Node root=new Node();
    public static void insert(String str){
       Node curr=root;
       int j=0;
       while(j<str.length()){
        char a=str.charAt(j);
        int index=a-'a';
        if(curr.arr[index]==null){
            curr.arr[index]=new Node(a);
            curr=curr.arr[index];
            count++;
            j++;
        }
        else{
            curr=curr.arr[index];
            j++;
        }
       }






    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the String");
     String str=obj.readLine();
     for(int i=0;i<str.length();i++){
        String sub=str.substring(i);
        insert(sub);
     }
     System.out.println(count+1);





    }
    
}
