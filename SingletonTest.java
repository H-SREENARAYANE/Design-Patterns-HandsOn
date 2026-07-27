public class SingletonTest {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.display();

        if (l1 == l2)
            System.out.println("Only one Logger instance created.");
        else
            System.out.println("Multiple instances created.");
    }
}