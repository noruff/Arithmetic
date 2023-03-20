public class Arithmetic {

    private static int a = 10;
    private static int b = 5;
    private static int min = -1;
    private static int max = -1;

    public static void CalculatedMinMax() {

        max = Math.max(a, b);

        min = Math.min(a, b);
    }

    public static void main(String[] args) {
        CalculatedMinMax();

        System.out.println("Сумма: " + (a+b));
        System.out.println("Произведение: " + (a*b));
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
}
