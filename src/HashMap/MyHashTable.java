package HashMap;
public class MyHashTable implements IMap<Integer, String> {

    private final int INIT_SIZE = 16;
    private int checkForList = 1;
    private Node[] array = new Node[INIT_SIZE];

    private int pointer = 0;

    public static class Node {
        public String value;
        public int unchangedKey;
        public boolean reader;
        public Node next;

        public Node(int unchangedKey, String value, boolean reader) {
            this.value = value;
            this.unchangedKey = unchangedKey;
            this.reader = reader;
            next = null;
        }
    }

    public void put(int key, String value) {
        //int keyForArray = hashFunction(key);
        //int keyForArray = multiplicationMethod(key);
        int keyForArray = divisionMethod(key);
        if (keyForArray < 0) {
            keyForArray = keyForArray + (-2 * keyForArray);
        }
        Node newNode = new Node(key, value, true);
        if (array[keyForArray] != null) {
            Node correntNode = array[keyForArray];
            while (correntNode.next != null) {
                correntNode = correntNode.next;
            }
            correntNode.next = newNode;
        } else {
            array[keyForArray] = newNode;
        }
        pointer++;
        if (pointer == array.length - 1)
            resize(array.length * 2);
    }

    public String get(int key) {
        StringBuilder result = new StringBuilder();
        //int keyForArray = hashFunction(key);
        //int keyForArray = multiplicationMethod(key);
        int keyForArray = divisionMethod(key);
        if (keyForArray < 0) {
            keyForArray = keyForArray + (-2 * keyForArray);
        }
        Node currentNode = array[keyForArray];
        if (currentNode.next == null) {
            result = new StringBuilder(currentNode.value);
        } else {
            while (currentNode.next != null) {
                if (currentNode.unchangedKey == key) {
                    result.append(currentNode.value);
                    return result.toString();
                }
                currentNode = currentNode.next;
            }
            if (currentNode.unchangedKey == key) {
                result.append(currentNode.value);
            }
        }
        return result.toString();
    }

    public void remove(int key) {
        //int keyForArray = hashFunction(key);
        //int keyForArray = multiplicationMethod(key);
        int keyForArray = divisionMethod(key);
        if (keyForArray < 0) {
            keyForArray = keyForArray + (-2 * keyForArray);
        }
        Node correntNode = array[keyForArray];
        if (correntNode.unchangedKey == key) {
            correntNode.reader = false;
            if (correntNode.next != null) {
                while (correntNode.next != null) {
                    correntNode = correntNode.next;
                    if (correntNode.unchangedKey == key) {
                        correntNode.reader = false;
                    }
                }
            }
        } else {
            if (correntNode.next != null) {
                while (correntNode.next != null) {
                    correntNode = correntNode.next;
                    if (correntNode.unchangedKey == key) {
                        correntNode.reader = false;
                    }
                }
            }
        }
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Node[] newArray = new Node[newLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        checkForList++;
    }

    private int hashFunction(Integer key) {
        StringBuilder result = new StringBuilder();
        String strKey = String.valueOf(key);
        for (int i = 0; i < strKey.length(); i++) {
            result.append(Integer.valueOf(strKey.charAt(i)));
        }
        int chet = Integer.parseInt(String.valueOf(result));
        return chet % array.length;
    }

    private int divisionMethod(Integer key) {
        if (checkForList == 1) {
            return key % array.length;
        } else {
            return key % (array.length / checkForList);
        }
    }
    private int multiplicationMethod(Integer key) {
        int n = 13;
        double A = 0.618033;
        return (int) (n * ((key * A) % 1));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                Node currentNode = array[i];
                while (currentNode.next != null) {
                    if (currentNode.reader) {
                        result.append(currentNode.value).append("\n");
                    }
                    currentNode = currentNode.next;
                }
                if (currentNode.reader) {
                    result.append(currentNode.value).append("\n");
                }
            }
        }
        return result.toString();
    }
}

