// singleton class but non efficient
package com.mulltithreading;

class DemoClass {
  private static DemoClass instance;

  public static DemoClass getInstace() {
    if (instance == null) {
      instance = new DemoClass();
    }
    return instance;
  }

}

public class SingletonClass {
  public static void main(String[] args) {
    DemoClass d1 = DemoClass.getInstace();
    DemoClass d2 = DemoClass.getInstace();
    System.out.println("are both instances same? " + (d1 == d2));
  }
}
