package Lv3;

/**
 * 제네릭 클래스
 * @param <T>
 */
public class ArithmeticCalculator<T> {

    /**
     * 속성
     */
    private double result;

    /**
     * 생성자
     * @param result
     */
    public ArithmeticCalculator(double result) {
        this.result = result;
    }

    /**
     * 기능
     * @return
     */
    public double getResult() {
        return this.result;
    }

    /**
     * 변수 타입에 상관없는 연산을 위한 제네릭 메서드
     * @param num1
     * @param num2
     * @param operator
     * @param <T>
     */
    public <T extends Number> void calculator(double num1, double num2, String operator) {

        if(operator.equals("+")) {
            result = num1+num2;
        } else if(operator.equals("-")) {
            result = num1-num2;
        } else if(operator.equals("*")) {
            result = num1*num2;
        } else if(operator.equals("/")) {
            //예외처리
            if(!ExceptionHandler.validateNotZero(num1, num2)) {
                return;
            }
            result = num1/num2;
        } else {
            if(!ExceptionHandler.validateNotOperator(operator)) {
                return;
            }
        }
    }
}

//
///**
// * Enum 활용
// */
//enum Operator {
//    PLUS("+", (num1, num2) -> num1 + num2),
//    MINUS("-", (num1, num2) -> num1 - num2),
//    MULTIPLE("*", (num1, num2) -> num1 * num2),
//    DIVIDE("/", (num1, num2) -> num1 / num2);
//
//    private final String operator;
//    private final DoubleBinaryOperator dbo;
//
//    Operator(String operator, DoubleBinaryOperator dbo) {
//        this.operator = operator;
//        this.dbo = dbo;
//    }
//
//    @Override
//    public String toString() {
//        return operator;
//    }
//
//    public double calculate(double num1, double num2) {
//        return dbo.applyAsDouble(num1, num2);
//    }
//}
