import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputValidator {

    public static int categoryCheck(Scanner sc, HashMap<Integer, String> categories) {

        int num=-1;
        boolean isCategory = false;

        do {
            try{
                System.out.println("메뉴 카테고리 번호를 입력해주세요.");
                num = sc.nextInt();

                if(num>0 && num<=categories.size()) {
                    isCategory = true;
                } else if(num == 0) {
                    System.out.println("종료합니다.");
                    isCategory = true;
                }else {
                    System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 번호입니다. 숫자만 입력해주세요.");
                sc.nextLine();
            }
        } while(!isCategory);
        return num;
    }

    public static int menuCheck(Scanner sc, HashMap<Integer, List<MenuItem>> menuItems, int category) {

        int num=-1;
        boolean isMenu = false;

        do {
            try{
                System.out.println("메뉴 번호를 입력해주세요.");
                num = sc.nextInt();

                if(num>0 && num<=menuItems.get(category).size()) {
                    isMenu = true;
                } else if(num == 0) {
                    isMenu = true;
                }else {
                    System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
                    sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("잘못된 번호입니다. 숫자만 입력해주세요.");
                sc.nextLine();
            }
        } while(!isMenu);
        return num;
    }


}
