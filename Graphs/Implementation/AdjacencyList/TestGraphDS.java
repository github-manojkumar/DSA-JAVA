package DSA_Java.Graphs.Implementation.AdjacencyList;

public class TestGraphDS {

    public static void main(String[] args) {

        GraphDS graph=new GraphDS(8);

        graph.addEdge(0,1,true);
        graph.addEdge(1,3,true);
        graph.addEdge(1,2,true);
        graph.addEdge(0,2,true);
        graph.addEdge(4,5,true);
        graph.addEdge(6,7,true);

        graph.display();
        System.out.println();
        System.out.println("Connected Components => "+graph.connectedComponents());

    }
}
