package Ejercicio9_estacionMeteorologica;

import java.util.Random;

public class Sensor {
    private static final Random RANDOM = new Random(7);

    private String tipo;
    private String unidad;
    private double minimo;
    private double maximo;

    public Sensor(String tipo, String unidad, double minimo, double maximo) {
        this.tipo = tipo;
        this.unidad = unidad;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public double obtenerLectura() {
        double valor = minimo + RANDOM.nextDouble() * (maximo - minimo);
        return Math.round(valor * 10) / 10.0;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidad() {
        return unidad;
    }
}
