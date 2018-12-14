import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IntegerArrayTest{
    @Test
    public void testSort(){
        int[] arrayOne = {3, 2, 1};
        int[] expectedOne = {1, 2, 3};
        IntegerArray testOne = new IntegerArray(arrayOne);
        testOne.sort();
        int[] actualOne = testOne.getArray();
        assertArrayEquals(expectedOne, actualOne);


        int[] arrayTwo = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntegerArray testTwo = new IntegerArray(arrayTwo);
        testTwo.sort();
        int[] actualTwo = testTwo.getArray();
        assertArrayEquals(expectedTwo, actualTwo);


        int[] arrayThree = {1, 3, 2, 4, 5, 8, 7, 9, 6};
        int[] expectedThree = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntegerArray testThree = new IntegerArray(arrayThree);
        testThree.sort();
        int[] actualThree = testThree.getArray();
        assertArrayEquals(expectedThree, actualThree);
    }
}
