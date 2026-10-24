package part1_classusedemonstration;

// 1.1. Class declaration
class MyClass {
}
// 1.2. Public method
class MyClassWithMethod {
    public void print(String s) {
        System.out.println(s);
    }
}
// 1.3 Private demonstration
class PrivateClass {
    private void print(String s) {
        System.out.println(s);
    }
}
// 1.4 Use of constructor
class ConstructorClass {
    private int speed;
    private int horsepower;

    public ConstructorClass(int speed, int horsepower) {
        this.speed = speed;
        this.horsepower = horsepower;
        System.out.println("ConstructorClass");
    }
    public void print () {
        System.out.println(speed);
        System.out.println(horsepower);
    }
}
// 1.5. Public properties
class PublicProperties {
    public String model = "BMW M3";
    public int speed = 120;
    public double price = 45000.50;
    public boolean isElectric = false;

    // Access to properties inside the class
    public void printProperties() {
        System.out.println(model);
        System.out.println(speed);
        System.out.println(price);
        System.out.println(isElectric);
    }
}
// 1.6 Private properties
class PrivateProperties {
    private String model = "BMW M3";
    private int speed = 120;
    private double price = 45000.50;
    private boolean isElectric = false;

    public void printProperties() {
        System.out.println(model);
        System.out.println(speed);
        System.out.println(price);
        System.out.println(isElectric);
    }
}
// 1.7 Getters and setters
class classInteger {
    private int value;

    public int getPosInteger() {
        return value;
    }
    public void setPosInteger(int posvalue) {
        if (posvalue > 0) {
            this.value = posvalue;
        }
    }
}
class classDouble {
    private double doublevalue;

    public double getNegDouble() {
        return doublevalue;
    }
    public void setNegDouble(double doublenegvalue) {
        if (doublenegvalue < 0) {
            doublevalue = doublenegvalue;
        }
    }
}
class classBoolean {
    private boolean booleanvalue;

    public boolean getBoolean() {
        return booleanvalue;
    }
    public void setBoolean(boolean booleanuser) {
        this.booleanvalue = booleanuser;

    }
}
class classString {
    private String stringvalue;

    public String getString() {
        return stringvalue;
    }
    public void setString(String stringuser) {
            stringvalue = stringuser;
    }
}
// 1.8 Use of constructors with arguments
class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}
    public class Part1ClassUseDemonstration {
        public static void main(String[] args) {
            // 1.1 Object creation
            MyClass obj = new MyClass();
            // 1.2 Public method call
            MyClassWithMethod obj2 = new MyClassWithMethod();
            obj2.print("print it");
            // 1.3 Call from private class
            PrivateClass obj3 = new PrivateClass();
            // obj3.print("error");
            // 1.4 Use of constructor
            ConstructorClass car1 = new ConstructorClass(120, 40);
            car1.print();
            // 1.5 Public properties of a various data types
            PublicProperties car2 = new PublicProperties();
            // Access these properties through object (obj.value)
            System.out.println(car2.model);
            System.out.println(car2.speed);
            System.out.println(car2.price);
            System.out.println(car2.isElectric);
            // Inside the class from the methods
            car2.printProperties();
            // 1.6 Private properties
            PrivateProperties car3 = new PrivateProperties();
            car3.printProperties();
            // Access these properties through object (obj.value)
            //System.out.println(car3.model);
            //System.out.println(car3.speed);
            //System.out.println(car3.price);
            //System.out.println(car3.isElectric);
            // 1.7 Demonstration of getters and setters
            classInteger myInt = new classInteger();
            myInt.setPosInteger(10);
            System.out.println("Integer value: " + myInt.getPosInteger());
            classDouble myDouble = new classDouble();
            myDouble.setNegDouble(-10.0);
            System.out.println("Double value: " + myDouble.getNegDouble());
            classBoolean myBoolean = new classBoolean();
            myBoolean.setBoolean(true);
            System.out.println("Boolean value: " + myBoolean.getBoolean());
            classString myString = new classString();
            myString.setString("a");
            System.out.println("String value: " + myString.getString());
            // 1.8 Use of constructors with arguments
            Car carbmw = new Car("BMW", 2023);
            Car caraudi = new Car("Audi", 2022);
            Car cartesla = new Car("Tesla", 2024);

            carbmw.printInfo();
            caraudi.printInfo();
            cartesla.printInfo();
        }
    }