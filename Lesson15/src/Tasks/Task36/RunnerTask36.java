package Tasks.Task36;

/*
адание 36
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */

import java.io.IOException;

public class RunnerTask36 {
    public static void main(String[] args) throws IOException {

        Task36 task36 = new Task36();
        task36.showDirectory(task36.showCatalog());
        task36.showFiles(task36.showCatalog());

    }
}
