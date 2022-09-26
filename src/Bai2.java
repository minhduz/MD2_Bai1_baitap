import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Ứng dụng đổi tiền------");
        System.out.println("1.USD --> VND");
        System.out.println("2.VND --> USD");
        System.out.print("Enter your choice: ");
        int opt = scanner.nextInt();
        switch (opt){
            case 1:
                System.out.print("Input value: ");
                double value1 = scanner.nextDouble();
                System.out.printf("%.2f USD = %.2f VND",value1,value1*23000);
                break;
            case 2:
                System.out.print("Input value: ");
                double value2 = scanner.nextDouble();
                System.out.printf("%.2f VND = %.2f USD",value2,value2/23000);
                break;
        }
    }
}
