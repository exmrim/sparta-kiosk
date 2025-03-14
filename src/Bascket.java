import java.util.ArrayList;
import java.util.List;

public class Bascket {

    private List<MenuItem> orders;
    private Menu menu;

    /**
     * 생성
     * @param menu
     */
    public Bascket(Menu menu) {
        this.menu = menu;
        orders = new ArrayList<>();
    }

    /**
     * 장바구니에 메뉴 추가
     * @param category
     * @param number
     */
    public void addOrder(int category, int number) {
        orders.add(menu.getItems().get(category).get(number));
    }

    /**
     * 장바구니 메뉴 삭제
     */
    public void removeOrder() {
        orders.clear();
    }
    
    //장바구니 추가 여부 메세지 출력
    public void showOrderCheckCategory() {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     | 2. 취소    ");
    }

    //장바구니 추가 확인 메세지 출력
    public void showAddOrderMessage() {
        System.out.println(orders.get(0).getName() + "이 장바구니에 추가되었습니다.");
        System.out.println();
    }

    //주문 확인 여부 메세지 출력
    public void showOrderCheckMessage() {
        System.out.println("아래와 같이 주문하시겠습니까?");
    }

    /**
     * 장바구니 메뉴 출력
     */
    public void showOrderMenu() {
        System.out.println("[ Orders ]");
        for(MenuItem item : orders) {
            System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println();
    }

    /**
     * 장바구니 메뉴 금액 출력
     */
    public double showTotalPrice() {

        double totalPrice = 0;
        for(MenuItem item : orders) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    //주문 완료 메세지 출력
    /*
    public void showOrderConfirmMessage() {
        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + " 입니다.");
        System.out.println();
    }*/

}
