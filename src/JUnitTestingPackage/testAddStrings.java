package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUintFunction jufStrings = new JUintFunction();
		String result = jufStrings.addStrings("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
