package poo.clases;

public class SmartPhone extends SmartDevice {

    double pantalla;
    double camara;

    public SmartPhone() {

    }

    public SmartPhone(String conectividad, String modelo, int bateria,
                      int memoria, int dimensiones, double peso, double pantalla, double camara) {
        super(conectividad, modelo, bateria, memoria, dimensiones, peso);
        this.pantalla = pantalla;
        this.camara = camara;
    }
}
