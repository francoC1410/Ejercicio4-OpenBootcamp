package poo.clases;

public class SmartWatch extends SmartDevice {

    int correa;

    public SmartWatch() {

    }

    public SmartWatch(String conectividad, String modelo,
                      int bateria, int memoria, int dimensiones, double peso, int correa) {
        super(conectividad, modelo, bateria, memoria, dimensiones, peso);
        this.correa = correa;
    }
}
