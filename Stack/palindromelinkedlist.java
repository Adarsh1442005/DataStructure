package Stack;
import java.util.*;
import java.io.*;
class Node{
    char data;
    Node next;
    public Node(char data){
        this.data=data;
        this.next=null;
    }
}

public class palindromelinkedlist {
    public static boolean ispalindrome(Node root){
       Node rootc=root;
       int count=0;
       while(rootc!=null){
        count++;
        rootc=rootc.next;

       }
       Stack<Character> st=new Stack();
       if(count%2==0){
        rootc=root;

        for( int i=1;i<=count/2;i++){
                st.push(rootc.data);
                rootc=rootc.next;





        }
        for(int i=count/2+1;i<=count;i++){
            if( st.peek()==rootc.data){
                rootc=rootc.next;
                st.pop();
            }
            else{
                return false;
            }
          

        }
        if(st.isEmpty()){
            return true;
        }
        return false;


       }
       else{
        rootc=root;
        for(int i=0;i<count/2;i++){
            st.push(rootc.data);
            rootc=rootc.next;

        }
        rootc=rootc.next;
        for(int i=count/2+1;i<count;i++){
            if(st.peek()==rootc.data){
                st.pop();
                rootc=rootc.next;
            }
            else{
                return false;
            }

        }
        if(st.isEmpty()){
            return true;
        }
        return false;





       }

      




    


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(obj.readLine());
        Node root=null;
        Node rootc=root;
        for(int i=0;i<size;i++){
            char a=obj.readLine().charAt(0);
            if(i==0){
                root=new Node(a);
                rootc=root;
                continue;
            }
            rootc.next=new Node(a);
            rootc=rootc.next;


          

        }
       if(ispalindrome(root)){
        System.out.println("yes this linked list is palindrome");
       }
       else{
        System.out.println("this linked list is not palindroem");
       }


        








    }

    
}
