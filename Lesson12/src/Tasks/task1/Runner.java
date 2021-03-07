package Tasks.task1;

public class Runner {
    public static void main(String[] args) {

        Generics <Number> generics = new Generics<>();

        generics.setIndex1 (new Number[3]);

        generics.getIndex1()[0] = 7.9;
        generics.getIndex1()[1] = -6458;
        generics.getIndex1()[2] = 4040;

        System.out.println(generics.getIndex(2));







    }
}
