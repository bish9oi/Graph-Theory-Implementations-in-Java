
package src;

import java.util.LinkedList;

public class Vertex {
    public LinkedList<Vertex> adj;
    int data;
    int color; // 0 = white, 1 = gray, 2 = black
    int distance; // from start vertex
    Vertex parent;
    int discoveryTime;
    int finishTime;
    boolean extracted;

    // Constructor inside the class
    public Vertex(int data) {
        this.data = data;
        this.color = 0;
        this.distance = -1;
        this.parent = null;
        this.adj = new LinkedList<>();
        this.discoveryTime = 0;
        this.finishTime = 0;
    }
}
