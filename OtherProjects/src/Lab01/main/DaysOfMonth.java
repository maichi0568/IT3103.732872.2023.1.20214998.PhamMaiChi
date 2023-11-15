package Lab01.main;
import java.util.Scanner;

public class DaysOfMonth {

	// Kiem tra thang co hop le khong
    public static int Month(String strMonth) {
        int month = -1;
        if (strMonth.equals("Jan") || strMonth.equals("January") || strMonth.equals("Jan.") || strMonth.equals("1")) {
            month = 1;
            return month;
        } else if (strMonth.equals("Feb") || strMonth.equals("February") || strMonth.equals("Feb.") || strMonth.equals("2")) {
            month = 2;
            return month;
        } else if (strMonth.equals("Mar") || strMonth.equals("March") || strMonth.equals("Mar.") || strMonth.equals("3")) {
            month = 3;
            return month;
        } else if (strMonth.equals("Apr") || strMonth.equals("April") || strMonth.equals("Apr.") || strMonth.equals("4")) {
            month = 4;
            return month;
        } else if (strMonth.equals("May") || strMonth.equals("May.") || strMonth.equals("5")) {
            month = 5;
            return month;
        } else if (strMonth.equals("Jun") || strMonth.equals("June") || strMonth.equals("6")) {
            month = 6;
            return month;
        } else if (strMonth.equals("Jul") || strMonth.equals("July") || strMonth.equals("7")) {
            month = 7;
            return month;
        } else if (strMonth.equals("Aug") || strMonth.equals("August") || strMonth.equals("Aug.") || strMonth.equals("8")) {
            month = 8;
            return month;
        } else if (strMonth.equals("Sep") || strMonth.equals("September") || strMonth.equals("Sept.") || strMonth.equals("9")) {
            month = 9;
            return month;
        } else if (strMonth.equals("Oct") || strMonth.equals("October") || strMonth.equals("Oct.") || strMonth.equals("10")) {
            month = 10;
            return month;
        } else if (strMonth.equals("Nov") || strMonth.equals("November") || strMonth.equals("Nov.") || strMonth.equals("11")) {
            month = 11;
            return month;
        } else if (strMonth.equals("Dec") || strMonth.equals("December") || strMonth.equals("Dec.") || strMonth.equals("12")) {
            month = 12;
            return month;
        } else {
            System.out.println("Pham Mai Chi- 20214998\nThang khong hop le, nhap lai!\n");
            return -1;
        }
    }

    // Kiem tra nam co hop le khong
    public static int Year(String strYear) {
        int year = -1;
        year = Integer.parseInt(strYear);
        if (year < 0 || strYear.length() != 4) {
            System.out.println("Pham Mai Chi- 20214998\nNam khong hop le, nhap lai!\n");
            return -1;
        } else return year;
    }

    // Kiem tra nam nhuan
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int month, year;
        // Yeu cau nguoi dung nhap nam
        do {
            System.out.println("Nhap nam: ");
            String strYear = keyboard.nextLine();
            year = Year(strYear);
        } while (year == -1);
        // Yeu cau nguoi dung nhap thang
        do {
            System.out.println("Nhap thang: ");
            String strMonth = keyboard.nextLine();
            month = Month(strMonth);
        } while (month == -1);
        // In ra so ngay tuong ung
        if (month == 2) {
            if (isLeapYear(year)) {
                System.out.println("So ngay trong thang: 29");
            } else {
                System.out.println("So ngay trong thang: 28");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("So ngay trong thang: 30");
        } else {
            System.out.println("So ngay trong thang: 31");
        }
    }
}