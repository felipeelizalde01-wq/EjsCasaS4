package ej1;

public class MainUsuario {
    public static void main(String[] args) {
        System.out.println("\nNumero de Usuarios antes de crearlos: " + Usuario.getTotalUsuarios());

        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("felipe", "felipe@correo.com");
        Usuario u3 = new Usuario("armando", "armando@correo.com");
        Usuario u4 = new Usuario("joaquin", "joaquin@correo.com");

        System.out.println("\n=== USUARIOS ====");
        System.out.println("ID: " + u1.getId() + " | Username: " + u1.getUsername() + " | Correo: " + u1.getCorreo() + " | Activo: " + u1.isActivo());
        System.out.println("ID: " + u2.getId() + " | Username: " + u2.getUsername() + " | Correo: " + u2.getCorreo() + " | Activo: " + u2.isActivo());
        System.out.println("ID: " + u3.getId() + " | Username: " + u3.getUsername() + " | Correo: " + u3.getCorreo() + " | Activo: " + u3.isActivo());
        System.out.println("ID: " + u4.getId() + " | Username: " + u4.getUsername() + " | Correo: " + u4.getCorreo() + " | Activo: " + u4.isActivo());

        System.out.println("\n====== RESULTADOS CONTADOR =====");
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());
    }
}

