import java.util.Scanner;
public class CountDays {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month which you would like to count days: ");
        month=sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //System.out.println("Numbers of day in month is: 31 days");
                daysInMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //System.out.println("Numbers of day in month is: 30 days");
                daysInMonth="30";
                break;
            case 2:
                //System.out.println("Numbers of day in month is 28 or 29 days");
                daysInMonth="28 or 29";
                break;
            default:
                daysInMonth="";
        }
        if (daysInMonth != "") {
            System.out.printf("The month '%d' has %s days!",month,daysInMonth);
        }
        else {
            System.out.println("Invalid.");
        }
    }
}
