import java.util.*;

// Graph class using Adjacency List
class Graph {

    // Adjacency list
    private Map<String, List<Edge>> adjList;

    // Edge class
    static class Edge {
        String vertex;
        int weight;

        Edge(String vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    // Constructor
    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Add an undirected weighted edge
    public void addEdge(String u, String v, int weight) {

        // Add vertices if they don't exist
        addVertex(u);
        addVertex(v);

        // Add edge in both directions (undirected graph)
        adjList.get(u).add(new Edge(v, weight));
        adjList.get(v).add(new Edge(u, weight));
    }

    // Print adjacency list
    public void printGraph() {
        for (String vertex : adjList.keySet()) {

            System.out.print(vertex + " -> ");

            for (Edge edge : adjList.get(vertex)) {
                System.out.print("(" + edge.vertex + ", " + edge.weight + ") ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        Graph graph = new Graph();

        // Add vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add edges
        graph.addEdge("B", "A", 11);
        graph.addEdge("C", "A", 13);
        graph.addEdge("D", "B", 5);
        graph.addEdge("E", "A", 7);
        graph.addEdge("C", "B", 3);

        // Print adjacency list
        graph.printGraph();
    }
}