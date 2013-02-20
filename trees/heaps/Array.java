package lds.collections;

import lds.collections.ArrayList;

/**
 *
 * @author avillanueva
 */
public class Array {
  // Use this only for quick tests.
  public static void main(String[] args) {
    System.out.println("Hello World!");

    ArrayList<Integer> mrpotatoes = new ArrayList<Integer>(6);

    mrpotatoes.insert(1);
    mrpotatoes.insert(2);
    mrpotatoes.insert(3);
    mrpotatoes.insert(4);
    mrpotatoes.insert(5);

    System.out.println("HEY THERE");
    System.out.println(mrpotatoes);
  }
}
