//Implement a graph data structure in Java using either an adjacency matrix or an adjacency list. The graph should have methods for adding and removing vertices and edges, and for traversing the graph.
import java.util.*;
public class GraphImplementation1
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the total no of vertices");
      int totalvertex=sc.nextInt();
      Graph graph=new Graph();
      while(true)
      {
         System.out.println("*****************\n1.add vertices \n2.remove vertices \n3.traversal\n*****************");
         System.out.println("Enter the choice");
         switch(sc.nextInt())
         {
          case 1:
            System.out.println("Vertex value");
            graph.addVertex(sc.nextInt());
            break;
          case 6:
              System.exit(0);
         }
      }
   }
}

class Graph
{
   ArrayList<Vertex> vertices;
   Edge edge;
   public void addVertex(int value)
   {
         Vertex newVertex=new Vertex(value);
         this.vertices.add(newVertex);
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
}
   
   
