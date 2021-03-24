/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignmentbst;

/**
 *
 * @author Jay Yadav
 */
public class Node {
    private int freq;
    String name;
    private Node leftChild;
    private Node rightChild;
    
    public Node (String name) {
        this.freq = 1;
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

   // Null constructor 
    public Node () {
        
    }
   

    /**
     * Gets name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name into the string
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

   /**
    * gets the left child
    * @return 
    */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * sets the left child
     * @param leftChild 
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

   /**
    * gets the right child
    * @return 
    */
    public Node getRightChild() {
        return rightChild;
    }

   /**
    * sets the right child
    * @param rightChild 
    */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

  /**
   * increments freq so we can count the number of repeats
   */
    public void incrementFreq() {
       freq++;
   }

   /**
    * gets the freq
    * @return 
    */
    public int getFreq() {
        return freq;
    }

    /**
     * sets the freq
     * @param freq 
     */
    public void setFreq(int freq) {
        this.freq = freq;
    }
   
   
    
    

    @Override
    public String toString() {
        return "Node{" + "name=" + name + '}';
    }
    
  
      
    
}
