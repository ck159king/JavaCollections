package com.JavaCollections;

import java.util.*;

public class ArraysLists {
  public static void main(String[] args) {
    ArrayList fruits = new ArrayList();
    System.out.println("Initial size of arraylist" + fruits.size());
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("PineApple");
    System.out.println("size of fruits after adding fruit" + fruits.size());
    System.out.println("Contents of fruits" + fruits);
    fruits.add(2, "Orange");
    System.out.println("Changed contents of fruits " + fruits);
    fruits.remove(2);
    fruits.remove("PineApple");
    System.out.println("Changed contents after removing elements " + fruits);
  }

}
