import java.util.Scanner;

public class Excersice09 {
    public static void main(String[] args) {
        /*
         * Input: number1, number2, number3
         * Output: Descending
         * */
        //B1. Nhap vao 3 so
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so thu hai:");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so thu ba:");
        int number3 = Integer.parseInt(scanner.nextLine());
        //B2. Tim max, min
        int max = number1, min = number1;
        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }
        int otherNumber = (number1 + number2 + number3) - (max + min);
        //B3. In 3 so giam dan
        System.out.printf("3 so sap xep giam dan la: %d %d %d\n", max, otherNumber, min);
    }
}
