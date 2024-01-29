import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class RunningTotalTest{
@Test
	public void testRunningTotal(){
		RunningTotal runningtotal = new RunningTotal();
		int[] numbers = {1, 2, 3, 4, 5};
		int[] total= RunningTotal.totalNumbers(numbers);
		int[] sum = {1, 3, 6, 10, 15};
		assertArrayEquals(sum, total);

	}	
}