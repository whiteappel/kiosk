package lv4;

public class Menucategory {
    //종류 설명 필드
    //햄버거 메뉴 출력 필요
    public String name;
    public int num;

    //
    //불러올때 보여줌
    public Menucategory(String name, int num) {
        this.name = name;
        this.num = num;
    }

    //메뉴판에 사용될거
    public void showMenu() {
        System.out.println(num + "." + name);
    }
    //아마 1.햄버거 이런식으로 구현생각
}
