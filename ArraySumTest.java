import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class ArraySumTest{
@Test
	public void testArraySum(){
	ArraySum arraysum = new ArraySum();
	int[] numbers = {1, 2, 3, 4, 5};
	int sum = ArraySum.computeSum(numbers);
	int expected = 15;
	assertEquals(expected, sum);
	}
}