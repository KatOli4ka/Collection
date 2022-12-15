package transport;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import transport.driver.Driver;


import java.util.*;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private double engineVolume;


    public Transport(String model, String brand,
                     double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(double engineVolume) {
        if (engineVolume <=0){
            engineVolume=1.5;
        }  this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            brand = "Не указан";
        }  this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "Не указана";
        }  this.model = model;
    }

    public void start() {
        System.out.println("На старт! Внимание! Марш!");
    }
    public void end() {
        System.out.println("Финиш!");
    }

    public abstract void printType();
    public abstract boolean getDiagnostic();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport car = (Transport) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }
    @Override
    public String toString() {
        return this.getBrand()+ " "+this.getModel()+", объем двигателя - "+
                this.engineVolume;
    }

    public abstract void fix();


}


