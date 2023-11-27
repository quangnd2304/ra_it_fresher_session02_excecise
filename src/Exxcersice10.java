import java.util.Scanner;

public class Exxcersice10 {
    public static void main(String[] args) {
        /*
         * Input: basicSalary, days
         * Output: salary
         * */
        //B1: Nhap luong co ban va ngay cong thuc te
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao luong co ban:");
        float basicSalary = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao ngay cong thuc te:");
        int days = Integer.parseInt(scanner.nextLine());
        //B2: Tinh luong
        float salary;
        if (days <= 26) {
            salary = basicSalary * days / 26;
        } else {
            salary = basicSalary + (basicSalary / 26) * (days - 26) * 1.5F;
        }
        //B3: In luong
        System.out.println("Luong nhan vien la: " + salary);
    }
}
