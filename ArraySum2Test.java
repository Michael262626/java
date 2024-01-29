import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class ArraySum2Test{
@Test
	public void testArraySum2(){
	ArraySum2 arraysum2 = new ArraySum2();
	int[] numbers = {1, 2, 3, 4, 5};
	int sum = ArraySum2.computeSum(numbers);
	int expected = 15;
	assertEquals(expected, sum);
	}
}