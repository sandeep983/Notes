package Polymorphism.RunTime;

class Animal {
   void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   @Override
   void move() {
      System.out.println("Dogs can walk and run");
   }
}

class Main {
   public static void main(String args[]) {
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object
      a.move(); // runs the method in Animal class
      b.move(); // runs the method in Dog class
   }
}

