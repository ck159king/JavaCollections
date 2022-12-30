
package com.JavaCollections;

import java.util.*;

public class ArraysLists {
  public static void main(String[] args) {
    ArrayList fruits = new ArrayList();
    System.out.println("Initial size of arraylist" + fruits.size());
    arraylist.add("Apple");
    arraylist.add("Banana");
    arraylist.add("Mango");
    arraylist.add("PineApple");
    System.out.println("size of fruits after adding fruit" + fruits.size());
    System.out.println("Contents of fruits" + arraylist);
    arraylist.add(2, "Orange");
    System.out.println("Changed contents of fruits " + arraylist);
    arraylist.remove(2);
    arraylist.remove("PineApple");
    System.out.println("Changed contents after removing elements " + arraylist);
  }

}
