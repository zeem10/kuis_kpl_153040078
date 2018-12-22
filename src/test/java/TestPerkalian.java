import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerkalian {

	A kali = new A();
	@Test
	public void test1() {
		assertEquals(0, kali.perkalian(0, 5));
	}

	@Test
	public void test2() {
		assertEquals(2, kali.perkalian(1, 2));
	}
}
