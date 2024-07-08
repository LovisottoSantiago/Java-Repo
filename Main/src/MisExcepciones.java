public class MisExcepciones extends Exception {
    public MisExcepciones(String mensaje){ //? La idea es usarla como excepcion general
        super("Problema: " + mensaje);
    }
}
