public class Coche {
    String matricula;
    String modelo;
    int velocidad;
    double gasolina;
    int distancia;


    /**
     * Constructor de la clase Coche, va a comenzar con 50 litros de gasolina
     * y como distancia partiendo del 0
     * @param mat
     * @param modelo
     */
    public Coche(String modelo, String mat ) {
        this.setMatricula(mat);
        this.setModelo(modelo);
        this.setVelocidad(0);
        this.gasolina = 50;
        this.distancia = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Esto nos permite restar la gasolina
     * según avancemos la distancia, puse como parámetro de gasolina que sea la mitad de la distanica según esta se añada...
     * @param metros
     */
    public boolean avanzar(int metros) {
        this.distancia += metros;
        this.gasolina -= metros*0.5;
        return true;
    }

}
