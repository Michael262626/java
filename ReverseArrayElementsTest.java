import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseArrayElementsTest{
@Test
	public void testReverseElementsOfArray(){
		ReverseArrayElements  reverseArrayValue = new ReverseArrayElements();
		int [] collection = {23,12,3,4,5};
		reverseArrayValue.reverseElements(collection);
		int []  reversed ={5,4,3,12,23};
		assertEquals(reversed,collection);
	}
@Test
	public void testReverseElementsOfArray(){
		ReverseArrayElements  reverseArrayValue1 = new ReverseArrayElements();
		int [] collection1 = {23,-12,-3,  -4, -5};
		reverseArrayValue1.reverseElements(collection1);
		int []  reversed1 ={-5, -4, -3,-12,23};
		assertEquals(reversed1,collection1);
	}
}