package LinkedList;

import java.util.function.Predicate;

public class MyList implements MyListable {

    private Node head;

    public MyList() {
        head = null;
    }

    public static class Node {
        public int data;
        public Node next;

        public Node (int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        Node correntNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (correntNode.next != null) {
                correntNode = correntNode.next;
            }
            correntNode.next = newNode;
        }
    }

    public void add(int index, int value) {
        Node newNode = new Node(value);
        Node correntNode = head;
        Node lastNode = null;
        if (index > counting() && (index >= 0)) {
            add(value);
        }else {
            if (head == null) {
                head = new Node(value);
            } else {
                for (int i = 0; i < index; i++) {
                    if (correntNode.next == null) {
                        correntNode.next = new Node(value);
                        break;
                    }
                    lastNode = correntNode;
                    correntNode = correntNode.next;
                }
                newNode.next = correntNode;
                lastNode.next = newNode;
            }
        }
    }
    public void remove(int index) {
        Node correntNode = head;
        Node lastNode = null;
        if (index > counting() && (index >=0)) {
            System.out.println("Ошибка введенного индекса");
        } else {
            for (int i = 0; i < index; i++) {
                lastNode = correntNode;
                correntNode = correntNode.next;
            }
            lastNode.next = correntNode.next;
            }
    }

    public void remove(Predicate<Integer> predicate) {
        Node correntNode = head;
        Node lastNode = null;

        while (correntNode.next != null) {

            if (predicate.test(correntNode.data)) { // TODO: 27/03/2023 implement with predicate
                if (correntNode == head) {
                    head = correntNode.next;
                } else {
                    lastNode.next = correntNode.next;
                }
            }
            lastNode = correntNode;
            correntNode = correntNode.next;
        }
    }

    public int counting() {
        int check = 0;
        Node currentNode = head;
        if (head == null) {
            return check;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                check++;
            }
            return check;
        }
    }

    @Override
    public String toString() {
        String result = "";
        Node currentNode = head;
        if (head == null) {
            result = String.valueOf(head.data);
            return result;
        }
        while (currentNode.next != null) {
            result += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        result += currentNode.data;
        return result;
    }
}
