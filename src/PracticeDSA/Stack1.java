package PracticeDSA;

public class Stack1 {
    int size=0;
    StackNode root=null;

    public StackNode createNode(int x){

        StackNode node = new StackNode(x);
        return node;
    }
    public void push(int x){
        StackNode newNode = createNode(x);
        if(root ==null){
            root= newNode;
            return;
        }
        else if (root.next ==null){
            root.next = newNode;
            return;
        }
        else {
            StackNode temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public StackNode pop() {

        StackNode temp = root;
        StackNode a = null;
        if (temp == null) {
            return null;
        } else if (temp.next == null) {
             a = root;
            root = null;
        } else {
            while (temp.next.next!= null) {
                     temp = temp.next;
            }
             a = temp.next;
            temp.next=null;
        }
        return a;
    }

    public void reverse(StackNode root){


    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(5);
        s.push(7);
        s.push(2);
        s.push(3);
        s.push(0);
        StackNode ss = s.pop();
        System.out.println(ss.value+ " " + ss.next);
        s.pop();
        s.pop();
        s.pop();
        StackNode temp = s.root;

        while(temp.next!=null){
            System.out.println(temp.value);
            temp=temp.next;
            if(temp.next==null){
                System.out.println(temp.value);
            }
        }

    }



}
