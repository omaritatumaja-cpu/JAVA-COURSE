void main(){// using it
    Car myCar = new Car("Tesla",122);
    myCar.drive();
    myCar.brand="toyota";
    myCar.drive();

}


class Car {
    private String brand;
    int speed;
    public  Car(String brand,int speed){
        this.speed=speed;
        this.brand=brand;
    }

    void drive() {
        System.out.println(this.brand + " is driving at " + this.speed + " km/h");
    }
}
