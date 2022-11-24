// Given an undirected graph that consists of N nodes and M edges as well as Q queries
// Each query containing 2 nodes (u,v)
// Task: 1) To find for each pair of Q query 2) Total number of edges found in
// In newly connected component after connecting between u and v.

import java.util.ArrayList;
import java.util.Stack;

public class BonusChallenge {
    static ArrayList<ArrayList<Integer>> graph;

    // Function to perform DFS
    static void DFS(int s, boolean[] visited)
    {

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the current source node
        stack.push(s);
        while (!stack.isEmpty())
        {

            // Pop a vertex from stack
            // and print it
            s = stack.peek();
            stack.pop();

            // Traverse adjacent vertices
            // of the popped vertex s
            for(Integer node : graph.get(s))
            {
                if (!visited[node])
                {

                    // If adjacent is unvisited,
                    // push it to the stack
                    visited[node] = true;
                    stack.push(node);
                }
            }
        }
    }

    // Function to return the count
    // edges removed
    static void countRemovedEdges(int N, int M, int K)
    {
        int C = 0;

        // Initially mark all vertices
        // as not visited
        boolean[] visited = new boolean[N+1];

        for(int node = 1; node <= N; node++)
        {

            // If node is unvisited
            if (!visited[node])
            {

                // Increment Connected
                // component count by 1
                C = C + 1;

                // Perform DFS Traversal
                DFS(node, visited);

                // Print the result
                if (C <= K)
                    System.out.println(M - N + K);
                else
                    System.out.println(-1);
            }
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int N = 4, M = 3, K = 2;

        // Create Graph
        graph = new ArrayList<>();

        for(int i = 0; i <= N; i++)
            graph.add(new ArrayList<Integer>());

        // Given Edges
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(4);

        // Function Call
        countRemovedEdges(N, M, K);
    }
}
