package Tasks.task2;

import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Class <MyService> clazz = MyService.class;
        AnalizeServise(clazz);

    }

    public static void AnalizeServise (Class clazz) throws IllegalAccessException, InstantiationException {

        boolean isAnnotated = clazz.isAnnotationPresent(AnnotationMyS.class);
        if (isAnnotated) {
            MyService myService = (MyService) clazz.newInstance();
            myService.setName("ProgrammerService");
            myService.setUsers(1000);
            myService.thisClassInfo();
        } else {
            System.out.println("Аннотация не найдена");
        }
    }
}
