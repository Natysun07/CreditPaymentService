public class Main {
    public static void main(String[] args) {
        CalkService service = new CalkService();
        int amountCredit = 1_000_000;
        double monthPaymentOneYearCredit = service.calculate(12, amountCredit);
        System.out.println(monthPaymentOneYearCredit);

        double monthPaymentTwoYearsCredit = service.calculate(24, amountCredit);
        System.out.println(monthPaymentTwoYearsCredit);

        double monthPaymentThreeYearsCredit = service.calculate(36, amountCredit);
        System.out.println(monthPaymentThreeYearsCredit);
    }
}