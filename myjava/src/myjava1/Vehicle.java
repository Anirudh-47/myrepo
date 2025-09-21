package myjava1;

//Hybrid Inheritance Example 


class Vehicle {
 void fuel() {
     System.out.println("Vehicles need fuel to run.");
 }
}


class Car extends Vehicle {
 void wheels() {
     System.out.println("Car has 4 wheels.");
 }
}


interface Electric {
 void charge();
}


class ElectricCar extends Car implements Electric {
 public void charge() {
     System.out.println("ElectricCar charges using electricity.");
 }
}

public class HybridExample {
 public static void main(String[] args) {
     ElectricCar tesla = new ElectricCar();

   
     tesla.fuel();

    
     tesla.wheels();

    
     tesla.charge();
 }
}

