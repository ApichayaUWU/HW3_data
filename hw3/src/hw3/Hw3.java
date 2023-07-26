/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3;

/**
 *
 * @author apichayaink
 */
public class Hw3 {
       
   
    public static void main(String[] args) {
        Node node;
        SinglyLinkedList list1;
        DoublyLinkedList list2;
        node = new Node();
        list1 = new SinglyLinkedList("Hello World!");
        list2 = new DoublyLinkedList("Hello World!");
        
        DoublyLinkedList list = new DoublyLinkedList("list4");
        list.printStructure();
        list.popFront();
        list.pushBack(new Node(5906001, "Matthew", 3.50));
        list.pushBack(new Node(5906002, "Mark", 2.75));
        list.pushBack(new Node(5906003, "Luke", 3.00));
        list.pushBack(new Node(5906004, "John", 3.75));
        list.printStructure();
        list.popFront();
        list.printStructure();
        list.popBack();
        list.printStructure();
        list.popFront();
        list.printStructure();
        list.popBack();
        list.printStructure();
        list.popBack();
        
        
    }
    
}
