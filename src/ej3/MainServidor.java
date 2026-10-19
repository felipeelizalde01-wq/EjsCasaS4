package ej3;

public class MainServidor {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor s3 = new Servidor("ServidorBackup", "192.168.1.22");

        s1.activar();
        s1.activar(); // Prueba: no debe duplicar el contador de activos
        s2.activar();
        s3.activar();
        s3.desactivar();

        System.out.println("\n=== SERVIDORES ====");
        System.out.println("ID: " + s1.getId());
        System.out.println("Nombre: " + s1.getNombre());
        System.out.println("IP: " + s1.getDireccionIP());
        System.out.println("Activo: " + s1.isActivo());
        System.out.println("");

        System.out.println("ID: " + s2.getId());
        System.out.println("Nombre: " + s2.getNombre());
        System.out.println("IP: " + s2.getDireccionIP());
        System.out.println("Activo: " + s2.isActivo());
        System.out.println("");

        System.out.println("ID: " + s3.getId());
        System.out.println("Nombre: " + s3.getNombre());
        System.out.println("IP: " + s3.getDireccionIP());
        System.out.println("Activo: " + s3.isActivo());

        System.out.println("\n====== RESULTADOS CONTADORES =====");
        System.out.println("Total de servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
    }
}