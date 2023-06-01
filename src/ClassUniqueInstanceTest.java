public class ClassUniqueInstanceTest {

    public static void main (String[] args){
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        instance1.setClick(11);

        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;
        instance2.setClick(20);

        System.out.println(instance1.getClick());
        System.out.println(instance2.getClick());
    }

}
