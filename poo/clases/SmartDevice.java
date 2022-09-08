package poo.clases;

public class SmartDevice {

    String conectividad;
    String modelo;
    int bateria;

    int memoria;
    int dimensiones;
    double peso;

    public SmartDevice() {

    }

    public SmartDevice(String conectividad, String modelo, int bateria, int memoria, int dimensiones, double peso) {
        this.conectividad = conectividad;
        this.modelo = modelo;
        this.bateria = bateria;
        this.memoria = memoria;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }
}

