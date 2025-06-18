package com.corejava;

@FunctionalInterface
interface Demo {
    void disp(int a);
}


public class CoreConcepts {
    Demo d2 = a ->{
        System.out.println("this is overridden method of functional interface and the value of a is " + a);       
    };
    public static void main(String[] args) {
        new CoreConcepts().d2.disp(10);
    }
    
}