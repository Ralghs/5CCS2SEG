import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IntegerArrayTest{
    @Test
    public void testSort(){
        int[] arrayOne = {3, 2, 1};
        int[] expected = {1, 2, 3};
        IntegerArray test = new IntegerArray(arrayOne);
        test.sort();
        int[] actual = test.getArray();
        assertArrayEquals(expected, actual);
    }
}
