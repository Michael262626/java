import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GunTest{

	private static Gun pistol;
	@Before
		public void initializer(){
			pistol = new Gun();
		}
	@Test
		public static void shoot(){
			pistol.ammo = 10;
			pistol.shoot();
			assertEquals(9, pistol.ammmo());
		}
	
		public static void isEmpty(){
			pistol.ammo = 0;
			assertTrue(pistol.isEmpty());
		}
		public static void reload(){
			pistol.ammo = 5;
			pistol.reload();
			assertEquals(10 ,pistol.ammo());

		}
		








	}

}











