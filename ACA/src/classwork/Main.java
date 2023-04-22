package classwork;

public class Main {
    private static int x = 10;
    static {
        x++;
    }
    static {
        ++x;
    }
    {
        x--;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2 = new Main();
        Main obj3 = new Main();
        System.out.println(x);
    }
}





