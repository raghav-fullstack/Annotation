import java.util.ArrayList;
import java.util.List;

public class B {

    @SuppressWarnings(value = {"deprecation"})
    public static void main(String[] args) {
        A a = new A();

        System.out.println(A.string);
        a.myMethod();
        System.out.println(a);

        List list = new ArrayList();
        System.out.println(list);
    }
}
