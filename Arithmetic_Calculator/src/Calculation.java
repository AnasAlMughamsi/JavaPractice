public class Calculation {

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        System.out.println(calculation.addition(2, 5));
        System.out.println(calculation.subtraction(2, 5));
        System.out.println(calculation.multiplication(2, 5));
        System.out.println(calculation.division(4, 2));
    }
}
