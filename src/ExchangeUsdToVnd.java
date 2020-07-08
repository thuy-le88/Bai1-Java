import java.util.Scanner;

public class ExchangeUsdToVnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter exchange rate (VND/USD):");
        int exRate=scanner.nextInt();
        System.out.println("Enter amount of USD: ");
        double usd=scanner.nextDouble();
        double vnd=exRate*usd;
        System.out.println(usd+" USD"+" = "+(int)vnd+" VND.");
    }
}
