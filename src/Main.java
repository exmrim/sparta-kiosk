import java.util.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk(menu);

        menu.addCategory(1, "Burger");
        menu.addCategory(2, "Drink");
        menu.addCategory(3, "Dessert");

        menu.addMenuItem(1, new MenuItem("Shakeshack Burger", 6.9, "치즈버거"));
        menu.addMenuItem(1, new MenuItem("SmokeShack Burger", 7.9, "치즈버거"));
        menu.addMenuItem(1, new MenuItem("Cheese Burger", 8.9, "치즈버거"));
        menu.addMenuItem(1, new MenuItem("Basic Burger", 6.0, "치즈버거"));

        kiosk.start();

    }
}