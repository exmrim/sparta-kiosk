import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {

    private HashMap<Integer, String> categories;
    private HashMap<Integer, String> orderCategories;
    private HashMap<Integer, List<MenuItem>> items;

    /**
     * 생성
     */
    public Menu() {
        categories = new HashMap<>();
        orderCategories = new HashMap<>();
        items = new HashMap<>();
    }

    /**
     * getter
     * @return
     */
    public HashMap<Integer, String> getCategories() {
        return categories;
    }

    public HashMap<Integer, String> getOrderCategories() {
        return orderCategories;
    }

    public HashMap<Integer, List<MenuItem>> getItems() {
        return items;
    }

    /**
     * setter
     * @param categories
     */
    public void setCategories(HashMap<Integer, String> categories) {
        this.categories = categories;
    }

    public void setOrderCategories(HashMap<Integer, String> orderCategories) {
        this.orderCategories = orderCategories;
    }

    public void setItems(HashMap<Integer, List<MenuItem>> items) {
        this.items = items;
    }

    /**
     * 메인 메뉴 카테고리 추가 기능
     * @param number
     * @param category
     */
    public void addCategory(int number, String category) {
        categories.putIfAbsent(number, category);
    }

    /**
     * 주문 메뉴 카테고리 추가 기능
     * @param number
     * @param category
     */
    public void addOrderCategory(int number, String category) { orderCategories.putIfAbsent(number, category); }

    /**
     * 카테고리별 상세 메뉴 추가 기능
     * @param category
     * @param item
     */
    public void addMenuItem(int category, MenuItem item) {
        items.putIfAbsent(category, new ArrayList<>());
        items.get(category).add(item);
    }

    /**
     * 메인 메뉴 출력
     */
    public void showCategories() {
        System.out.println("[ MAIN MENU ]");
        for(int i : categories.keySet()) {
            System.out.println(i + ". " + categories.get(i));
        }
        System.out.println("0. 종료");
    }

    /**
     * 주문 메뉴 출력
     */
    public void showOrderCategory() {
        System.out.println("[ ORDER MENU ]");
        for(int i : orderCategories.keySet()) {
            System.out.println(i + ". " + orderCategories.get(i));
        }
    }

    /**
     * 상세 메뉴 출력
     * @param category
     */
    public void showMenuItems(int category) {
        System.out.println("[ BURGER MENU ]");

        int i = 1;
        for(MenuItem item : items.get(category)) {
            System.out.println(i + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            i++;
        }
        System.out.println("0. 뒤로가기");
    }

}
