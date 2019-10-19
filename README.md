Introduction:

Breadth First Search:
	Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or any node) and explores all of the neighbour nodes at the present depth prior to moving on to the nodes at the next depth level.
	It uses a Queue data structure which follows first in first out. In BFS, one vertex is selected at a time when it is visited and marked then its adjacent are visited and stored in the queue. It is slower than DFS.

Ex. ![Image Daa1](https://user-images.githubusercontent.com/56750272/67139985-98c94980-f273-11e9-9727-e5156001a7b0.PNG)


Output: A, B, C, D, E, F
Applications of BFS:
1.	Finding the shortest path between two nodes 
2.	Testing a graph for bipartiteness
3.	To find out if a graph contains cycle
4.	To construct BFS tree from a graph
5.	Copying garbage collection


Topic :  To count minimum no. of edges between two vertices of a graph.


Explanantion of BFS program:

1.	minEdgeBFS() :-  Method for finding min. no. of edge using BFS.
2.	Visited[n] :- For keeping track of visited nodes.
3.	Use a vector distance and set distances as ‘0’ for all vertices.
4.	Now, suppose during BFS, vertex ‘x’ is popped from queue.
5.	Now, suppose during the BFS operation, if vertex ‘x’ is popped from queue and we are pushing all adjacent non- visited vertices back into queue at the same time , we should update distance.get(i) = distance.get(x) +1.
6.	Finally distance.get(v) gives the min. no. of edges between u and v.

Graph Used:


 
Output: 5


