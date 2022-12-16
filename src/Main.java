import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import transport.driver.Driver;

import java.util.List;

;


public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1");

        Car bmw = new Car("Z8", "BMW", 1.9,TypeOfBody.COUPE);
        Car kia = new Car("Sportage", "Kia", 1.7,TypeOfBody.STATION_WAGON);
        Car subaru = new Car("Forester", "Subaru", 1.5,TypeOfBody.HATCHBACK);

        Truck fe = new Truck("FE-G9K320", "Volvo", 8.9,LoadCapacity.N3);
        Truck fm = new Truck("FM-D8K", "Volvo", 6.0,LoadCapacity.N2);
        Truck fh = new Truck("FH--D13K", "Volvo", 12.8,LoadCapacity.N3);

        Mechanic<Car> ivan = new Mechanic<Car>("Иван Попов", "Hjpolo");
        Mechanic<Transport> vitya = new Mechanic<Transport>("Витя Иванович", "CoCoCo");
        Mechanic<Bus> pasha = new Mechanic<Bus>("Паша Валов", "GiGoPo");

        Sponsor cocaCola = new Sponsor("Coca Cola", 3345000);
        Sponsor fanta = new Sponsor("Fanta", 2890000);
        Sponsor pepsi = new Sponsor("Pepsi", 1900000);


        Car lada = new Car("Granta", "Lada", 1.6, TypeOfBody.SEDAN);
        lada.addDriver(new DriverB("Вова", true, 8,"B"));
        lada.addMechanic(ivan);
        lada.addSponsor(cocaCola,fanta);

        Truck fl = new Truck("FL-D5K", "Volvo", 2.4, LoadCapacity.N1);
        fl.addDriver(new DriverC("Жора", true, 9,"C"));
        fl.addMechanic(vitya);
        fl.addSponsor(pepsi);

        Bus ikarus = new Bus("280", "Ikarus", 8.0, Capacity.TINY);
        ikarus.addDriver(new DriverD("Миша", true, 12,"D"));
        ikarus.addMechanic(vitya);
        ikarus.addSponsor(pepsi, cocaCola);


        List<Transport> transports = List.of(lada, fl, ikarus);
        for (Transport transport : transports) {
            printInfo(transport);
        }

        System.out.println("ДЗ-2. Задача 1");
        System.out.println();
        ServiceStation<Car> linkAuto = new ServiceStation<>("LinkAuto");
        ServiceStation<Truck> autoMobile = new ServiceStation<>("AutoMobile");
        linkAuto.addTransport(bmw);
        linkAuto.addTransport(kia);
        linkAuto.addTransport(subaru);
        linkAuto.addTransport(lada);
        linkAuto.techInspection();

        autoMobile.addTransport(fl);
        autoMobile.addTransport(fe);
        autoMobile.addTransport(fm);
        autoMobile.addTransport(fh);
        autoMobile.techInspection();

    }

    public static void printInfo(Transport transport) {
        System.out.println("Инфо по авто "+transport.getBrand()+" "+transport.getModel());
        System.out.println("Водитель: "+transport.getDrivers());
        System.out.println("Механик: "+transport.getMechanics());
        System.out.println("Спонсоры: "+transport.getSponsors());
        System.out.println();

    }


}