package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //메뉴보여주기
        System.out.println("[부거집]");
        System.out.println("1입력시 햄부기(7만원)");
        System.out.println("2입력시 햄(77만원)");
        System.out.println("3입력시 부기(777)");
        System.out.println("0입력시 종료");
        System.out.println("메뉴를 선택하세요");

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
                    System.out.println("햄부기인듯하다.");
                    break;
                }
                case 2: {
                    System.out.println("햄인듯하다.");
                    break;
                }
                case 3: {
                    System.out.println("부기인듯하다.");
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