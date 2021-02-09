public class Task18 {
    /*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
     */
    public static void main(String[] args) {
        String str = "https://ru.stackoverflow.com/questions/835178/git-в-idea-Удаление-ответвления";
        int n = 0;
        char symbol;
        for(int i = 0;i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == '-'|| symbol == '/') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");


    }
}
