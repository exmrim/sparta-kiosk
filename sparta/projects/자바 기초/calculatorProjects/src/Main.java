
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

        System.out.println("실행하고 싶은 단계를 입력해주세요. (1~3) ");

        do {
            try {
                int code = sc.nextInt();

                //단계별 계산기가 실행
                switch (code) {
                    case 1:
                        Lv1.App.main(new String[]{});
                        isValid = true;
                        break;
                    case 2:
                        Lv2.App.main(new String[]{});
                        isValid = true;
                        break;
                    case 3:
                        Lv3.App.main(new String[]{});
                        isValid = true;
                        break;
                    default:
                        System.out.println("레벨은 1~3에서만 선택 가능합니다. 다시 입력해주세요.");
                        isValid = false;
                }
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요.");
                sc.nextLine();
            }
        } while(!isValid);



    }
}