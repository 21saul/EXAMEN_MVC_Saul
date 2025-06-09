public class Controller {

    /**
     * Añade  coches de prueba llamando al model
     * @return
     */
    public static boolean engadirCochesProba() {
        Model.crearCoche("Audi", "123");
        Model.crearCoche("BMW", "781");
        Model.crearCoche("Mercedes", "456");
        Model.crearCoche("Lexus", "789");

        return true;
    }
    /**
     * Añade un coche llamando al model
     * @return
     */
    public static boolean crearCoche() {
        String modelo = View.pedirModelo();
        String matricula = View.pedirMatricula();
        Model.crearCoche(
                matricula,
                modelo);
        return true;
    };

    /**
     * Listado de coches
     * @return
     */
    public static String listaCoches() {
        StringBuilder aux1 = new StringBuilder("Lista Coches:");
        for (Coche c: Model.parking) {
            aux1.append("\nMatrícula ").append(c.getMatricula())
                    .append("\nModelo ").append(c.getModelo())
                    .append("\nVelocidad: ").append(c.getVelocidad())
                    .append("\nGasolina ").append(c.gasolina)
                    .append("\nDistancia ").append(c.distancia)
                    .append("\n");

        }

        return aux1.toString();
    }

    /**
     * Modifica la velocidad de un coche
     * @return
     */
    public static boolean modificaVelocidad() {
        String mat = View.pedirMatricula();
        int v = View.pedirVelocidad();
        Model.cambiarVelocidad(mat, v);
        return true;
    }

    /**
     * Le añade la gasolina a un coche
     * @return
     */
    public static boolean echarGasolina() {
        String matricula = View.pedirMatricula();
        int litros = View.pedirGasolina();
        Model.echarGasolina(matricula, litros);
        View.mensax("Metiste " + litros + " litros de gasolin en el coche con la matrícula: " + matricula);
        return true;
    }

    /**
     * Avanza metros solicitados por el usuario al coche
     * @return
     */
    public static boolean avanzar() {
        String matricula = View.pedirMatricula();
        int metros = View.pedirDistancia();
        Model.avanzar(matricula, metros);
        View.mensax("Se han avanzado " + metros + " en el coche matricula " + matricula);
        return true;
    }

}
