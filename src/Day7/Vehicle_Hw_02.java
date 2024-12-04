package Day7;

public class Vehicle_Hw_02 {
    private String make;
    private String model;
    private int year;
    private String color;
    private double engineCapacity;
    private double cargoCapacity;


    //constructor part for cars and motorbikes
    public Vehicle_Hw_02(String make, String model, int year, String color, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.cargoCapacity = 0;

    }

    //constructor part for trucks
    public Vehicle_Hw_02(String make, String model, int year, String color, double cargoCapacity, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cargoCapacity = 0;
        this.engineCapacity = 0;
    }
    //constructor part for general-purpose
    public Vehicle_Hw_02(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    //This is method display
    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Color : " + color);
        System.out.println("Capacity : " + engineCapacity);
        System.out.println("Cargo Capacity : " + cargoCapacity);
    }
        public static void main(String[] args) {
        System.out.println("<<<<<Welcome to Vehicle>>>>>>>>");

            Vehicle_Hw_02 car = new Vehicle_Hw_02("Toyota", "Supra Mk4", 2020, "Black", 4.0);

            Vehicle_Hw_02 motorbike = new Vehicle_Hw_02("BMW", "CR500F", 2023, "LightBlue", 4,5.0);

            Vehicle_Hw_02 truck = new Vehicle_Hw_02("Toyota","Tundra",2024,"Silver");

            Vehicle_Hw_02 general = new Vehicle_Hw_02("Ford","Ranger",2022,"Titanium");

            car.display();
            motorbike.display();
            truck.display();
            general.display();

        }
    }
