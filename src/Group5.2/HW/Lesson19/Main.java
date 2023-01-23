package Lesson19;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal [3];
        for (int i = 0; i<=2; i++){
            animals[0]= new Dog("Тузик", "Россия", "Любит кости, но ест что дают",
                    "какой то текст", 5);
            animals[1] = new Cat("Кот - матроскин ", "Эфиопия", "обажает воровать рыбку у рыбаков ",
                    "Животное не нужно лечить!!!!!!!", 3);
            animals[2] = new Horse("Конь-конский", "Дубай", "любит кушать солому ",
                    "Животное болеет и его нужно вылечить", 4);

            System.out.println(animals[i]);
            animals[i].makeSound();
            animals[i].eat();
            animals[i].HealthState();
            Vet treatAnimals = new Vet ();
            treatAnimals.treatAnimal();
        }

    }
}




//        animals[0]= new Dog("Тузик", "Россия", "Любит кости, но ест что дают",
//                "какой то текст", 5);
//        System.out.println(animals[0]);
//        animals[0].makeSound();
//        animals[0].eat();
//        animals[0].HealthState();
//        Vet treatAnimals = new Vet ();
//        treatAnimals.treatAnimal();
//        animals[1] = new Cat("Кот - матроскин ", "Эфиопия", "обажает воровать рыбку у рыбаков ",
//                "Животное не нужно лечить!!!!!!!", 3);
//        System.out.println('\n' + "" + animals[1]);
//        animals[1].makeSound();
//        animals[1].eat();
//        animals[1].HealthState();
//        Vet treatAnimalss = new Vet ();
//        treatAnimalss.treatAnimal();