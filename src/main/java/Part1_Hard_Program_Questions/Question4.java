package Part1_Hard_Program_Questions;

public class Question4 {
    private Node top;
    private int size;

    public Question4() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next;
        size--;
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = top;
            System.out.print("Stack elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack using Linked List");
        System.out.println("\nInput some elements on the stack:");
        Question4 stack = new Question4();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("\nTop element: " + stack.peek());
        System.out.println("\nRemove two elements from the stack:");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("\nTop element: " + stack.peek());
    }
}
