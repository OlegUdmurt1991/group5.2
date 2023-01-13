package Lesson19.ru.pflb.vehicles;

import Lesson19.ru.pflb.details.Engine;
import Lesson19.ru.pflb.professions.Driver;

public class Lorry extends Car{
    int loadingAmount ; //- грузоподъемность в киллограммах
    VehicleClass vehicleClass ; //= String.valueOf(VehicleClass.LARGE)


    public Lorry(String model, VehicleClass vehicleClass, int weight, Engine engine, Driver driver, int loadingAmount) {
        super(model, vehicleClass, weight, engine, driver);
        this.loadingAmount = loadingAmount;
        this.vehicleClass = vehicleClass;
    }

    @Override
    public String toString() {
        return("Модель: " + model + " , Класс: " + vehicleClass/*тут наверное фор нужно будет зафигачить*/
                    + '\n' + "Характеристики: " + '\n' + "вес: " + weight + '\n' +
                    "двигатель: " + engine +  "Вт" + '\n' + "Водитель: " + driver + '\n'
                    + "Грузоподъемность: " + loadingAmount + '\n' + '\n');

        }

    }

//    public void vehicleClassMetod () {
//        if (vehicleClass.equals(VehicleClass.LARGE) && vehicleClass.equals(VehicleClass.MEDIUM)){
//            System.out.println(vehicleClass.toString());
//        }
//        else {
//            System.out.println("не грузовик");
//        }


//Вот тут остановился и чуток с car нужно разобраться с VehicleClass.vehicleClass[2]


