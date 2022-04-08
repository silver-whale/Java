package DataStructure;
import java.util.Stack;

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

public class binaryTree {
    Node root;

    binaryTree(int key){
        root = new Node(key);
    }

    binaryTree(){
        root = null;
    }
    // PostOrder : Left , Right, Root
    // Root가 Post(이후)에 온다
    void postOrder(Node node){
        if (node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }

    void inOrder(Node node){
        if (node==null) return;
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    void preOrder(Node node){
        if (node==null) return;
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Wrapper Method, Validate parameters, Perform initialization, Handle exceptions
    // 입력값을 주지 않을 시 root를 넣어서 동작하게 하라
    void postOrder() {postOrder(root);}
    void inOrder() {inOrder(root);}
    void preOrder() {preOrder(root);}
    
    void inOrderNR(){
        if(root==null) return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // 현재 노드가 존재하고 순회해야 하는 노드가 남아 있는 한
        while(curr!=null || s.size() > 0){
            // 먼저 left 전부 순회한 후
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            // 중앙 순회
            System.out.print(curr.key + " ");
            // right 순회
            curr = curr.right;
        }
    }


    public static void main(String[] args){
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }
}
