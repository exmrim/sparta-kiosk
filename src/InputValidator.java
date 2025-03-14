import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputValidator {

    /**
     * 메인 메뉴 카테고리 입력 예외처리
     * @param sc
     * @param categories
     * @return
     */
    public static int categoryCheck(Scanner sc, HashMap<Integer, String> categories) {

        int num=-1;
        boolean isCategory = false;

        do {
            try{
                System.out.println("메뉴 카테고리 번호를 입력해주세요.");
                num = sc.nextInt();

                if(num>0 && num<=categories.size()) {
                    isCategory = true;
                } else if(num == 4) { //주문 메뉴 카테고리
                    isCategory = true;
                } else if(num == 5) { //주문 메뉴 카테고리
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

    /**
     * 상세 메뉴 입력 예외처리
     * @param sc
     * @param menuItems
     * @param category
     * @return
     */
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

    /**
     * 주문 메뉴 카테고리 입력 예외처리
     * @param sc
     * @return
     */
    public static int basketCheck(Scanner sc) {

        int num=-1;
        boolean isBasket = false;

        do {
            try{
                num=sc.nextInt();
                if(num == 1) {
                    isBasket = true;
                } else if(num == 2) {
                    isBasket = true;
                } else if(num == 4) {
                    isBasket = true;
                } else if(num == 5) {
                    isBasket = true;
                } else {
                    System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
                    sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("잘못된 번호입니다. 숫자만 입력해주세요.");
                sc.nextLine();
            }
        } while(!isBasket);
        return num;
    }

    /**
     * 주문 최종 확인 여부 입력 예외처리
     * @param sc
     * @return
     */
    public static int orderConfirm(Scanner sc) {

        int num=-1;
        boolean isConfirm = false;

        do {
            try{
                num=sc.nextInt();
                if(num == 1) {

                    isConfirm = true;
                } else if(num == 2) {
                    isConfirm = true;
                } else {
                    System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
                    sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("잘못된 번호입니다. 숫자만 입력해주세요.");
                sc.nextLine();
            }
        } while(!isConfirm);
        return num;
    }

}
