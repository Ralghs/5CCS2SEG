/**
 *  An IntegerArray is an array of integers.
 *  This class is developed as part of the Software Engineering Group
 *  Project: Skills and Tools for Software Developers Practical 4:
 *  Test Driven Development with JUnit.
 */
public class IntegerArray {
  private int[] data;
  private void swap(int i, int j) {
    int temp = data[i];
    data[i] = data[j];
    data[j] = temp;
  }

  /**
   * Constructs an IntegerArray object from a given integer array.
   * @param data The given integer array
   */
  public IntegerArray(int[] data) {
    this.data = data.clone();
  }

  /**
   * Returns the current content of the integer array.
   * @return The IntegerArray object as an int[]
   */
  public int[] getArray() {
    return data;
  }

  /**
   * Sorts the contents of the array, from lowest integer to highest.
   */
  public void sort() {
      for (int i = 1; i < data.length; i++) {
          for (int j = i; j > 0; j--) {
              if (data[j] < data[j - 1]) {
                  swap(j, j-1);
              }
          }
      }
  }
}
