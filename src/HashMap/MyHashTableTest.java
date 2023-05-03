package HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTableTest {
    @org.junit.jupiter.api.Test
    void get() {
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
        myMap.put(20, "Java");
        myMap.put(70, "Top");

        assertEquals("one", myMap.get(1));
        assertEquals("two", myMap.get(2));
        assertEquals("six", myMap.get(6));
        assertEquals("privet", myMap.get(34));
        assertEquals("hello", myMap.get(33));
        assertEquals("Nasty", myMap.get(28));
        assertEquals("good", myMap.get(15));
        assertEquals("hahaha", myMap.get(3));
        assertEquals("JavaTop", myMap.get(25));
        assertEquals("TopTest", myMap.get(7));

        assertEquals("pri", myMap.get(38));
        assertEquals("on", myMap.get(4));
        assertEquals("tw", myMap.get(29));
        assertEquals("si", myMap.get(60));
        assertEquals("hel", myMap.get(31));
        assertEquals("Na", myMap.get(58));
        assertEquals("go", myMap.get(153));
        assertEquals("ha", myMap.get(98));
        assertEquals("Java", myMap.get(20));
        assertEquals("Top", myMap.get(70));
    }

    @org.junit.jupiter.api.Test
    void size() {
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
        assertEquals(10, myMap.size());
    }
}