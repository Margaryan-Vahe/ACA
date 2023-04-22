import java.util.Scanner;

public class FifthLesson {
    private static final int ON = 1;
    private static final int OFF = 0;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input your name: ");
//        String myName = scanner.nextLine();
//        switch (myName) {
//            case "Alex" -> System.out.println("Your name is " + myName);
//            case "Bob" -> System.out.println("Your name is " + myName);
//            case "Tom" -> System.out.println("Your name is " + myName);
//            default -> System.out.println("You don't know your name!");
//        }
//        int a = 10;
//        System.out.println(++a);
        int state = 4;
        switch (state){
            case 1 -> System.out.println("On");
            case 0 -> System.out.println("Off");
            default -> System.out.println("E");
        }
    }
}
