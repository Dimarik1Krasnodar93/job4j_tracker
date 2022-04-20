package ru.job4j.poly;

import javax.swing.text.PlainDocument;

public interface Transport {

    public void move();

    public void getPassangeres(int count);

    public void refuel(double count, double prioe);

    public static void main(String[] args) {
        Vehicle [] arrayVehicle = new Vehicle[4];
        Train train = new Train();
        Airplane airplane = new Airplane();
        Bus bus = new Bus();
        Train train2 = new Train();
        Airplane airplane2 = new Airplane();
        arrayVehicle[0] = train;
        arrayVehicle[1] = airplane;
        arrayVehicle[2] = train2;
        arrayVehicle[3] = airplane2;

        for (int i = 0; i < arrayVehicle.length; i++) {
            arrayVehicle[i].move();
        }
    }
}
