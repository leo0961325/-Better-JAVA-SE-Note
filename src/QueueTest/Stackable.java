package QueueTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stackable {


    public static class Stack<E> {
        private Deque<E> deque = new ArrayDeque<>();
        private int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
        }

        public boolean push(E elem) {
            if(isFull()) {
                return false;
            }
            return deque.offerLast(elem);
        }

        private boolean isFull() {
            return deque.size() + 1 > capacity;
        }

        public E pop() {
            return deque.pollLast();
        }

        public E peek() {
            return deque.peekLast();
        }

        public int size() {
            return deque.size();
        }

        public static void main(String[] args) {
            Stack<String> stack = new Stack<>(5);
            stack.push("Justin");
            stack.push("Monica");
            stack.push("Irene");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
    }











}
