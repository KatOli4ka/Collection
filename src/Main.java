import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import transport.driver.Driver;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1");
//        boolean uspeh=Data.proverka("ghyq1","poiu8j_","poiu8j");
//        if (uspeh) {
//            System.out.println("Вы ввели корректные данные!");
//        } else {
//            System.out.println("Вы ввели не корректные данные!");
//        }

        Mechanic<Car> ivan = new Mechanic<Car>("Иван Попов", "Hjpolo");
        Mechanic<Transport> vitya = new Mechanic<Transport>("Витя Иванович", "CoCoCo");
        Mechanic<Bus> pasha = new Mechanic<Bus>("Паша Валов", "GiGoPo");

        Sponsor cocaCola = new Sponsor("Coca Cola", 3345000);
        Sponsor fanta = new Sponsor("Fanta", 2890000);
        Sponsor pepsi = new Sponsor("Pepsi", 1900000);
//        Driver<Car> vova = new DriverB("Вова", true, 8);
//                DriverD jora = new DriverD("Жора", true, 9);
//                DriverC misha = new DriverC("Миша", true, 12);


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

//        getDiagnoctic(lada,bmw,kia,subaru,fl,fe,fm,fh,liaz,ikarus,paz,scania);
        List<Transport> transports = List.of(lada, fl, ikarus);
        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println("Инфо по авто "+transport.getBrand()+" "+transport.getModel());
        System.out.println("Водитель: "+transport.getDrivers());
        System.out.println("Механик: "+transport.getMechanics());
        System.out.println("Спонсоры: "+transport.getSponsors());
        System.out.println();

    }



//    private static void getDiagnoctic(Transport... transports) {
//        for (Transport transport : transports) {
//            if (!transport.getDiagnostic()) {
//                try {
//                    throw new RuntimeException("Авто " + transport.getBrand() + " "
//                            + transport.getModel() + " не прошел диагностику");
//                } catch (RuntimeException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//
//    }
}