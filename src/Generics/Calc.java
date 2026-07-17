package Generics;
 class Calc<T, U, V> {
    T x;
    U y;
    V z;

    Calc(T x, U y, V z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void describe() {
        System.out.println("My name is " + this.x + ", I am " + this.y + " years old, are you married? " + this.z);
    }

    public static void main(String[] args) {
        Calc<String, Integer, Boolean> calc = new Calc<>("abdoul", 23, true);
        calc.describe();
    }
}