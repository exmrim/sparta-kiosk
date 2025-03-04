package Lv2;

import java.util.ArrayList;

public class Calculator {

    /**
     * 속성
     */
    private int result;

    /**
     * getter
     * @return
     */
    public int getResult() {
        return result;
    }

    /**
     * setter
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * 연산 기능
     * @param num1
     * @param num2
     * @param operator
     * @return
     */
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
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 기호를 입력하셨습니다.");
        }
        return result;
    }

    /**
     * 컬렉션 값 제거
     * @param list
     */
    public void removeResult(ArrayList<Integer> list) {

        //가장 첫번째 값 제거
        list.remove(0);
        System.out.println(list); //test
    }
}
