class vehicle{
    private String make;
    private String model;

    vehicle(){
        make = "1890";
        model = "Rolls Royce";
    }

    vehicle(String m, String mod){
        make = m;
        model = mod;
    }

    void startEngine(){
        System.out.println("ENGINE STARTED FOR " + model + " MADE IN " + make);
    }

    void stopEngine(){
        System.out.println("ENGINE STOPPED FOR " + model + " MADE IN " + make);
    }
}

class car extends vehicle{
    private int d;

    car(String make, String model, int doors){
        super(make, model);
        d = doors;
    }

    void honk(){
        System.out.println("Honk! Honk! This car has " + d + " doors.");
    }
}

class motorbike extends vehicle{
    private boolean sc;

    motorbike(String make, String model, boolean sidecars){
        super(make, model);
        sc = sidecars;
    }

    public void wheelie() {
        if (sc) {
            System.out.println("Performing a wheelie with a sidecar.");
        } else {
            System.out.println("Performing a wheelie.");
        }
    }
}

class practice {
    public static void main(String[] args) {
        car car = new car("Toyota", "Camry", 4);
        car.startEngine();
        car.honk();
        car.stopEngine();

        System.out.println();

        motorbike motorbike = new motorbike("Harley-Davidson", "Sportster", false);
        motorbike.startEngine();
        motorbike.wheelie();
        motorbike.stopEngine();
    }
}
