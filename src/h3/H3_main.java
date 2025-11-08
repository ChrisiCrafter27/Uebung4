package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2f;
        float fahrenheitFloat = 0;
        double celsiusDouble = 14.2d;
        double fahrenheitDouble = 0;

        fahrenheitFloat = celsiusFloat * (9 / 5f) + 32;
        fahrenheitDouble = celsiusDouble * (9 / 5d) + 32;

        //System.out.println("Float: " + fahrenheitFloat);
        //System.out.println("Double: " + fahrenheitDouble);
    }
}
