public class Main {

    public static void main(String[] args){

//        class vs object
//        class ->object

        // Khởi tạo object

        // kieudulieu tenbien
        // ctrl + space : gợi ý code
        // ctrl + p : xem tham số truyền vào
        // runtime
//        Animal cat = new Animal(1,"gray",3);
//        cat.eat();
//        System.out.println("Cân nặng " + cat.weight );
//        System.out.println("Chiều cao " + cat.height );
//        System.out.println("Màu lông " + cat.color );

        Cat cat = new Cat(1 , "gray",3,2);
        cat.eat();
        System.out.println("Cân nặng " + cat.weight );
        System.out.println("Chiều cao " + cat.height );
        System.out.println("Màu lông " + cat.color );
        System.out.println("Chiều dài " + cat.width );


        // access modifier : phạm vi hoạt động

        // public , private , protected

        // 4 phạm vi
        // 1 - trong class
        // 2 - ngoài class và không bởi lớp con
        // 3 - ngoài package bởi lớp con
        // 4 - trong package

        // Tính chất
        // Tính kế thừa
        // Tính đa hình
        // Tính trượu tượng
        // Tính đóng gói (access modifier)


    }
}
