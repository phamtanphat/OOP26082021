import abstraction.Pizza;
import abstraction.PizzaCheese;
import abstraction.PizzaStore;

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
//        overload;
//        override

        // overload : phương thức nạp chồng
        // 1 : Khác với nhau về tham số truyền vào
        // 2 : Tạo ra cùng 1 nơi tạo ra
        // thực thi phương thức
//         showMessage();
//        Cat cat = new Cat(1,"gray",1,1);
//        cat.eat();

//        Animal animal = new Animal(1,"gray",1);
//        animal.setHeight(10);

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(new PizzaCheese());


    }
//    private static void showMessage(String message){
//        System.out.println(message);
//    }
//
//    private static void showMessage(String message , int age){
//        System.out.println(message);
//    }

}
