import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        Controller.engadirCochesProba();
        int opcion = 1;
        while (opcion!=0) {
            System.out.println("Cochesitos");
            System.out.println("0. Salir");
            System.out.println("1. Crear Coche");
            System.out.println("2. Modificar velocidad");
            System.out.println("3. Mostrar todos los coches");
            System.out.println("4. Echar Gasolina");
            System.out.println("5. Avanzar distancia");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> Controller.crearCoche();
                case 2 -> Controller.modificaVelocidad();
                case 3 -> System.out.println(Controller.listaCoches());
                case 4 -> Controller.echarGasolina();
                case 5 -> Controller.avanzar();
            }
        }
    }

    /**
     * Pide la matricula del coche al usuario
     * @return
     */
    public static String pedirMatricula() {
        System.out.println("Introduce matricula: ");
        String mat = sc.next();
        return mat;
    }
    /**
     * Le pide el moodelo del coche al usuario
     * @return
     */
    public static String pedirModelo() {
        System.out.println("Introduce modelo de cochesito: ");
        return sc.next();
    }
    /**
     * Pide la velocidad del coche al usuario
     * @return
     */
    public static int pedirVelocidad() {
        System.out.println("Velocidad a modificar: ");
        return sc.nextInt();
    }

    /**
     * Pide litros de gasolina al usuario
     */
    public static int pedirGasolina() {
        System.out.println("Mete los litros de gasolina: ");
        return sc.nextInt();
    }

    /**
     * Pide distancia al usuario
     */
    public static int pedirDistancia() {
        System.out.println("Distancia a avanzar: ");
        return sc.nextInt();
    }

    public static void mensax(String mensaje) {
        System.out.println(mensaje);
    }

}
