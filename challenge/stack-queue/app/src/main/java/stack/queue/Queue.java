package stack.queue;

public class Queue {
    Node front;
    Node tail;
    int length;
    public Queue() {
        this.front=null;
        this.tail=null;
        this.length=0;
    }
    public void enqueue(int value){
        this.length++;
        Node newNode=new Node(value);
        if(tail == null){

            this.front=newNode;
            this.tail=newNode;
        }
        else {
            this.tail.next=newNode;
            this.tail=newNode;
        }

    }
    public int dequeue(){
        if (this.front == null) {
            System.out.println("the Queue is empty");
            throw new NullPointerException();
        }
        int value = this.front.value;
        this.front = this.front.next;
        this.length--;
        return value;
    }
    public int peek(){
        if (this.front == null) {
            System.out.println("the stack is empty");
            throw new NullPointerException();
        }
        int value = this.front.value;
        return value;
    }
    public boolean isEmpty(){
        if(this.front==null)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        Node pointer =this.front;
        String str="";
        while (pointer !=null){
            str=str+ "{ "+pointer.value+" } ->";
            pointer = pointer.next;
        }
        str=str+"NULL";
        return str;

    }
}
