package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;

        boolean a = false;
        boolean b = false;
        boolean c = false;

        int input = 0;

        x = input == 10 || input == 11;
        y = input == 11 || input == 01;

        boolean e1 = x;
        boolean e2 = y;
        boolean e3 = x != y;

        a = e1 && e2;
        b = e1 || e3;
        c = !y;
    }
}
