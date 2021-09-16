public class Cat extends Animal {

    int width;

    public Cat(int height, String color, int weight , int width) {
        super(height, color, weight);
        this.width = width;
    }

    public void run(){
        System.out.println("Chạy bằng 4 chân");
    }

//    public String info(){
//        return  "Thông tin của con Mèo" + "\n" +
//                "Cân nặng : " + weight + "\n" +
//                "Chiều cao : " + height + "\n" +
//                "Màu lông : " + color + "\n" +
//                "Chiều dài : " + width + "\n";
//    }

    // alt + insert : hiện thị các công cụ

    @Override
    public String toString() {
        return "Cat{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }


    // alt + enter : gợi ý sửa lỗi
}
