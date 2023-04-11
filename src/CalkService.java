public class CalkService {
    public double calculate(int amountCredit, double percent, int month, int paymentMonth) {
        double monthPercent;
        double monthPayment;
        double degree;
        double amount;
        monthPercent = percent / month /100;
        amount = (1 + monthPercent);
        degree = Math.pow(amount, paymentMonth);

        monthPayment = amountCredit * monthPercent * (degree) / ((degree) - 1);
        return monthPayment;


    }
}
