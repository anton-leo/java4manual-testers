package personal.edu;

public class MortgageMain {

    public static void main(String[] args) {

        int counter = 0;
        double minpayment = 57000;
        double remainder = 3_600_000.0;
        double percentage = 12.9;
        double deltasum = 0.0;
        while (remainder > minpayment) {
            remainder = (remainder - minpayment);
            double delta = (remainder / 100 * percentage / 12);
            remainder = remainder + delta;
            counter++;
            if (counter == 1) {
                deltasum = delta;
            } else {
                deltasum = deltasum + delta;
            }
        }
        System.out.print("You will be able to repay your apartment in ");
        System.out.print(counter + 1);
        System.out.println(" months");
        System.out.print("And you pay to the bank ");
        System.out.println(deltasum);
    }
}

