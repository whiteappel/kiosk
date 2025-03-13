package lv5;

//오류잡기

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    private Menu menu;
    // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
    // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
    Scanner sc;

    public Kiosk() {
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
    }

    //start가 기존 lv2 아래 내용 축약
    public void start() {
        menu.showlist();

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
            } catch (InputMismatchException e) {

                System.out.println("잘못 입력햇습니다. 정수만 입력가능");
                sc.nextLine();
                //break쓰면 그냥끝나고 이걸해야 한줄만 나옴
            }
        }


    }
}
