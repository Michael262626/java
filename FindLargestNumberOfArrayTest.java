import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class FindLargestNumberTest{
@Test
	public void testFindLargestNumberOfArray(){
		FindLargestNumber findlargestNumber = new FindLargestNumber();
			int[] numbers = {5, 2, 8, 1, 9};

			int max = numbers[0];
			
			int expected = (max.checkFindLargestNumberOfArray(givenArray));
			assertEquals(9,expected);
	}
}