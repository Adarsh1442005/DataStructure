import java.util.*;
import java.io.*;
class Node1{
char c;
Node1 arr[]=new Node1[26];
public Node1(char c){
    this.c=c;
}
public Node1(){

}
boolean last=false;
int freq=0;





}
public class prefixproblem {
    public static List<String> search(String arr[],Node1 root){
        List<String> li=new ArrayList();

    for(int i=0;i<arr.length;i++){
        String str=arr[i];
        Node1 curr=root;
        int j=0;
        String ans="";
        
        while(j<arr.length){
            char a=str.charAt(j);
            int index=a-'a';
            curr=curr.arr[index];
            if(curr.freq==1){
                ans=ans+Character.toString(a);
                li.add(ans);
                break;

            }
            ans=ans+Character.toString(a);
            j++;

        }

    }
return li;
    



    }
    public static Node1 insert(String arr[]){
        Node1 root=new Node1();

       for(int i=0;i<arr.length;i++){
        String str=arr[i];
        int j=0;
        Node1 curr=root;
        while(j<str.length()){
            
            char a=str.charAt(j);
            int index=a-'a';
            if(curr.arr[index]==null){
                curr.arr[index]=new Node1(a);
                curr=curr.arr[index];
                curr.freq=1;
                j++;

            }
            else{
                curr=curr.arr[index];
                curr.freq=curr.freq+1;
                j++;
            }
        }
        curr.last=true;
       }


    return root;

    }

    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the total number of String ");
      int size=Integer.parseInt(obj.readLine());
       String arr[]=new String [size];
       for(int i=0;i<arr.length;i++){
        arr[i]=obj.readLine();
       }
       Node1 root=insert(arr);
       System.out.println("prefixes are:");
       List<String> li=search(arr, root);
       for(String str:li){
        System.out.println(str);
       }



    }
}
