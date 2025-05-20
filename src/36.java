import java.util.Scanner;

public class Project123456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入一个数字:");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " 是偶数");
        } else {
            System.out.println(number + " 不是偶数");
        }
        
        scanner.close();
    }
}
