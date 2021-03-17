package Tasks.Task36;

import java.io.File;
import java.io.IOException;

public class Task36 {


    public File[] showCatalog() throws IOException {
        File file = new File("Text");

        if (!file.exists()) {
            file.createNewFile();
        }
        return file.listFiles();
    }

    public void showDirectory(File[] list) {
        for (File file : list) {
            if (file.isDirectory()) {
                System.out.println(file.toString());
            }
        }
    }

    public void showFiles(File[] list) {
        for (File file : list) {
            if (file.isFile()) {
                System.out.println(file);
            }
        }
    }
}
