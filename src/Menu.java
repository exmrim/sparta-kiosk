import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {

    private HashMap<Integer, String> categories;
    private HashMap<Integer, List<MenuItem>> items;

    public Menu() {
        categories = new HashMap<>();
        items = new HashMap<>();
    }

    public HashMap<Integer, String> getCategories() {
        return categories;
    }

    public HashMap<Integer, List<MenuItem>> getItems() {
        return items;
    }

    public void setCategories(HashMap<Integer, String> categories) {
        this.categories = categories;
    }

    public void setItems(HashMap<Integer, List<MenuItem>> items) {
        this.items = items;
    }

    public void addCategory(int number, String category) {
        categories.putIfAbsent(number, category);
    }

    public void addMenuItem(int number, MenuItem item) {
        items.putIfAbsent(number, new ArrayList<>());
        items.get(number).add(item);
    }

    public void showCategories() {
        System.out.println("[ MAIN MENU ]");
        for(int i : categories.keySet()) {
            System.out.println(i + ". " + categories.get(i));
        }
        System.out.println("0. 종료");
    }

    public void showMenuItems(int number) {
        System.out.println("[ BURGER MENU ]");

        int i = 1;
        for(MenuItem item : items.get(number)) {
            System.out.println(i + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            i++;
        }
        System.out.println("0. 뒤로가기");
    }
}
