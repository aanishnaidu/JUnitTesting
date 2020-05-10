package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUintFunction jufNumbers = new JUintFunction();
		int result = jufNumbers.addNumbers(100,200);
		assertEquals(300,result);
	}

}
