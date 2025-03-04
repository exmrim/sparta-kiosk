package Practice;

public class NumberCheck {

    private boolean bool;
    private String str1;
    private String str2;
    private int num1;
    private int num2;

    public boolean checkNum1(String str1) {

        char ch = ' ';

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);

            if (ch >= 48 && ch <= 57) {
                bool = true;
            } else {
                bool = false;
                System.out.println("숫자를 입력해주세요.(1)");
            }
        }
        return bool;
    }

    public boolean checkNum2(String str2) {

        char ch = ' ';

        for (int i = 0; i < str2.length(); i++) {
            ch = str2.charAt(i);

            if (ch >= 48 && ch <= 57) {
                bool = true;
            } else {
                bool = false;
                System.out.println("숫자를 입력해주세요.(2)");
            }
        }
        return bool;
    }

    public int getNum1(String str1) {
        this.str1 = str1;

        num1 = Integer.parseInt(str1);
        return num1;
    }

    public int getNum2(String str2) {
        this.str2 = str2;

        num2 = Integer.parseInt(str2);
        return num2;
    }



}
