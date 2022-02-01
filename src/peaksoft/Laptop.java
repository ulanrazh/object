package peaksoft;

public class Laptop {

        String model;
        String nameOfLaptop;
        double monitorSize;
        String color;
        String cpu;
        String gpu;
        int ram;
        int ssd;

        public void turnOn() {
            System.out.println(model + " is turning on");
        }
        public void shutDown() {
            System.out.println(model + " is shutting down");
        }


}
