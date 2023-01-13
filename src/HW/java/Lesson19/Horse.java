package Lesson19;

public class Horse extends Animal{
    Horse(String name, String location, String food, String health, int numberOfIndividuals) {
        super(name);
        super.location = location;
        this.food = food;
        this.health = health;
        this.numberOfIndividuals = numberOfIndividuals;
    }


    @Override
    public void HealthState() {
        String HEALTHY = ("Животное не нужно лечить!!!!!!!");
        String UNHEALTHY = ("Животное болеет и его нужно вылечить");
        if (health.equals(HEALTHY)){
            System.out.println(HEALTHY);
        }else{
            System.out.println(UNHEALTHY);
        }

    }

    @Override
    public void makeSound() {
        System.out.println("Издает звук: Игого игого ");
    }

    @Override
    public void eat() {
        System.out.println("Жует как жевачку ");

    }

    @Override
    public void sleep() {
        System.out.println("Спит стоя ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


