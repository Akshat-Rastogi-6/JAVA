import java.util.Scanner;
import java.util.Stack;

class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        System.out.println("Stack" + st);
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);

        st.pop();

        System.out.println(st.peek());

        System.out.println("Stack" + st);
    }
}
