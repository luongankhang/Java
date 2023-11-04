package fa.training.main;

import fa.training.entities.Rectangle;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hình chữ nhật: ");
        int n = scanner.nextInt();

        Rectangle[] rectangles = new Rectangle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập chiều dài của hình chữ nhật thứ " + (i + 1) + ": ");
            int length = scanner.nextInt();
            System.out.print("Nhập chiều rộng của hình chữ nhật thứ " + (i + 1) + ": ");
            int width = scanner.nextInt();

            rectangles[i] = new Rectangle();
            rectangles[i].setLengthWidth(length, width);
        }

        int maxArea = Integer.MIN_VALUE;
        int minPerimeter = Integer.MAX_VALUE;
        Rectangle maxAreaRectangle = null;
        Rectangle minPerimeterRectangle = null;

        for (int i = 0; i < n; i++) {
            Rectangle rectangle = rectangles[i];
            int area = rectangle.calculateArea();
            int perimeter = rectangle.calculatePerimeter();

            System.out.println("Hình chữ nhật thứ " + (i + 1) + " - Chiều dài: " + rectangle.getLength() + ", Chiều rộng: " + rectangle.getWidth());
            System.out.println("Chu vi: " + perimeter + ", Diện tích: " + area);

            if (area > maxArea) {
                maxArea = area;
                maxAreaRectangle = rectangle;
            }

            if (perimeter < minPerimeter) {
                minPerimeter = perimeter;
                minPerimeterRectangle = rectangle;
            }
        }

        System.out.println("Hình chữ nhật có diện tích lớn nhất:");
        System.out.println("Chiều dài: " + maxAreaRectangle.getLength() + ", Chiều rộng: " + maxAreaRectangle.getWidth());
        System.out.println("Chu vi: " + maxAreaRectangle.calculatePerimeter() + ", Diện tích: " + maxAreaRectangle.calculateArea());

        System.out.println("Hình chữ nhật có chu vi nhỏ nhất:");
        System.out.println("Chiều dài: " + minPerimeterRectangle.getLength() + ", Chiều rộng: " + minPerimeterRectangle.getWidth());
        System.out.println("Chu vi: " + minPerimeterRectangle.calculatePerimeter() + ", Diện tích: " + minPerimeterRectangle.calculateArea());
    }
}
