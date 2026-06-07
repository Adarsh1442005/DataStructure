import java.util.*;
import java.io.*;
class Node{
    char  let;
    Node arr[]=new Node[26];
    public Node(char let){
        this.let=let;
    }
    public Node(){

    }
    boolean last=false;
}
public class insertion{
 public static boolean search(Node root,String str){
    if(str==null){
        return false;
    }
     int j=0;
     Node curr=root;
     while(j<str.length()){
      char a=str.charAt(j);
      int index=a-'a';
      if(curr.arr[index]==null){
        return false;
      }
      else{
        curr=curr.arr[index];
        j++;
      }


     


     }
     if(curr.last==true){
     return true;
     }
     return false;




 }

 public static Node insert(String arr[]){
     Node root=new Node();
     for(int i=0;i<arr.length;i++){
        String str=arr[i];
        Node curr=root;
        int j=0;
        while(j<str.length()){
            if(curr.arr[str.charAt(j)-'a']==null){
                curr.arr[str.charAt(j)-'a']=new Node(str.charAt(j));
                curr=curr.arr[str.charAt(j)-'a'];
                j++;
            }
            else{
                curr=curr.arr[str.charAt(j)-'a'];
                j++;
            }
        }
        curr.last=true;
        
     }
     return root;





}


public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the the total number of strings");
    int size=Integer.parseInt(obj.readLine());
    String arr[]=new String[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=obj.readLine();
    }
  Node root=  insert(arr);
  if(search(root, "any")){
    System.out.println("string exist");
  }
  else{
    System.out.println("string does not exist");
  }
}




}
