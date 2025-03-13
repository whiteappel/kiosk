package lv5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    // 카테고리 이름 필드 추가
    // MenuItem 클래스를 List로 관리
    List<Menucategory> menucategory;
    List<MenuItem> bugerItem;
    List<MenuItem> drinkItem;
    List<MenuItem> sideItem;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        this.menucategory = new ArrayList<>();
        this.bugerItem = new ArrayList<>();
        this.drinkItem = new ArrayList<>();
        this.sideItem = new ArrayList<>();

        menucategory.add(new Menucategory("햄버거", 1));
        menucategory.add(new Menucategory("음료", 2));
        menucategory.add(new Menucategory("사이드", 3));
        //메뉴 아이템 외에도 새로운게 필요할려나
        bugerItem.add(new MenuItem("1995버거", 6900, "1955 그때 버거 1번시 선택됨"));
        bugerItem.add(new MenuItem("불고기버거", 3500, "불고기가 들어간 평범한 불고기 2번시 선택됨"));
        bugerItem.add(new MenuItem("치즈버거", 2000, "값싸게 먹을수잇는버거 3번시 선택됨"));
        //음료
        drinkItem.add(new MenuItem("사이다", 1500, "칠성사이다 1번시 선택"));
        drinkItem.add(new MenuItem("코카콜라", 1500, "코카콜라 2번시 선택"));
        drinkItem.add(new MenuItem("펩시콜라", 1500, "펩시콜라 3번시 선택"));
        //사이드
        sideItem.add(new MenuItem("감자튀김", 6900, "햄버거집 후렌치 후라이 1번시 선택"));
        sideItem.add(new MenuItem("치즈스틱", 3500, "치즈 듬뿍~튀김 2번시 선택"));
        sideItem.add(new MenuItem("치즈볼", 2000, "치즈가 든 치즈볼 3번시 선택"));
        //메뉴 입력
        // List에 포함된 MenuItem을 순차적으로 보여주는 함수
        showlist();

        selectCategory();
        //메뉴 고르기
        System.out.println("0입력시 종료");
        //종료안내
    }

    public void showlist() {
        System.out.println("\n===== 카테고리 목록 =====");
        for (Menucategory category : menucategory) {
            category.showMenu();  // category.viewMenu() menucategory 쪽에잇음
        }
        System.out.println("0.종료");
    }

    //메뉴고르기
    public void selectCategory() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("카테고리 번호를 선택하세요: ");
            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("메뉴 선택을 종료합니다");
                    break;
                }

                switch (choice) {
                    case 1:
                        selectMenuItem(bugerItem, "햄버거");
                        break;
                    case 2:
                        selectMenuItem(drinkItem, "음료");
                        break;
                    case 3:
                        selectMenuItem(sideItem, "사이드");
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요");
                }
            }catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다. 정수만 입력가능");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    //선택한 목록, 표시될이름
    /*
    public void showItems(List<MenuItem> items, String categoryName) {
        System.out.println("\n===== " + categoryName + " 메뉴 =====");
        for (MenuItem item : items) {
            item.viewMenu();
            System.out.println("--------------------");
        }
    }
    //보여주는 테스트용이엿던거
    */
    // List를 리턴하는 함수
    //메뉴 선택 시 종류와 이름표시
    public void selectMenuItem(List<MenuItem> items, String categoryName) {
        while (true) {
            System.out.println("\n===== " + categoryName + " 메뉴 =====");
            //고른것에대한거 보여주기
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i).getName() + ":" + items.get(i).getPrice() + "원"+items.get(i).getDescription());
            }
            System.out.println("0입력시 이전화면");

            System.out.println("메뉴 번호를 선택하시오:");

            //뒤로가기용 추가 스캐너
            try {
                int menuChoice = scanner.nextInt();

                if (menuChoice == 0) {
                    showlist();
                    return;
                }
                //선택한 메뉴아이템 내용들 꺼내는겅
                else if(menuChoice >=1 && menuChoice <= items.size()){
                    System.out.println("선택한 메뉴"+ items.get(menuChoice -1).getName());
                    System.out.println("\n(아무 키나 입력하면 카테고리 선택 화면으로 돌아갑니다.)");
                    scanner.nextLine();
                    scanner.nextLine();  // 입력을 기다림
                    showlist();
                    return;
                    // 카테고리 화면으로 돌아감
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다. 정수만 입력가능");
                scanner.nextLine();
                //break쓰면 그냥끝나고 이걸해야 한줄만 나옴
            }

        }

        // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
    }
}