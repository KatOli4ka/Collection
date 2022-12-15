package transport.driver;

import transport.Mechanic;
import transport.Sponsor;
import transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class Driver<A extends Transport> {
    private final String fio;
    private boolean hasDriveLicense;
    private int expirience;
    private final List<Driver<?>> drivers=new ArrayList<>();
    private final List<Mechanic<?>> mechanics=new ArrayList<>();
    private final List<Sponsor> sponsors=new ArrayList<>();

    public Driver(String fio, boolean hasDriveLicense, int expirience) {
        this.fio = fio;
        this.hasDriveLicense = hasDriveLicense;
        this.expirience = expirience;
    }

    public String getFio() {
        return fio;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public abstract void start(A transport);

    public abstract void stop(A transport);

    public abstract void refuel(A transport);

    public void printInfo(A transport) {
        System.out.println("Водитель - "+fio+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    } public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    } public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }
}
