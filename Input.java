
import java.util.Scanner;

public class Input implements InputInterface {
    static Scanner in = new Scanner(System.in);

    @Override
    public String getAction(String action) {
        in.nextLine();
        System.out.printf("%s", action);
        return in.nextLine();
    }

    @Override
    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

}
