public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("############");
        System.out.println("EJERCICIO 2:");
        System.out.println("############");

        double ingreso = 480000;
        int cantVehi = 1;
        int cantInmue = 1;
        boolean embarcAeoroActiv = true;

        if(ingreso >= 489083 || cantVehi >= 3 || cantInmue >= 3 || embarcAeoroActiv){
            System.out.println("Pertenece al Segmento de Ingresos Altos");
        }else {
            System.out.println("No Pertenece al Segmento de Ingresos Altos");
        }
    }
}
