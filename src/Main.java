import java.util.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk(menu);

        //메뉴 카테고리 추가
        menu.addCategory(1, "Burger");
        menu.addCategory(2, "Drink");
        menu.addCategory(3, "Dessert");
        menu.addOrderCategory(4, "Orders");
        menu.addOrderCategory(5, "Cancel");

        //버거 상세R메뉴 추가
        menu.addMenuItem(1, new MenuItem("Shakeshack Burger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(1, new MenuItem("SmokeShack Burger", 7.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(1, new MenuItem("Cheese Burger", 8.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addMenuItem(1, new MenuItem("Basic Burger", 6.5, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //키오스크 화면 입출력 시작
        kiosk.start();

    }
}