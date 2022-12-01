import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    // Driver Program
    public static void main(String args[])
    {
        // No of vertices
        int v = 10;

        // Adjacency list for storing which vertices are connected
        ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        System.out.println("Eugene(1)");
        System.out.println("Jose(2)");
        System.out.println("Kelvin(3)");
        System.out.println("Terence(4)");
        System.out.println("Dennis(5)");
        System.out.println("Eunice(6)");
        System.out.println("Bryan(7)");
        System.out.println("Gabriel(8)");
        System.out.println("Jimmy(9)");

        // an edge between them.
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 2, 6);
        addEdge(adj, 2, 7);
        addEdge(adj, 6, 8);
        addEdge(adj, 6, 9);
        // source and dest input
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Employee numbers to find shortest distance ");

        int ceo=sc.nextInt();
        int source= sc.nextInt();
        int dest=sc.nextInt();

        shortestPath(adj, source, dest, v);
    }

    // function to form edge between two vertices
    // source and dest
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    // shortestPth Function
    private static void shortestPath(
            ArrayList<ArrayList<Integer>> adj,
            int s, int dest, int v)
    {

        int pred[] = new int[v];
        int dist[] = new int[v];
        int ceo=1;

        if (BFS(adj, s, dest, v, pred, dist) == false) {
            System.out.println("Given source and destination" +
                    "are not connected");
            return;
        }

        // LinkedList to store path
        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }



        // Print path
        System.out.print("Shortpath(");
        System.out.print("Eugene(1),");
        if(s==8){
            System.out.print("Gabriel(8)");
        }
        else if(s==9){
            System.out.print("Jimmy(9)");
        }
        else if(s==7){
            System.out.print("Bryan(7)");
        }
        else if(s==6){
            System.out.print("Eunice(6)");
        }
        else if(s==5){
            System.out.print("Dennis(5)");
        }
        else if(s==4){
            System.out.print("Terence(4)");
        }
        else if(s==3){
            System.out.print("Kelvin(3)");
        }
        else {
            System.out.print("Jose(2)");
        }

        System.out.print(",");
        if(dest==8){
            System.out.print("Gabriel(8)");
        }
        else if(dest==9){
            System.out.print("Jimmy(9)");
        }
        else if(dest==7){
            System.out.print("Bryan(7)");
        }
        else if(dest==6){
            System.out.print("Eunice(6)");
        }
        else if(dest==5){
            System.out.print("Dennis(5)");
        }
        else if(dest==4){
            System.out.print("Terence(4)");
        }
        else if(dest==3){
            System.out.print("Kelvin(3)");
        }
        else {
            System.out.print("Jose(2)");
        }


        System.out.print(")= ");
        for (int i = path.size() - 1; i >= 0; i--) {
            int name=path.get(i);

            if(name==8){
                System.out.print("Gabriel(8) >");
            }
            else if(name==9){
                System.out.print("Jimmy(9) >");
            }
            else if(name==7){
                System.out.print("Bryan(7) >");
            }
            else if(name==6){
                System.out.print("Eunice(6) >");
            }
            else if(name==5){
                System.out.print("Dennis(5) >");
            }
            else if(name==4){
                System.out.print("Terence(4) >");
            }
            else if(name==3){
                System.out.print("Kelvin(3) >");
            }
            else if(name==2){
                System.out.print("Jose(2) >");
            }
            if(name==1){
                System.out.print("Engene(1) >");
            }
        }
    }

    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
                               int dest, int v, int pred[], int dist[])
    {

        LinkedList<Integer> queue = new LinkedList<Integer>();

        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        // bfs Algorithm
        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == false) {
                    visited[adj.get(u).get(i)] = true;
                    dist[adj.get(u).get(i)] = dist[u] + 1;
                    pred[adj.get(u).get(i)] = u;
                    queue.add(adj.get(u).get(i));

                    // stopping condition (when we find
                    // our destination)
                    if (adj.get(u).get(i) == dest)
                        return true;
                }
            }
        }
        return false;
    }
}
