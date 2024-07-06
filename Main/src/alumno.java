public class alumno {
    private final String nombre;
    private final String apellido;
    private final int edad;

    public alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }

    public void saludar(){
        System.out.println("Hola! Mi nombre es " + nombre + ", " + apellido + ".");
        System.out.println("Tengo " + edad + " años.");
    }

}
