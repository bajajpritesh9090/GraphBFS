package graphbfs;

import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Vector; 
public class GraphBFS {

    static int minEdgeBFS(Vector<Integer> edges[], int u,int v, int n) 
    { 
        
        Vector<Boolean> visited = new Vector<Boolean>(n); 
          
        for (int i=0;i<n;i++) 
        { 
            visited.addElement(false); 
        } 
       
        Vector<Integer> distance = new Vector<Integer>(n); 
          
        for (int i=0;i<n;i++) 
        { 
            distance.addElement(0); 
        } 
       
        Queue<Integer> q = new LinkedList<>(); 
        distance.setElementAt(0, u); 
       
        q.add(u); 
        visited.setElementAt(true, u);
        while (!q.isEmpty()) 
        { 
            int x = q.peek(); //to fetch first element of queue
            q.poll(); //remove element at the front of queue
       
            for (int i=0; i<edges[x].size(); i++) 
            { 
                if (visited.elementAt(edges[x].get(i))) 
                    continue; 
       
                distance.setElementAt(distance.get(x) + 1,edges[x].get(i)); 
                q.add(edges[x].get(i)); 
                visited.setElementAt(true,edges[x].get(i)); 
            } 
        } 
        return distance.get(v); 
    } 
      
    static void addEdge(Vector<Integer> edges[], int u, int v) 
    { 
       edges[u].add(v); 
       edges[v].add(u); 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 14; 
        Vector<Integer> edges[] = new Vector[14]; 
          
        for (int i=0;i<edges.length;i++) { 
            edges[i]=new Vector<>(); 
        } 
          
        addEdge(edges, 1, 2); 
        addEdge(edges, 2, 3); 
        addEdge(edges, 3, 4); 
        addEdge(edges, 3, 5); 
        addEdge(edges, 4, 7); 
        addEdge(edges, 4, 6); 
        addEdge(edges, 5, 6); 
        addEdge(edges, 5, 9); 
        addEdge(edges, 6, 10); 
        addEdge(edges, 7, 8); 
        addEdge(edges, 10, 11); 
        addEdge(edges, 11, 12); 
        addEdge(edges, 12, 13); 
        addEdge(edges, 11, 13); 
        int u = 1; 
        int v = 10; 
        System.out.println(minEdgeBFS(edges, u, v, n)); 
    } 
} 
