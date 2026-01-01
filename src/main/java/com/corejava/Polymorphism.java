package com.corejava;

class Parent {
    public void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    private int number;

    public Child(int number) {
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("Child class method for child " + number);
    }
}

class Family {
    void polymorph(Parent p) {
        p.display();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Family f = new Family();
        Child c1 = new Child(1);
        f.polymorph(c1);
        Child c2 = new Child(2);
        f.polymorph(c2);
    }
}
