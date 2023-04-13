public class CalkService {
    public double calculate(int term, int amountCredit) {
        double percent = 9.99;
        double monthPercent;
        double degree;
        double amount;
        monthPercent = percent / 12 / 100;
        amount = (1 + monthPercent);
        degree = Math.pow(amount, term);

        int monthPayment = (int) (amountCredit * monthPercent * (degree) / ((degree) - 1));
        return monthPayment;


    }
}
