package abstraction;

public class PizzaCheese extends Pizza{


    @Override
    void prepare() {
        System.out.println("Chuẩn bị phô mai để làm bánh");
    }

    @Override
    void cook() {
        System.out.println("Nướng trong 20 phút");
    }

    @Override
    void cut() {
        System.out.println("Cắt thành 8 phần");
    }

    @Override
    void box() {
        System.out.println("Đóng thành hộp");
    }

    @Override
    String getName() {
        return "Pizza Cheese";
    }
}
