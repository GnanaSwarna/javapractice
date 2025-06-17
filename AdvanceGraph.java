package xyz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceGraph {

    static class Graph {
        private Map<Integer, List<Integer>> adjlist = new HashMap<>();

        void addEdge(int u, int v) {
            adjlist.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjlist.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        void printGraph() {
            for (int node : adjlist.keySet()) {
                System.out.print("Node " + node + " is connected to: ");
                for (int neighbor : adjlist.get(node)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph g1 = new Graph();
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 4);
        g1.addEdge(3, 4);  

        g1.printGraph();
    }
}
