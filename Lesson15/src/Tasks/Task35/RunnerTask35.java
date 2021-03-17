package Tasks.Task35;

import java.io.IOException;

public class RunnerTask35 {
    public static void main(String[] args) throws IOException {

        Task35 task35 = new Task35();

        System.out.println(task35.ReadFromFile());
        System.out.println(task35.average());
    }
}
