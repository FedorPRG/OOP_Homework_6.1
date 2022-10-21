
import java.util.Scanner;

public class InputKindContin {
    static Scanner in = new Scanner(System.in);
    
    public static int kindValue(String title) {
        System.out.printf("%s", title);        
        return in.nextInt();
    }

    public static int contin(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

}
