package Part1_Hard_Program_Questions;

public class Question2 {


    class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    Node head, tail = null;


    public void addNode(int item) {

        Node newNode = new Node(item);

        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args) {

        Question2 hard = new Question2();

        hard.addNode(10);
        hard.addNode(20);
        hard.addNode(30);
        hard.addNode(40);
        hard.addNode(50);

        hard.printNodes();
    }
}
