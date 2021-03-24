/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignmentbst;

/**
 *
 * @author yogeshyadav
 */
public class BinarySearchTree {

    private Node root;
 

   /**
    * constructor 
    */
    public BinarySearchTree() {
        root = null;
       
    }

    /**
     *  checks to see if the root is empty 
     * @return null  
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * The insert Method is a recursive method and accepts a word 
     * @param word 
     */
    public void insert(String word) {
 
        // Create a new Node to store the null value 
        Node newNode = new Node(word);
      

        //If the tree is empty, put the object at the root
        if (isEmpty()) {
            root = newNode;

        } else {
            // call the insert method
            insert(root, newNode);
        }

    }

    /**
     * This method recursively inserts nodes into the binary search tree
     * @param parent
     * @param node 
     */
    public void insert(Node parent, Node node) {
        //Determine whether node should go left or right
        if (node.getName().compareTo(parent.getName()) < 0) {     //Left

            //Is there a left child already
            if (parent.getLeftChild() == null) {
                //Put node as root's left child
                parent.setLeftChild(node);
            } else {
                //Recursively call insert on the left child
                insert(parent.getLeftChild(), node);
            }
        } else if (node.getName().compareTo(parent.getName()) > 0) {                                           //Right

            //Is there a right child already
            if (parent.getRightChild() == null) {
                //Put node as root's right child
                parent.setRightChild(node);
            } else {
                //Recursively call insert on the right child
                insert(parent.getRightChild(), node);
            }
        } else  {
            // Increments the frequency 
            parent.incrementFreq();
        }
    }

    /**
     * This method takes in a word and searches the tree to find the word 
     * @param word
     * @return focusNode
     */
    public Node search(String word) {
        //Searching for a word inputed by the user
        // Create an object that stores a value
        Node focusNode;
        
        if (isEmpty()) {
              return null;
        }

        focusNode = search(root, word);
        // check to see if focusNode == null and implement the following code 
        if (focusNode == null) {
            System.out.println(word + " Was not Found");
        } else {
            System.out.println(word + " Was found " + "Frequency: " + focusNode.getFreq()  );
        }

        return focusNode;
    }

    public Node search(Node parent, String word) {

        if (parent.getName().equals(word)) {
            return parent;
        } else if (word.compareTo(parent.getName()) < 0) {   //Left

            //Is there a left child
            if (parent.getLeftChild() == null) {
                return null;
            } else {
                return search(parent.getLeftChild(), word);
            }

        } else {                                    //Right

            //Is there a right child
            if (parent.getRightChild() == null) {
                return null;
            } else {
                return search(parent.getRightChild(), word);
            }

        }

    }

   /**
    * Print the preOrder
    */
    public void printPreOrder() {

        System.out.println("--------------------------");
        System.out.println("Running PreOrder Traversal");
        printPreOrder(root);
        
    }

    /**
     * This method prints by looking at the parent then the left child then the
     * right child
     * @param parent 
     */
    public void printPreOrder(Node parent) {
        if (parent == null) {
            return;
        }

        //Print parent
        System.out.println(parent.getName() + "  Frequecny = " + parent.getFreq());

        //Left subtree
        printPreOrder(parent.getLeftChild());

        //Right subtree
        printPreOrder(parent.getRightChild());
    }

    /**
     * InOrder print method
     */
    public void printInOrder() {

        System.out.println("-------------------------");
        System.out.println("Running InOrder Traversal");
        printInOrder(root);
        //System.out.println("-----------");
    }

    /**
     * This method prints by first looking at left then parent then right
     * @param parent 
     */
    public void printInOrder(Node parent) {
        if (parent == null) {
            return;
        }

        //Left child
        printInOrder(parent.getLeftChild());

        //Print parent
        System.out.println(parent.getName() + "  Frequency = " + parent.getFreq());

        //Right child
        printInOrder(parent.getRightChild());
    }
    
    /**
     * postOrder print method
     */ 
    public void printPostOrder() {

        System.out.println("----------------------------");
        System.out.println("Running PostOrder Traversal");
        printPostOrder(root);
        //System.out.println("-----------");
    }

    /**
     * This method prints by first looking at the left and right child then parent\
     * 
     * @param parent 
     */
    public void printPostOrder(Node parent) {
        if (parent == null) {
            return;
        }

        //Left subtree
        printPostOrder(parent.getLeftChild());

        //Right subtree
        printPostOrder(parent.getRightChild());
        
        //Print parent
        System.out.println(parent.getName() + "  Frequency = " + parent.getFreq());
    }
    
   
}
