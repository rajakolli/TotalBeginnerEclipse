package org.totalbeginnereclipse.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3,  p1.getMaximumBooks());

	}

	@Test
	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Raja");
		assertEquals("Raja", p2.getName());
	}

	@Test
	public void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(10);
		assertEquals(10, p3.getMaximumBooks());
	}
	
	@Test
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Raja Kolli");
		p4.setMaximumBooks(7);
		String testString = "Raja Kolli (7 books)";
		assertEquals(testString, p4.toString());
	}
	
}
