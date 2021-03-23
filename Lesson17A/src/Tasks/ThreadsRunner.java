package Tasks;

/*
1)Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 Некоторые из них можно выдавать на руки некоторые - только в читальный зал.
 Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
 */

import java.util.List;

public class ThreadsRunner {
    public static void main(String[] args) throws InterruptedException {

        DomParser parser = new DomParser();
        List<LibraryOfBooks> libraryList = parser.writeBooksFromXML();

        Lebrarian librarian = new Lebrarian("First librarian", libraryList);
        Lebrarian librarian2 = new Lebrarian("Second librarian", libraryList);
        librarian.start();
        Thread.sleep(100);
        librarian2.start();
    }
}
