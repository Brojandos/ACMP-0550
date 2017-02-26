import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        System.out.print(((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? "12" : "13") + "/09/");
        if (year < 10) {
            System.out.print("000" + year);
        } else if (year < 100) {
            System.out.print("00" + year);
        } else if (year < 1000) {
            System.out.print("0" + year);
        } else {
            System.out.print(year);
        }
    }
}