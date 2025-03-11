public class CtoFTableDisplay {
    public static void main(String[] args) {
        for (int celsius = -100; celsius <= 100; celsius++) {
            System.out.printf("%-10d %10.2f%n", celsius, CtoF(celsius));
        }
    }
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
