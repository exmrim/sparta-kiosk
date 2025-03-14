import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

  private Menu menu;
  private Bascket bascket;

  /**
   * 생성
   * @param menu
   */
  public Kiosk(Menu menu) {
    this.menu = menu;
    this.bascket = new Bascket(menu);
  }

  /**
   * 키오스크 입출력 기능
   */
  public void start() {

    Scanner sc = new Scanner(System.in);
    int exit = -1;          //종료
    int back = -1;          //뒤로가기
    int category=-1;        //메인 메뉴 카테고리
    int item=-1;            //상세 메뉴
    int orderCategory=-1;   //주문 메뉴 카테고리
    int orderConfirm=-1;    //주문 최종 확인
    double totalPrice=0;    //최종 금액

    do {

      //메인 메뉴 출력
      menu.showCategories();

      //장바구니에 담긴 메뉴가 있을 경우, 주문 메뉴 출력
      if(orderCategory == 1 || orderConfirm == 2) {
        menu.showOrderCategory();
      }

      //메뉴 카테고리 입력 및 예외처리
      category = InputValidator.categoryCheck(sc, menu.getCategories());
      System.out.println();

      if(category == 0) {
        exit = category; //종료
      } else if(category == 4 || category == 5) { 
        orderCategory = category; //주문 메뉴 카테고리에 값을 옮기기
      } else {
        
        //메뉴 출력
        menu.showMenuItems(category);
        
        //메뉴 입력 및 예외처리
        item = InputValidator.menuCheck(sc, menu.getItems(), category);
        System.out.println();

        if (item == 0) {
          back = item; //뒤로가기
        } else {
          System.out.println("선택한 메뉴 : " + menu.getItems().get(category).get(item-1).getName() + " | W " + menu.getItems().get(category).get(item-1).getPrice() + " | " + menu.getItems().get(category).get(item-1).getDescription());
          System.out.println();
          
          //장바구니 추가 여부 메세지 출력
          bascket.showOrderCheckCategory();
          
          //주문 메뉴 카테고리 입력 및 예외처리
          orderCategory = InputValidator.basketCheck(sc);
        }
      }

      if(orderCategory == 1) { //장바구니 추가

        //입력 받은 메뉴 장바구니에 추가하기
        bascket.addOrder(category, item-1);

        //장바구니 추가 확인 메세지 출력
        bascket.showAddOrderMessage();

      } else if(orderCategory == 4) { //장바구니 메뉴 주문

        bascket.showOrderCheckMessage();        //주문 확인 여부 메세지 출력
        bascket.showOrderMenu();                //장바구니 메뉴 출력
        totalPrice = bascket.showTotalPrice();  //장바구니 금액 출력

        System.out.println("[ Price ]");
        System.out.println("W " + totalPrice);
        System.out.println();

        System.out.println("1. 주문     2. 메뉴판");
        
        //주문 최종 확인 입력 및 예외처리
        orderConfirm = InputValidator.orderConfirm(sc);
        
        if(orderConfirm == 1) {

          //주문 완료 메세지 출력
          System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + " 입니다.");
          System.out.println();
          exit = 0;
        }
      } else if(orderCategory == 5) {
        
        //장바구니 메뉴 삭제
        bascket.removeOrder();
      }
    } while (exit!=0);
    System.out.println("이용해주셔서 감사합니다.");
  }
 }
