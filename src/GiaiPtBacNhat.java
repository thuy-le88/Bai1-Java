import java.util.Scanner;
public class GiaiPtBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=sc.nextDouble();
        System.out.println("Enter b: ");
        b=sc.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double answer=(-b)/a;
            System.out.println("Phương trình có một nghiệm duy nhất là: "+answer);
            //System.out.printf("Phương trình có một nghiệm duy nhất x=%f!\n",answer);
        }
    }
}
