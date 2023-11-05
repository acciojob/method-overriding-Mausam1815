package com.driver;

public class Main {

  public Main() {

  }

  public static class A {

    public A(){

    }

    public String meth() {
      return "Invoking method from class A";
    }
  }

  public static class B extends A {

    @Override
    public String meth() {
      return "Method is overridden in Extended class B";
    }
  }

  public static void main(String[] args) {
    B objB = new B();
    String s = objB.meth();
    System.out.println(s);
  }
}