import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class FindLargestNumberTest{
@Test
	public void testfindLargestNumberOfArray(){
		FindLargestNumber findlargestNumber = new FindLargestNumber();
			int[] numbers = {5, 2, 8, 1, 9};

			int actual = FindLargestNumber.findLargestNumber(numbers);
			
			int expected = 9;

			assertEquals(expected, actual);
	}
}