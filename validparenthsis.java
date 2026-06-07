import java.util.*;
import java.io.*;
public class validparenthsis {
    public static boolean valid(Stack<Character> st,String str){
            for(int i=0;i<str.length();i++){
                if((str.charAt(i)=='{') || str.charAt(i)=='('|| str.charAt(i)=='[' ){
                    st.push(str.charAt(i));

                }
                else if(!st.isEmpty()&&((str.charAt(i)=='}'&& st.peek()=='{')||(str.charAt(i)==']' && st.peek()=='[') || (str.charAt(i)==')' && st.peek()=='('))){
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
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str=obj.readLine();
        Stack<Character> st=new Stack();
        if(valid(st, str)){
            System.out.println("provided string is valid");
        }
        else{
            System.out.println("provided string is invalid");
        }




    }
    
}
