//package com.JavaCollections;

import java.util.*;

public class LinkedLists {
  private LinkedList list = new LinkedList();

  public void push1(Object o) {
    list.addFirst(o);
  }

  public void push2(Object o) {
    list.addLast(o);
  }

  public Object bottom() {
    return list.getLast();
  }

  public Object pop() {
    return list.removeFirst();
  }

  public static void main(String[] args) {
    Car myCar;
    Bird myBird;
    LinkedLists s = new LinkedLists();
    s.push1(new Car());
    s.push2(new Bird());
    myCar = (Car) s.pop();
    System.out.println("The first element in the list: " + s);
    myBird = (Bird) s.bottom();
    System.out.println("The last element in the list: " + myBird);
  }
}

class Car {
  String car1, car2, car3, car4;

  Car() {
    car1 = "Benz";
    car2 = "Toyoto";
    car3 = "Alto";
    car4 = "creata";
  }
}

class Bird {
  String bird1, bird2, bird3;

  Bird() {
    bird1 = "parrot";
    bird2 = "duck";
    bird3 = "raven";
  }
}
