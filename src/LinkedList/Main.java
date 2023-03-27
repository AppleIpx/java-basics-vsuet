package LinkedList;


public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(4, 4);
        //myList.removingRepetitions(5);
        //myList.remove(3);
        myList.remove(value -> value == 5);
        System.out.println(myList);

    }
}
