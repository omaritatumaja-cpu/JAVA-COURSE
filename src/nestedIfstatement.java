

void main() { int age = 20;
    boolean hasLicense = true;

    if (age >= 18) {
        if (hasLicense) {
            System.out.println("You can drive.");
        } else {
            System.out.println("Get a license first.");
        }
    } else {
        System.out.println("Too young to drive.");
    }


}