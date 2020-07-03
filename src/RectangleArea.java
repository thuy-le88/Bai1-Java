import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width: ");
        width=sc.nextFloat();
        System.out.println("Enter height: ");
        height=sc.nextFloat();
        float rectArea=width*height;
        System.out.println("Rectangle area is: "+rectArea);
    }
}
