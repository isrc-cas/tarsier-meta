 import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        var name = scanner.nextLine();
        System.out.println("How old are you?");
        var old = scanner.nextInt();
        System.out.println("Your name is " + name + ".");
        System.out.println("You are " + old + " years old.");
    }
}
