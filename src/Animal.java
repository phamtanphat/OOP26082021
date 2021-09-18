public class Animal {
    // tính chất - thuộc tính (properties)
    private int height;
    private String color;
    private int weight;

    // constructor (Phương thức khởi tạo)

    public Animal(int height , String color , int weight){
        this.height = height;
        this.color = color;
        this.weight = weight;
    }

    // hành vi - phương thức
    public void eat(){
        System.out.println("Eat");
    }

    //alt + insert


    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
