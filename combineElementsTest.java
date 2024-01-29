import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class combineElementsTest{
@Test
	public void testcombineElements(){
	combineElements combineelements = new combineElements();
	String[] words = {"a", "b", "c"};
	String[] numbers = {"1", "2", "3"};

	Object[] combine = combineElements.combineArrays(words, numbers);
	String[] expected = {"a", "1", "b", "2", "c", "3"};
	assertArrayEquals(expected, combine);
	}
}