package DAY_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class GraphDataStructure {
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
            System.out.print(vertex + "->");
            for (int nbr : hm.get(vertex)) {
                System.out.print(nbr + ",");
            }
            System.out.println();
        }
    }

    boolean pathExists(int source, int destination) {
        Set<Integer> visited = new HashSet<>();
        LinkedList<Integer> queue = new LinkedList<>();

        visited.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination) {
                return true;
            }

            for (int neighbor : hm.getOrDefault(current, new LinkedList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        GraphDataStructure gs = new GraphDataStructure();
        Scanner sc = new Scanner(System.in);
        int n = 5;

        System.out.println("Add Vertex: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            gs.addVertex(x);
        }

        System.out.println("Add Edges: ");
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            gs.addEdges(u, v);
        }

        System.out.println("Graph representation:");
        gs.display();

        System.out.println("Enter source and destination to check path:");
        int source = sc.nextInt();
        int destination = sc.nextInt();

        boolean pathExists = gs.pathExists(source, destination);
        if (pathExists) {
            System.out.println("Path exists between " + source + " and " + destination);
        } else {
            System.out.println("Path does not exist between " + source + " and " + destination);
        }

        sc.close();
    }
}