package lds.collections.interfaces;

/**
 * List Interface.
 *
 * A list is to be a finite, ordered sequence of data items known as elements.
 *
 * An ordered list means that each element has a position in the list but it
 * does not mean that it is sorted.
 *
 * A list is empty when there is no data contained within. The size is stored
 * in a length/size attribute and retrieved with a getter function.
 *
 * The beginning of the list is called the head.
 *
 * The end of the list is called the tail.
 *
 * There might or might not be some relationship between the value of an element
 * and its position in the list. For example, sorted lists have their elements
 * positioned in ascending order of value, while unsorted lists have no
 * particular relationship between element values and positions. - Saffer
 *
 * ?n elements are noted as such:    <a0, a1, ..., an?1?>
 * empty list is noted such as:     <>
 *
 * There are n + 1 current positions. This is because arrays start at 0.
 *
 * Given a list (where the item in brackets is the current position:
 *    <20, 23, [12], 15>
 * If we insert an item [10] the list will look like such:
 *    <20, 23, [10], 12, 15>
 *
 */
public interface List<E> {
  /**
   * Remove all contents from the list, so it is once again empty.
   *
   * Client is responsible for reclaiming storage used by the list elements.
   */
  public void clear();

  /**
   * Insert an element at the current location.
   *
   * The client must ensure that the list's capacity is not exceeded.
   *
   * @param item The element to be inserted.
   */
  public void insert(E item);

  /**
   * Append an element at the end of the list.
   *
   * The client must ensure that the list's capacity is not exceeded.
   *
   * @param item The element to be appended.
   */
  public void append(E item);

  /**
   * Remove and return the current element.
   *
   * @return The element that was removed.
   */
  public E remove();

  /**
   * Set the current position to the start of the list.
   */
  public void moveToStart();

  /**
   * Set the current position to the end of the list.
   */
  public void moveToEnd();

  /**
   * Move the current position one step left.
   *
   * No change if already at beginning.
   */
  public void prev();

  /**
   * Move the current position one step right.
   *
   * No change if already at end.
   */
  public void next();

  /**
   * Get the length of the list.
   *
   * @return The number of elements in the list.
   */
  public int length();

  /**
   * Get the current position of the list.
   *
   * @return The position of the current element.
   */
  public int currPos();

  /**
   * Set current position.
   *
   * @param pos The position to make current.
   */
  public void moveToPos(int pos);

  /**
   * Get the current element.
   *
   * @return The current element.
   */
  public E getValue();
}
