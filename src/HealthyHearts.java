import java.util.Scanner;
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        int max = 220 - age;
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");

        System.out.println("Your target HR Zone is " + (int)(max * 0.5) + " - " + (int)(max * 0.85) + " beats per minute");
        input.close();
    }
}
