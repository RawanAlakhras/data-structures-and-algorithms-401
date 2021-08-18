package challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KarryTree <T>{
    NodeKarryTree root;
    int k;
    ArrayList<T> output1;

    public KarryTree(int k) {
        this.k=k;
        this.root=null;
    }
    public void add(T value){
        NodeKarryTree newNode = new NodeKarryTree(value);
        if(this.root == null) {
            root = newNode;
        }
        else {
            Queue<NodeKarryTree> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                NodeKarryTree front =queue.poll();
                if(front.children.size() <this.k) {
                    front.addChild(newNode);
                }
                else {
                    queue.addAll(front.children);
                }
            }
        }

    }
    public ArrayList<T> breadthFirst(NodeKarryTree <T> node){
        this.output1.clear();
        Queue<NodeKarryTree> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            NodeKarryTree front =queue.poll();
            this.output1.add((T) front.value);
            for (int i=0;i<front.children.size();i++){
                queue.add((NodeKarryTree) front.children.get(i));
            }

        }

        return this.output1;
    }
}
