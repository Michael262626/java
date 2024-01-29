import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class OddListTest{
@Test
	public void testOddList(){
		OddList oddlist = new OddList();
		int[] numbers = {2, 4, 6, 8, 10};
		int[] oddNumber = OddList.OddNumbers(numbers);
		int[] expected ={2, 6, 10};
		assertArrayEquals(expected, oddNumber); 



	}





}