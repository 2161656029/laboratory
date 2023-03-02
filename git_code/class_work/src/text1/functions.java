package text1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class functions {
    public void judge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期(xxxx-xx-xx):");
        String input = sc.next();
        if(input.equals("5")){
            return;
        }
        String[] s = input.split("-");
        LocalDate day2 = LocalDate.of(Integer.parseInt(s[0]),
                Integer.parseInt(s[1]),Integer.parseInt(s[2]));
        LocalDate day1 = LocalDate.of(1990,1,1);
        long result = ChronoUnit.DAYS.between(day1,day2);
        System.out.println(result);
        long temp = result%5;
        if (temp >= 0 && temp < 4) {
            System.out.println("打鱼");
        }else {
            System.out.println("晒网");
        }

    }
    public void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期1(xxxx-xx-xx):");
        String input1 = sc.next();
        if(input1.equals("5")){
            return;
        }
        String[] s1 = input1.split("-");
        LocalDate day1 = LocalDate.of(Integer.parseInt(s1[0]),
                Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));

        System.out.print("请输入日期2(xxxx-xx-xx):");
        String input2 = sc.next();
        if(input2.equals("5")){
            return;
        }
        String[] s2 = input2.split("-");
        LocalDate day2 = LocalDate.of(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]),
                Integer.parseInt(s2[2]));
        long result = ChronoUnit.DAYS.between(day1, day2);
        System.out.println(day1);
        System.out.println(day2);
        System.out.println("相差："+result+"天");
    }
    public void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String str = sc.next();
        if(str.equals("5")){
            return;
        }
        System.out.print("请输入起始位置和结束位置:(英文逗号','隔开)");
        String[] be = sc.next().split(",");
        if(be[0].equals("5")){
            return;
        }
        String before = str.substring(0,Integer.parseInt(be[0])-1);
        String middle = str.substring(Integer.parseInt(be[0])-1,Integer.parseInt(be[1]));
        String after = str.substring(Integer.parseInt(be[1]));
        char[] chars = middle.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length-1;i >=0;i--){
            result.append(chars[i]);
        }
        System.out.print("反转前:"+ str +"反转后："+before+result+after+"\n");
    }
    public void capitalize(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入2个单词(空格隔开):");
        String input = sc.nextLine();
        if(input.equals("5")){
            return;
        }
        String[] data = input.split(" ");
        System.out.println(Arrays.toString(data));
        char[] temp1 = data[0].toCharArray();
        char[] temp2 = data[1].toCharArray();
        temp1[0] = Character.toUpperCase(temp1[0]);
        temp2[0] = Character.toUpperCase(temp2[0]);
        StringBuilder result = new StringBuilder();
        for (char i :temp1){
            result.append(i);
        }
        result.append(' ');
        for (char j :temp2){
            result.append(j);
        }
        System.out.println(result);

    }
}
