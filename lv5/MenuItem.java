package lv5;

public class MenuItem {
    //이름 가격 설명 필드
    //햄버거 메뉴 출력 필요
    private String name;
    private int price;
    private String description;

    //불러올때 보여줌
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //메뉴판에 사용될거
    public void viewMenu() {
        System.out.println("메뉴이름" + name);
        System.out.println("가격" + price);
        System.out.println("설명" + description);

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
