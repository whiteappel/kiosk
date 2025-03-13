package lv4;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        // Menu 객체 생성하면서 카테고리 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

        //메뉴보여주고 메뉴 1햄버거 2감튀 3음료 이런식으로 나눠서 해주기
        kiosk.start();
        // Kiosk 객체 생성
        // Kiosk 내 시작하는 함수 호출
        /*
        *
        ===== 카테고리 목록 =====
        1.햄버거
        2.음료
        3.사이드
        0.종료//예시
         */
    }
}
