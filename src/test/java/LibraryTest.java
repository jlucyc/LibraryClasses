import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Books book;
    Books book1;
    Books book2;
    Books book3;

    @Before
    public void setUp() {
        book = new Books("Harry Potter and the Prisoner of Askaban", "Jk Roling", "Fiction");
        book1 = new Books("The Alchemist", "Paulo Coelho", "Fiction");
        book2 = new Books("Small Pleasures", "Clare Chambers", "Fiction");
        book3 = new Books("Normal People", "Sally Rooney", "Fiction");
    }

//    @Test
//    public void CanCountBooksInLibrary(){
//        assertEquals(4, library.bookCount());
//    }

    @Test
    public void add(Books book){
        this.Books.add(book);
    }

}
