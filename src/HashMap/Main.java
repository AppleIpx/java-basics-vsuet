package HashMap;

public class Main {
    public static void main(String[] args) {
        IMap<Integer, String> myMap = new MyHashTable();
        myMap.put(34, "privet");
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(6, "six");
        myMap.put(33, "hello");
        myMap.put(28, "Nasty");
        myMap.put(15, "good");
        myMap.put(3,"hahaha");
        myMap.put(25, "JavaTop");
        myMap.put(7, "TopTest");

        myMap.put(38, "pri");
        myMap.put(4, "on");
        myMap.put(29, "tw");
        myMap.put(60, "si");
        myMap.put(31, "hel");
        myMap.put(58, "Na");
        myMap.put(153, "go");
        myMap.put(98,"ha");
        myMap.put(25, "Java");
        myMap.put(70, "Top");
        //System.out.println(Integer.valueOf('7'));
        myMap.remove(34);
        myMap.remove(28);
        myMap.remove(98);
        myMap.remove(33);
        myMap.remove(15);
        myMap.remove(3);
        //System.out.println(myMap.size());
        //System.out.println(myMap.get(31));
        System.out.println(myMap);
    }
}
