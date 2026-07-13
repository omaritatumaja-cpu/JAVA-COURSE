import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.print("is he/she married ?");
    boolean is_married = scanner.nextBoolean();

    System.out.print("Enter your height (in meters): ");
    int height = scanner.nextInt();
    System.out.print("Enter your height (in meters): ");
    double gpa = scanner.nextDouble();

    System.out.println("Hello " + name + ", age " + age + ", height " + height+ "is he/she married?: "+is_married+"your GPA ıs "+gpa);
}