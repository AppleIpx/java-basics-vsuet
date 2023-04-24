package LinkedList;


import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MyListable myListable = new MyList();
        myListable.add(0);
        myListable.add(2);
        myListable.add(1,1);
        myListable.add(4);
        myListable.remove(3);
        System.out.println(myListable);
    }
}
