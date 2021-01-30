/*
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
 */

public class Task5 {
    public static int main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        int max =0;
        int maxValue = mas[0];
        for(int i=1;i < mas.length;i++) {
            if(mas[i] > maxValue){
            maxValue = mas[i];
        }
        }
        System.out.println("Maximum Value is: "+maxValue);
        return maxValue;


    }
}
