import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph { //creatinga  class
    Queue<Node> queue = new LinkedList<>(); //we used the queue pattern since it is a bfs graph
      class Node { //creating a node class with specific characteristics
        char value;
        Node left;
        Node right;
        boolean visited;

        public Node(char value) { //constructor
            this.value = value;
            this.left = null;
            this.right = null;
            this.visited = false;
        }
    }

    private Node TreeCreation(){

          Node rootA = new Node('A'); //creating the tree exactly as krish's video

          rootA.left = new Node('C');
          rootA.left.left = new Node('G');
          rootA.left.right= new Node('E');
          rootA.left.right.right = new Node('F');
          rootA.right = new Node('B');
          rootA.right.right = new Node('D');
          return rootA;

    }
  
    private void traverse(Node node) {

        if (queue == null){
            return;
        }
        node.visited = true;
        System.out.println(node.value);
        if (node.right != null)
            queue.add(node.right);

        if (node.left != null)
            queue.add(node.left);


        traverse(queue.poll());

    }
    
   public void BFS() {
        queue.add(TreeCreation());
        traverse(queue.remove()); //calling application function
    }
}

