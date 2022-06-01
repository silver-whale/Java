import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean visited;

        Node(int data){
            this.data = data;
            this.visited = false;
            adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph(int size){
        nodes = new Node[size];
        for(int i=0; i<size; i++){
            nodes[i] = new Node(i);
        }
    }

    // i1, i2: Node's index
    void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }

    void dfs(){
        dfs(0);
    }

    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.visited = true;

        while(!stack.isEmpty()){
            Node current = stack.pop();
            for(Node n:current.adjacent){
                if(!n.visited){
                    n.visited = true;
                    stack.push(n);
                }
            }
            System.out.print(current.data);
        }
    }

    void bfs(){
        bfs(0);
    }

    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        root.visited = true;
        while(!queue.isEmpty()){
            Node current = queue.poll();
            for(Node next:current.adjacent){
                if(!next.visited){
                    next.visited = true;
                    queue.add(next);
                }
            }
            System.out.print(current.data);
        }
    }

    void dfsR(Node n){
        if(n==null) return;

        n.visited = true;
        System.out.print(n.data);
        for(Node cur:n.adjacent){
            if(!cur.visited){
                dfsR(cur);
            }
        }
    }

    void dfsR(int index){
        Node r = nodes[index];
        dfsR(r);
    }

}

public class FirstSearch {
    public static void main(String[] args){
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);

        //g.dfs(0);
        System.out.println();
        //g.bfs(0);
        System.out.println();
        //g.dfsR(0);
    }
}
