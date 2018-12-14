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
    int n = data.length;
    int temp = 0;
    for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){
            if(data[j-1] > data[j]){
                //swap elements
                temp = data[j-1];
                data[j-1] = data[j];
                data[j] = temp;
            }
        }
    }
  }
}
