public class CalkService {
    public double calculate(int a, double b, int c, int d) {
        double monthPercent;
        double monthPayment;
        double degree;
        double x;
        monthPercent = b / c / 100;
        x = (1 + monthPercent);
        degree = Math.pow(x, d);

        monthPayment = a * monthPercent * (degree) / ((degree) - 1);
        return monthPayment;


    }
}
