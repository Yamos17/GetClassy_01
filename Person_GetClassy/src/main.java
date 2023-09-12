import java.util.Calendar;

public class main {
    public static void main(String[] args) {

        Person connor = new Person("123456", "Connor", "Helms", "Mr.", 2004);

        System.out.println(connor.getfName());

        connor.setfName("Connor");

        System.out.println(connor.getfName());

        System.out.println(connor);

        System.out.println(connor.toCSV());

        System.out.println(connor.getFullName());

        System.out.println(connor.getFormalName());

        System.out.println(connor.getAge());



    }
}
