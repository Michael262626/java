import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class ListOfDigitsTest{
@Test
	public void testListOfDigits(){
	ListOfDigits listofdigits = new ListOfDigits();
	int numbers = 2342;
	int[] list = ListOfDigits.returnDigits(numbers);
	
	int[] expected = {2, 3, 4, 2};
	assertArrayEquals(expected, list);
	}
}