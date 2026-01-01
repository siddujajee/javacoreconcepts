package com.corejava;

class Charger {
    private String type;

    public Charger(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class OperatingSystem {
    private String name;

    public OperatingSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mobile {
    OperatingSystem os = new OperatingSystem("windows");

    void setCharger(Charger charger) {
        System.out.println(charger.getType());
    }
}

public class AggregationAndComposition {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        System.out.println(mobile.os.getName());
        Charger charger = new Charger("vook charger");
        mobile.setCharger(charger);
        mobile = null;
        // below line will throw NullPointerException, as mobile is set to null, proving
        // composition
        // System.out.println(mobile.os.getName());
        // even after mobile is set to null, charger object is accessible, proving
        // aggregation
        System.out.println(charger.getType());
    }
}
