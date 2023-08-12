package org.example.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>> adj
                = new ArrayList<>(V);

        for (int i = 0; i < V+1; i++)
            adj.add(new ArrayList<>());

        // Adding edges one by one
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        printGraph(adj);
        bfsDisconnected(adj, 6);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfsDisconnected(ArrayList<ArrayList<Integer> > adj, int V){
        boolean [] visited = new boolean[V+1];
        int islands = 0;
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                BFS(adj, i, visited);
                islands++;
            }
        }
        System.out.println("No of islands: "+islands);
    }
    static void BFS(ArrayList<ArrayList<Integer> > adj, int s, boolean[] visited)
    {

        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty() ){
            int u = queue.poll();
            System.out.println(u+" ");

            for(int v: adj.get(u)){

                if(visited[v] == false){
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj){

    }
}
