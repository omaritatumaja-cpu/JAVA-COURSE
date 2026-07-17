void main() {int[] numbers = {12, 45, 3, 67, 22};
    int max = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    System.out.println("Max value: " + max);}