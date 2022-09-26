import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int num = scanner.nextInt();
        String text1 = null,text2 = null,text3 = null;

        if (num < 0 || num > 999){
            System.out.println("Vui lòng nhập lại sô từ 0 đến 999");
        }

        int hangTram = num/100;
        num = num%100;
        int hangChuc = num/10;
        int hangDoiVi = num%10;

        num = hangTram*100 + hangChuc*10 + hangDoiVi;

        if (num < 10){
            switch (num){
                case 0:
                    System.out.println("Không");
                    break;
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
            }
            return;
        }



        if(num < 20){
            text2 = "Mười";
            switch (hangDoiVi){
                case 0:
                    text3 = "";
                    break;
                case 1:
                    text3 = "Một";
                    break;
                case 2:
                    text3 = "Hai";
                    break;
                case 3:
                    text3 = "Ba";
                    break;
                case 4:
                    text3 = "Bốn";
                    break;
                case 5:
                    text3 = "Lăm";
                    break;
                case 6:
                    text3 = "Sáu";
                    break;
                case 7:
                    text3 = "Bảy";
                    break;
                case 8:
                    text3 = "Tám";
                    break;
                case 9:
                    text3 = "Chín";
                    break;
            }
            System.out.printf("%s %s",text2,text3);
            return;
        }

        if (num < 100){
            switch (hangChuc){
                case 2:
                    text2 = "Hai";
                    break;
                case 3:
                    text2 = "Ba";
                    break;
                case 4:
                    text2 = "Bốn";
                    break;
                case 5:
                    text2 = "Năm";
                    break;
                case 6:
                    text2 = "Sáu";
                    break;
                case 7:
                    text2 = "Bảy";
                    break;
                case 8:
                    text2 = "Tám";
                    break;
                case 9:
                    text2 = "Chín";
                    break;
            }
            switch (hangDoiVi){
                case 0:
                    text3 = "Mươi";
                    break;
                case 1:
                    text3 = "Mươi Mốt";
                    break;
                case 2:
                    text3 = "Mươi Hai";
                    break;
                case 3:
                    text3 = "Mươi Ba";
                    break;
                case 4:
                    text3 = "Mươi Tư";
                    break;
                case 5:
                    text3 = "Mươi Lăm";
                    break;
                case 6:
                    text3 = "Mươi Sáu";
                    break;
                case 7:
                    text3 = "Mươi Bảy";
                    break;
                case 8:
                    text3 = "Mươi Tám";
                    break;
                case 9:
                    text3 = "Mươi Chín";
                    break;
            }
            System.out.printf("%s %s",text2,text3);
            return;
        }


        if ((num <= 110) ||
                (200 <= num && num <= 210) ||
                (300 <= num && num <= 310) ||
                (400 <= num && num <= 410) ||
                (500 <= num && num <= 510) ||
                (600 <= num && num <= 610) ||
                (700 <= num && num <= 710) ||
                (800 <= num && num <= 810) ||
                (900 <= num && num <= 910)){

            switch (hangTram){
                case 1:
                    text1 = "Một Trăm";
                    break;
                case 2:
                    text1 = "Hai Trăm";
                    break;
                case 3:
                    text1 = "Ba Trăm";
                    break;
                case 4:
                    text1 = "Bốn Trăm";
                    break;
                case 5:
                    text1 = "Năm Trăm";
                    break;
                case 6:
                    text1 = "Sáu Trăm";
                    break;
                case 7:
                    text1 = "Bảy Trăm";
                    break;
                case 8:
                    text1 = "Tám Trăm";
                    break;
                case 9:
                    text1 = "Chín Trăm";
                    break;
            }

            switch (hangChuc){
                case 1:
                    text2 = "Mười";
                    break;
                case 0:
                    text2 = "";
                    break;
            }

            switch (hangDoiVi){
                case 0:
                    text3 = "";
                    break;
                case 1:
                    text3 = "Linh Một";
                    break;
                case 2:
                    text3 = "Linh Hai";
                    break;
                case 3:
                    text3 = "Linh Ba";
                    break;
                case 4:
                    text3 = "Linh Tư";
                    break;
                case 5:
                    text3 = "Linh Năm";
                    break;
                case 6:
                    text3 = "Linh Sáu";
                    break;
                case 7:
                    text3 = "Linh Bảy";
                    break;
                case 8:
                    text3 = "Linh Tám";
                    break;
                case 9:
                    text3 = "Linh Chín";
                    break;
            }

            System.out.printf("%s %s%s",text1,text2,text3);
            return;
        }

        if ((num <= 119) ||
                (211 <= num && num <= 219) ||
                (311 <= num && num <= 319) ||
                (411 <= num && num <= 419) ||
                (511 <= num && num <= 519) ||
                (611 <= num && num <= 619) ||
                (711 <= num && num <= 719) ||
                (811 <= num && num <= 819) ||
                (911 <= num && num <= 919)){
            text2 = "Mười";
            switch (hangTram){
                case 1:
                    text1 = "Một Trăm";
                    break;
                case 2:
                    text1 = "Hai Trăm";
                    break;
                case 3:
                    text1 = "Ba Trăm";
                    break;
                case 4:
                    text1 = "Bốn Trăm";
                    break;
                case 5:
                    text1 = "Năm Trăm";
                    break;
                case 6:
                    text1 = "Sáu Trăm";
                    break;
                case 7:
                    text1 = "Bảy Trăm";
                    break;
                case 8:
                    text1 = "Tám Trăm";
                    break;
                case 9:
                    text1 = "Chín Trăm";
                    break;
            }
            switch (hangDoiVi){
                case 1:
                    text3 = "Một";
                    break;
                case 2:
                    text3 = "Hai";
                    break;
                case 3:
                    text3 = "Ba";
                    break;
                case 4:
                    text3 = "Bốn";
                    break;
                case 5:
                    text3 = "Lăm";
                    break;
                case 6:
                    text3 = "Sáu";
                    break;
                case 7:
                    text3 = "Bảy";
                    break;
                case 8:
                    text3 = "Tám";
                    break;
                case 9:
                    text3 = "Chín";
                    break;
            }
            System.out.printf("%s %s %s",text1,text2,text3);
            return;
        }


        if(num<1000){
            switch (hangTram){
                case 1:
                    text1 = "Một Trăm";
                    break;
                case 2:
                    text1 = "Hai Trăm";
                    break;
                case 3:
                    text1 = "Ba Trăm";
                    break;
                case 4:
                    text1 = "Bốn Trăm";
                    break;
                case 5:
                    text1 = "Năm Trăm";
                    break;
                case 6:
                    text1 = "Sáu Trăm";
                    break;
                case 7:
                    text1 = "Bảy Trăm";
                    break;
                case 8:
                    text1 = "Tám Trăm";
                    break;
                case 9:
                    text1 = "Chín Trăm";
                    break;
            }
            switch (hangChuc){
                case 2:
                    text2 = "Hai Mươi";
                    break;
                case 3:
                    text2 = "Ba Mươi";
                    break;
                case 4:
                    text2 = "Bốn Mươi";
                    break;
                case 5:
                    text2 = "Năm Mươi";
                    break;
                case 6:
                    text2 = "Sáu Mươi";
                    break;
                case 7:
                    text2 = "Bảy Mươi";
                    break;
                case 8:
                    text2 = "Tám Mươi";
                    break;
                case 9:
                    text2 = "Chín Mươi";
                    break;
            }

            switch (hangDoiVi){
                case 1:
                    text3 = "Mốt";
                    break;
                case 2:
                    text3 = "Hai";
                    break;
                case 3:
                    text3 = "Ba";
                    break;
                case 4:
                    text3 = "Tư";
                    break;
                case 5:
                    text3 = "Lăm";
                    break;
                case 6:
                    text3 = "Sáu";
                    break;
                case 7:
                    text3 = "Bảy";
                    break;
                case 8:
                    text3 = "Tám";
                    break;
                case 9:
                    text3 = "Chín";
                    break;
            }
            System.out.printf("%s %s %s",text1,text2,text3);
        }
    }
}

