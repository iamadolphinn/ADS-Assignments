import java.util.*;

// Graph class
class Graph1 {

    // Adjacency List
    private Map<String, List<String>> adjList;

    // Constructor
    public Graph1() {
        adjList = new HashMap<>();
    }

    // Add vertex
    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Add undirected edge
    public void addEdge(String u, String v) {
        addVertex(u);
        addVertex(v);

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // DFS using recursion
    public void DFS(String start) {
        Set<String> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    // Helper method for DFS
    private void dfsHelper(String vertex, Set<String> visited) {

        visited.add(vertex);
        System.out.print(vertex + " ");

        for (String neighbor : adjList.get(vertex)) {

            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // BFS using queue
    public void BFS(String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            String vertex = queue.poll();
            System.out.print(vertex + " ");

            for (String neighbor : adjList.get(vertex)) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Graph1 graph = new Graph1();

        // Add edges
        graph.addEdge("B", "A");
        graph.addEdge("C", "A");
        graph.addEdge("D", "B");
        graph.addEdge("E", "A");
        graph.addEdge("C", "B");

        // Starting node = C
        String startNode = "C";

        // Run DFS and BFS
        graph.DFS(startNode);
        graph.BFS(startNode);
    }
}