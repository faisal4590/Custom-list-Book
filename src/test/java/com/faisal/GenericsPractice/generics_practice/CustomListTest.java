package com.faisal.GenericsPractice.generics_practice;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class CustomListTest {

	@Test
	public void addBook() {
		CustomList<Book> actualBookList = new CustomList<Book>();

		Book book1 = new Book("sad", "123", "gfc", LocalDate.of(2012, 3, 5), 123.32);
		Book book2 = new Book("faisal", "2123", "fas", LocalDate.of(2014, 7, 5), 312.32);

		actualBookList.add(book1);
		// testing if the book1 is added to the list or not
		assertTrue(actualBookList.get(0).equals(book1));

		actualBookList.add(book2);
		// testing if the book2 is added to the list or not
		assertTrue(actualBookList.get(1).equals(book2));

	}

	@Test
	public void addAt() {
		CustomList<Book> actualBookList = getSomeBookInitial();

		Book bk = new Book("addAt", "4124", "cxvv", LocalDate.of(2017, 12, 4), 312.32);

		actualBookList.addAt(2, bk);
		assertEquals(bk, actualBookList.get(2));

	}

	@Test
	public void get() {
		CustomList<Book> actualBookList = getSomeBookInitial();

		Book bk1 = new Book("Data", "23112", "hasdd", LocalDate.of(2015, 3, 5), 9801.31);
		Book bk2 = new Book("Python", "98731", "czxca", LocalDate.of(2017, 5, 7), 5565.31);

		assertEquals(bk2, actualBookList.get(actualBookList.find(bk2)));

	}

	/*
	 * @Test public void addAll() { CustomList<Book> actuaBookList =
	 * getSomeBookInitial();
	 * 
	 * Book[] bk = new Book[3];//allocating three books bk[0] = new Book("add1",
	 * "3312", "bjulls", LocalDate.of(2015, 3, 5), 12313); bk[1] = new Book("add2",
	 * "4122", "cczaa", LocalDate.of(2011, 12, 4), 44441);
	 * 
	 * int changeLength = actuaBookList.size() + 2;//as we are adding 2 new books,
	 * we made some space actuaBookList.addAll(c)(); }
	 */

	@Test
	public void remove() {
		CustomList<Book> actualBookList = getSomeBookInitial();
		Book bk = new Book("sad", "123", "gfc", LocalDate.of(2012, 3, 5), 123.32);
		actualBookList.remove(bk);
		// if contains method returns false, that means the book is not in the list
		// anymore that means it is removed successfully
		assertEquals(false, actualBookList.contains(new Book("sad", "123", "gfc", LocalDate.of(2012, 3, 5), 123.32)));

	}

	@Test
	public void removeAt() {
		CustomList<Book> actualBookList = getSomeBookInitial();
		actualBookList.removeAt(1);
		assertEquals(false, actualBookList.contains(new Book("sad", "123", "gfc", LocalDate.of(2012, 3, 5), 123.32)));
	}

	@Test
	public void find() {
		CustomList<Book> actualBookList = getSomeBookInitial();
		Book bk = new Book("Python", "98731", "czxca", LocalDate.of(2017, 5, 7), 5565.31);
		// This bk book is at 2nd index(index 1)
		assertEquals(1, actualBookList.find(bk));

	}

	@Test
	public void replaceFunctionTest() {
		CustomList<Book> actualBookList = getSomeBookInitial();
		Book bkBook = new Book("Faisal Ibn Aziz", "98731", "czxca", LocalDate.of(2017, 5, 7), 5565.31);
		actualBookList.replace(2, bkBook);

		assertEquals(bkBook, actualBookList.get(2));

	}

	public static CustomList<Book> getSomeBookInitial() {
		// some random books that is added to the list initially.
		CustomList<Book> actualBookList = new CustomList<Book>();

		Book book1 = new Book("pre1", "123", "gfc", LocalDate.of(2012, 3, 5), 123.32);
		Book book2 = new Book("Python", "98731", "czxca", LocalDate.of(2017, 5, 7), 5565.31);

		actualBookList.add(book1);
		actualBookList.add(book2);

		return actualBookList;

	}

	/*
	 * public void showAllBook(CustomList<Book> bkList) { for (int i = 0; i <
	 * bkList.size(); i++) { System.out.println(bkList.get(i)); } }
	 */

}
