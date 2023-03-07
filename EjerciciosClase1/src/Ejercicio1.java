public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("##############");
        System.out.println("EJERCICIO 1-A:");
        System.out.println("##############");

        int a = 80;
        int b = 100;

        while(a <= b) {
            System.out.println(a);
            a++;
        }

        System.out.println("##############");
        System.out.println("EJERCICIO 1-B:");
        System.out.println("##############");

        a = 80;
        b = 100;

        while(a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

        System.out.println("##############");
        System.out.println("EJERCICIO 1-C:");
        System.out.println("##############");

        a = 80;
        b = 100;
        boolean pares = true;

        while(a <= b){
            if(pares && (a % 2 == 0)){
                System.out.println(a);
            }else if(!pares && a % 2 != 0){
                System.out.println(a);
            }
            a++;
        }

        System.out.println("##############");
        System.out.println("EJERCICIO 1-D:");
        System.out.println("##############");

        a = 80;
        b = 100;

        for(int i = b; i >= a; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
