package Assignment;

public class D5 {
	import java.util.ArrayList;

	 class Graph0{
	    ArrayList<ArrayList<Integer>> graph;
	    int V;
	    
	    Graph0(int nodes)
	    {
	        V = nodes;
	        graph = new ArrayList<ArrayList<Integer>>();
	        for(int i =0;i<V;i++)
	        {
	            graph.add(new ArrayList<Integer>());
	        }
	        
	    }
	    void addEdge(int v,int u)
	    {
	        graph.get(v).add(u);
	        graph.get(u).add(v);
	    }
	    void printGraph()
	    {
	        for(int i=0;i<V;i++)
	        {
	            System.out.print("Node"+ i);         
	            for(int x :graph.get(i))
	            System.out.print(" -> "+x);
	             System.out.println();
	        }
	    }    
	}
	public class Graph1{
	    public static void main(String args[])
	    {
	        Graph0 g = new Graph0(5);
	        g.addEdge(0, 1);
	        g.addEdge(3, 2);
	        g.addEdge(2, 4);
	        g.addEdge(1, 4);
	        g.addEdge(3, 1);
	        g.addEdge(2, 0);
	       g.printGraph();
	        
	        
	    }
	}
	--------------------------------------------------
	Graph with BFS and DFS
	package gf;

	import java.util.*;
	import utility.Queue;

	 class Graph11{
	    ArrayList<ArrayList<Integer>> graph;
	    int V;
	    
	    Graph11(int nodes)
	    {
	        V = nodes;
	        graph = new ArrayList<ArrayList<Integer>>();
	        for(int i =0;i<V;i++)
	        {
	            graph.add(new ArrayList<Integer>());
	        }
	        
	    }
	    void addEdge(int v,int u)
	    {
	        graph.get(v).add(u);
	        graph.get(u).add(v);
	    }
	    void printGraph()
	    {
	        for(int i=0;i<V;i++)
	        {
	            System.out.print("Node"+ i);         
	            for(int x :graph.get(i))
	            System.out.print(" -> "+x);
	             System.out.println();
	        }
	    }

	  
	    void dfsUtil(int node, boolean visited[])
	    {
	        visited[node]=true;
	        System.out.print(node+" ");
	        for(int x:graph.get(node))
	        {
	            if(visited[x]==false)
	            {
	                dfsUtil(x,visited);
	            }
	        }
	        
	    }
	    
	    void DFS(int start)
	    {
	        boolean visited[] = new boolean[V];
	        System.out.println("DFS Traversalod of a graph");
	        dfsUtil(start,visited);
	        
	    }

	   void BFS(int start)
	   {
	       boolean visited[] = new boolean[V];
	       LinkedList<Integer> q = new LinkedList<Integer>();
	       q.add(start);
	       System.out.println("BFS graph traversal");
	       visited[start] = true;
	       while(q.isEmpty() == false)
	       {
	           int node = q.poll();
	           System.out.print(node+ " ");
	           for(int x: graph.get(node))
	           {
	               if(visited[x] == false)
	               {
	                   visited[x]=true;
	                   q.add(x);
	               }
	           }
	       }
	   }
	}
	public class GraphBFS{
	    public static void main(String args[])
	    {
	        Graph11 g = new Graph11(5);
	        g.addEdge(0, 1);
	        g.addEdge(3, 2);
	        g.addEdge(2, 4);
	        g.addEdge(1, 4);
	        g.addEdge(3, 1);
	        g.addEdge(2, 0);
	       g.printGraph();
	       g.DFS(0);
	       System.out.println();
	       g.BFS(0);
	       
	        
	        
	    }
	}

}
