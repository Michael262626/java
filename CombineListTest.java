import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class CombineListTest{
@Test
	public void testCombineList(){
	CombineList combinelist = new CombineList();
	int[] numbers1 = {1, 2, 3};
	int[] numbers2 = {2, 4, 6};
	int[] concatenates = CombineList.concatenatesArrays(numbers1, numbers2);
	int[] expected = {1, 2, 3, 2, 4, 6 };
	assertArrayEquals(expected, concatenates);

	}
}