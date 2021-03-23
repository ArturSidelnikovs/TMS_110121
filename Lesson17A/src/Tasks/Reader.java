package Tasks;

import java.util.List;

public class Reader {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reader(String name) {
        this.name = name;
    }

    public void takeBookForReading(List <LibraryOfBooks> books) {
        try {
            StringBuffer sb = new StringBuffer("");
            if (books.size() != 0) {
                for (int i = 0; i <2; i++) {
                    if (books.size() > 1 && i != books.size() - 1) {
                        sb.append(books.get(i).getName()).append(",");
                    }
                }
                System.out.println(name + " of the " + Thread.currentThread().getName() + " is taking books " + sb + " for reading.");
                Thread.sleep(5000);
                System.out.println(name + " of the " + Thread.currentThread().getName() + " is returning books " + sb + " to the library.");
            } else {
                System.out.println(name + " of the " + Thread.currentThread().getName() + " took nothing,and with sadness in his eyes went to home.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }


