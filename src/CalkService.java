public class CalkService {
    public double calculate(int a, double b, int c, int d) {
        double monthPercent;
        double monthPayment;
        double degree;
        double amount;
        monthPercent = b / c / 100;
        amount = (1 + monthPercent);
        degree = Math.pow(amount, d);

        monthPayment = a * monthPercent * (degree) / ((degree) - 1);
        return monthPayment;


    }
}
