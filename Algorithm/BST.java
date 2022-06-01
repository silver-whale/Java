public class BST {
    static class node{
        int key;
        node left, right;
    }
    // make new node
    static node newNode(int item){
        node temp = new node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    // insert a new node(key) under 'node'
    static node insert(node node, int key) {
        // if node==null, return new node with value: key
        if (node == null) {
            return newNode(key);
        }

        // Recursion until there is no node
        // 마지막 insert 함수는 newNode(key)를 반환 -> node.left = newNode(key)가 되어서 새 노드가 생성 및 삽입됨.
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        // Remember this part!
        return node;
    }

    static void inorder(node root){
        if(root != null){
            inorder(root.left);
            System.out.print(" "+root.key);
            inorder(root.right);
        }
    }
}
