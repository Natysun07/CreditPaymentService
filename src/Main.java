public class Main {
    public static void main(String[] args) {
        CalkService service = new CalkService();
        int amountCredit = 1_000_000;
        double percent = 9.99;
        int month = 12;
        int paymentMonth = 36;
        double payment = service.calculate(amountCredit, percent, month, paymentMonth);
        payment = (int) payment;
        System.out.println(payment);
    }
}