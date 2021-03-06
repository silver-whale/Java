package DataStructure;
public class binarySearchTree {
    class Node{
        int key;
        Node left, right;
    
        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    // constructor
    binarySearchTree() {root = null;}
    binarySearchTree(int value) {root = new Node(value);}

    // insert()호출 시 insertRec()가 호출됨
    void insert(int key) {root = insertRec(root, key);}

    Node insertRec(Node root, int key){
        if (root==null){
            root = new Node(key);
            return root;
        }

        if (key<root.key)
            root.left = insertRec(root.left, key);
        else if (key>root.key)
            root.right = insertRec(root.right, key);


        // return the (unchanged) node pointer
        return root;

    }

    void inorder() {inorderRec(root);}

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Binary Search tree : Left < Right
    public Node search(Node root, int key){
        if (root == null || root.key == key)
            return root;
        
        if (root.key < key)
            return search(root.right, key);
        
        return search(root.left, key);
    }
    
    public static void main(String[] args){
        binarySearchTree tree = new binarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
    }
}
