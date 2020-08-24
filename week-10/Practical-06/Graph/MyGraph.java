//Student ID: a1806522
//Student Name: Zhuofan Zhang
import java.util.LinkedList;

public class MyGraph {
    LinkedList adjListArray[];
    // You should initialise an empty graph in the constructor.
    public MyGraph() {
    }
    public void createGraph(int vertices) {
        adjListArray = new LinkedList[vertices];
        for(int i =0;i<vertices;i++) {
            adjListArray[i] = new LinkedList<Node>();
        }
    }
    // transform an adjacency matrix to an adjacency list

    public void matrixToList(int[][] matrix) {
        int v = matrix.length;

        createGraph(v);
        for(int i = 0;i<v;i++) {
            for(int j = 0;j<v;j++) {
                if(matrix[i][j] == 1) {
                    adjListArray[i].add(new Node(j));
                }
            }
        }
    }

    // Print out the adjacency list array
    public void displayAdjListArray() {
        if(adjListArray.length == 0) {
            System.out.println("\nNo Nodes in the Graph.");
            return;
        }
        int size;

        for(int i = 0;i<adjListArray.length;i++) {
            System.out.print(i+": ");
            size = adjListArray[i].size();
            if(size == 0) {
                System.out.println("N/A");
            }
            for(int j = 0;j<size;j++) {
                Node node = (Node)adjListArray[i].get(j);
                node.printNode();
                if(j+1<size) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
}