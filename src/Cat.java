public class Cat extends Animal {

    int width;

    public Cat(int height, String color, int weight , int width) {
        super(height, color, weight);
        this.width = width;
    }

    // ghi đè :
    // phương thức ghi đè được tạo ra ở 1 nơi khác và sử kế thừa từ lớp cha
    // để con ghi lại phương thức của lớp cha

    // anotation : chú thích
    @Override
    public void eat() {
        super.eat();
        System.out.println("Con mèo");
    }
}
