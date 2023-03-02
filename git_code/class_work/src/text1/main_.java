package text1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class main_ {
    public static void main(String[] args) {
        functions functions = new functions();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请选择:(1-4,5回退,6退出)");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:functions.judge();break;
                case 2:functions.sub();break;
                case 3:functions.reverse();break;
                case 4:functions.capitalize();break;
                case 6:
                    System.out.println("结束");return;

            }
        }


    }

}
