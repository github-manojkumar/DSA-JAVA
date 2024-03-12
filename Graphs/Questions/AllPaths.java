package DSA_Java.Graphs.Questions;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 797
 */
public class AllPaths {
    private List<List<Integer>> result;
    private int target;
    private int[][] graph;

    private void dfs(int node, List<Integer> path){

        if(node==target){
            result.add(new ArrayList<Integer>(path));
            return;
        }

        for(int nextNode:graph[node]){

            path.add(nextNode);

            dfs(nextNode,path);

            path.remove(path.size()-1);

        }

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        this.result=new ArrayList<List<Integer>>();
        this.target=graph.length-1;
        this.graph=graph;

        List<Integer> path=new ArrayList<>();
        path.add(0);

        dfs(0,path);

        return this.result;
    }
}
