import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "^4\\d{15}";
        String masterCardRegex1 = "^(5[1-5])\\d{14}";
        String masterCardRegex2 = "^(222[1-9]|22[3-9]\\d|2[3-6]\\d{2}|27[01]\\d|2720)\\d{12}";
        String americanExpressRegex = "^(34|37)\\d{13}";

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex1) || card.matches(masterCardRegex2)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}
