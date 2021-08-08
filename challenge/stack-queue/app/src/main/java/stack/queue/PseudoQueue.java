package stack.queue;

public class PseudoQueue {
    Stack stack1;
    Stack stack2;

    public PseudoQueue() {
        stack1=new Stack();
        stack2=new Stack();
    }

    public void enqueue(int value){
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
            //stack1.pop();
        }

        // Push item into stack1
        stack1.push(value);

        // Push everything back to stack1
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
            //stack2.pop();
        }
    }

    @Override
    public String toString() {
        return "PseudoQueue{" + stack1 +'}';
    }

    public int dequeue() throws Exception {
        if(stack1.isEmpty()){
            //System.out.println("the Queue is empty");
            throw new Exception("you can not delete :the queue is empty");
        }
        int value=stack1.pop();
        return value;
    }
}
