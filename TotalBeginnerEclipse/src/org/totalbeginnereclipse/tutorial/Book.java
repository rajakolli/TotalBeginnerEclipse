package org.totalbeginnereclipse.tutorial;

public class Book {

	public Object title;
	public Object autor;
	private Person person;

	public Book(String string) {
		this.title = string;
		this.autor = "unknown author";
	}

	public Object getAutor() {
		return autor;
	}

	public void setAutor(Object autor) {
		this.autor = autor;
	}

	public Object getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
		
	}

	public Person getPerson() {
		return this.person;
	}
	
	public String toString() {
		String available;
		if(this.getPerson() == null) {
			available = "Available";
		}
		else {
			available = "Checked out to " + this.getPerson().getName();
		}
		return this.getTitle() + " by " + this.getAutor() + "; " + available;
	}



}
