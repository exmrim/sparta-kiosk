package Lv1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("*********Lv1.계산기를 실행하셨습니다!*********");

        Scanner sc = new Scanner(System.in);

        String exit = "";
        boolean bool1 = false;
        boolean bool2 = false;
        boolean bool3 = false;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;

        char ch = ' ';

        //숫자만 입력받았을 경우 다음단계로 넘어갈 수 있음
        do {

            System.out.println("Lv1) 첫번째 숫자를 입력하세요.");
            String str1 = sc.next();

            //첫번째 숫자 체크
            for (int i = 0; i < str1.length(); i++) {
                ch = str1.charAt(i);

                if (ch >= 48 && ch <= 57) {
                    num1 = Integer.parseInt(str1);
                    bool1 = true;
                } else {
                    System.out.println("숫자만 입력하세요.");
                    bool1 = false;
                }
            }

            System.out.println("Lv1) 두번째 숫자를 입력하세요.");

            String str2 = sc.next();

            //두번째 숫자 체크
            for (int i = 0; i < str2.length(); i++) {
                ch = str2.charAt(i);

                if (ch >= 48 && ch <= 57) {
                    num2 = Integer.parseInt(str2);
                    bool2 = true;
                } else {
                    System.out.println("숫자만 입력하세요.");
                    bool2 = false;
                }
            }
        }while (!bool1 || !bool2); 

        
        //연산기호 입력하기
        do {
            System.out.println("");
            System.out.println("+, -, *, / 중 골라주세요.");

            char cal = sc.next().charAt(0);

            //입력받은 연산기호로 계산하기
            switch (cal) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다."); //에러체크1
                    } else if (num1 == 0 && num2 == 0) {
                        System.out.println("정의되지 않은 결과입니다."); //에러체크2
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("잘못된 기호를 입력하셨습니다.");
            }

            System.out.println(num1 + " " + cal + " " + num2 + " = " + result);

            System.out.println("종료하시려면 exit 를 입력해주세요. (계속 하시려면 아무 키를 입력하세요..)");
            exit = sc.next();

            //종료하지 않으면 누적된 값에 새로운 값 입력해서 계속 계산을 이어나감
            if (!exit.equals("exit")) {
                num3 = result;
                num1 = num3;

                System.out.println("Lv1) 숫자를 입력하세요.");
                String str3 = sc.next();

                //숫자만 입력받아야 다음 단계로 넘어갈 수 있음
                do {
                    //세번째 숫자 체크
                    for (int i = 0; i < str3.length(); i++) {
                        ch = str3.charAt(i);

                        if (ch >= 48 && ch <= 57) {
                            num2 = Integer.parseInt(str3);
                            bool3 = true;
                        } else {
                            System.out.println("숫자만 입력하세요3.");
                            bool3 = false;
                        }
                    }
                } while(!bool3);
            }
        } while (!exit.equals("exit"));
        System.out.println("종료합니다.");
    }
}
