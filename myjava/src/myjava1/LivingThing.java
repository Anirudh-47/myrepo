package myjava1;


interface LivingThing {
 void breathe();
}


interface Human extends LivingThing {
 void speak();
}


class Student implements Human {
 public void breathe() {
     System.out.println("Student breathes air.");
 }

 public void speak() {
     System.out.println("Student speaks politely.");
 }
}

public class InterfaceToInterface {
 public static void main(String[] args) {
     Student s = new Student();
     s.breathe(); 
     s.speak();   
 }
}
