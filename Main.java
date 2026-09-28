package Ejercicio9_estacionMeteorologica;

public class Main {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        estacion.agregarSensor(new Sensor("Temperatura", "°C", -5, 40));
        estacion.agregarSensor(new Sensor("Humedad", "%", 20, 95));
        estacion.agregarSensor(new Sensor("Presión", "hPa", 980, 1040));

        estacion.generarReporteClimatico();
    }
}
