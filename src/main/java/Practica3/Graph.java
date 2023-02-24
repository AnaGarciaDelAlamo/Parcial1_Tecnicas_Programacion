package Practica3;

import jdk.jfr.StackTrace;

import java.util.*;

//Intentado con copilot pero hemos dado grafos

public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V vertex) {
        if (adjacencyList.containsKey(vertex)) {
            return false;
        }
        adjacencyList.put(vertex, null);
        return true;
    }

    public boolean addEdge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1) || !adjacencyList.containsKey(v2)) {
            return false;
        } else {
            adjacencyList.get(v1).add(v2);
        }
        return true;
    }

    public Set<V>obtainAdjacents(V v){
        return adjacencyList.get(v);
    }

    public boolean containsVertex(V v){
         adjacencyList.containsKey(v);
         return true;
    }

    public String toString(){
        return adjacencyList.toString();
    }

    public List<V> onePath(V v1, V v2){
        List<V> path = new ArrayList<>();
        path.add(v1);
        if(v1.equals(v2)){
            return path;
        }
        for(V v: adjacencyList.get(v1)){
            path.addAll(onePath(v, v2));
        }
        return path;
    }


    public void onePathFindsAPath(){
        System.out.println("\nTest onePathFindsAPath");
        System.out.println("--------------------------");

        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(1, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 4);

        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(6);
        expectedPath.add(4);

        assertEqual(expectedPath, g.onePath(1, 4));
    }

    private void assertEqual(List<Integer> expectedPath, List<Integer> onePath) {

    }
}


