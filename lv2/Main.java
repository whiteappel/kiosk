package lv2;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //리스트 이용
        //MenuItem 생성
        //리스트선언 MenuItem추가

        // List 선언 및 초기화
        List<MenuItem> MenuItem= new ArrayList<>();
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        MenuItem.add(new MenuItem("1995버거", 6900, "1955 그때 버거 1누를시 선택됨"));
        MenuItem.add(new MenuItem("불고기버거", 3500, "불고기가 들어간 평범한 불고기 2누를시 선택됨"));
        MenuItem.add(new MenuItem("치즈버거", 2000, "값싸게 먹을수잇는버거 3누를시 선택됨"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (MenuItem item : MenuItem) {
            item.viewMenu();
            System.out.println("--------------------");
        }

        // lv1 부분 위에 부터 lv2
        System.out.println("0입력시 종료");
        // 숫자를 입력 받기 lv1?
        // 입력된 숫자에 따른 처리
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명
        while(true){
            int num = sc.nextInt();
            //0입력 종료
            if(num == 0){
                System.out.println("종료합니다");
                break;
            }
            //숫자 작동
            switch (num) {
                case 1: {
                    System.out.println("1995버거 6900원 선택됨.");
                    //햄부기7만원
                    break;
                }
                case 2: {
                    //햄77만원 개창렬
                    System.out.println("불고기 버거 3500원 선택됨.");
                    break;
                }
                case 3: {
                    System.out.println("치즈버거 2000원 선택됨.");
                    //부기 777만원 쓰레기
                    break;
                }
                default:
                    System.out.println("잘못된입력입다.");
                    break;


            }

        }
        sc.close();
    }
}
