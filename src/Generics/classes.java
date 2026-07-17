void main(){
    // T is Double type
    Animal<Double> animal0=new Animal<>();
   animal0.setParty(272.0);
    System.out.println(animal0.getParty());
  // T is String type
    Animal<String> animal1=new Animal<>();
    animal1.setParty("Abu");
    System.out.println(animal1.getParty());

  //T is Integer type
    Animal<Integer> animal2=new Animal<>();
    animal2.setParty(9);
    System.out.println(animal2.getParty());

}

public  class  Animal<T>{
    T party;
    public void setParty(T party){
        this.party=party;
    }
    public   T getParty(){

        return party;


    }

}