import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualRevolution1Test {

@Test
	public void testSetName() {

	MenstrualRevolution1.menstrualRevolution1 = new MenstrualRevolution1();
	menstrualRevolution1.setName("Michael");
	assertEquals("Michael", menstrualRevolution1.getName());
}
}