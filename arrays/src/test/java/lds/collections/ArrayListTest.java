package lds.collections;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author Andric Villanueva
 */
@RunWith(JUnit4.class)
public class ArrayListTest {
  /**
   * Test of clear method, of class ArrayList.
   */
  @Test
  public void mainTest() {
    System.out.println("Hello World!");

    ArrayList<Integer> mrpotatoes = new ArrayList<Integer>(6);

    mrpotatoes.insert(1);
    mrpotatoes.insert(2);
    mrpotatoes.insert(3);
    mrpotatoes.insert(4);
    mrpotatoes.insert(5);

    System.out.println("HEY THERE");
    System.out.println(mrpotatoes);

    assertTrue(true);
  }
}

