package fr.usmb.idu.money;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMoney() {
		Money m = new Money(5,"USD");
		assertEquals(5.0, m.getAmount(), 0.01);

		assertEquals("USD", m.getCurrency());

		assertThrows(NullPointerException.class, () -> {
			new Money(5, null);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Money(5, "");
		});
	}

	@Test
	void testAmount() {
		fail("Not yet implemented");
	}

	@Test
	void testCurrency() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

}
