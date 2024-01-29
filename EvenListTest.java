import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class EvenListTest{
@Test
		public void testEvenList(){
			EvenList evenlist = new EvenList();
			int[] numbers = {1, 2, 3, 4, 5};
			int[] EvenNumber = EvenList.evenNumbers(numbers);
			int[] expected = {2, 4};
		assertArrayEquals(expected, EvenNumber);
		}
}