public class Persona {
    private String Nombre;
    private String Apellido ;
    private int Edad;

    public Persona (String Nombre, String Apellido, int Edad){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Edad=Edad  ;

    }

    public void verNombre(){
        System.out.println(Nombre);
        System.out.println(Apellido);
        System.out.println(Edad);
    }


}
