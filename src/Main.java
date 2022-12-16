import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

;


public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1");

        Car bmw = new Car("Z8", "BMW", 1.9,TypeOfBody.COUPE);
        Car kia = new Car("Sportage", "Kia", 1.7,TypeOfBody.STATION_WAGON);
        Car subaru = new Car("Forester", "Subaru", 1.5,TypeOfBody.HATCHBACK);

        Truck fe = new Truck("FE-G9K320", "Volvo", 8.9,LoadCapacity.N3);
        Truck fm = new Truck("FM-D8K", "Volvo", 6.0,LoadCapacity.N2);
        Truck fh = new Truck("FH-D13K", "Volvo", 12.8,LoadCapacity.N3);

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
        linkAuto.addCar(bmw);
        linkAuto.addCar(kia);
        linkAuto.addCar(subaru);
        linkAuto.addCar(lada);
        linkAuto.techInspection();

        autoMobile.addTruck(fl);
        autoMobile.addTruck(fe);
        autoMobile.addTruck(fm);
        autoMobile.addTruck(fh);
        autoMobile.techInspection();

        System.out.println();
        System.out.println("ДЗ-2.Задание 2");
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);
        System.out.println();
        add("Мора Кайли",queue1,queue2);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);
        System.out.println();
        remove(queue1,queue2);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);



    }
    public static void printInfo(Transport transport) {
        System.out.println("Инфо по авто "+transport.getBrand()+" "+transport.getModel());
        System.out.println("Водитель: "+transport.getDrivers());
        System.out.println("Механик: "+transport.getMechanics());
        System.out.println("Спонсоры: "+transport.getSponsors());
        System.out.println();

    }
    private static final List<String> NAMES=List.of(
            "Глеб Калюжный",
            "Юра Борисов",
            "Анна Старшенбаум",
            "Ким Нам Джун",
            "Со Ин Гук",
            "Пак Чи Мин",
            "Нам Гун Мин",
            "Джесси",
            "CL",
            "Лили Коллинз"
    );
    private static Random RANDOM = new Random();
    private static final int MAX_SIZE=5;
    private static void randomFilling(Queue<String> queue) {
        int size= RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно возвать Галю!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);

        } else {
            queue2.offer(name);
        }

    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        }else {
            queue2.poll();
        }
    }








}