package ss1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập số (0 - 999): ");
        int number = sc.nextInt();

        if (number >= 0 && number < 20) {
            readNumberBelowTwenty(number);
        } else if (number >= 20 && number < 100) {
            readNumberBelowHundred(number);
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;

            String hundredsWord = "";
            switch (hundreds) {
                case 1:
                    hundredsWord = "One hundred";
                    break;
                case 2:
                    hundredsWord = "Two hundred";
                    break;
                case 3:
                    hundredsWord = "Three hundred";
                    break;
                case 4:
                    hundredsWord = "Four hundred";
                    break;
                case 5:
                    hundredsWord = "Five hundred";
                    break;
                case 6:
                    hundredsWord = "Six hundred";
                    break;
                case 7:
                    hundredsWord = "Seven hundred";
                    break;
                case 8:
                    hundredsWord = "Eight hundred";
                    break;
                case 9:
                    hundredsWord = "Nine hundred";
                    break;
            }

            if (remainder == 0) {
                System.out.println(hundredsWord);
            } else {
                System.out.print(hundredsWord + " and ");
                if (remainder < 20) {
                    readNumberBelowTwenty(remainder);
                } else {
                    readNumberBelowHundred(remainder);
                }
            }
        } else {
            System.out.println("Chương trình chỉ hỗ trợ các số từ 0 đến 999.");
        }

        sc.close();
    }

    
    public static void readNumberBelowTwenty(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;
        }
    }

  
    public static void readNumberBelowHundred(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensWord = "";
        String onesWord = "";

        switch (tens) {
            case 2:
                tensWord = "Twenty";
                break;
            case 3:
                tensWord = "Thirty";
                break;
            case 4:
                tensWord = "Forty";
                break;
            case 5:
                tensWord = "Fifty";
                break;
            case 6:
                tensWord = "Sixty";
                break;
            case 7:
                tensWord = "Seventy";
                break;
            case 8:
                tensWord = "Eighty";
                break;
            case 9:
                tensWord = "Ninety";
                break;
        }

        switch (ones) {
            case 1:
                onesWord = "One";
                break;
            case 2:
                onesWord = "Two";
                break;
            case 3:
                onesWord = "Three";
                break;
            case 4:
                onesWord = "Four";
                break;
            case 5:
                onesWord = "Five";
                break;
            case 6:
                onesWord = "Six";
                break;
            case 7:
                onesWord = "Seven";
                break;
            case 8:
                onesWord = "Eight";
                break;
            case 9:
                onesWord = "Nine";
                break;
        }

        if (ones == 0) {
            System.out.println(tensWord);
        } else {
            System.out.println(tensWord + " " + onesWord);
        }
    }
}

