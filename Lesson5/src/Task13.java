public class Task13 {
    public static void main(String[] args) {
        int array [] = {20, 50, 30, 10, 40};
        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array [index] > array [index + 1]) {
                    int tmp = array [index];
                    array [index] = array [(index + 1)];
                    array [(index + 1)] = tmp;
                }
            }
        }
        System.out.println(array[array.length-1]);
        }
    }

