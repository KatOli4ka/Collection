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


        Car lada = new Car("Granta", "Lada", 1.6, TypeOfBody.SEDAN);

        lada.addDriver((Driver)new DriverB("Вова", true, 8));
//        lada.addMechanic(ivan);
//        lada.addSponsor(cocaCola,fanta);

//        Truck fl = new Truck("FL-D5K", "Volvo", 2.4, LoadCapacity.N1);


//        fl.addDriver((Driver) new DriverD("Жора", true, 9));
//        fl.addMechanic(vitya);
//        fl.addSponsor(pepsi, fanta);


        Bus ikarus = new Bus("280", "Ikarus", 8.0, null);


//        ikarus.addDriver((Driver) new DriverC("Миша", true, 12));
//        ikarus.addMechanic(vitya);
//        ikarus.addSponsor(pepsi, cocaCola);

//        getDiagnoctic(lada,bmw,kia,subaru,fl,fe,fm,fh,liaz,ikarus,paz,scania);
//        List<Transport> transports = List.of(lada, fl, ikarus);
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