package personal.edu;

public class MortgageMain {

    public static void main(String[] args) {
        int counter = 0;
        double minPayment = 57000;
        double remainder = 3_600_000.0;
        double percentage = 12.9;
        double deltaSum = 0.0;
        while (remainder > minPayment) {
            remainder = (remainder - minPayment);
            double delta = (remainder / 100 * percentage / 12);
            remainder = remainder + delta;
            counter++;
            if (counter == 1) {
                deltaSum = delta;
            } else {
                deltaSum = deltaSum + delta;
            }
        }
        System.out.print("You will be able to repay your apartment in ");
        System.out.print(counter + 1);
        System.out.println(" months");
        System.out.print("And you pay to the bank ");
        System.out.println(deltaSum);
    }
}

