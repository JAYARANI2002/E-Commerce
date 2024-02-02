//Implement a graph data structure in Java using either an adjacency matrix or an adjacency list. The graph should have methods for adding and removing vertices and edges, and for traversing the graph.
import java.util.*;
public class GraphImplementation
{
   public static void main(String args[])
   {
      Graph graph=new Graph();
      Scanner sc=new Scanner(System.in);
      ArrayList<ArrayList<Integer>> adjacentList=new ArrayList<>();
      while(true)
      {
         System.out.println("*****************\n1.add vertices \n2.remove vertices \n3.traversal\n*****************");
         System.out.println("Enter the choice");
         switch(sc.nextInt())
         {
          case 1:
            System.out.println("Source and Destination");
            graph.addEdge(adjacentList,sc.nextInt(),sc.nextInt());
            break;
          case 2:
              System.out.println("Source and Destination");
              graph.deleteEdge(adjacentList,sc.nextInt(),sc.nextInt());
              break;
          case 3:
              graph.printGraph(adjacentList);
              break;
          case 4:
              System.exit(0);
       }
     }
   }
}
class Graph
{
   ArrayList<ArrayList<Integer>> adjacentList;
   public void addVertex(int value)
   {
         adjacentList.add(new ArrayList<>());
   }
   public void removeVertex(Vertex vertex)
   {
         //vertex.remove(vertex);
   }   
   void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination)
   {
       adj.get(source).add(destination);
       adj.get(destination).add(source); 
   }
   void deleteEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination)
   {
      adj.get(source).remove(destination);
   }
   void printGraph(ArrayList<ArrayList<Integer>> adj)
   {
       for(int i=0;i<adj.size();i++)
       {
           System.out.print("Adjacent list"+i+" =>");
           for(int j=0;j<adj.get(i).size();j++)
           {
              System.out.print(adj.get(i).get(j)+" ");
           }
           System.out.println();
       }
   }
}
class Vertex
{
   int value;
   ArrayList<Edge> edges;
   Vertex(int value)
   {
      this.value=value;
      edges=new ArrayList<Edge>();
   }
}
class Edge
{
   
   Vertex source,destination;
   int weight;
   Edge(Vertex source,Vertex destination,int weight)
   {
        this.source=source;
        this.destination=destination;
        this.weight=weight;
   }
}

   
   
