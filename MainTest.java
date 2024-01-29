import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class MainTest{
@Test
	public void testMain(){
		Main main = new Main();
		
		int[] check = {1, 2, 3, 4, 5};
		boolean numberInList = Main.checkElement(check, 3);
		boolean elementToCheck = true;

		assertEquals(elementToCheck, numberInList);


	}



}