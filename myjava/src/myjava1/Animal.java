package myjava1;

//Hierarchical Inheritance Example


class Animal {
 void eat() {
     System.out.println("All animals eat food.");
 }
}


class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks.");
 }
}


class Cat extends Animal {
 void meow() {
     System.out.println("Cat meows.");
 }
}


class Cow extends Animal {
 void moo() {
     System.out.println("Cow moos.");
 }
}

public class HierarchicalDemo {
 public static void main(String[] args) {
    
     Dog d = new Dog();
     d.eat();   
     d.bark();


     Cat c = new Cat();
     c.eat(); 
     c.meow();

    
     Cow cw = new Cow();
     cw.eat();  
     cw.moo();
 }
}
