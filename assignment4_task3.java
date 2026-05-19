import java.util.*;

// Edge class
class Edge {
    String destination;
    int weight;

    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

// Graph class
class Graph2 {

    private final Map<String, List<Edge>> adjList;

    public Graph2() {
        adjList = new HashMap<>();
    }

    // Add vertex
    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Add weighted edge
    public void addEdge(String source, String destination, int weight) {
        addVertex(source);
        addVertex(destination);

        adjList.get(source).add(new Edge(destination, weight));
        adjList.get(destination).add(new Edge(source, weight)); // Undirected graph
    }

    // Dijkstra Algorithm
    public void dijkstra(String start) {

        // Distance map
        Map<String, Integer> distance = new HashMap<>();

        // Previous node map (for path reconstruction)
        Map<String, String> previous = new HashMap<>();

        // Initialize distances
        for (String vertex : adjList.keySet()) {
            distance.put(vertex, Integer.MAX_VALUE);
        }

        distance.put(start, 0);

        // Priority Queue
        PriorityQueue<String> pq =
                new PriorityQueue<>(Comparator.comparingInt(distance::get));

        pq.add(start);

        while (!pq.isEmpty()) {

            String current = pq.poll();

            for (Edge edge : adjList.get(current)) {

                String neighbor = edge.destination;
                int newDistance = distance.get(current) + edge.weight;

                // Relaxation step
                if (newDistance < distance.get(neighbor)) {

                    distance.put(neighbor, newDistance);
                    previous.put(neighbor, current);

                    pq.add(neighbor);
                }
            }
        }

        // Print results
        System.out.println("Shortest paths from " + start + ":\n");

        for (String vertex : adjList.keySet()) {

            System.out.print("To " + vertex + " -> Distance: ");

            if (distance.get(vertex) == Integer.MAX_VALUE) {
                System.out.println("Unreachable");
                continue;
            }

            System.out.println(distance.get(vertex));

            // Print path
            System.out.print("Path: ");

            List<String> path = new ArrayList<>();
            String current = vertex;

            while (current != null) {
                path.add(current);
                current = previous.get(current);
            }

            Collections.reverse(path);

            System.out.println(String.join(" -> ", path));
            System.out.println();
        }
    }
}

// Main class
public class assignment4_task3 {

    public static void main(String[] args) {

        Graph2 g = new Graph2();

        // Example weighted graph
        g.addEdge("A", "B", 4);
        g.addEdge("A", "C", 2);
        g.addEdge("B", "C", 1);
        g.addEdge("B", "D", 5);
        g.addEdge("C", "D", 8);
        g.addEdge("C", "E", 10);
        g.addEdge("D", "E", 2);
        g.addEdge("D", "F", 6);
        g.addEdge("E", "F", 3);

        // Source node = B
        g.dijkstra("B");
    }
}