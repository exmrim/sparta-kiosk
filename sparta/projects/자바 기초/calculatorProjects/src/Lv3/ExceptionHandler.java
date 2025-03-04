package Lv3;

import java.util.Scanner;

public class ExceptionHandler {

    /**
     * 숫자 체크
     * @param sc
     * @param message
     * @return
     */
    public static double validateNumber(Scanner sc, String message) {

        double num = 0;
        boolean isValid = false;

        do {
            System.out.println(message);

            try {
                num = sc.nextDouble();
                isValid = true;
            } catch (Exception e) {
                System.out.println("숫자만 입력해주세요.");
                isValid = false;
                sc.nextLine();
            }
        } while(!isValid);
        return num;
    }

    /**
     * 0으로 나누기 예외 처리
     * @param num1
     * @param num2
     * @return
     */
    public static boolean validateNotZero(double num1, double num2) {

        if(num1 == 0 && num2 == 0) {
            System.out.println("정의되지 않은 결과입니다.");
            return false;
        } else if(num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return false;
        }
        return true;
    }

    /**
     * 연산 기호 체크
     * @param operator
     * @return
     */
    public static boolean validateNotOperator(String operator) {
        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            return true;
        } else {
            System.out.println("잘못된 연산 기호를 입력하셨습니다.");
            return false;
        }
    }




}
