public class assignment3_task6 {

    static final int SIZE = 7;

    public static void insert(int[] hashTable, int key) {


        int index = key % SIZE;


        while (hashTable[index] != -1) {
            index = (index + 1) % SIZE;
        }

        hashTable[index] = key;
    }

    public static void printTable(int[] hashTable) {

        System.out.println("\nHash Table:");

        for (int i = 0; i < SIZE; i++) {
            System.out.println(
                    "Index " + i + " : " + hashTable[i]
            );
        }
    }

    public static void main(String[] args) {


        int[] keys = {50, 700, 76, 85, 92, 73, 101};


        int[] hashTable = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            hashTable[i] = -1;
        }


        for (int key : keys) {
            insert(hashTable, key);
        }


        printTable(hashTable);
    }
}