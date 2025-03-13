import java.util.Scanner;

public class Kiosk {

  private Menu menu;
  //private List<Menu> categories;
  //private List<MenuItem> items;

  public Kiosk(Menu menu) {
    this.menu = menu;
  }

  public void start() {

    //categories = new ArrayList<>();
    //items = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int exit = -1;
    int back = -1;
    int category;
    int item;

    do {

      menu.showCategories();
      category = InputValidator.categoryCheck(sc, menu.getCategories());
      System.out.println();

      if(category == 0) {
        exit = category;
      } else {
        menu.showMenuItems(category);
        item = InputValidator.menuCheck(sc, menu.getItems(), category);
        System.out.println();

        if (item == 0) {
          back = item;
        } else {
          System.out.println("선택한 메뉴 : " + menu.getItems().get(category).get(item).getName() + " | W " + menu.getItems().get(category).get(item).getPrice() + " | " + menu.getItems().get(category).get(item).getDescription());
          System.out.println();
        }
      }
    } while (exit!=0);

    System.out.println("이용해주셔서 감사합니다.");

  }

  }
