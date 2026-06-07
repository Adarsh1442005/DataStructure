package HashMap;
import java.util.*;
import java.io.*;
class Node{
int data ;
Node left;
Node right;
public Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
}

}
class Pair{
 Node node;
 int hd;
 public Pair(Node node,int hd){
    this.node=node;
    this.hd=hd;
 }

}

public class bottomview {
    public static void bottom(Node root){
    Queue<Pair> qu=new LinkedList<>();
    HashMap<Integer,Integer> map=new HashMap();
    qu.add(new Pair(root,0));
    while(!qu.isEmpty()){
     Pair p=qu.poll();
     Node nd=p.node;
     int hd=p.hd;
     map.put(hd,nd.data);
     if(nd.left!=null){
        qu.add(new Pair(nd.left,hd-1));
     }
     if(nd.right!=null){
        qu.add(new Pair(nd.right,hd+1));
     }
    }
    Set<Integer> set=map.keySet();
    for(int i:set){
        System.out.println(map.get(i));
    }





    }
    
    public static void main(String args[]) throws IOException{
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       Node root=new Node(20);
       root.left=new Node(8);
       root.left.left=new Node(5);
       root.left.right=new Node(3);
       root.left.right.left=new Node(10);
       root.left.right.right=new Node(14);
       root.right=new Node(22);
       root.right.right=new Node(25);
       bottom(root);

    }
}
