public class Main {
public static void main(String[] args) {

double balance = 1000.00;
System.out.println("===== Compound Growth Tracker =====");

    System.out.println("Initial Balance: " + balance);
    balance += 350;

    System.out.println("After Adding 350: " + balance);
    balance *= 1.10;

    System.out.println("After 10% Growth: " + balance);
    balance += 200;

    System.out.println("After Adding 200: " + balance);

    int count = 5;

    System.out.println("\nPostfix Increment (count++) ");
    System.out.println("Inside println: " + count++);
    System.out.println("After println: " + count);

    count = 5;

    System.out.println("\nPrefix Increment (++count) ");
    System.out.println("Inside println: " + (++count));
    System.out.println("After println: " + count);

    }
}
