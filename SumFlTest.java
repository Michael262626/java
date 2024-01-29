import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class SumFlTest{
@Test
	public void testSumFl(){
	SumFl sumfl = new SumFl();
	int[] numbers = {1, 4, 6, 7, 9};
	int sum = SumFl.computeSum(numbers);
	int expected = 27;
	assertEquals(expected, sum);

	}




}