package Practice;

import java.util.ArrayList;

public class SecondCalculator {

    private int result;

    public int calculate(int num1, int num2, char operator) {

        switch (operator) {
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
                    //계산 에러체크 메서드 만들기
                } else if (num1 == 0 && num2 == 0) {
                    //계산 에러체크 메서드 만들기
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 기호를 입력하셨습니다.");
        }
        return result;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void removeResult(int num1, int num2, int num3) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(num1);
        list.add(num2);
        list.add(num3);
        



    }
}
