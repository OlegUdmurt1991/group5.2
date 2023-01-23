package Lesson19.ru.pflb;

import Lesson19.ru.pflb.details.Engine;
import Lesson19.ru.pflb.professions.Driver;
import Lesson19.ru.pflb.vehicles.Car;
import Lesson19.ru.pflb.vehicles.Lorry;
import Lesson19.ru.pflb.vehicles.SportCar;
import Lesson19.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("PRIORA", VehicleClass.SMALL, 850, new Engine(33000, "LADA"),
                new Driver(2,25065, "Спиди гончик", 23));
        System.out.println(car);
        Lorry lorry = new Lorry("Камаз", VehicleClass.LARGE, 3000, new Engine(60000, "MAZ"),
                new Driver(30,978149,"Анатолыч", 48),8888888);
        System.out.println(lorry);
        SportCar sportCar = new SportCar("911", VehicleClass.SPORTS_CAR, 600, new Engine(6666, "Porshe"),
                new Driver(25, 529605,"Михаил", 34), 199);
        System.out.println(sportCar);
        }


}
