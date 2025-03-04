package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstPracApp {

    public static void main(String[] args) {

        String str1;
        String str2;
        String operator;
        String exit = "";

        int num1;
        int num2;
        int num3;
        int result;

        boolean bool1 = false;
        boolean bool2 = false;

        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        NumberCheck chk = new NumberCheck();
        FirstCalculator cal = new FirstCalculator();

        do {
            System.out.println();
            System.out.println("계산할 숫자 두개를 입력하세요.");
            str1 = sc.nextLine();
            str2 = sc.nextLine();

            bool1 = chk.checkNum1(str1);
            bool2 = chk.checkNum2(str2);
        } while(!bool1 || !bool2);

        num1 = chk.getNum1(str1);

        do{
            num2 = chk.getNum2(str2);

            System.out.println("+, -, *, / 중 골라주세요.");
            operator = sc.nextLine();

            result = cal.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            System.out.println("종료하시려면 exit를 입력해주세요. (계속 하시려면 아무 키...)");
            exit = sc.nextLine();

            do {
                if(!exit.equals("exit")) {
                    num3 = result;
                    num1 = num3;

                    System.out.println("계산할 숫자를 입력해주세요.");
                    str2 = sc.nextLine();
                    bool2 = chk.checkNum2(str2);
                }
            } while(!bool2);

        } while(!exit.equals("exit"));

        System.out.println();
        System.out.println("종료합니다.");
    }
}
