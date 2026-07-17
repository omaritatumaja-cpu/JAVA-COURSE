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
void main(){// using it
    Car myCar = new Car("Tesla",122);
    myCar.drive();}
