package Part1_Hard_Program_Questions;

import java.util.Stack;

public class Question5 {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();


    void push(int x) {
        if (s1.isEmpty()) {
            s1.push(x);
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
    }

    int pop() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
    }
}
        //This main class is also being used in Question2 causing an error
        //Just answering your question

