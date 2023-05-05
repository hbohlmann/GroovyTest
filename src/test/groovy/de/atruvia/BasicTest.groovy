package de.atruvia

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class BasicTest {

	@Test
	void testSimple() {
		assertEquals(romanToArabic(1), "I")
		assertEquals(romanToArabic(2), "III")
	}

	
	String romanToArabic(int arabic) {
		return "I" * arabic
	}
}
