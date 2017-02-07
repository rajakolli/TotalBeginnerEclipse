package org.totalbeginnereclipse.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		Book b1 = new Book ("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.autor);
	}
	
	@Test
	public void testGetPerson() {
		Book b2 = new Book("War And Peace");
		Person p2 = new Person();
		p2.setName("Vijaya");
		
		//methods to say book is loaned to this person
		b2.setPerson(p2);
		
		//get the name of the person who has the book
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
				
		String testName = b2.getPerson().getName();
		assertEquals("Vijaya", testName);
	}
	
	@Test
	public void testToString() {
		Book b2 = new Book("War And Peace");
		Person p2 = new Person();
		p2.setName("Vijaya");
		
		assertEquals("War And Peace by unknown author; Available", b2.toString()); 
		
		b2.setPerson(p2);
		assertEquals("War And Peace by unknown author; Checked out to Vijaya", b2.toString());
	}
}
