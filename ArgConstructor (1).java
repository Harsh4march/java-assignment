  // A-1 Ques 31 and A-2 Ques 2

     //0-ARGUMENTS CONSTRUCTOR 

class Car {
    String brand;
    int year;

    public Car() {
        brand = "Tata";
        year = 1945;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ArgConstructor {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.displayInfo();
    }
}

