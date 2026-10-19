package ej2;

public class MainAplicacion {
    public static void main(String[] args) {
        System.out.println("\nTotal antes de crear: " + Aplicacion.getTotalAplicaciones());

        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("GestorInventario", "2.4");
        Aplicacion app3 = new Aplicacion("MonitorRed", "1.1");

        app1.iniciar();
        app3.iniciar();
        app3.cerrar();

        System.out.println("\n=== APLICACIONES ====");
        System.out.println("ID: " + app1.getId());
        System.out.println("Nombre: " + app1.getNombre());
        System.out.println("Version: " + app1.getVersion());
        System.out.println("Ejecutando: " + app1.isEjecutando());
        System.out.println("");

        System.out.println("ID: " + app2.getId());
        System.out.println("Nombre: " + app2.getNombre());
        System.out.println("Version: " + app2.getVersion());
        System.out.println("Ejecutando: " + app2.isEjecutando());
        System.out.println("");

        System.out.println("ID: " + app3.getId());
        System.out.println("Nombre: " + app3.getNombre());
        System.out.println("Version: " + app3.getVersion());
        System.out.println("Ejecutando: " + app3.isEjecutando());

        System.out.println("\n====== RESULTADOS CONTADOR =====");
        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}