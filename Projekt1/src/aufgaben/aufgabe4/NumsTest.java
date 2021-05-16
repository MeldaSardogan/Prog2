package aufgaben.aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumsTest {

	int [] nums1 = {5,1,2,1,2};
	int [] nums2 = {1,2,1,2};
	int [] nums3 = {1};
	

	@Test
	void test() {
		// given (preperation)		
		// when (execution
		// than (verification)
		
		assertTrue(5 == Nums.singleNumber(nums1), "Input: nums = [5,1,2,1,2] %n Output: 5");
		assertTrue(1==Nums.singleNumber(nums3),"Input: [1] Expected output: 1");
		assertTrue(5==Nums.singleNumber(nums1),"Input: [5,1,2,1,2] Expected output: 5");
		assertTrue(-1==Nums.singleNumber(nums2),"Input: [1,2,1,2] Expected output: -1");
		assertFalse(6==Nums.singleNumber(nums1), "Input: [5,1,2,1,2] Expected output: 5");	
		assertEquals(5, Nums.singleNumber(nums1), "Input: [5,1,2,1,2] Expected output: 5");
		
	}

}
