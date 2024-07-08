public class MisExcepciones extends Exception {
    public MisExcepciones(String mensaje){
        super("Problema: " + mensaje);
    }
}
