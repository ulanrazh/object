package peaksoft;

public class Main {

    public static void main(String[] args) {
        //OOP lesson class and object
        Laptop lenovo = new Laptop();
        lenovo.model = "Lenovo";
        lenovo.nameOfLaptop = "My Laptop";
        lenovo.color = "Black";
        lenovo.monitorSize = 15.6;
        lenovo.cpu = "AMD";
        lenovo.gpu ="AMD Radeon";
        lenovo.ram = 8;
        lenovo.ssd = 512;
        lenovo.turnOn();
        lenovo.shutDown();

        Laptop asus = new Laptop();
        asus.model = "Asus";
        asus.nameOfLaptop = "Zenbook";
        asus.color = "White";
        asus.monitorSize = 14.0;
        asus.cpu = "Intel";
        asus.gpu ="GForce";
        asus.ram = 16;
        asus.ssd = 256;
        asus.turnOn();
        asus.shutDown();

        Laptop hp = new Laptop();
        hp.model = "HewletPackard";
        hp.nameOfLaptop = "Probook";
        hp.color = "Blue";
        hp.monitorSize = 15.6;
        hp.cpu = "Ryzen 5";
        hp.gpu ="RTX5060";
        hp.ram = 16;
        hp.ssd = 1024;
        hp.turnOn();
        hp.shutDown();

        Laptop samsung = new Laptop();
        samsung.model = "Samsung";
        samsung.nameOfLaptop = "TravelBook";
        samsung.color = "Black";
        samsung.monitorSize = 15.6;
        samsung.cpu = "Intel";
        samsung.gpu ="GT1080ti";
        samsung.ram = 4;
        samsung.ssd = 128;
        samsung.turnOn();
        samsung.shutDown();

        Laptop sony = new Laptop();
        sony.model = "Sony";
        sony.nameOfLaptop = "Slip";
        sony.color = "Red";
        sony.monitorSize = 14.0;
        sony.cpu = "Intel";
        sony.gpu ="RTX1080";
        sony.ram = 8;
        sony.ssd = 512;
        sony.turnOn();
        sony.shutDown();
    }
}
