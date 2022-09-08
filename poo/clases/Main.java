package poo.clases;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();

        System.out.println("Mis dos dispositivos: ");
        
        SmartPhone samsung = new SmartPhone("wifi ", "samsung Galaxy ",  3300 ,
                16 , 235,  150.5 , 5.5 , 18.5);

        System.out.println("samsung galaxy j7 2016: " + samsung.conectividad + samsung.modelo + "j7 " +
                samsung.bateria + " mAh " + samsung.memoria + " ram " + samsung.dimensiones + " mm " +
                samsung.peso + " gramos " + samsung.pantalla + " pulgadas " + samsung.camara + " Mpx ");

        SmartWatch moto360 = new SmartWatch("bluetooth ", "moto360 ", 320,
                512, 40, 50.10, 41);

        System.out.println("Moto360: " + moto360.conectividad + moto360.modelo + moto360.bateria + " mAh " +
                moto360.memoria + " ram " + moto360.dimensiones + " mm " +
                moto360.peso + " Mpx " + moto360.correa + " mm ");

       
    }
}

