package challenge;

public class BinarySearchTree extends BinaryTree<Integer>{


    public void Add(int value){
      this.root = recursionAdd(this.root,value);
    }

    public Node recursionAdd(Node node,int value){
        if(node ==null){
            Node newNode =new Node(value);
            return newNode;
        }
        if(value > (int)node.value){
            node.right= recursionAdd(node.right,value);
        }else {
            node.left= recursionAdd(node.left,value);
        }
        return node;

    }

    public boolean contains(int key){
        Node node = this.root;
        node = recursionContains(node,key);
        if(node != null)
            return true;
        else
            return false;

    }
    public Node recursionContains(Node node ,int key){
        if(node ==null || (int)node.value==key)
            return node;
        if(key > (int)node.value)
           return recursionContains(node.right,key);

        return recursionContains(node.left,key);

    }


}
