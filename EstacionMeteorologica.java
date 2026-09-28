package Ejercicio9_estacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    private List<Sensor> sensores = new ArrayList<>();

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void generarReporteClimatico() {
        System.out.println("=== Reporte climático ===");
        for (Sensor s : sensores) {
            double lectura = s.obtenerLectura();
            System.out.println(s.getTipo() + ": " + lectura + " " + s.getUnidad());
        }
        System.out.println("Sensores consultados: " + sensores.size());
    }
}
