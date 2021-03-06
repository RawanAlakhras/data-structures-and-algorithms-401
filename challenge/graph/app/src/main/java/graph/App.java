/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("Bob");
        graph.addNode("Alice");
        graph.addNode("Mark");
        graph.addNode("Rob");
        graph.addNode("Maria");
        graph.addEdge("Bob", "Alice",2);
        graph.addEdge("Bob", "Rob",4);
        graph.addEdge("Alice", "Mark",1);
        graph.addEdge("Rob", "Mark",1);
        graph.addEdge("Alice", "Maria",2);
        graph.addEdge("Rob", "Maria",3);
        System.out.println(graph.getNodes());
        System.out.println(graph.getSize());
        System.out.println(graph.getNeighbours("Rob"));

        System.out.println(graph.breadthFirst("Bob"));

        





    }
}
