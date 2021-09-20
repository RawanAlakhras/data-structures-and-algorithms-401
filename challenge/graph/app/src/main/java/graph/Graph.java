package graph;

import java.util.*;

public class Graph {
    public final Map<String , Map<String , Integer>>nodes = new HashMap<>();

    public void addNode(String value){
        nodes.put(value , new HashMap<>());


    }

    public void addEdge(String node1 , String node2 , int weight){

        if (!nodes.containsKey(node1))
            addNode(node1);

        if (!nodes.containsKey(node2))
            addNode(node2);

        nodes.get(node1).put(node2 , weight);
        nodes.get(node2).put(node1 , weight);
    }
    public Set<String> getNodes(){
        return nodes.keySet();
    }
    public Set<String> getNeighbours(String node) {
        return nodes.get(node).keySet();
    }
    public int getSize(){
        return this.nodes.size();
    }

    public List<String> breadthFirst(String root){
        Queue<String> visited = new LinkedList<>();
        Queue<String> list = new LinkedList<>();
        List<String> traversed = new ArrayList<>();

        list.add(root);
        visited.add(root);

        while (!list.isEmpty()){
            String node = list.remove();
            traversed.add(node);
            for (String singleNode : getNeighbours(node)){
                if (!visited.contains(singleNode)){
                    visited.add(singleNode);
                    list.add(singleNode);
                }
            }
        }
        return traversed;
    }

    // challenge 37

    public String businessTrip(String[] cities){
        int totalCost = 0;
        for (int i = 0; i < cities.length-1; i++) {
            if (getNeighbours((String) cities[i]).contains(cities[i+1])){
                totalCost += nodes.get(cities[i]).get(cities[i+1]);
            }
            else {
                totalCost = 0;
                break;
            }

        }
        if(totalCost == 0){
            return "False, "+ "$" + totalCost ;
        }
        else {
            return "True, " + "$"+ totalCost ;
        }
    }
}
