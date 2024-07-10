public class Cordero extends Animal{

    public Cordero(String nombre, String raza, int peso, int promedioVida, double altura) {
        super(nombre, raza, peso, promedioVida, altura);
    }

    public void saludar(boolean estado){
        super.saludar();
        if (estado){ //* Asustado
            System.out.println("Soy un corderito asustado");
        }
        else { //* Distinto de Asustado
            System.out.println("Soy un cordero MACHO CARAJO!");
        }
    }

}
