import java.util.Scanner;
public class ThrowExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a <18) {
                throw new ArithmeticException("Not eligible to vote");
            }
            else{
                System.out.println("Eligible to vote");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
