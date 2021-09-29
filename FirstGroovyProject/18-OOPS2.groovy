

class Car {

    String name;
    String color;
    int model;

    static main(args) {

        Car toyota = new Car();
        Car ford = new Car();
        Car mercedes = new Car();

        toyota.name = "Toyota";
        toyota.model = 2019
        toyota.color = "Red"

        ford.name = "Ford";
        ford.model = 2020
        ford.color = "Blue"

        mercedes.name = "Mercedes"
        mercedes.model = 2021
        mercedes.color = "Green"

        toyota.getCarDetails()
        toyota.startEngine()
        println("=====================")
        ford.getCarDetails()
        ford.startEngine()
        println("=====================")
        mercedes.getCarDetails()
        mercedes.startEngine()
        println("=====================")
    }

    def getCarDetails() {
        println("You are driving $model, $color, colored $name")
    }

    def startEngine() {
        println("Starting enging for $name")
    }
}