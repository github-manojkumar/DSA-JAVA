package DSA_Java.Graphs.Implementation.AdjacencyList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class GraphDS {

    private int v;//no of vertices in a graph

    private LinkedList<Integer>[] adjList;

    public GraphDS(int v){
        this.v=v;
        this.adjList=new LinkedList[v];

        //initializing an empty linked list at every index
        for(int i=0;i<v;i++){
            this.adjList[i]=new LinkedList<>();
        }
    }

    public void addEdge(int u,int v,boolean biDirectional){
        /**
         * If the direction, i.e., biDirectional is true, then we have to add u->v and v->u
         * If the direction, i.e., biDirectional is false,then we have to add only u->v
         * Here u->v relation is common
         */
        this.adjList[u].add(v); // Case: Bi-directional and Uni-directional

        if(biDirectional){
            this.adjList[v].add(u);//Case: Bi-directional only
        }

    }

    public void display(){

        for(int i=0;i<this.v;i++){

            System.out.print(i+" -> {");

            int size=adjList[i].size();
            for(int node:this.adjList[i]){
                System.out.print(" "+node);
                if(size>1){
                    System.out.print(",");
                }
                size--;
            }

            System.out.print(" }");
            System.out.println();
        }

    }

    /**
     * Depth-first Search in Graph
     * @param src Starting node
     */
    public void dfs(int src){

        Map<Integer,Boolean> visited=new HashMap<>();
        dfsHelper(src,visited);
        System.out.println();
    }

    /**
     *
     * @param src current vertex or node
     * @param visited Hashmap to track if the current vertex or node is visited or not
     */
    private void dfsHelper(int src,Map<Integer,Boolean> visited){
        visited.put(src,true);
        System.out.print(src+" ");

        for(Integer neighbour:adjList[src]){
            if(!visited.containsKey(neighbour)){
                dfsHelper(neighbour,visited);
            }
        }

    }

    /**
     * Breadth-first Search in graph
     * @param src starting vertex or node in the graph
     */
    public void bfs(int src){

        Queue<Integer> q=new LinkedList<>();
        HashMap<Integer,Boolean> visited=new HashMap<>();

        q.add(src);
        visited.put(src,true);

        while(!q.isEmpty()){

            int node=q.poll();
            System.out.print(node+" ");

            for(int neighbour:adjList[node]){
                if(!visited.containsKey(neighbour)){
                    q.add(neighbour);
                    visited.put(neighbour,true);
                }
            }
        }
        System.out.println();
    }

    public int connectedComponents(){

        int components=0;
        Map<Integer,Boolean> visited=new HashMap<>();

        for(int i=0;i<this.v;i++){
            if(!visited.containsKey(i)){
                dfsHelper(i,visited);
                components++;
            }
        }

        return components;
    }

}
