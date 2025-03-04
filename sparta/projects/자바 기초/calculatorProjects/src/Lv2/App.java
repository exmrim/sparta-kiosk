package Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("*********Lv2.계산기를 실행하셨습니다!*********");

        //인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        String exit;

        do {

            System.out.println("Lv2) 첫번째 숫자를 입력하세요.");
            int num1 = sc.nextInt();

            System.out.println("Lv2) 두번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();

            System.out.println("+, -, *, / 중 하나를 입력하세요.");
            char operator = sc.next().charAt(0);

            //연산 시작
            calculator.calculate(num1, num2, operator);
            
            //결과값 도출
            int result = calculator.getResult();

            //입력받은 값과 연산기호로 결과값 출력
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println();
            System.out.println("종료하시려면 exit를 눌러주세요. (계속 하시려면 아무 키를 입력해주세요...)");

            exit = sc.next();
            System.out.println();

            //컬렉션에 결과값 추가
            list.add(result);
            
            //컬렉션 값 제거
            calculator.removeResult(list);

        } while(!exit.equals("exit")); //exit 누르면 계산 종료

    }
}
