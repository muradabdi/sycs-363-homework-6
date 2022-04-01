package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	@Test
	@DisplayName("Test case for the intersect function")
	public void testIntersect() {
	
		IntegerSet actual = new IntegerSet();
		actual.add(5);
		actual.add(7);
		actual.add(2);

		IntegerSet set2 = new IntegerSet();
		set2.add(8);
		set2.add(2);
		set2.add(7);
		
		// Actual
		actual.intersect(set2);
		
		// Expected is [7,2]
		String expected = "[7, 2]";

		assertEquals(expected, actual.toString());

	}
	
	@Test
	@DisplayName("Test case for the equals function")
	public void testEquals() {

		IntegerSet set1 = new IntegerSet();
		set1.add(8);
		set1.add(8);
		set1.add(2);

		IntegerSet set2 = new IntegerSet();
		set2.add(7);
		set2.add(2);
		set2.add(7);

		// Actual
		boolean actual = set1.equals(set2);
		
		// Expected
		boolean expected = false;

		assertEquals(expected, actual);

	}
	
	@Test
	@DisplayName("Test case for the add function")
	public void testAdd() {
		
		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(9);
		actual.add(10);
		
		// Expected
		String expected = "[9, 10]";

		assertEquals(expected, actual.toString());

	}
	
	@Test
	@DisplayName("Test case for the removeItem function")
	public void testRemove() {
			
		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(1);
		actual.add(2);
		actual.add(3);

		actual.remove(0);
		
		// Expected
		String expected = "[2, 3]";

		assertEquals(expected, actual.toString());

	}
	
	@Test
	@DisplayName("Test case for the smallest function")
	public void testSmallest() throws IntegerSetException {
			
		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(5);
		actual.add(-100);
		actual.add(0);
		actual.add(0);
		
		// Expected
		int expected = -100;

		assertEquals(expected, actual.smallest());

	}
	
	@Test
	@DisplayName("Test case for the largest function")
	public void testLargest() throws IntegerSetException {
			
		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(6);
		actual.add(-1);
		actual.add(18);
		actual.add(24);
		
		// Expected
		int expected = 24;

		assertEquals(expected, actual.largest());

	}

	@Test
	@DisplayName("Test case for the diff function")
	public void testDiff() {
			
		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(5);
		actual.add(7);
		actual.add(4);
		actual.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		set2.add(7);
		set2.add(4);
		set2.add(3);
		
		actual.diff(set2);
		
		// Expected
		String expected = "[]";

		assertEquals(expected, actual.toString());

	}

	@Test
	@DisplayName("Test case for the union function")
	public void testUnion() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(5);
		actual.add(7);
		actual.add(4);
		actual.add(3);

		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		set2.add(7);
		set2.add(4);
		set2.add(3);

		actual.diff(set2);
		
		// Expected
		String expected = "[]";

		assertEquals(expected, actual.toString());

	}
	
	@Test
	@DisplayName("Test case for the length function")
	public void testLength() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(1);
		actual.add(2);
		actual.add(4);
		actual.add(0);
		actual.add(0);
		actual.add(-1);
		actual.add(8);
		actual.add(9);
		
		// Expected
		int expected = 7;

		assertEquals(expected, actual.length());

	}
	
	@Test
	@DisplayName("Test case for the isEmpty function")
	public void testIsEmpty() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(0);
		actual.add(0);
		
		// Expected
		boolean expected = false;

		assertEquals(expected, actual.isEmpty());

	}
	
	@Test
	@DisplayName("Test case for the contains function")
	public void testContains() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(6);
		actual.add(7);
		
		// Expected
		boolean expected = true;

		assertEquals(expected, actual.contains(7));

	}
	
	@Test
	@DisplayName("Test case for the toString function")
	public void testToString() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(2);
		actual.add(1);
		actual.add(3);

		// Expected
		String expected = "[2, 1, 3]";

		assertEquals(expected, actual.toString());

	}
	
	@Test
	@DisplayName("Test case for the getSet function")
	public void testGetSet() {

		// Actual
		IntegerSet actual = new IntegerSet();
		actual.add(0);
		actual.add(-1);
		actual.add(5);

		// Expected
		String expected = "[0, -1, 5]";

		assertEquals(expected, actual.getSet().toString());

	}
	
}
