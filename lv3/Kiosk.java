package lv3;

import java.util.*;
import java.util.InputMismatchException;//

public class Kiosk {
    List<lv3.MenuItem> menuItem;
    Scanner sc;

    public Kiosk() {
        this.menuItem = new ArrayList<>();
        this.sc = new Scanner(System.in);

        menuItem.add(new lv3.MenuItem("1995버거", 6900, "1955 그때 버거 1누를시 선택됨"));
        menuItem.add(new lv3.MenuItem("불고기버거", 3500, "불고기가 들어간 평범한 불고기 2누를시 선택됨"));
        menuItem.add(new lv3.MenuItem("치즈버거", 2000, "값싸게 먹을수잇는버거 3누를시 선택됨"));
        //메뉴 입력
        for (lv3.MenuItem item : menuItem) {
            item.viewMenu();
            System.out.println("--------------------");
        }
        //메뉴 순차출력
        System.out.println("0입력시 종료");
        //종료안내
    }
    //start가 기존 lv2 아래 내용 축약
    public void start() {

            while (true) {
                try {
                int num = sc.nextInt();
                //0입력 종료
                if (num == 0) {
                    System.out.println("종료합니다");
                    break;
                }
                //숫자 작동
                switch (num) {
                    case 1: {
                        System.out.println("1995버거 6900원 선택됨.");
                        break;
                    }
                    case 2: {
                        System.out.println("불고기 버거 3500원 선택됨.");
                        break;
                    }
                    case 3: {
                        System.out.println("치즈버거 2000원 선택됨.");
                        break;
                    }
                    default:
                        System.out.println("잘못된입력입니다.");
                        break;


                }
            }catch(InputMismatchException e){

                    System.out.println("잘못 입력햇습니다. 정수만 입력가능");
                    sc.nextLine();
                    //break쓰면 그냥끝나고 이걸해야 한줄만 나옴
                }
        }


        }
    }
