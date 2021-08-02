package linked.list;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;

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

    public void append(int value){
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
    public void insertBefore(int value,int newValue){
        this.length++;
        boolean b=false;
        Node newNode=new Node(newValue);
        Node pointer=this.head;
        if(this.head.value == value){
            newNode.next=this.head;
            this.head=newNode;
        }else {
            while (pointer.next !=null){
                if(pointer.next.value== value){
                    b=true;
                    newNode.next=pointer.next;
                    pointer.next=newNode;
                    break;
                }
                pointer=pointer.next;

            }
            if(!b){
                System.out.println("No change, method exception");
                this.length--;
            }
        }
    }
    public void insertAfter(int value,int newValue){
        this.length++;
        boolean b=false;
        Node newNode=new Node(newValue);
        Node pointer = this.head;
        while (pointer != null){
            if(pointer.value == value){
                newNode.next=pointer.next;
                pointer.next=newNode;
                b=true;
                break;
            }
            pointer=pointer.next;
        }
        if(!b){
            System.out.println("No change, method exception");
            this.length--;
        }


    }
    public void insert(int value){
        this.length++;
        Node newNode= new Node(value);
        newNode.next=this.head;
        this.head=newNode;

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

    public Object kth(int k){
        if(k >= this.length ){
            System.out.println("k is greater than the length of the linked list");
            return null;
        }
        else if(k<0){
            System.out.println("k should be a positive integer");
            return null;
        }else {
            ArrayList <Integer>arr=new ArrayList<>();
            Node pointer=this.head;
            while (pointer != null){
                arr.add(pointer.value);
                pointer=pointer.next;
            }
            return arr.get(arr.size()-k-1);
        }

    }

}
