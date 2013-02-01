
// A node of the SinglyLinkedList has two properties: 
// 1, data (various types)
// 2, the pointer to the next node (which is also a node in java)

public class Node {

    private Object data;  // attribute of the class Node: store the data
    private Node next;    // attribute of the class Node: store the reference for next node

    // constructor 1, with two parameters (data and next node)
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    // constructor2, (as constructor 1 with null next node reference)
    public Node(Object data) {
        this(data,null);
    }
    
    /**
     *  Nodes' methods:
     */
    
    // return the data
    public Object getData() {
        return this.data;
    }

    // set the data of this node
    public void setData(Object data) {
        this.data = data;
    }

    // get the next node
    public Node getNext() {
        return this.next;
    }
    
    // set this node's next node (set this nodes' pointer)
    public void setNext(Node next) {
        this.next = next;
    }

}