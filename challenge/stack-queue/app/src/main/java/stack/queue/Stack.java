package stack.queue;

public class Stack {
    Node top;
    int length;
    public Stack() {
        this.top=null;
        this.length=0;
    }
    public Stack(int value) {
        this.top=new Node(value);
    }



    public void push(int value){
        this.length++;
        Node newNode= new Node(value);
        newNode.next=this.top;
        this.top=newNode;


    }
    public int pop() {
        if (this.top == null) {
            System.out.println("the stack is empty");
            throw new NullPointerException();
        }
        int value = this.top.value;
        this.top = this.top.next;
        this.length--;
        return value;

    }
    public int peek(){
        if (this.top == null) {
            System.out.println("the stack is empty");
            throw new NullPointerException();
        }
        int value = this.top.value;
        return value;

    }
    public boolean isEmpty(){
        if(this.top==null)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        Node pointer =this.top;
        String str="";
        while (pointer !=null){
            str=str+ "{ "+pointer.value+" } ->";
            pointer = pointer.next;
        }
        str=str+"NULL";
        return str;

    }



}
