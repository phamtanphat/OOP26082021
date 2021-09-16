public class Main {

    public static void main(String[] args) {

        // hệ thống sẽ thực thi các đoạn code trong đây

       /*
        class vs object
        class ->object

         Khởi tạo object

         kieudulieu tenbien
         ctrl + space : gợi ý code
         ctrl + p : xem tham số truyền vào
         runtime
        Animal cat = new Animal(1,"gray",3);
        cat.eat();
        System.out.println("Cân nặng " + cat.weight );
        System.out.println("Chiều cao " + cat.height );
        System.out.println("Màu lông " + cat.color );




         access modifier : phạm vi hoạt động

         public , private , protected

         4 phạm vi
         1 - trong class
         2 - ngoài class và không bởi lớp con
         3 - ngoài package bởi lớp con
         4 - trong package

         Tính chất
         Tính kế thừa
         Tính đa hình
         Tính trượu tượng
         Tính đóng gói (access modifier)


        Tạo phương thức
        */

        Cat cat = new Cat(1, "gray", 3, 2);
        String info = cat.info();
        System.out.println(info);

    }

    // 1 : access modifier
    // 2 : giá trị trả về sau khi phương thức xử lý xong
    // 3 : tên phương thức
    // 4 : tham số truyền vào

    //1     2    3      4
    private int tinhTong(int a, int b) {
        int result = a + b;
        return result;
    }


}
