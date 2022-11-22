package PracticeDSA;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    static Stack<Integer> st = new Stack<>();

    public void reverse(){
        if(st.size()>0){
            int x = st.peek();
            st.pop();
            reverse();
            insert_At_Bottom(x);

        }
    }

    private void insert_At_Bottom(int x) {
        if(st.empty()){
            st.push(x);
            return;
        }
        else{
             int a = st.peek();
             st.pop();
             insert_At_Bottom(x);
             st.push(a);
        }
    }

    public static void main(String[] args) {
         st.push(1);
         st.push(2);
         st.push(3);


    }


}
