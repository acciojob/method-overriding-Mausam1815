package com.driver;

public class Main {
  A objA = new A();
  B objB = new B();
  // Calling the method from class A using an object of class B
  String resultA = objB.meth();
  System.out.println(resultA);
  // Calling the overridden method from class B
  String resultB = objB.meth();
  System.out.println(resultB);
}
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
