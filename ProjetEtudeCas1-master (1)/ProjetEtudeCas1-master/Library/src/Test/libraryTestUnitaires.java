package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.benoit.epsi.library.Book;
import com.benoit.epsi.library.Client;
import com.benoit.epsi.library.Library;
import com.benoit.epsi.library.LibraryException;
import com.benoit.epsi.library.Status;

class libraryTestUnitaires  {
	
	private Library lib;
	


	@Test
	void testGetBook() {
		try {
		 Book livre= new Book("l1","jhon","truc","9782953341300",Status.FREE);
		 Book livre2= new Book("l2","david","machin","9782943341300",Status.FREE);
		 ArrayList<Book>livres= new ArrayList<Book> ();
		 livres.add(livre);
		 livres.add(livre2);
		 Client c = new Client("Gary");
		 Client c2 = new Client("Louis");
		 ArrayList<Client>clients= new ArrayList<Client> ();
		 clients.add(c);
		 clients.add(c2);
		 lib = new Library(livres,clients);
		 assertEquals(livres.get(0),lib.getBook("l1"));
		}catch(LibraryException e) {}	
		
		
	}

	@Test
	void testAddBook() {
		fail("Not yet implemented");
	}

	

	@Test
	void testBorrowBook() {
		fail("Not yet implemented");
	}

	@Test
	void testReturnBook() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBooks() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchBooks() {
		fail("Not yet implemented");
	}

}
