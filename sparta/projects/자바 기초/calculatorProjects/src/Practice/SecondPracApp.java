package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPracApp {

    public static void main(String[] args) {

        SecondCalculator calculator = new SecondCalculator();

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        String exit;

        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        do {

            System.out.println("+, -, *, / 중 하나를 입력하세요.");
            char operator = sc.next().charAt(0);

            calculator.calculate(num1, num2, operator);
            int result = calculator.getResult();

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println();
            System.out.println("종료하시려면 exit를 눌러주세요. (계속 하시려면 아무 키를 입력해주세요...)");

            exit = sc.next();
            System.out.println();

            if(!exit.equals("exit")) {
                //num1 = result;

                System.out.println("숫자를 입력하세요.");
                //num2 = sc.nextInt();
                int num3 = sc.nextInt();
            }

        } while(!exit.equals("exit"));

    }
}
