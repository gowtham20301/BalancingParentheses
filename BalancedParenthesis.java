package Demo;
import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args)
    {
        String a="[[]]";
        Stack<Character> st= new Stack<Character>();
        char c;
        for(int i=0;i<a.length();i++)
        {
            c = a.charAt(i);
            if(c=='('|| c=='{'|| c=='[')
            {
                st.push(c);
            }
            else if(!st.isEmpty() &&(
                    (c==')'&&st.peek()=='(')||
                    (c=='}'&&st.peek()=='{') ||
                    ( c==']'&& st.peek()=='[')))
            {
                   st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        if(st.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("UnBalanced Parentheses");
        }
    }
}