package challenge;

import java.util.ArrayList;
import java.util.List;

public class NodeKarryTree <T> {
    public NodeKarryTree parent;
    public List<NodeKarryTree> children;
    public T value;
    int maxNrOfChildren;

    public NodeKarryTree(T value) {
        this.value = value;
        children  = new ArrayList<>(maxNrOfChildren);
    }
    public List<NodeKarryTree> getChildren() {
        return children;
    }

    public void addChild( NodeKarryTree child) {
        this.children.add(child);
    }
}
