import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class ReverseTest{
@Test
	public void testReverseArray(){
		ReverseList reverseList = new ReverseList();
		int[] collection = { 1, 2, 3, 4, 5};
		int [] numbersInReverse = ReverseList.reverse(collection);
		
		int[] reverse = {5, 4, 3, 2, 1};
		assertArrayEquals(reverse, numbersInReverse);



	}
}