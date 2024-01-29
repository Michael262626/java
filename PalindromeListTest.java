import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class PalindromeListTest{
@Test
	public void testPalindromeList(){
		PalindromeList palindromelist = new PalindromeList();
		String word = "level";
		boolean check = PalindromeList.isPalindrome(word);
		boolean result = true;
		assertEquals(result, check);

	}







	}