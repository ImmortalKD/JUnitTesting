package jUnitTestingPackage;
//Kartikeya Venugopal E20CSE048
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Kartikeya", "Venugopal");
		assertEquals("KartikeyaVenugopal", result);
	}

}
