package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T>{

    Node root;
    ArrayList <T>output1;


    public BinaryTree(T root) {
        this.root =new Node(root);
        output1=new ArrayList<>();

    }
    public BinaryTree() {
        this.root = null;

        output1=new ArrayList<>();

    }
    public ArrayList<T> breadthFirst(Node <T> node){
        this.output1.clear();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node front =queue.poll();
            this.output1.add((T) front.value);
            if(front.left !=null)
                queue.add(front.left);
            if(front.right !=null)
                queue.add((Node) front.right);
        }

        return this.output1;
    }
    public  ArrayList<T> DFTpre(Node <T> node){
        this.output1.clear();
        DFTpreOrder( node);
        return this.output1;

    }
    public  ArrayList<T> DFTIn(Node <T> node){
        this.output1.clear();
        DFTinOrder( node);
        return this.output1;

    }
    public  ArrayList<T> DFTPost(Node <T> node){
        this.output1.clear();
        DFTpostOrder( node);
        return this.output1;

    }
    public void DFTpreOrder(Node <T> node){
        this.output1.add(node.value);

        if(node.left != null){
            DFTpreOrder(node.left);
        }
        if(node.right !=null){
            DFTpreOrder(node.right);
        }


    }

    public void DFTinOrder(Node <T> node){
        if(node.left !=null)
            DFTinOrder(node.left);

        this.output1.add(node.value);
        if(node.right !=null)
            DFTinOrder(node.right);


    }

    public void DFTpostOrder(Node <T> node){
        if(node.left != null)
            DFTpostOrder(node.left);
        if(node.right !=null)
            DFTpostOrder(node.right);
        output1.add(node.value);


    }
    public int maximumValue(){
        Node node =this.root;
        return recursionMax(node);


    }
    public int recursionMax(Node node){
        if (node == null)
            return Integer.MIN_VALUE;
        int max=(int)node.value;
        int lmax=(int)recursionMax(node.left);
        int rmax=(int)recursionMax(node.right);

        if(lmax >rmax)
            max=lmax;
        else if(rmax>lmax)
            max=rmax;
        return max;

    }
}
