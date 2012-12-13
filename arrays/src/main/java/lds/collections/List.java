package lds.collections;

/**
 * The list implementation
 *
 * The fully qualified name is used because the name for the interface is List
 * and would be "cyclic inheritance" but I want to keep the name for the
 * interface easy and clean to remember in it's own package. So there's the
 * reasoning for the fully qualified name space for List.
 *
 * @author Andric Villanueva
 */
class List<GENERIC> implements lds.collections.interfaces.List<GENERIC> {
   // Default size
  protected static final int defaultSize = 10;

  // Maximum size of list
  protected int maxSize;

  // Current # of list items
  protected int listSize;

  // Position of current element
  protected int curr;

  // Array holding list elements
  protected GENERIC[] listArray;

  /**
   * Create a list with the default capacity.
   */
  List() {
    // Can't say that I knew I could do this.
    this(defaultSize);
  }

  /**
   * Create a new list object.
   *
   * @param
   *   size Max number of elements list can contain.
   */
  @SuppressWarnings("unchecked")
  List(int size) {
    maxSize = size;
    listSize = curr = 0;
    listArray = (GENERIC[]) new Object[size];
  }

  /**
   * Reinitialize the list.
   *
   * This doesn't remove the objects from memory but it resets the pointers.
   * Essentially this is fine as an array will take up the amount of memory that
   * is defined as a primitive array in Java takes up the bytes of the type that
   * is stored within times the length of the array.
   */
  public void clear() {
    listSize = curr = 0;
  }

  /**
   * Insert "it" at current position
   */
  public void insert(GENERIC it) {
    assert listSize < maxSize : "List capacity exceeded";

    // Shift elements up.
    for (int i = listSize; i > curr; i--) {
      // To make room.
      listArray[i] = listArray[i - 1];
    }

    listArray[curr] = it;
    listSize++;
  }

  /**
   * Append a an object to the list.
   */
  public void append(GENERIC it) {
    assert listSize < maxSize : "List capacity exceeded";
    listArray[listSize++] = it;
  }

  /**
   * Remove and return the current element
   */
  public GENERIC remove() {
    // No current element.
    if ((curr < 0) || (curr >= listSize)) {
      return null;
    }

    // Copy the element.
    GENERIC it = listArray[curr];

    // Shift them down.
    for (int i = curr; i < listSize - 1; i++)  {
      listArray[i] = listArray[i + 1];
    }

    // Decrement size
    listSize--;

    return it;
  }

  // Set to front
  public void moveToStart() {
    curr = 0;
  }

  public void moveToEnd() {
    curr = listSize;
  }

  // Back up
  public void prev() {
    if (curr != 0) {
      curr--;
    }
  }

  public void next() {
    if (curr < listSize) {
      curr++;
    }
  }

  /**
   * @return List size
   */
  public int length() {
    return listSize;
  }

  /**
   * @return Current position
   */
  public int currPos() {
    return curr;
  }

  /**
   * Set current list position to "pos"
   */
  public void moveToPos(int pos) {
    assert (pos >= 0) && (pos <= listSize) : "Pos out of range";
    curr = pos;
  }

  /**
   * @return Current element
   */
  public GENERIC getValue() {
    assert (curr >= 0) && (curr < listSize) : "No current element";
    return listArray[curr];
  }

  /**
   * Generate a human-readable representation of this list's contents.
   *
   * that looks something like this: < 1 2 3 | 4 5 6 >. The vertical bar
   * represents the current location of the fence. This method uses toString()
   * on the individual elements.
   *
   * @return The string representation of this list.
   */
  public String toString() {
    // Save the current position of the list.
    int oldPos = currPos();
    int length = length();

    StringBuilder out = new StringBuilder((length() + 1) * 4);

    moveToStart();
    out.append("< ");

    for (int i = 0; i < oldPos; i++) {
      out.append(getValue());
      out.append(" ");
      next();
    }

    out.append("| ");

    for (int i = oldPos; i < length; i++) {
      out.append(getValue());
      out.append(" ");
      next();
    }

    out.append(">");
    moveToPos(oldPos); // Reset the fence to its original position

    return out.toString();
  }
}
