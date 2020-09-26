// Chapter 8 task 4
// Chapter 8 task 4
// Chapter 8 task 4
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float perimeter, area;
        System.out.println("Length and width for rect1: ");
        Rectangle rect1 = new Rectangle(10,15);
        System.out.printf("Length: %.2f    Width: %.2f\n",rect1.getLength(),rect1.getWidth());
        System.out.println("Perimeter and area for rect1: ");
        perimeter = rect1.calculatePerimeter();
        area = rect1.calculateArea();
        System.out.printf("Perimeter: %.2f    Area: %.2f\n\n",perimeter,area);

        System.out.println("Length and width for rect2: ");
        Rectangle rect2 = new Rectangle(-2,19);
        System.out.printf("Length: %.2f    Width: %.2f\n",rect2.getLength(),rect2.getWidth());
        System.out.println("Perimeter and area for rect2: ");
        perimeter = rect2.calculatePerimeter();
        area = rect2.calculateArea();
        System.out.printf("Perimeter: %.2f    Area: %.2f\n\n",perimeter,area);
    }
}
