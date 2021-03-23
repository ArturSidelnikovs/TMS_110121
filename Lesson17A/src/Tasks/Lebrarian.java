package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Lebrarian extends Thread {

    private List<LibraryOfBooks> books;
    private List<Reader> readers;
    private Random random = new Random();
    private ReentrantLock lock = new ReentrantLock();

    public List<LibraryOfBooks> getBooks() {
        return books;
    }

    public void setBooks(List<LibraryOfBooks> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }


    public ReentrantLock getLock() {
        return lock;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }

    public Lebrarian(String name, List<LibraryOfBooks> books) {
        super(name);
        this.books = books;
        readers = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            readers.add(new Reader("Reader " + (i + 1)));
        }
    }


            @Override
            public  void run () {
                for (Reader reader : readers) {
                List<LibraryOfBooks> books1 = new ArrayList<>();
                lock.lock();
                {
                    for (int i = 0; i < 2; i++) {
                        LibraryOfBooks book = books.get(random.nextInt(books.size()));
                        books.add(book);
                    }
                    reader.takeBookForReading(books);
                }
            }
                lock.unlock();

            }
    }


