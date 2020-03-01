package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.calc;

public class cTest {

	@Test
	public void test() {
		assertEquals(15, calc.add(10,5));
	}

}
