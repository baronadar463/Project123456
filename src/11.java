import java.util.Random;

public class JavaCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("The random number is: " + x);
    }
}
