class Add {
    // STATIC - Good for utility
    public static int add(int a, int b) {
        return a + b;
    }

    // NON-STATIC - Needs instance state
    private int memory;

    public void storeValue(int value) {
        this.memory = value;  // Needs instance
    }

    public int getMemory() {
        return memory;
    }

    public static void main() {
        // STATIC call - no object needed
        int sum = Add.add(5, 3);
        System.out.println("Static add result: " + sum);  // Prints: Static add result: 8

        // NON-STATIC call - requires object
        Add calc = new Add();
        calc.storeValue(10);
        System.out.println("Stored value: " + calc.getMemory());  // Prints: Stored value: 10

        // You can also call it directly (since main is in the same class)
        int anotherSum = add(7, 2);
        System.out.println("Direct call: " + anotherSum);  // Prints: Direct call: 9
    }
}