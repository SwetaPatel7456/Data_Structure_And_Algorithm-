package PracticeDSA;

import java.util.Stack;

import static java.lang.System.exit;

public class Stack2 {

    private class Node {
        int data;
        Node link;
    }
    Node top;
    public Stack2(){
        this.top = null;
    }
    public void push(int x){
        Node node = new Node();
        if(node ==null){
            System.out.println("Stack overflow");
            return;
        }
        node.link = top;
        node.data = x;
        top = node;
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        top = top.link;

    }
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
    public void reverseWithoutUsingSpace() {

        Node current,previous,successor;
        current = previous = this.top;
        current =current.link;
        previous.link = null;

        while (current!=null){
            successor = current.link;
            current.link = previous;
            previous = current;
            current = successor;
        }
        this.top = previous;
    }

    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(2);
        s.push(5);
        s.push(7);
        s.push(2);
        s.push(3);
        s.push(0);
        s.pop();
        //s.display();
        s.reverseWithoutUsingSpace();
        s.display();

    }
}

