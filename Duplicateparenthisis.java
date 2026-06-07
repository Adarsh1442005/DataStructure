import java.util.*;
import java.io.*;
public class Duplicateparenthisis {
    public static boolean parenthsis(Stack<Character> st,String exp){
          for(int i=0;i<exp.length();i++){
           char a=exp.charAt(i);
            
              if(a!='}' && a!=']' && a!=')'){
                  st.push(a);
              }
              else if((a==')'&& st.peek()=='(')|| (a=='}'&& st.peek()=='{')|| (a==']' && st.peek()=='[')){
                return true;
            }
              else{
                while((st.peek()!='(' && a==')')|| (st.peek()!='[' && a==']')|| (st.peek()!='{'&& a=='}')){
                    st.pop();
                }
                st.pop();
              }



                              
   } 
   return false;


    }
    public static void main(String args[]) throws IOException{
            BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the string");
            String exp=obj.readLine();
            Stack<Character> st=new Stack();
            if(parenthsis(st, exp)){
                System.out.println("the expression is duplicate");
                return;
            }
            System.out.println("expression is not duplicate");


    }
    
}
