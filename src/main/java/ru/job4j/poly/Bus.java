package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Поехали на автобусе!");
    }

    @Override
    public void getPassangeres(int count) {
        System.out.println("Число пассажиров " + count);
    }

    @Override
    public void refuel(double count, double price) {
        System.out.println("Заправка " + count + "л  по цене " + price);
    }
}
