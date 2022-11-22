package PracticeDSA;

import java.util.ListIterator;
import java.util.Stack;

public class DeleteMiddleElementOfStack {

    public static Stack<Integer> midElement(Stack<Integer> s,int size){
        if(size==0){
            return s;
        }
        int k = size/2+1;
        middleElement(s,k);
        return s;
    }


    public  static void  middleElement(Stack<Integer>s ,int k){
        if (k==1){
            s.pop();
            return;
        }
        int temp = s.pop();
        middleElement(s,k-1);
        s.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        s.push(3);
        midElement(s,s.size());

        ListIterator<Integer> iterator = s.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
