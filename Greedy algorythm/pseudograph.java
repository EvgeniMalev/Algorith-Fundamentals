import java.util.*;

public class PseudoGraph {
    static class Edge {
        int to;
        boolean isSelfLoop;

        public Edge(int to, boolean isSelfLoop) {
            this.to = to;
            this.isSelfLoop = isSelfLoop;
        }

        @Override
        public String toString() {
            return isSelfLoop ? "(self-loop)" : "-> " + to;
        }
    }

    private Map<Integer, List<Edge>> adjacencyList;

    public PseudoGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int from, int to) {
        adjacencyList.putIfAbsent(from, new ArrayList<>());
        boolean isSelfLoop = from == to;
        adjacencyList.get(from).add(new Edge(to, isSelfLoop));
    }

    public void printGraph() {
        for (var entry : adjacencyList.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + ": ");
            for (Edge edge : entry.getValue()) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PseudoGraph graph = new PseudoGraph();

        graph.addEdge(1, 2);
        graph.addEdge(1, 2); 
        graph.addEdge(2, 3);
        graph.addEdge(3, 3); 
        graph.addEdge(3, 1);

   
        graph.printGraph();
    }
}
