package Lv3;

import Lv2.Calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("*********Lv3.계산기를 실행하셨습니다!*********");

        //인스턴스화
        ArithmeticCalculator<Double> calculate = new ArithmeticCalculator<>(0);

        Scanner sc = new Scanner(System.in);
        String exit = "";

        //숫자가 아닐 경우를 위해 예외처리
        double num1 = ExceptionHandler.validateNumber(sc, "Lv3) 첫번째 숫자를 입력해주세요.");
        double num2 = ExceptionHandler.validateNumber(sc, "Lv3) 두번째 숫자를 입력해주세요.");

        do {
            System.out.println("+, -, *, / 중 하나를 입력해주세요.");
            String operator = sc.next();

            //계산 후 결과값 도출
            calculate.calculator(num1, num2, operator);
            double result = calculate.getResult();

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("종료하시려면 exit를 입력해주세요. (계속 하시려면 아무 키...)");
            exit = sc.next();
            System.out.println();

            //종료하지 않으면
            if(!exit.equals("exit")) {
                //첫 결과값이 누적값으로 변환
                num1 = result;
                //다시 숫자 입력 후 예외처리
                num2 = ExceptionHandler.validateNumber(sc, "Lv3) 숫자를 입력해주세요.");

            } else {
                System.out.println("종료합니다.");
                break;
            }
        } while(!exit.equals("exit"));
    }
}
