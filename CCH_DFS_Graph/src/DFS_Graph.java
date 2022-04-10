import java.util.Stack;

public class DFS_Graph {

    Stack<Node> stack = new Stack<>();
    class Node {
        int value;
        Node left;
        Node right;
        Node previous;
        boolean visited;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.previous = null;
            this.visited = false;
        }
    }
    public void DFS() {
        stack.add(TreeCreation());
        traverse(stack);
    }
    private Node TreeCreation(){
        Node root = new Node(0);
        root.left = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.left.left.left = new Node(4);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(2);
        root.left.right.right.right.left = new Node(1);

        return  root;
    }

    private void traverse( Stack<Node> stack) {
        Node currentNode = stack.peek(); //getting the current value with peek

        if ((currentNode.visited) || (currentNode == null) )
            return;

        System.out.println(currentNode.value);

        currentNode.visited = true;
        if (currentNode.right != null) {
            stack.push(currentNode.right);
            traverse(stack);
        }
        if (currentNode.left != null) {
            stack.push(currentNode.left);
            traverse(stack);
        }
        if ( (currentNode.right == null) && (currentNode.left == null) ) {
            stack.pop();
        }


    }



}
