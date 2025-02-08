package src;//package src;
//
//import java.util.LinkedList;
//
//public class Graph { //undirected graph
//    int v; //no. of vertices
//    Vertex[] vertex;
//
//    public Graph(int v){
//        this.v = v;
//        vertex = new Vertex[v];
//        for(int i=0; i<v; i++){
//            vertex[i] = new Vertex(i);
//        }
//    }
//    void addEdge(int a , int b){
//        vertex[a].adj.add(vertex[b]);
//        if (a != b){ //otherwize 2 times added
//            vertex[b].adj.add(vertex[a]); // remove this line for directed graph
//        }
//    }
//    void printList(LinkedList<Vertex> 1 LinkedList<Vertex> adj){
//        for (Vertex v: 1){
//            System.out.println(v.data + "");
//        }
//        System.out.println();
//    }
//    void printAdjacencyList(){
//        for (Vertex v : vertex){
//            System.out.println("Vertex" + v.data+ ": ");
//            printList(v.adj);
//        }
//    }
//    public static void main(String[] args){
//        Graph g = new Graph(5);
//        g.addEdge(0,1);
//        g.addEdge(1,2);
//        g.addEdge(2,0);
//        g.addEdge(3,3);
//        g.addEdge(4,2);
//        g.printAdjacencyList();
//    }
//}


import src.Vertex;

import java.util.LinkedList;

public class Graph {//undirected graph
    int v;//no of vertices
    Vertex[] vertex;

    public Graph(int v){
        this.v=v;
        vertex = new Vertex[v];
        for(int i = 0; i<v; i++){
            vertex[i] = new Vertex(i);
        }
    }

    void addEdge(int a, int b){
        vertex[a].adj.add(vertex[b]);
        if(a!=b)//otherwise 2 times added
            vertex[b].adj.add(vertex[a]);//remove this line for directed graph
    }

    void printList(LinkedList<Vertex> l){
        for(Vertex v: l){
            System.out.print(v.data+" ");
        }
        System.out.println();
    }

    void printAdjacencyList(){
        for(Vertex v: vertex){
            System.out.print("Vertex "+v.data+": ");
            printList(v.adj);
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 3);
        g.addEdge(4, 2);
        g.printAdjacencyList();
    }
}