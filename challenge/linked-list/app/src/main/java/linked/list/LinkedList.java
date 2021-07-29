package linked.list;

public class LinkedList {
    Node head;
    int length;

    public LinkedList() {
        this.head=null;
        this.length=0;
    }
    public LinkedList(int value) {
        this.head=new Node(value);
    }
    public void insert(int value){
        this.length++;
        Node newNode= new Node(value);
        Node pointer=this.head;
        if(this.head ==null){
            this.head = newNode;
        }
        else{
           while(pointer.next != null){
               pointer=pointer.next;
           }
           pointer.next=newNode;
        }


    }
    public Boolean includes(int value){
        Node pointer =this.head;
        if(this.head ==null){
            return false;
        }
        while(pointer !=null){
            if(pointer.value ==value){
                return true;
            }
            pointer=pointer.next;
        }
        return false;
    }
    public String tostring(){
        Node pointer =this.head;
        String str="";
        while (pointer !=null){
            str=str+ "{ "+pointer.value+" } ->";
            pointer = pointer.next;
        }
        str=str+"NULL";
        return str;


    }

}
