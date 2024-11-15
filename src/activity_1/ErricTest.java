package activity_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErricTest {

	@Test 
    void testCalculateSimpleInterest() {
        assertEquals(100.0, Erric.calculateSimpleInterest(1000, 5, 2));
    }
 
    @Test
    void testCalculateDiscount() {
        assertEquals(180.0, Erric.calculateDiscount(200, 10));
    }
 
    @Test
    void testFindMinimumValue() {
        int[] array = {10, 20, 5, 7};
        assertEquals(5, Erric.findMinimumValue(array));
    }
}
	


