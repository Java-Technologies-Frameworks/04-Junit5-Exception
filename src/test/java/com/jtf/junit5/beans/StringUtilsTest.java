package com.jtf.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	public void testConvertToIntNullParameterAssertThrows() {
		String str =null;
		assertThrows(IllegalArgumentException.class, () -> StringUtils.convertToInt(str));
	}
}
