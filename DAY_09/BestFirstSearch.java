package DAY_09;

import java.util.*;

public class BestFirstSearch {
    HashMap<Integer, LinkedList<Integer>> hm = new HashMap<>();

    void addVertex(int u) {
        hm.putIfAbsent(u, new LinkedList<>());
    }

    void addEdges(int u, int v) {
        addVertex(u);
        addVertex(v);
        hm.get(u).add(v);
        hm.get(v).add(u); 
    }

    void display() {
        for (int vertex : hm.keySet()) {
            System.out.print(vertex + " -> ");
            for (int nbr : hm.get(vertex)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
    }

    void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal starting from " + start + ": ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : hm.getOrDefault(current, new LinkedList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BestFirstSearch bfsGraph = new BestFirstSearch();
        Scanner sc = new Scanner(System.in);
        int n = 5;

        System.out.println("Add Vertex:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            bfsGraph.addVertex(x);
        }

        System.out.println("Add Edges:");
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            bfsGraph.addEdges(u, v);
        }

        System.out.println("Graph Representation:");
        bfsGraph.display();

        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();
        bfsGraph.bfs(start);

        sc.close();
    }
}
