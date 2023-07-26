package hw3;

public class DoublyLinkedList {
    Node head;
    Node tail;
    String listName;
    
    public DoublyLinkedList(String name){
        listName = name;
    }
    
    public void popBack() {
      if (isEmpty()){
        System.out.println("ERROR");
        }else{
        Node current = head;
        if(head.next == null){
            head = null;
        }else{
            while(current.next.next != null)
        {
            current = current.next;
        }
        tail = current;
        current.next = null;
        }
        }
    }
    
    public void popFront(){
       if (isEmpty()){
        System.out.println("ERROR");
        }else{
        head = head.next;
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node topBack(){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){

        }else{
            
        }
    }
    
    public void pushBack(Node node) {
         if (isEmpty()) {
          head = node;
          tail = node;
        } else {
          tail.next = node;
          tail = node;
          node.next = null;
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){

    }
    
    public void addNodeBefore(Node node1, Node node2){

    }
    
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else return false;
    }
    public void merge(DoublyLinkedList list){
        
    }
    
    public void printStructure(){
        System.out.print(listName + ": " + "head <-> " );
        Node current = head;
        while(current != null)
        {
            System.out.print("{"+current.student_id+"}" + " <-> ");
            current = current.next;
        }
        System.out.println("tail");
    }
    
    // This may be useful for you for implementing printStructure()
    public void printStructureBackward(){ 
        Node current=tail;
        System.out.print(listName + ": tail <-> ");
        while(current!=null){
            System.out.print("[" + current.student_id + "] <-> ");
            current = current.previous;
        }
        System.out.println("head");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
