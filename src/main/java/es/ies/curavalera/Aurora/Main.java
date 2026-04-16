package es.ies.curavalera.Aurora;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("44885522R","Juan Gómez");
        empleado1.setDireccion("C/de mi casa,5");
        empleado1.setNumHijos(12);

        empleado1.infoEmpleado();
    }
    
}
