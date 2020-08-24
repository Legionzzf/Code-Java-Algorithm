//Student ID: a1806522
//Student Name: Zhuofan Zhang
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test 1");
        MyGraph graph = new MyGraph();
        int matrix[][] =
                {{0 , 1 , 0 , 1},
                {1 , 0 , 0 , 0},
                {0 , 0 , 0 , 1},
                {0 , 1 , 1 , 0}};
        graph.matrixToList(matrix);
        graph.displayAdjListArray();

        System.out.println("\nTest 2");
        int matrix2 [][] =
                {{0 ,1 , 0 , 1 , 0},
                {1 , 0 , 0 , 0 , 0},
                {0 , 0 , 0 , 1 , 1},
                {0 , 1 , 1 , 0 , 1},
                {0 , 0 , 1 , 0 , 1}};
        MyGraph graph2 = new MyGraph();
        graph2.matrixToList(matrix2);
        graph2.displayAdjListArray();
    }
}