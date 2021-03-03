import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet() {
        System.out.println("Hello! My name is " + "Hajuj" + ".");
        System.out.println("I was created in " + "April 2020" + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d\n", i);
        }
    }

    static void test() {
        System.out.println("Would you like to participate in a short Java test?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        int ans = scanner.nextInt();
        switch (ans) {
            case 1:
                System.out.println("Let's test your programming knowledge!");
                System.out.println("First question:");
                System.out.println("Why do we use methods?");
                System.out.println("[1] To repeat a statement multiple times.");
                System.out.println("[2] To decompose a program into several small subroutines.");
                System.out.println("[3] To determine the execution time of a program.");
                System.out.println("[4] To interrupt the execution of a program.");

                while (true) {
                    ans = scanner.nextInt();
                    if (ans == 2) {
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Please, try again.");
                }

                System.out.println("Second question:");
                System.out.println("What is instanceof?");
                System.out.println("[1] An operator and keyword.");
                System.out.println("[2] A keyword only.");
                System.out.println("[3] A methods in object.");
                System.out.println("[4] An operator only.");

                while (true) {
                    ans = scanner.nextInt();
                    if (ans == 1) {
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Please, try again.");
                }

                System.out.println("Third question:");
                System.out.println("What is the appropriate data type for this field: isSwimmer?");
                System.out.println("[1] int");
                System.out.println("[2] String");
                System.out.println("[3] Double");
                System.out.println("[4] Boolean");

                while (true) {
                    ans = scanner.nextInt();
                    if (ans == 4) {
                        System.out.println("Correct!");
                        break;
                    }
                    System.out.println("Please, try again.");
                }
                System.out.println("Congratulations your answers are correct, have a nice day!");
                break;
            case 2:
                System.out.println("Okay, have a nice day!");
                break;
        }
    }
}
