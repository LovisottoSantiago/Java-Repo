public class Animal {
    protected String nombre, raza;
    protected int peso;
    protected int promedioVida;
    protected double altura;

    public Animal(String nombre, String raza, int peso, int promedioVida, double altura){
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.promedioVida = promedioVida;
        this.altura = altura;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String value){
        this.nombre = value;
    }

    public int getPeso(){
        return peso;
    }
    public void setPeso(int value){
        this.peso = value;
    }

    public int getPromedioVida(){
        return promedioVida;
    }
    public void setPromedioVida(int value){
        this.promedioVida = value;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double value){
        this.altura = value;
    }


    public void saludar(){
        System.out.println("¡Hola!" + "\n Mi nombre es: " + nombre + ", soy un " + raza + " y vivo aproximadamente " + promedioVida + " años.");
    }

}
