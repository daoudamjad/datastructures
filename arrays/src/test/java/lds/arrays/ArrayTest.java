package lds.arrays;

import junit.framework.TestCase;

/**
 *
 * @author avillanueva
 */
public class ArrayTest extends TestCase {
  public ArrayTest(String testName) {
    super(testName);
  }
  
  // Does nothing currently.
  protected void setUp() throws Exception {
    super.setUp();
  }

  /**
   * Test of doNothing method, of class Array.
   */
  public void testDoNothing() {
    System.out.println("doNothing test - start");
    Array instance = new Array();
    assertEquals(true, instance.doNothing());
    assertTrue(instance.doNothing());
    System.out.println("doNothing test - end");
  }
}
