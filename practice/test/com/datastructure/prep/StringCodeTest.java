package com.datastructure.prep;

import static org.junit.Assert.*;

import org.junit.Test;

import com.datastructures.prep.StringCode;

public class StringCodeTest {

	@Test
	public void isUniqueCharStringTest() {
		StringCode sc = new StringCode();
		assertFalse(sc.isUniqueCharString("test"));
	}
	
	@Test
	public void isUniqueCharStringTest1() {
		StringCode sc = new StringCode();
		assertTrue(sc.isUniqueCharString("tes"));
	}

}
