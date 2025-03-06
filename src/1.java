import java.util.*;
class Random{
public static void main(String[] args) {
Random rand = new Random();
int n1 = rand.nextInt(6) + 1;
int n2 = rand.nextInt(6) + 1;
System.out.println("Dice Roll: " + n1 + " and " + n2);
}
}