public class ClassSingletonTest {

    public static void main (String[] args) {
        ClassSingleton instance1 = ClassSingleton.getInstance();

        ClassSingleton instance2 = ClassSingleton.getInstance();
        instance2.setDescription("new value description");

        System.out.println(instance1.getDescription());
        System.out.println(instance2.getDescription());
    }

}
